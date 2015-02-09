package org.celtab.services;

import java.util.concurrent.Future;

import javax.ejb.AsyncResult;
import javax.ejb.Asynchronous;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RequestScoped
@Path("/person")
public class PersonResource {

	@GET @Produces("application/json")
	@Asynchronous
	public Future<String> welcome()		{
		return new AsyncResult<String>("Hey !!!");
	}
}
