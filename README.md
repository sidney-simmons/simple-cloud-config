# simple-cloud-config

simple-cloud-config is a gradle project meant to illustrate basic usage of a Spring Cloud Config server for managing properties and a client application that consumes them.  Some of what's illustrated:

* Spring Cloud Config server
    * GitHub based repository
    * Config files separated into directories per application
* Spring Boot client
    * Client access to properties via Spring
    * Client access to properties via API
* Gradle multi-project structure

## Usage

Clone the repository and execute the following.  The client runs on port 8080 and the server runs on port 8888.

```
// Uses the docker-compose.yml file to start the client and the server
./gradlew dockerComposeUp

// Test that the externalized property is returned when you ping the client
PS C:\Users\sassi\git\simple-cloud-config> curl -Uri http://localhost:8080 | Select-Object -ExpandProperty Content
{"propertyViaSpring":"hi there!","propertyViaApi":"hello there!"}
```

You can view the service logs by running the following.

```
docker-compose logs -f
```

## License
[MIT](https://choosealicense.com/licenses/mit/)