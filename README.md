# Microservises Task

**Description**

It is an application to get acquainted with Spring Cloud. 
<br>


## Installation and Running
* JDK
* Apache Maven
* PostgreSql
* Postman

**_Running the project:_**
1. Clone this project to your local repository
2. Create an empty database and change login and password in config_server properties for database
3. Run config_server (port:8888)
4. Run eureka_server (port:8761)
5. Run gateway (port:8084)
6. Run user_service (port:8081)
7. Run movie_service (port:8082)
8. Run review_service (port:8083)


**_Check if application works correctly:_**
1. Open Postman
2. Do post request to save user: http://localhost:8084/user/users/save <br>
Json should have the next fields {email, firstName, lastName}
3. Do post request to save movie: http://localhost:8084/movie/movies/save <br>
   Json should have the next fields {title, directorName,releaseDate}
4. Do post request to save review   http://localhost:8084/revie/review/save <br>
Json should have the next fields: {userId, movieId, rating, comment}
5. Do get request: http://localhost:8084/review/reviews/{review_id}

## Main Technologies and Instruments
* Spring Boot
* Maven
* JPA
* PostgreSql
* Liquibase
* Zuul, FeignClient
