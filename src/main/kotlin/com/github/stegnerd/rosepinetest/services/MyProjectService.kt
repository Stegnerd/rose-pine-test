package com.github.stegnerd.rosepinetest.services

import com.intellij.openapi.project.Project
import com.github.stegnerd.rosepinetest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
