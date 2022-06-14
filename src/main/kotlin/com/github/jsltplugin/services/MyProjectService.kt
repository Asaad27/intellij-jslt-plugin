package com.github.jsltplugin.services

import com.intellij.openapi.project.Project
import com.github.jsltplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
