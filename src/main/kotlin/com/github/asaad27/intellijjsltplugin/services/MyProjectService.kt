package com.github.asaad27.intellijjsltplugin.services

import com.intellij.openapi.project.Project
import com.github.asaad27.intellijjsltplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
