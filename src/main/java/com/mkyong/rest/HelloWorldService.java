package com.mkyong.rest;
 
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class HelloWorldService {
 
	@GET
	@Path("/{param}")
	public Response getMsg(@Context HttpServletRequest requestContext) {
		String ip=requestContext.getRemoteAddr().toString();
		
		return Response.status(200).entity(ip).build();
 
	}
 
}