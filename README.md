# RESTful web service using Jersey and Jackson (Maven Project in Eclipse):

This is a simple example of RESTful web service which is developed using Jersey, Jackson and maven technologies in Eclipse.

1. Create a simple Dynamic web project and then convert it to Maven in Eclipse.
2. Add the following dependencies for Jersey and Jackson in your pom.xml file.
      
    <dependency>
			<groupId>com.sun.jersey</groupId>
			<artifactId>jersey-server</artifactId>
			<version>1.19</version>
		</dependency>
    
		<dependency>
			<groupId>com.sun.jersey</groupId>
			<artifactId>jersey-servlet</artifactId>
			<version>1.19</version>
		</dependency>

		<dependency>
			<groupId>com.sun.jersey</groupId>
			<artifactId>jersey-server</artifactId>
			<version>1.8</version>
		</dependency>

		<dependency>
			<groupId>com.sun.jersey</groupId>
			<artifactId>jersey-json</artifactId>
			<version>1.8</version>
		</dependency>

3. Now add Jersey servlet to web.xml.

  <servlet>
		<servlet-name>Jerseydemo</servlet-name>
		<servlet-class>com.sun.jersey.spi.container.servlet.ServletContainer</servlet-class>
		<init-param>
			<param-name>com.sun.jersey.config.property.packages</param-name>
			<param-value>com.demo</param-value>
		</init-param>
			<load-on-startup>1</load-on-startup>
	</servlet>
  
   <servlet-mapping>
		<servlet-name> Jerseydemo </servlet-name>
		<url-pattern>/*</url-pattern>
	</servlet-mapping>     

4. In web.xml, declares “com.sun.jersey.api.json.POJOMappingFeature” as “init-param” in  
    Jersey mapped servlet. It will make Jersey support JSON/object mapping.
     
        <init-param>
	         <param-name>com.sun.jersey.api.json.POJOMappingFeature</param-name>
	          <param-value>true</param-value>
         </init-param>

5. Create class TestRESTfulWS as: 
         
       package com.demo;

       @Path("/")
       public class TestRESTfulWS {

	     @GET
	     @Path("/getStudent")
	     @Produces(MediaType.APPLICATION_JSON)
	     public Student getStudent() {
		       // for demo the student object is created here.
		       Student student = new Student("suresh", "adhikari", "San Diego, CA", "suresh@adhikari.com");
		   return student;
	     }}

6. Create POJO class Student. 
7. Right click on project and run it as run on server. 
8. Click on the link http://localhost:8080/RESTfulWS/getStudent. It will return JSON data: 

        {"address":"San Diego, CA","firstName":"suresh","secondName":"adhikari","email":"suresh@adhikari.com"}
