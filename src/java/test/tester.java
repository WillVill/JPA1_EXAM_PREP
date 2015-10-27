/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import objects.Project;
import objects.ProjectUser;
import objects.Task;

/**
 *
 * @author bechw
 */
public class tester {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA1_EXAM_PREPPU");
        EntityManager em = emf.createEntityManager();
        EntityManager em1 = emf.createEntityManager();
        EntityManager em2 = emf.createEntityManager();
        
        Project p = new Project("name","desc","today","tomorrow");
        ProjectUser pu = new ProjectUser("name", "mail", "today");
        Task t = new Task("name", "description", 10, 11);
        
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
        
        em1.getTransaction().begin();
        em1.persist(pu);
        em.getTransaction().commit();
        em1.close();
        
        em2.getTransaction().begin();
        em2.persist(t);
        em.getTransaction().commit();
        em2.close();
        
    }
}
