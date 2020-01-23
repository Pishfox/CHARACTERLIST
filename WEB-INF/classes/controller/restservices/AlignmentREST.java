package controller.restservices;

import entities.Alignment;
import controller.*;
import java.io.Serializable;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.*;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.json.*;

@ApplicationScoped
@Path("/Alignment")
public class AlignmentREST implements Serializable {

    @PgDatabase
    @Inject
    private EntityManager em;

    @GET
    @Path("/findAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Alignment> findAll() throws JSONException {
        TypedQuery<Alignment> query = em.createNamedQuery("Alignment.findAll", Alignment.class);
        List<Alignment> results = query.getResultList();
        return results;
    }
    
    @GET
    @Path("/findById")
    @Produces(MediaType.APPLICATION_JSON)
    public String findById() {
        TypedQuery<Alignment> query = em.createNamedQuery("Alignment.findById", Alignment.class);
        String result = query.getSingleResult().toString();
        return result;
    }
}
