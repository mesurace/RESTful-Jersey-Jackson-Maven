package com.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.demo.domain.Student;

@Path("/")
public class TestRESTfulWS {

	@GET
	@Path("/getStudent")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudent() {

		// for demo the student object is created here.
		Student student = new Student("suresh", "adhikari", "San Diego, CA", "suresh@adhikari.com");

		return student;
	}
}
