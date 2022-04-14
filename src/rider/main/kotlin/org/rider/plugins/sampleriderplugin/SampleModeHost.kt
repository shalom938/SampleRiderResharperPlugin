package org.rider.plugins.sampleriderplugin

import com.intellij.openapi.project.Project
import com.jetbrains.rd.platform.util.idea.ProtocolSubscribedProjectComponent
import com.jetbrains.rider.projectView.solution

class SampleModeHost(project: Project) : ProtocolSubscribedProjectComponent(project)  {
    val model = project.solution.sampleModel
}