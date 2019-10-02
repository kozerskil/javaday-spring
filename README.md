# javaday-spring

https://start.spring.io/

```
. ./setenv.sh
```
```
mvn package -DskipTests=true
java -jar target/demo-0.0.1-SNAPSHOT.jar
```
```
http localhost:8081/hello -v
```
```
ps_mem
```
```
docker network create javaday-net
```
```
mvn clean
mvn package
docker build -t javaday-spring .
docker run --rm -d -p 8081:8081 -m 256m --network javaday-net --name spring javaday-spring
docker stop spring
```
