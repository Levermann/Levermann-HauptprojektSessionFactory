package com.levermann.utilHandling;


import com.levermann.entityclass.AnalysisRating;
import org.hibernate.criterion.Restrictions;

import java.io.Serializable;
import java.util.List;

/**
 * A DAO implementation for the {@link AnalysisRating} class
 *
 * @author saifasif
 */
public class AnalysisRatingG extends GenericHibernate<AnalysisRating, Serializable> {

    //private Criteria criteria = HibernateUtil.getSession().createCriteria(Human.class);

    public  AnalysisRating getAnAnalysisRatingNameByID(String id) {
        List<AnalysisRating> resultList = findByCriteria(Restrictions.eq("AnalysisRatingName", id));
        if (!resultList.isEmpty()) {
            return findByCriteria(Restrictions.eq("AnalysisRatingName", id)).get(0);
        }
        return null;
    }

    public  List<AnalysisRating> getAllRatings() {
        return findAll();
    }

    public  List<AnalysisRating> findByExample(AnalysisRating exampleInstance) {
        return null;
    }


}