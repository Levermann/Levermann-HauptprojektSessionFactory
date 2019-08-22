package com.levermann.utilHandling;

import com.levermann.sessionControlClasses.Analysissteps;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.List;

/**
 * A DAO implementation for the {@link Analysissteps} class
 *
 * @author saifasif
 */
public class AnalysisstepsG extends GenericHibernate<Analysissteps, Serializable> {

    //private Criteria criteria = HibernateUtil.getSession().createCriteria(Human.class);

    public Analysissteps getACompanyByID(String id) {
        List<Analysissteps> resultList = findByCriteria(Restrictions.eq("id", id));
        if (!resultList.isEmpty()) {
            return findByCriteria(Restrictions.eq("id", id)).get(0);
        }
        return null;
    }

    public  List<Analysissteps> getAllCompanies() {
        return findAll();
    }

    public  List<Analysissteps> findByExample(Analysissteps exampleInstance) {
        return null;
    }


}