## Dependencies
### Spring Boot
- Ensure your project includes the Spring Boot framework as a dependency:

    If you are using Maven, add the following to your `pom.xml`:

    ```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
  
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
    ```

    If you are using Gradle, add the following to your `build.gradle`:
    ```xml
    dependencies {
      implementation 'org.springframework.boot:spring-boot-starter-web'
      testImplementation 'org.springframework.boot:spring-boot-starter-test'
    }
    ```
  
### MongoDB
- Add the following configuration to your application properties or YAML file:

     ```properties
     spring.data.mongodb.uri=mongodb+srv://<username>:<password>@cluster0.mongodb.net/<dbname>?retryWrites=true&w=majority
     ```
- Ensure your project includes the MongoDB driver as a dependency.

    If you are using Maven, add the following to your `pom.xml`:

     ```xml
     <dependency>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-data-mongodb</artifactId>
     </dependency>
     ```
 
     Add the following plugin to your  `pom.xml`:
 
     ```xml
     <plugins>
       <plugin>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-maven-plugin</artifactId>
       </plugin>
     </plugins>
     ```
 
    If you are using Gradle, add the following to your `build.gradle`:

     ```groovy
     dependencies {
     implementation 'org.springframework.boot:spring-boot-starter-data-mongodb'
     }
     ```
### Swagger UI
- Ensure your project includes the Spring Boot framework as a dependency:

    If you are using Maven, add the following to your `pom.xml`:

    ```xml
    <dependency>
      <groupId>io.springfox</groupId>
      <artifactId>springfox-boot-starter</artifactId>
      <version>3.0.0</version>
    </dependency>
    ```
    If you are using Gradle, add the following to your `build.gradle`:

    ```xml
    dependencies {
      implementation 'io.springfox:springfox-starter:3.0.0'
    }
    ```
    Add the following code to configure Swagger in your application:

    ```java
    import org.springframework.context.annotation.Bean;
    import org.springframework.context.annotation.Configuration;
    import springfox.documentation.builders.RequestHandlerSelectors;
    import springfox.documentation.spi.DocumentationType;
    import springfox.documentation.spring.web.plugins.Docket;

    @Configuration
    public class SwaggerConfig {

      @Bean
      public Docket api() {
          return new Docket(DocumentationType.SWAGGER_2)
                  .select()
                  .apis(RequestHandlerSelectors.basePackage("your.package.name"))
                  .build();
      }
      @Bean
      public ApiInfo apiInfo() {
          final ApiInfoBuilder builder = new ApiInfoBuilder();
          return builder.build();
      }
    }
    ```
