package model.rider

import com.jetbrains.rd.generator.nova.*
import com.jetbrains.rd.generator.nova.PredefinedType.*
import com.jetbrains.rd.generator.nova.csharp.CSharp50Generator
import com.jetbrains.rd.generator.nova.kotlin.Kotlin11Generator
import com.jetbrains.rider.model.nova.ide.SolutionModel

object SampleModel : Ext(SolutionModel.Solution) {



    init {
        setting(CSharp50Generator.Namespace, "ReSharperPlugin.SampleRiderResharperPlugin.Rider")
        setting(Kotlin11Generator.Namespace, "org.rider.plugins.sampleriderplugin")
        property("someProp", string)
        property("methodInfo" ,string)
        source("refresh", bool).documentation = "Refresh"
        call ("hasMethod", void, bool)
    }

}