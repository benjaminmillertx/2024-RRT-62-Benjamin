package org.example.database.dao;

import org.example.database.entity.Employee;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class EmployeeDAO {
    public void insert(Employee employee) {
        // these 2 lines of code prepare the hibernate session for use
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // begin the transaction
        session.getTransaction().begin();

        // insert the employee to the database
        session.save(employee);

        /// commit our transaction
        session.getTransaction().commit();

        // cleanup the session
        session.close();
    }


    public List<Employee> findByFirstName(String firstName) {
        // this is where the code goes to execute the query

        return null;
    }

    public List<Employee> findByLastName(String lastName) {
        // this is where the code goes to execute the query

        return null;
    }
}