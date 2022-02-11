# To run
To start the application, execute the following commands in sequence.


###Backend Challenge

Go inside the backend directory and execute the following commands in sequence to build and start the application.

To build and generate a jar with embedded tomcat execute the following in the cloned project directory.
> mvn clean install

### Dockerize the app
To containerizing the application using docker, the image needs to be created first.
>docker image build -t bayer-challenge -f DockerFile .

###Run the application

Start the docker container using the following command
>docker run -p 8080:8080 bayer-challenge

The above command will start the backend springboot application on port 8080.

Alternatively, the backend application can be started without docker, by executing the following command.
>java -jar .\target\backend-0.0.1-SNAPSHOT.jar

The above commands uses windows path(if executing in linux change the pattern to linux path)

## Backend API's Calls.
There is only one exposed API which returns the list of characters, it accepts a query param called name which can be used to filter the characters based on the name, incase name param is not passed, it will return all the characters.

API Endpoint = http://localhost:8080/character?name=somename

### To Test
Import the RestAPI's Insomnia.json file(inside backend folder) in Insomnia application(link below), and test the application using the api. 
> Insomnia : https://insomnia.rest/download

Alternatively, the api can be directly tested using curl or any other rest client. 

To test with curl execute the following. 
>curl "http://localhost:8080/character?name=rick"