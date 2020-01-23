package controller;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named("entitymanager")
@ApplicationScoped
public class EntityManagerCreator implements Serializable {
    @Produces
    @PersistenceContext(unitName = "clPU")
    @PgDatabase
    private EntityManager em;
}
