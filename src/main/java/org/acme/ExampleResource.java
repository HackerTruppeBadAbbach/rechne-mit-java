package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("rechne")
public class ExampleResource {
    @Path("/{y}mal{z}")
    @GET()
    @Produces(MediaType.TEXT_HTML)
    public String mal(long y, long z) {
        long x=y*z;
       
        //return "Ergebnis von "+y+" mal "+z+" ist: "+String.format("%,d", x);
        return "<html><body><h1>Ergebnis von "+y+" mal "+z+" ist: "+String.format("%,d", x)+"</h1></body></html>";

    }
    @Path("/{y}plus{z}")
    @GET()
    @Produces(MediaType.TEXT_PLAIN)
    public String plus(float y, float z) {
        double x=y+z;
        return "Ergebnis von "+y+" plus "+z+" ist: "+x;
    }

}
