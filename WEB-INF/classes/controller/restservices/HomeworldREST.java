package controller.restservices;

import entities.Homeworld;
import controller.*;
import java.io.Serializable;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.json.JSONException;

@ApplicationScoped
@Path("/Homeworld")
public class HomeworldREST implements Serializable {

    @PgDatabase
    @Inject
    private EntityManager em;

    @GET
    @Path("/findAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Homeworld> findAll() throws JSONException {
        TypedQuery<Homeworld> query = em.createNamedQuery("Homeworld.findAll", Homeworld.class);
        List<Homeworld> results = query.getResultList();
        return results;
    }
}
