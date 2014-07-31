WebOneMvc
======

Java One Web Mvc Testes....

IDE: eclipse
Padrão MVC
Servlet + JSP

Deploy de AppWeb….
Gerando o .war

Dentro da minha pasta WebContent ou Webapp precisa estar a arquiteura da seguinte forma:

- WebContent/
            |-------------- *.html
            |-------------- WEB-INF/
                               |---------------- web.xml
                               |---------------- lib/
                               |                  |------------ *jar
                               |---------------- classes/
                                                     |----------------- br.com.pacote.*.class

Estando da seguinte forma basta zipar os arquivos *.html e WEB-INF (e se tiver mais algum).

Agora altere de WebContent.zip para nome_da_minha_app.war e jogar no meu servidor de Aplicação!

