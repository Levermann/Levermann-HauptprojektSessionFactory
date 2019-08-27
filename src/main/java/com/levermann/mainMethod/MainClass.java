package com.levermann.mainMethod;

import com.levermann.entityclass.Company;
import com.levermann.keyFiguresForAnalysis.Kursmomentum;
import com.levermann.sessionControlClasses.HibernateUtil;
import org.apache.log4j.BasicConfigurator;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


abstract public class MainClass {


 @SuppressWarnings("empty-statement")
 public static void main(String[] args) {

     BasicConfigurator.configure();

     Kursmomentum km = new Kursmomentum();

     km.Kursmomentum();


 }
}