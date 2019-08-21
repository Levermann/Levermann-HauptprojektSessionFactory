package com.levermann.sessionControlClasses;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.apache.log4j.Logger;

import javax.imageio.spi.ServiceRegistry;
import java.util.ArrayList;
import java.util.List;

public class HibernateUtil {
   // private static final Logger log = Logger.getLogger(HibernateUtil.class);

    @SuppressWarnings({"unchecked", "rawtypes", "serial"})
    private static final List<Class<?>> classList = new ArrayList() {{
        add(com.levermann.entityclass.Company.class);
        add(com.levermann.entityclass.AnalysisSteps.class);
        add(com.levermann.entityclass.AnalysisRating.class);
    }};
    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {

        try {
            if (sessionFactory == null) {
                Configuration configuration = new Configuration().configure(HibernateUtil.class.getResource("/hibernate.cfg.xml"));
                StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
                serviceRegistryBuilder.applySettings(configuration.getProperties());
                ServiceRegistry serviceRegistry = (ServiceRegistry) serviceRegistryBuilder.build();
            //    for (Class<?> pojoClass : classList) {
                //    log.info("Adding annotated class : " + pojoClass.getCanonicalName());
               // }
                sessionFactory = configuration.buildSessionFactory((org.hibernate.service.ServiceRegistry) serviceRegistry);
            }

        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed" + ex);
            throw new ExceptionInInitializerError(ex);
        }

         return sessionFactory;
    }

    public static Session getSession()
        throws HibernateException { return sessionFactory.openSession();
    }
    public static Session getCurrentSession()
        throws HibernateException { return sessionFactory.getCurrentSession();

    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }


    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();

    }

    private static Transaction getTransaction() throws Exception {
        Session s = getSessionFactory().getCurrentSession();
        Transaction transaction = s.beginTransaction();
        transaction.setTimeout(12);
        return transaction;
    }
}