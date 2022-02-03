# spring-data-service

### To create service
Group: com.onejava  
Artifact: spring-data-service  
Package name: com.onejava  
JDK11, Gradle, 2.6.3, Jar  
Dependencies > Spring Data JPA, Validation(Hibernate), Web, Flyway, Lombok, MySQL Driver, Spring Configuration Processor  
Other Dependencies:  
compileOnly 'org.apache.commons:commons-lang3'  

### Tools used
We have used JPA Buddy to create Entities, Repositories, DTOs, Query DSL methods and Queries, Flyway Migration, adding validation for entities

### Flyway migration
Used Diff versioned migration of JPA Buddy to insert DB tables  
Used Empty Versioned migration of JPA Buddy to insert initial data

### Topics covered
@NamedQuery, @NamedNativeQuery support in JPARepositories   
QueryDSL methods and queries in JPARepositories   
Pagination and Sorting Support   
Testing the Repositories methods using test cases   
Flyway migration scripts for DB   
Simple RestController with CRUD operations   
ModelMappers and Dto support for APIs   
Creating custom repositories  
Logging and formatting SQL queries on logs   
JPA buddy tool usage for generating Entities, Repositories, DTOs, Query DSL methods and Queries, Flyway Migration, adding validation for entities   
