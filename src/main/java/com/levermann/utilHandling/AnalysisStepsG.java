package com.levermann.utilHandling;

import com.levermann.entityclass.AnalysisSteps;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.List;

/**
 * A DAO implementation for the {@link AnalysisSteps} class
 *
 * @author saifasif
 */
public class AnalysisStepsG extends GenericHibernate<AnalysisSteps, Serializable> {

    //private Criteria criteria = HibernateUtil.getSession().createCriteria(Human.class);

    public  AnalysisSteps getACompanyByID(String id) {
        List<AnalysisSteps> resultList = findByCriteria(Restrictions.eq("AnalysisStepsName", id));
        if (!resultList.isEmpty()) {
            return findByCriteria(Restrictions.eq("AnalysisStepsName", id)).get(0);
        }
        return null;
    }

    public  List<AnalysisSteps> getAllCompanies() {
        return findAll();
    }

    public  List<AnalysisSteps> findByExample(AnalysisSteps exampleInstance) {
        return null;
    }


}