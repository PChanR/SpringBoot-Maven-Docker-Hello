# SpringBoot-Maven-Docker-Hello
Dockerize a Spring Boot application


Running the app with Docker
* First you have to generate .jar file by running:
  
  mvn clean package
  
* Then, you just need to execute:
 
 docker build -t <image-name> .
 
* We're almost there to have our application up and running on Docker. We just need to create a container using the new image:
 
 docker run -p 8000:8080 <new-image-name>
 
 By using the -p  we're telling docker to expose the container's port 8080 on the host's port 8000. We can access from our machine to localhost:8000
 
 
 * You used Docker to run the application:

    > You built the image using docker build.
    > You ran the container using docker run, specifying the port to make it available from the host.
 
 
 
