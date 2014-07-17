call mvn install

call mvn install:install-file -DgroupId=quickstart -DartifactId=web -Dversion=1.0.0 -Dpackaging=jar -Dfile=target/springmvc-quickstart-1.0.0.jar -DgeneratePom=true

call mvn archetype:create -DarchetypeGroupId=quickstart -DarchetypeArtifactId=web -DgroupId=com.yunos -DartifactId=quickstart