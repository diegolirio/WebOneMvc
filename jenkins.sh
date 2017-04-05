container=vsWebOneMvc
pwd
ls -la

if sudo docker ps | awk -v container="container" 'NR>1{  ($(NF) == container )  }'; then
  sudo docker stop "$container" && sudo docker rm -f "$container"
fi
#sudo docker run -itd --name $container -p 9001:8080  -m 1024M  diegolirio/tomcat:1.0 /bin/bash
sudo docker run -itd --name $container -p 9001:8080 diegolirio/tomcat8:1.0 /bin/bash


url=https://github.com/diegolirio/WebOneMvc.git
echo $url
sudo docker exec -i $container bash -c "cd /root && git clone $url"
sudo docker exec -i $container bash -c "apt-get install -y zip"
sudo docker exec -i $container bash -c "cd /root/WebOneMvc/build && cp -R classes/ ../WebContent/WEB-INF/ && cd ../WebContent/ && zip -r WebOneMvc.war * && mv WebOneMvc.war /usr/local/tomcat/webapps/"
sudo docker exec -i $container bash -c "bin/catalina.sh start"
