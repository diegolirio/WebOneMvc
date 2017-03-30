# dependencias: 
# apt-get install zip
pwd
cd build/
cp -R classes/ ../WebContent/WEB-INF/
cd ../WebContent/
zip -r WebOneMvc.war * && mv WebOneMvc.war /etc/apache-tomcat-8.5.12/webapps/
cd /etc/apache-tomcat-8.5.12/webapps/
