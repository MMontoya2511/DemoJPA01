package pe.edu.cibertec.relations;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Estudiante;

public class JPAManyToMany {

    public static void main(String[] args) {

        // referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        //obtener estudiante
        Estudiante estudiante = em.find(Estudiante.class, "E1");

        // imprimir cursos
        estudiante.getCurso().forEach(System.out::println);

    }
}
