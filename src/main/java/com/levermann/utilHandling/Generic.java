package com.levermann.utilHandling;

import java.io.Serializable;
import java.util.List;

/**
     * Generic DAO implmentation interface
     *
     * @param <T>
     * @param <ID>
     * @author LisaStolz
     */
    public interface Generic<T, ID extends Serializable> {

        T findById(ID id, boolean lock);

        List<T> findAll();

        List<T> findByExample(T exampleInstance);

        T makePersistent(T entity);

        void makeTransient(T entity);
    }

