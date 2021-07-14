# Simple management people system API REST with Spring Boot

To run the project without a terminal, type the following command:

```shell script
mvn spring-boot:run 
```
If you can't start/compile the project by some error linked about Controller and Services add it Annotations on Main :

- @SpringBootApplication
- @ComponentScan({"com.github.personapi.controller", "com.github.personapi.service"}) <- Path of your controllers and services !
- @EntityScan("com.github.personapi.entity") <- Path of your entities
- @EnableJpaRepositories("com.github.personapi.repository") <- Path of your repositories

After executing the above command, just open the following address and view the project execution:


```
http://localhost:8080/api/v1/people
```


The following prerequisites are necessary for the execution of the developed project

* [SDKMan! para gerenciamento e instalação do Java e Maven](https://sdkman.io/)
* [Referência do Intellij IDEA Community, para download](https://www.jetbrains.com/idea/download)
* [Palheta de atalhos de comandos do Intellij](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)
* [Site oficial do Spring](https://spring.io/)
* [Site oficial do Spring Initialzr, para setup do projeto](https://start.spring.io/)
* [Site oficial do Heroku](https://www.heroku.com/)
* [Site oficial do GIT](https://git-scm.com/)
* [Site oficial do GitHub](http://github.com/)
* [Documentação oficial do Lombok](https://projectlombok.org/)
* [Documentação oficial do Map Struct](https://mapstruct.org/)
* [Referência para o padrão arquitetural REST](https://restfulapi.net/)

