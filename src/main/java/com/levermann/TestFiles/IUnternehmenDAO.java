package com.levermann.TestFiles;

import java.util.Collections;
import java.util.List;

import org.hibernate.Session;

import com.levermann.entityclass.Unternehmen;

public interface IUnternehmenDAO {

    public List<Unternehmen> fetchUnternehmen();

    public void insert(Session session, Unternehmen un) throws Exception;

    public void update (Unternehmen un) throws Exception;

    public void delete (Unternehmen un) throws Exception;

    List<Unternehmen> fetchUnternehmen(Unternehmen un);

    void save(Unternehmen un) throws Exception;

}