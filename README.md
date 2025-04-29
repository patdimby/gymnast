# gymnast
Spring boot Rest API for workout application

# Spring web applications
Spring makes building web applications fast and hassle-free. By removing much of the boilerplate code and configuration associated with web development, you get a modern web programming model that streamlines the development of server-side HTML applications, REST APIs, and bidirectional, event-based systems.

# HATEOAS in Spring Boot
HATEOAS is the concept within REST that enables the client to interact with the RESTful service entirely through hyperlinks provided dynamically by the service itself. It means the client does not need to hardcode the URIs of the resource but can discover them at runtime.

In Spring Boot, HATEOAS can be implemented using the spring-boot-starter-hateoas dependency which allows the easy creation of hypermedia links and resources. With HATEOAS each resource representation returned by the server can contain the links to related resources or actions that the client can follow.

[Hateoas](https://docs.spring.io/spring-boot/reference/web/spring-hateoas.html)

# springdoc-openapi
springdoc-openapi java library helps to automate the generation of API documentation using spring boot projects. springdoc-openapi works by examining an application at runtime to infer API semantics based on spring configurations, class structure and various annotations.

Automatically generates documentation in JSON/YAML and HTML format APIs. This documentation can be completed by comments using swagger-api annotations.