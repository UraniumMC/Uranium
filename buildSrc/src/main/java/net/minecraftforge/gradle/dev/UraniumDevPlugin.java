package net.minecraftforge.gradle.dev;

import cc.uraniummc.GenUraniumDevProjectsTask;
import groovy.lang.Closure;
import lombok.val;
import net.minecraftforge.gradle.tasks.abstractutil.ExtractTask;
import net.minecraftforge.gradle.tasks.dev.*;

import java.io.File;

import static net.minecraftforge.gradle.dev.DevConstants.*;

public class UraniumDevPlugin extends CauldronDevPlugin
{
    @Override
    public void applyPlugin() {
        super.applyPlugin();
        this.createProjectTasks();
    }

    @SuppressWarnings("serial")
    private void createProjectTasks()
    {
        this.project.getTasks().remove(this.project.getTasks().findByName("generateProjectCauldron"));
        val task2 = makeTask("generateProjectCauldron", GenUraniumDevProjectsTask.class);
        {
            task2.setConfigurations(project.getConfigurations());
            task2.setRepositories(project.getRepositories());
            //task.setJson(delayedFile(ECLIPSE_CDN+"/"+EXTRA_JSON_DEV));
            task2.setTargetDir(delayedFile(ECLIPSE_CDN));

            task2.addSource(delayedFile(ECLIPSE_CDN_SRC));
            task2.addSource(delayedFile(EXTRA_SOURCES));
            task2.addTestSource(delayedFile(EXTRA_TEST_SOURCES));

            task2.addResource(delayedFile(ECLIPSE_CDN_RES));
            task2.addResource(delayedFile(EXTRA_RESOURCES));
            task2.addResource(delayedFile(EXTRACTED_RES));
            task2.addTestSource(delayedFile(EXTRA_TEST_SOURCES));

            task2.setMcVersion(delayedString("{MC_VERSION}"));
            task2.setMappingChannel(delayedString("{MAPPING_CHANNEL}"));
            task2.setMappingVersion(delayedString("{MAPPING_VERSION}"));

            task2.dependsOn("extractRes", "extractNatives","createVersionPropertiesFML");
        }

        //makeTask("generateProjects").dependsOn("generateProjectClean", "generateProjectCauldron");
    }

}
