package cc.uraniummc;

import com.google.common.io.Files;
import groovy.lang.Closure;
import lombok.Setter;
import lombok.val;
import net.minecraftforge.gradle.common.Constants;
import net.minecraftforge.gradle.delayed.DelayedFile;
import net.minecraftforge.gradle.delayed.DelayedString;
import net.minecraftforge.gradle.tasks.dev.GenDevProjectsTask;
import org.gradle.api.DefaultTask;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.dsl.RepositoryHandler;
import org.gradle.api.artifacts.repositories.MavenArtifactRepository;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.tasks.diagnostics.DependencyReportTask;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.*;
import java.util.stream.Collectors;


public class GenUraniumDevProjectsTask extends DefaultTask {

    protected DelayedFile targetDir;
    @Input
    @Optional
    private DelayedString mappingChannel;
    @Input
    @Optional
    private DelayedString mappingVersion;
    @Input
    @Optional
    private DelayedString mcVersion;
    private List<DelayedFile> sources = new ArrayList();
    private List<DelayedFile> resources = new ArrayList();
    private List<DelayedFile> testSources = new ArrayList();
    private List<DelayedFile> testResources = new ArrayList();
    @Setter
    private ConfigurationContainer configurations;
    @Setter
    private RepositoryHandler repositories;
    public GenUraniumDevProjectsTask() {
        this.getOutputs().file(this.getTargetFile());
    }

    @TaskAction
    public void doTask() throws IOException {
        //this.parseJson();
        this.writeFile();
    }

    private void writeFile() throws IOException {
        File file = this.getProject().file(this.getTargetFile().call());
        file.getParentFile().mkdirs();
        Files.touch(file);
        StringBuilder o = new StringBuilder();
        this.lines(o, "apply plugin: 'java' ",
                "apply plugin: 'eclipse'",
                "",
                "sourceCompatibility = '1.6'",
                "targetCompatibility = '1.6'",
                "", "repositories",
                "{");
        for(val repo:repositories){
            if(repo instanceof MavenArtifactRepository) {
                if (repo.getName().equals("MavenRepo")) {
                    o.append("\tmavenCentral()").append(Constants.NEWLINE);
                }
                if (repo.getName().equals("MavenLocal")) {
                    o.append("\tmavenLocal()").append(Constants.NEWLINE);
                } else {
                    o.append("\tmaven {").append(Constants.NEWLINE)
                            .append("\t\t name '").append(repo.getName()).append("'").append(Constants.NEWLINE)
                            .append("\t\t url '").append(((MavenArtifactRepository) repo).getUrl()).append("'").append(Constants.NEWLINE)
                            .append("\t}").append(Constants.NEWLINE);
                }
            }
        }
        this.lines(o,"}",
                "", "dependencies", "{");
        configurations.getByName("libraries").getResolvedConfiguration().getResolvedArtifacts().stream().map(i->i.getModuleVersion().getId()).forEach(id->{
            if(id.toString().startsWith("net.minecraft:server:")||id.toString().startsWith("org.ow2.asm:asm-all"))return;
            o.append("\tcompile '").append(id).append("'").append(Constants.NEWLINE);
        });
        configurations.getByName("compile").getResolvedConfiguration().getResolvedArtifacts().stream().map(i->i.getModuleVersion().getId()).forEach(id->
                o.append("\tcompile '").append(id).append("'").append(Constants.NEWLINE)
        );
        String version;
        String channel = this.getMappingChannel();
        version = this.getMappingVersion();
        String mcversion = this.getMcVersion();
        if (version != null && channel != null) {
            o.append("\tcompile group: 'de.oceanlabs.mcp', name:'mcp_").append(channel).append("', version:'").append(version).append('-').append(mcversion).append("', ext:'zip'");
        }

        this.lines(o, "", "\ttestCompile 'junit:junit:4.5'", "}", "");
        URI base = ((File)this.targetDir.call()).toURI();
        if (this.resources.size() > 0 || this.sources.size() > 0 || this.testSources.size() > 0 || this.testResources.size() > 0) {
            this.lines(o, "sourceSets");
            this.lines(o, "{");
            this.lines(o, "\tmain");
            this.lines(o, "\t{");
            Iterator ii;
            DelayedFile src;
            if (this.sources.size() > 0) {
                this.lines(o, "\t\tjava");
                this.lines(o, "\t\t{");
                ii = this.sources.iterator();

                while(ii.hasNext()) {
                    src = (DelayedFile)ii.next();
                    o.append("\t\t\tsrcDir '").append(this.relative(base, src)).append('\'').append(Constants.NEWLINE);
                }

                this.lines(o, "\t\t}");
            }

            if (this.resources.size() > 0) {
                this.lines(o, "\t\tresources");
                this.lines(o, "\t\t{");
                ii = this.resources.iterator();

                while(ii.hasNext()) {
                    src = (DelayedFile)ii.next();
                    o.append("\t\t\tsrcDir '").append(this.relative(base, src)).append('\'').append(Constants.NEWLINE);
                }

                this.lines(o, "\t\t}");
            }

            this.lines(o, "\t}");
            this.lines(o, "\ttest");
            this.lines(o, "\t{");
            if (this.testSources.size() > 0) {
                this.lines(o, "\t\tjava");
                this.lines(o, "\t\t{");
                ii = this.testSources.iterator();

                while(ii.hasNext()) {
                    src = (DelayedFile)ii.next();
                    o.append("\t\t\tsrcDir '").append(this.relative(base, src)).append('\'').append(Constants.NEWLINE);
                }

                this.lines(o, "\t\t}");
            }

            if (this.testResources.size() > 0) {
                this.lines(o, "\t\tresources");
                this.lines(o, "\t\t{");
                ii = this.testResources.iterator();

                while(ii.hasNext()) {
                    src = (DelayedFile)ii.next();
                    o.append("\t\t\tsrcDir '").append(this.relative(base, src)).append('\'').append(Constants.NEWLINE);
                }

                this.lines(o, "\t\t}");
            }

            this.lines(o, "\t}");
            this.lines(o, "}");
        }

        this.lines(o, "", "jar { exclude 'GradleStart*', 'net/minecraftforge/gradle/**' }", "");
        this.lines(o, "def links = []", "def dupes = []", "eclipse.project.file.withXml { provider ->", "    def node = provider.asNode()", "    links = []", "    dupes = []", "    node.linkedResources.link.each { child ->", "        def path = child.location.text()", "        if (path in dupes) {", "            child.replaceNode {}", "        } else {", "            dupes.add(path)", "            def newName = path.split('/')[-2..-1].join('/')", "            links += newName", "            child.replaceNode {", "                link{", "                    name(newName)", "                    type('2')", "                    location(path)", "                }", "            }", "        }", "    }", "}", "", "eclipse.classpath.file.withXml {", "    def node = it.asNode()", "    node.classpathentry.each { child -> ", "        if (child.@kind == 'src' && !child.@path.contains('/')) child.replaceNode {}", "        if (child.@path in links) links.remove(child.@path)", "    }", "    links.each { link -> node.appendNode('classpathentry', [kind:'src', path:link]) }", "}", "tasks.eclipseClasspath.dependsOn 'eclipseProject' //Make them run in correct order");
        this.lines(o,"[compileJava, compileTestJava]*.options*.encoding = 'UTF-8'");
        Files.write(o.toString(), file, Charset.defaultCharset());
    }

    private String relative(URI base, DelayedFile src) {
        String relative = base.relativize(((File)src.call()).toURI()).getPath().replace('\\', '/');
        if (!relative.endsWith("/")) {
            relative = relative + "/";
        }

        return relative;
    }

    private void lines(StringBuilder out, String... lines) {
        String[] arr$ = lines;
        int len$ = lines.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            String line = arr$[i$];
            out.append(line).append(Constants.NEWLINE);
        }

    }

    private Closure<File> getTargetFile() {
        return new Closure<File>(this) {
            private static final long serialVersionUID = -6333350974905684295L;

            public File call() {
                return new File(GenUraniumDevProjectsTask.this.getTargetDir(), "build.gradle");
            }

            public File call(Object obj) {
                return new File(GenUraniumDevProjectsTask.this.getTargetDir(), "build.gradle");
            }
        };
    }

    public File getTargetDir() {
        return (File)this.targetDir.call();
    }

    public void setTargetDir(DelayedFile targetDir) {
        this.targetDir = targetDir;
    }

    public GenUraniumDevProjectsTask addSource(DelayedFile source) {
        this.sources.add(source);
        return this;
    }

    public GenUraniumDevProjectsTask addResource(DelayedFile resource) {
        this.resources.add(resource);
        return this;
    }

    public GenUraniumDevProjectsTask addTestSource(DelayedFile source) {
        this.testSources.add(source);
        return this;
    }

    public GenUraniumDevProjectsTask addTestResource(DelayedFile resource) {
        this.testResources.add(resource);
        return this;
    }

    public String getMappingChannel() {
        String channel = (String)this.mappingChannel.call();
        return channel.equals("{MAPPING_CHANNEL}") ? null : channel;
    }

    public void setMappingChannel(DelayedString mChannel) {
        this.mappingChannel = mChannel;
    }

    public String getMappingVersion() {
        String version = (String)this.mappingVersion.call();
        return version.equals("{MAPPING_VERSION}") ? null : version;
    }

    public void setMappingVersion(DelayedString mappingVersion) {
        this.mappingVersion = mappingVersion;
    }

    public String getMcVersion() {
        return (String)this.mcVersion.call();
    }

    public void setMcVersion(DelayedString mcVersion) {
        this.mcVersion = mcVersion;
    }

}
