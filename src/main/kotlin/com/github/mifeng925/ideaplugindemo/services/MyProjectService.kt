package com.github.mifeng925.ideaplugindemo.services

import com.intellij.openapi.project.Project
import com.github.mifeng925.ideaplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
