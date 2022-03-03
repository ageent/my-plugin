package com.github.ageent.myplugin.services

import com.intellij.openapi.project.Project
import com.github.ageent.myplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
