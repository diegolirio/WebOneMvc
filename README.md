WebOneMvc
======

Java One Web Mvc Testes....

IDE: eclipse
Padrão MVC
Servlet + JSP

Deploy de AppWeb….
Gerando o .war

Dentro da minha pasta WebContent ou Webapp a arquiteura precisa estar da seguinte forma:

        WebContent/
            |-------------- *.html
            |-------------- WEB-INF/
                               |---------------- web.xml
                               |---------------- lib/
                               |                  |------------ *jar
                               |---------------- classes/
                                                     |----------------- br.com.pacote.*.class

Estando da seguinte forma basta zipar os arquivos *.html e WEB-INF (e se tiver mais algum).

Agora altere de WebContent.zip para nome_da_minha_app.war e jogar no meu servidor de Aplicação!   

Script para jenkins
```shell
cd build/
cp -R classes/ ../WebContent/WEB-INF/
cd ../WebContent/
zip -r WebOneMvc.war * && mv WebOneMvc.war /etc/apache-tomcat-8.5.12/webapps/
cd /etc/apache-tomcat-8.5.12/webapps/
```
