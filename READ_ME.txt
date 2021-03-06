DESCRIPTION:
THIS IS A BASIC SPRINGBOOT API WHICH RETURNS HELLO WORLD AS A TEXT AND HTTP STATUS 200.

REQUIREMENTS:
1. You need an Laptop that can run local server or localhost.
2. you will need an IDE that can open Maven projects.
3. All the dependencies required to run the program are in POM.xml
4. You might need an internet connection to install dependencies if not installed already.

HOW TO RUN:

1. Open ide and run SampleApplication.java (it will run as java application) path to this file is 
 	"sample/src/main/java/com/example/manas/web/sample" there you will see the file named 		"SampleApplication.java".
2. After running this file you will notice Tomcat server will start on the port 8080.
3. Open Postman or any browser will also work and send a HTTP request "localhost:8080/helloworld"
  	this will return Hello world as a message and a HTTP status of 200.
	PATH FOR THE FILE:
	"sample/src/main/java/com/example/manas/web/sample/helloworld/HelloController"
4. You can also try hitting localhost:8080/hellobean this will return a message "Hello world" in 		JSON with status 200.
	"sample/src/main/java/com/example/manas/web/sample/helloworld/HelloController.java"- file 	for handling GET request.
	""sample/src/main/java/com/example/manas/web/sample/helloworld/Hellobean.java"-File to see 		structure of the bean.


IMPROVEMENTS:
	I will be adding some more functionalities to the Repository and according to that i will 		change the description.
	