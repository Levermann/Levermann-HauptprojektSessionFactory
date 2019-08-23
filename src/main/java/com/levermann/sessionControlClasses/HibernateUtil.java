package com.levermann.sessionControlClasses;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static final Logger log = Logger.getLogger(HibernateUtil.class);

    private static SessionFactory sessionFactory = buildSessionFactory();

    private static  SessionFactory buildSessionFactory() {
        try {
            if (sessionFactory == null) {
                /*
                 * Load up the configuration using the hibernate.cfg.xml
                 */
                Configuration configuration = new Configuration()
                        .setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
                        .setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver")
                        .setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/levermann?useSSL=false&serverTimezone=UTC")
                        .setProperty("hibernate.connection.username", "Levermann")
                        .setProperty("hibernate.connection.password", "Levermann")
                        .setProperty("hibernate.connection.autoReconnect", "true")
                        .setProperty("hibernate.order_updates", "true")
                        .addAnnotatedClass(com.levermann.entityclass.Company.class)
                        .addAnnotatedClass(com.levermann.entityclass.AnalysisSteps.class)
                        .addAnnotatedClass(com.levermann.entityclass.AnalysisRating.class);
                //(HibernateUtil.class.getResource("/resources" +"/hibernate.cfg.xml"));

                /*
                 * Build the registry using the properties in the configuration
                 */
                StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
                serviceRegistryBuilder.applySettings(configuration.getProperties());
                ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            }
        } catch (HibernateException ex) {
            System.err.println("Initial SessionFactory creation failed" + ex);
            ex.printStackTrace();
        }
        return sessionFactory;
    }
    public static SessionFactory getSessionFactory() {return sessionFactory;}
    public static void shutdown() {getSessionFactory().close();}

    /**
     * The main utility method to be used to retreive the transaction.
     *
     * @return {@link Transaction} The transaction of the current session
     */
    public static  Transaction getTransaction() throws Exception {
        Session s = getSessionFactory().getCurrentSession();
        Transaction tx = s.beginTransaction();
        tx.setTimeout(10);
        return tx;

    }

}