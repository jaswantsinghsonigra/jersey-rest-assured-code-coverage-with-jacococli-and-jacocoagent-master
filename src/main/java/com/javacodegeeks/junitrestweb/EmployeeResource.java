package com.javacodegeeks.junitrestweb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("employee")
public class EmployeeResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Employee getEmployee(@PathParam("id") final Long id) {
		final Employee emp = new Employee();
		emp.setId(id);
		emp.setFirstName("Jaswant");
		emp.setLastName("Singh");
		emp.setDesignation("CEO");

		return emp;
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("hello")
	public String getHelloMsg() {
		return "Hello...!!! Jaswant Singh....";
	}
}
