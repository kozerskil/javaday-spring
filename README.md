# javaday-spring

https://start.spring.io/

```
JAVA_HOME=/usr/lib/jvm/java-11-openjdk-11.0.4.11-0.fc30.x86_64
```
```
mvn package -DskipTests=true & java -jar target/demo-0.0.1-SNAPSHOT.jar
```
```
http localhost:8081/hello -v
```
```
ps_mem
```
```
mvn package
docker build -t javaday-spring .
docker run --rm -d -p 8081:8081 --name spring javaday-spring
docker stop spring
```
