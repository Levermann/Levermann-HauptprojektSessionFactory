package com.levermann.utilHandling;

import com.levermann.sessionControlClasses.Analysisrating;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.List;

/**
 * A DAO implementation for the {@link Analysisrating} class
 *
 * @author LisaStolz
 */
public class AnalysisratingG extends GenericHibernate<Analysisrating, Serializable> {

    //private Criteria criteria = HibernateUtil.getSession().createCriteria(Human.class);

    public Analysisrating getACompanyByID(String id) {
        List<Analysisrating> resultList = findByCriteria(Restrictions.eq("id", id));
        if (!resultList.isEmpty()) {
            return findByCriteria(Restrictions.eq("id", id)).get(0);
        }
        return null;
    }

    public  List<Analysisrating> getAllCompanies() {
        return findAll();
    }

    public  List<Analysisrating> findByExample(Analysisrating exampleInstance) {
        return null;
    }


}