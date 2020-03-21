package company.services;

import java.util.Properties;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

@Path("properties")
public class Resource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Properties getProperties() {
        System.out.println("HEJHEJ");
        return System.getProperties();
    }

    // @POST
    // @Path("/{id}")
    // @Consumes(MediaType.APPLICATION_JSON)
    // public Properties getProperties(@PathParam("id") String id) {
    //     System.out.println("HEJHEJ");
    //     return System.getProperties();
    // }

    @POST
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateHook(){
        System.out.println("Update hook called!");
    }

}