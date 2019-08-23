package com.levermann.utilHandling;
import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.Restrictions;
import com.levermann.entityclass.Company;

/**
 * A DAO implementation for the {@link Company} class
 *
 * @author saifasif
 */
public class CompanyG extends GenericHibernate<Company, Serializable> {

    //private Criteria criteria = HibernateUtil.getSession().createCriteria(Human.class);

    public  Company getACompanyByID(String id) {
        List<Company> resultList = findByCriteria(Restrictions.eq("Companyname", id));
        if (!resultList.isEmpty()) {
            return findByCriteria(Restrictions.eq("Companyname", id)).get(0);
        }
        return null;
    }

    public  List<Company> getAllCompanies() {
        return findAll();
    }

    public  List<Company> findByExample(Company exampleInstance) {
        return null;
    }


}