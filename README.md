# jersey-rest-assured-code-coverage-with-jacococli-and-jacocoagent-master
* First download the latest version 0.8.5 of jacocoagent and jacococli jar from jacoco zip archieve https://www.eclemma.org/jacoco/

* create war of project and before deploying war to tomact create a setenv.bat file inside `<tomcat-home-directory>/bin` and add set JAVA_OPTS inside that file like below.in case of linux counter file is setenv.sh .
  
  `set JAVA_OPTS="-javaagent:<path-of-jar>\jacocoagent.jar=address=*,port=36320,destfile=jacoco-it.exec,output=tcpserver"`
  
* after creating setenv.bat file start tomcat

* then use below command to hit rest endpoints or else run test using gradlew test command
  
    `curl -X GET http://localhost:8080/webapi/employee/145`
    
    `curl -X GET http://localhost:8080/webapi/employee/hello`

* now dump the file, which will be in exec format. This code will be all data collected from javaagent to analyze the code coverage. We will use this command to dump the report and the dump file will be inside the build folder.
       
       'java -jar <path-of-jar>/jacococli.jar dump --address localhost --port 36320 --destfile <path-to-application>/build/jacoco-it.exec'
* we will use the below command to create the final report and to generate code coverage reports readable in many formats, including HTML, CSV, and XML.
       
       'java -jar <path-of-jar>/jacococli.jar report <path-to-application>/build/jacoco-it.exec --classfiles <path-to-application>/build/classes/ --sourcefiles <path-to-application>/src/main/java/ --html <path-to-application>/build/jacoco-report'
