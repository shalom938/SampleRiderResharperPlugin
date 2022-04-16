package model.rider

import com.jetbrains.rd.generator.nova.*
import com.jetbrains.rd.generator.nova.PredefinedType.void
import com.jetbrains.rd.generator.nova.csharp.CSharp50Generator
import com.jetbrains.rd.generator.nova.kotlin.Kotlin11Generator
import com.jetbrains.rider.model.nova.ide.SolutionModel

object MethodInfoModel : Ext(SolutionModel.Solution) {

    private var MethodInfo = structdef {
        field("fqn", PredefinedType.string)
        field("filePath", PredefinedType.string)
    }


    init{
        setting(CSharp50Generator.Namespace, "ReSharperPlugin.SampleRiderResharperPlugin.Rider")
        setting(Kotlin11Generator.Namespace, "org.rider.plugins.sampleriderplugin")
        call ("getMethodUnderCaret", void,MethodInfo)
    }

}