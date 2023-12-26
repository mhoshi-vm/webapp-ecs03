# Accelerator Log

## Options
```json
{
  "bsGitBranch" : "main",
  "appName" : "webapp",
  "bsGitRepository" : "github.com?owner=mhoshi-vm&repo=webapp-ecs03",
  "projectName" : "java-to-ecs",
  "gitRepo" : "webapp-ecs03"
}
```
## Log
```
┏ engine (Chain)
┃  Info Running Chain(GeneratorValidationTransform, UniquePath)
┃ ┏ ┏ engine.transformations[0].validated (Combo)
┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ engine.transformations[0].validated.delegate (Chain)
┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0] (Merge)
┃ ┃ ┃ ┃  Info Running Merge(Combo, Combo, Combo)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.transformations[0].sources[0].delegate (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Exclude)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[0].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug accelerator-manifest.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug workload.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/demo/DemoApplication.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/demo/DemoController.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/demo/DemoEntity.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/demo/DemoRepository.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/demo/DemoApplicationTests.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/com/example/demo/TestDemoApplication.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[0].delegate.transformations[1] (Exclude)
┃ ┃ ┃ ┃ ┃ ┃  Info Will exclude [catalog.yaml, workload.yaml]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [catalog.yaml, workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug accelerator-manifest.yaml didn't match [catalog.yaml, workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog.yaml matched [catalog.yaml, workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [catalog.yaml, workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [catalog.yaml, workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [catalog.yaml, workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug workload.yaml matched [catalog.yaml, workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [catalog.yaml, workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [catalog.yaml, workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [catalog.yaml, workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/demo/DemoApplication.java didn't match [catalog.yaml, workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/demo/DemoController.java didn't match [catalog.yaml, workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/demo/DemoEntity.java didn't match [catalog.yaml, workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/demo/DemoRepository.java didn't match [catalog.yaml, workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/demo/DemoApplicationTests.java didn't match [catalog.yaml, workload.yaml] -> included
┃ ┃ ┃ ┃ ┗ ┗ Debug src/test/java/com/example/demo/TestDemoApplication.java didn't match [catalog.yaml, workload.yaml] -> included
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.transformations[0].sources[1].delegate (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[1].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [catalog.yaml]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [catalog.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug accelerator-manifest.yaml didn't match [catalog.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog.yaml matched [catalog.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [catalog.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [catalog.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [catalog.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug workload.yaml didn't match [catalog.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [catalog.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [catalog.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [catalog.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/demo/DemoApplication.java didn't match [catalog.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/demo/DemoController.java didn't match [catalog.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/demo/DemoEntity.java didn't match [catalog.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/demo/DemoRepository.java didn't match [catalog.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/demo/DemoApplicationTests.java didn't match [catalog.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/com/example/demo/TestDemoApplication.java didn't match [catalog.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[1].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┗ ┗  Info Will replace [CHANGEME->webapp]
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[2] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.transformations[0].sources[2].delegate (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[2].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [workload.yaml]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug accelerator-manifest.yaml didn't match [workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog.yaml didn't match [workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug workload.yaml matched [workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/demo/DemoApplication.java didn't match [workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/demo/DemoController.java didn't match [workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/demo/DemoEntity.java didn't match [workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/demo/DemoRepository.java didn't match [workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/demo/DemoApplicationTests.java didn't match [workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/com/example/demo/TestDemoApplication.java didn't match [workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[2].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [CHANGEME->webapp]
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[2].delegate.transformations[2] (ReplaceText)
┃ ┃ ┃ ┗ ┗ ┗  Info Will replace [GITREPO->webapp-ecs03]
┃ ┗ ┗ ╺ engine.transformations[0].validated.delegate.transformations[1] (UniquePath)
┗ ╺ engine.transformations[1] (UniquePath)
```
