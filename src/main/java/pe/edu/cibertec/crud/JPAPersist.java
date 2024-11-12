package pe.edu.cibertec.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Libro;

import java.util.Date;

public class JPAPersist {

    public static void main(String[] args) {

        // referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        // crear un libro
        Libro libro = new Libro("A100", "titulo", "autor", new Date(), 50.45, null);

        //persist
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();

    }

}
