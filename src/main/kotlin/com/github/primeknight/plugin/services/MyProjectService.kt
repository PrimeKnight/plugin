package com.github.primeknight.plugin.services

import com.intellij.openapi.project.Project
import com.github.primeknight.plugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
