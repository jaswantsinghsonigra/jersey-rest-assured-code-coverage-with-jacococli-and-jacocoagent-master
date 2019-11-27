# jersey-rest-assured-code-coverage-with-jacococli-and-jacocoagent-master
* create war of project and before deploying war to tomact create a setenv.bat file inside tomact_home/bin and add set JAVA_OPTS inside that file like below.in case of linux counter file is setenv.sh .
  'set JAVA_OPTS="-javaagent:<path-of-jar>\jacocoagent.jar=address=*,port=36320,destfile=<path-to-application>\build\jacoco-it.exec,output=tcpserver"'
* after creating setenv.bat file start tomcat
* then use below command to hit rest endpoints or else run test using gradlew test command
  'curl -X GET http://localhost:8080/webapi/employee/145'
  'curl -X GET http://localhost:8080/webapi/employee/hello'
*
