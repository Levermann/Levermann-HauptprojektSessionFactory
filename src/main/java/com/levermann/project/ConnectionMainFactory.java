package com.levermann.project;

import com.levermann.entityclass.Unternehmen;
import com.levermann.dao.Create;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// import com.levermann.kennzahlen.Gewinnrevision;

public class ConnectionMainFactory {

 @SuppressWarnings("empty-statement")
 public static void main(String[] args) {
 Create cr = new Create();
 cr.CreateUnternehmen();



    }

}
