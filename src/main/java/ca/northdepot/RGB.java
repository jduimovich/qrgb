package ca.northdepot;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class RGB {
    @Path("test")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response test() { 
       return new Response("1.12", "blue", 1800, 12);
    }
} 
