package cc.uraniummc

import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.api.artifacts.repositories.MavenArtifactRepository
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.tasks.*

import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

class InstallBundle extends DefaultTask {
    @InputFile
    File serverJar

    @InputFiles
    ConfigurableFileCollection bootstrapClasspath

    @Input
    String bootstrapMain

    RepositoryHandler repos

    InstallBundle() {
        bootstrapClasspath = project.files()
    }

    def bootstrapClasspath(Object... args) {
        bootstrapClasspath.from args
    }

    @OutputDirectory
    def File getInstallLocation() {
        new File(project.buildDir, 'bundle')
    }

    @TaskAction
    def install() {
        installLocation.deleteDir()
        installLocation.mkdirs()
        def sb = new StringBuilder();
        def cp = bootstrapClasspath

        for(def repo:repos){
            if(repo instanceof MavenArtifactRepository){
                if(repo.getUrl().scheme.startsWith("http"))
                sb.append(repo.name).append('\n').append(repo.getUrl().toURL()).append("\n")
            }
        }
        def reposIndex = Paths.get(installLocation.canonicalPath,"kBootstrapX.reposList")
        Files.deleteIfExists(reposIndex)
        Files.write(reposIndex, sb.toString().getBytes("UTF-8"),StandardOpenOption.CREATE_NEW)
        for (int i = 0; i < 3; i++) {
            def result = project.javaexec { it ->
                workingDir installLocation
                classpath cp
                main bootstrapMain
                args '--serverDir', installLocation.canonicalPath,
                        '--installServer', serverJar.canonicalFile,
                        '--binDir', 'libraries'
            }
            if (result.exitValue == 0) return
        }
        throw new GradleException("Failed to install bundle into ${installLocation}")
    }

    private static final class NopOutputStream extends OutputStream {
        @Override
        void write(byte[] b, int off, int len) throws IOException {
        }

        @Override
        void write(byte[] b) throws IOException {
        }

        @Override
        void write(int b) throws IOException {
        }
    }
}
