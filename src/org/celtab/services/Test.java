package org.celtab.services;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@RequestScoped
@Path("/stub")
public class Test {

	@GET
	public String get()	{
		return "";
	}
}
