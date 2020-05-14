# simple-cloud-config

simple-cloud-config is a gradle project meant to illustrate basic usage of a Spring Cloud Config server for managing properties and a client application that consumes them.  Some of what's illustrated:

* Spring Cloud Config server
* Spring Boot client
* Gradle multi-project structure

## Usage

Clone the repository and execute the following.  The client runs on port 8001 and the server runs on port 8002.

```
// Uses the docker-compose.yml file to start the client and the server
./gradlew dockerComposeUp
```

You can view the service logs by running the following.

```
docker-compose logs -f
```

## License
[MIT](https://choosealicense.com/licenses/mit/)