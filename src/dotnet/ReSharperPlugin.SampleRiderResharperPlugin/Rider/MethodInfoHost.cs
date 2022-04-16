using JetBrains.Application.Threading;
using JetBrains.Lifetimes;
using JetBrains.ProjectModel;
using JetBrains.Rd.Tasks;
using JetBrains.RdBackend.Common.Features;
using JetBrains.RdBackend.Common.Features.Util;
using JetBrains.Util;

namespace ReSharperPlugin.SampleRiderResharperPlugin.Rider
{
    [SolutionComponent]
    public class MethodInfoHost
    {
        public MethodInfoHost(ISolution solution,ILogger logger)
        {
            var model = solution.GetProtocolSolution().GetMethodInfoModel();


            logger.Info("building GetMethodUnderCaret");
            model.GetMethodUnderCaret.Set( (lifetime, request) =>
            {
                logger.Info("Calling GetMethodUnderCaret");
                return JetBrains.Rd.Tasks.RdTask<MethodInfo>.Successful(new MethodInfo("the fqn", "file name"));
            });
        }
    }
}