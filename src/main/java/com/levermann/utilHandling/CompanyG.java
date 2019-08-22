package com.levermann.utilHandling;
import java.io.Serializable;
import java.util.List;

import com.levermann.sessionControlClasses.CompanyEntity;
import org.hibernate.criterion.Restrictions;

/**
 * A DAO implementation for the {@link CompanyEntity} class
 *
 * @author saifasif
 */
public class CompanyG extends GenericHibernate<CompanyEntity, Serializable> {

    //private Criteria criteria = HibernateUtil.getSession().createCriteria(Human.class);

    public  CompanyEntity getACompanyByID(String id) {
        List<CompanyEntity> resultList = findByCriteria(Restrictions.eq("id", id));
        if (!resultList.isEmpty()) {
            return findByCriteria(Restrictions.eq("id", id)).get(0);
        }
        return null;
    }

    public  List<CompanyEntity> getAllCompanies() {
        return findAll();
    }

    public  List<CompanyEntity> findByExample(CompanyEntity exampleInstance) {
        return null;
    }


}