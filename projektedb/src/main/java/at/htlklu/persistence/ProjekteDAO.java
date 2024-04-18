package at.htlklu.persistence;

import at.htlklu.entities.Mitarbeiter;
import at.htlklu.entities.Projekte;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ProjekteDAO {
    public static List<Projekte> getAllProjekte(){
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("select e from Projekte e").getResultList();
    }

    public static List<Mitarbeiter> getAllMitarbeiter() {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        return em.createQuery("select e from Mitarbeiter e").getResultList();
    }

    public static List<Mitarbeiter> findAdress(String name) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        TypedQuery<Mitarbeiter> query = em.createQuery("select e from Mitarbeiter e where e.nachname = ?1 ", Mitarbeiter.class);
        List <Mitarbeiter> mlist = query.setParameter(1, name).getResultList();
        return mlist;
    }
}
