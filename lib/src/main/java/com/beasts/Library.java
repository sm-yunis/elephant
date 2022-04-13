package com.beasts;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Library {

    public void run() {

        EntityManagerFactory emf  = null;
        EntityManager entityManager = null;

        try {
            emf = Persistence.createEntityManagerFactory("elephant-persistence-unit");
            entityManager = emf.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(new Person("Eman", 27, false));
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
            emf.close();
        }

    }
}
