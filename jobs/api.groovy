import javaposse.jobdsl.dsl.DslFactory
import uk.gov.hmrc.jenkinsjobbuilders.domain.BuildMonitorViewBuilder
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtFrontendJobBuilder

new SbtFrontendJobBuilder('api-example-scala-client').
        build(this as DslFactory)


new BuildMonitorViewBuilder('API-MONITOR')
        .withJobs('api-example-scala-client').build(this)
