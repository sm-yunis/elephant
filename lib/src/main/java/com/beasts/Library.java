package com.beasts;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Library {

    public void run() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("elephant-persistence-unit");

        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(new Person("Sumeya",23,false));
        entityManager.getTransaction().commit();
        entityManager.close();
        emf.close();
    }
}
