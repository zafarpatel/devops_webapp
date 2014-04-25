rem start C:\Zap\Personal_Reserviour\Installable\Zafar\apache-tomcat-7.0.53\bin\startup.bat
cd C:\Zap\Personal_Reserviour\Installable\Zafar\source\web_application\devops_webapp
mvn clean
mvn compile
mvn package
mvn tomcat7:undeploy
mvn tomcat7:deploy
mvn tomcat7:undeploy tomcat7:deploy