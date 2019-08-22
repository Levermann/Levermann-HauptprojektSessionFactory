package com.levermann.sessionControlClasses;



import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil
{

    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory()
    {
        try
        {
            if (sessionFactory == null)
            {
                Configuration configuration = new Configuration()
                .setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
                .setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver")
                .setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/levermann?zeroDateTimeBehavior=convertToNull")
                .setProperty("hibernate.connection.username", "Levermann")
                .setProperty("hibernate.connection.password", "Levermann")
                        .setProperty("hibernate.connection.autoReconnect", "true")
                        .setProperty("hibernate.order_updates", "true")
           .addAnnotatedClass(Company.class);
                // .addAnnotatedClass(com.levermann.entityclass.Company)


                StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
                serviceRegistryBuilder.applySettings(configuration.getProperties());
                ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            }

        } catch (HibernateException ex)
        {
            System.err.println("Initial SessionFactory creation failed." + ex);
            ex.printStackTrace();
        }

        return sessionFactory;

    }

    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }

    public static void shutdown()
    {
        getSessionFactory().close();
    }
}