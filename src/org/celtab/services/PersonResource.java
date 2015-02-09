package org.celtab.services;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RequestScoped
@Path("/person")
public class PersonResource {

	@Produces("text/plain")
	@GET
	public String welcome()		{
		return "Hey !!!";
	}
}
