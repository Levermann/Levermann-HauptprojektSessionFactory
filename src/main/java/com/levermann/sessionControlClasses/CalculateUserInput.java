package com.levermann.sessionControlClasses;

import com.levermann.entityclass.AnalysisRating;
import com.levermann.entityclass.AnalysisSteps;
import com.levermann.entityclass.Company;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CalculateUserInput {


    final static Logger logger = Logger.getLogger(com.levermann.keyFiguresForAnalysis.Eigenkapitalrendite.class);

    public void CalculateEigenkapitalrendite( ) {


        //Aufrufen der aktuellen Session aus HibernateUtil
        final Session session = HibernateUtil.getSessionFactory().openSession();
        Query query7 = session.getNamedQuery("AnalysisRating.findAll");
        final List<AnalysisRating> analysisRatingsFilled = (List<AnalysisRating>) query7.list();
        try {
            Transaction tx = null;
            tx = session.beginTransaction();

            //HQL Named Query FindAll Unternehmen
            Query query = session.getNamedQuery("Company.findAll");
            List<Company> unList = (List<Company>) query.list();

            for (Company un : unList) {

                String company = un.getCompanyname();

                //HQL Named Query FindAll Levermannschritte
                Query query1 = session.getNamedQuery("AnalysisSteps.findall");
                List<AnalysisSteps> unList1 = (List<AnalysisSteps>) query1.list();
                for (AnalysisSteps un1 : unList1) {
                    System.out.println("Analyse Liste = " + un1.getAnalysisStepsName()
                            + ","
                            + un1.getCompanyname_AnalysisSteps());

                    // Ausgabe eines Datensatzes mit Cid
                    query1 = session.getNamedQuery("AnalysisSteps.findByName");
                    query1.setString("Companyname_AnalysisSteps", company);
                    unList1 = query1.list();
                    System.out.println("fuck y");
                    if (un1.getCompanyname_AnalysisSteps().equals(company)) {

                        System.out.println("Fuuuuuuuuuuuuuuuuck");

                        //Set Company
                        un1.setCompanyname_AnalysisSteps(un1.getCompanyname_AnalysisSteps());

                        // Calculate 13 Steps and fill in AnalysisSteps

                        un1.setEigenkapitalrendite(un.getJahresueberschuss() / un.getEigenkapital()); // Punkt 1
                        un1.setEBITMarge(un.getGewinnEBIT() / un.getJahresumsatz());                    // Punkt 2
                        un1.setEigenkapitalquote(un.getEigenkapital() / (un.getEigenkapital() + un.getFremdkapital()));                                       // Punkt 3
                        un1.setKursGewinnVerhaeltnisAktuell(un.getAktuellerAktienkurs() / un.getGewinnschaezung());                                      // Punkt 4
                        un1.setKursGewinnVerhaeltnis(un.getAktuellerAktienkurs() / un.getGewinnAVG());                               // Punkt 5 über 5 jahre
                        un1.setAnalystenmeinungen((un.getKaufen() + un.getHalten() * 2 + un.getVerkaufen() * 3) / (un.getKaufen() + un.getVerkaufen() + un.getHalten()));                                         // Punkt 6
                        un1.setReaktionaufQuartalszahlen(un.getKursanstiegUnternehmen() - un.getKursanstiegIndex());          // Punkt 7
                        un1.setGewinnrevision(((un.getGewinnschaezung() / un.getGewinnschaezungVor4Wochen()) - 1) * 100);                                               // Punkt 8

                        un1.setKursverlauf6Monate((un.getAktuellerAktienkurs() - un.getKursVor6Monaten()) / un.getKursVor6Monaten());                                           // Punkt 9
                        un1.setKursverlauf12Monate((un.getAktuellerAktienkurs() - un.getKursVor12Monaten()) / un.getKursVor12Monaten());                                       // Punkt 10
                        //                // TODO setze hier die Punkteliste anhand kennzahl 9 und 10 un1.setKursmomentum();                                             // Punkt 11
                        //   un1.setDreimonatsreversal((float) 0);                                          // Punkt 12
                        // un1.setGewinnwachstum((float) 13);                                              // Punkt 13


                        // Set Eigenkapitalrendite



                        // Set Eigenkapitalrendite

                        if (un1.getEigenkapitalrendite() > 20) {
                            //HQL Named Query FindAll Levermannschritte
                            Query query2 = session.getNamedQuery("AnalysisRating.findAll");
                            List<AnalysisRating> unList2 = (List<AnalysisRating>) query2.list();
                            for (AnalysisRating un2 : unList2) {
                                System.out.println("Analyse Liste = " + un2.getAnalysisRatingName()
                                        + ","
                                        + un2.getCompanyname_AnalysisRating());
                                // Ausgabe eines Datensatzes mit Cid
                                query2 = session.getNamedQuery("AnalysisRating.findByName");
                                query2.setString("Companyname_AnalysisRating", company);
                                unList2 = query2.list();
                                System.out.println("fuck y");
                                if (un2.getCompanyname_AnalysisRating().equals(company)) {

                                    System.out.println("Fuuuuuuuuuuuuuuuuck");

                                    un2.setCompanyname_AnalysisRating(un1.getCompanyname_AnalysisSteps());
                                    un2.setEigenkapitalrendite((float) 1);

                                    System.out.println("keine Null Bro :D");
                                }
                            }
                        }
                        if (un1.getEigenkapitalrendite() < 10) {
                            //HQL Named Query FindAll Levermannschritte
                            Query query2 = session.getNamedQuery("AnalysisRating.findAll");
                            List<AnalysisRating> unList2 = (List<AnalysisRating>) query2.list();
                            for (AnalysisRating un2 : unList2) {
                                System.out.println("Analyse Liste = " + un2.getAnalysisRatingName()
                                        + ","
                                        + un2.getCompanyname_AnalysisRating());

                                // Ausgabe eines Datensatzes mit Cid
                                query2 = session.getNamedQuery("AnalysisRating.findByName");
                                query2.setString("Companyname_AnalysisRating", company);
                                unList2 = query2.list();
                                System.out.println("fuck y");
                                if (un2.getCompanyname_AnalysisRating().equals(company)) {

                                    System.out.println("Fuuuuuuuuuuuuuuuuck");

                                    un2.setCompanyname_AnalysisRating(un1.getCompanyname_AnalysisSteps());
                                    un2.setEigenkapitalrendite((float) -1);

                                    System.out.println("keine Null Bro :D");
                                }
                            }
                        }

                        if (un1.getEigenkapitalrendite() >= 10 && un1.getEigenkapitalrendite() <=20) {
                            //HQL Named Query FindAll Levermannschritte
                            Query query2 = session.getNamedQuery("AnalysisRating.findAll");
                            List<AnalysisRating> unList2 = (List<AnalysisRating>) query2.list();
                            for (AnalysisRating un2 : unList2) {
                                System.out.println("Analyse Liste = " + un2.getAnalysisRatingName()
                                        + ","
                                        + un2.getCompanyname_AnalysisRating());

                                // Ausgabe eines Datensatzes mit Cid
                                query2 = session.getNamedQuery("AnalysisRating.findByName");
                                query2.setString("Companyname_AnalysisRating", company);
                                unList2 = query2.list();
                                System.out.println("fuck y");
                                if (un2.getCompanyname_AnalysisRating().equals(company)) {

                                    System.out.println("Fuuuuuuuuuuuuuuuuck");

                                    un2.setCompanyname_AnalysisRating(un1.getCompanyname_AnalysisSteps());
                                    un2.setEigenkapitalrendite((float) 0);

                                    System.out.println("Null Bro :D");
                                }
                            }
                        }

                        // Set EBIT-Marge

                        // Set Eigenkapitalquote

                        // KGV 5 Jahre

                        //  KGV aktuell
                        //Reversal
                        for (AnalysisRating un2 : analysisRatingsFilled) {
                            query7 = session.getNamedQuery("AnalysisRating.findByName");
                            query7.setString("Companyname_AnalysisRating", company);
                            if (un2.getCompanyname_AnalysisRating().equals(company)) {

                                System.out.println("Fuuuuuuuuuuuuuuuuck :)");

                                un2.setCompanyname_AnalysisRating(un1.getCompanyname_AnalysisSteps());
                                if (un.getKursVor1Monat() - un.getDaxVor1Monat() < un.getKursanstiegIndex() && un.getKursVor2Monaten() - un.getDaxVor2Monaten() < un.getKursanstiegIndex() && un.getKursVor3Monaten() - un.getDaxVor3Monaten() < un.getKursanstiegIndex()) {
                                    un2.setDreimonatsreversal((float) 1);
                                } else if (un.getKursVor1Monat() - un.getDaxVor1Monat() > un.getKursanstiegIndex() && un.getKursVor2Monaten() - un.getDaxVor2Monaten() > un.getKursanstiegIndex() && un.getKursVor3Monaten() - un.getDaxVor3Monaten() > un.getKursanstiegIndex())
                                    un2.setDreimonatsreversal((float) -1);
                            } else {
                                un2.setDreimonatsreversal((float) 0);
                            }
                        }

                    }}}

            session.getTransaction().commit();
            //    System.out.println("fuck youuuuuuuuuuuu" + un1.getEigenkapitalrendite()+ un1.getCompanyname_AnalysisSteps());
            System.out.println("Speichere Unternehmen...");
            System.out.println("Done!");
        } catch (HibernateException e) {
            System.out.println("Hibernate Exception" + e.getMessage());
            session.getTransaction().rollback();
            throw new RuntimeException(e);
        } finally {
        }
    }
}