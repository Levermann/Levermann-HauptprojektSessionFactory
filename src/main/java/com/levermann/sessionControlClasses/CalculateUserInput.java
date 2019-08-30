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


    final static Logger logger = Logger.getLogger(com.levermann.sessionControlClasses.CalculateUserInput.class);

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

                        /**
                         * Berechnung der 13 Levermannschritte:
                         */
                        un1.setEigenkapitalrendite(un.getJahresueberschuss() / un.getEigenkapital()); //Punkt 1
                        un1.setEBITMarge(un.getGewinnEBIT() / un.getJahresumsatz());                  // Punkt 2
                        un1.setEigenkapitalquote(un.getEigenkapital() / (un.getEigenkapital() + un.getFremdkapital()));    // Punkt 3
                        un1.setKursGewinnVerhaeltnisAktuell(un.getAktuellerAktienkurs() / un.getGewinnschaezung());        // Punkt 4
                        un1.setKursGewinnVerhaeltnis(un.getAktuellerAktienkurs() / un.getGewinnAVG());                     // Punkt 5 über 5 jahre
                        un1.setAnalystenmeinungen((un.getKaufen() + (un.getHalten() * (float) 2.0) + (un.getVerkaufen() * (float) 3.0)) / (un.getKaufen() + un.getVerkaufen() + un.getHalten()));    // Punkt 6
                        un1.setReaktionaufQuartalszahlen(un.getKursanstiegUnternehmen() - un.getKursanstiegIndex());       // Punkt 7
                        un1.setGewinnrevision((un.getGewinnschaezung()  / un.getGewinnschaezungVor4Wochen()) - 1) ;        // Punkt 8
                        un1.setKursverlauf6Monate((un.getAktuellerAktienkurs() - un.getKursVor6Monaten()) / un.getKursVor6Monaten());    // Punkt 9
                        un1.setKursverlauf12Monate((un.getAktuellerAktienkurs() - un.getKursVor12Monaten()) / un.getKursVor12Monaten());    // Punkt 10
                        un1.setGewinnwachstum((un.getGewinnschaezungNaechstesJahr() - un.getGewinnschaezungDiesesJahr() ) / un.getGewinnschaezungDiesesJahr()); // Punkt 13
                        /**
                         * Punkteliste befüllen: Schritt 1 Eigenkapitalrendite
                         */
                        for (AnalysisRating un2 : analysisRatingsFilled) {
                            query7 = session.getNamedQuery("AnalysisRating.findByName");
                            query7.setString("Companyname_AnalysisRating", company);
                            if (un2.getCompanyname_AnalysisRating().equals(company)) {
                                un2.setEigenkapitalrendite((float)0);
                                un2.setCompanyname_AnalysisRating(un1.getCompanyname_AnalysisSteps());
                                if (un1.getEigenkapitalrendite() > (float) 0.2) {
                                    System.out.println("is größer muss 1");
                                    un2.setEigenkapitalrendite((float) 1);
                                }
                                else if (un1.getEigenkapitalrendite() < (float) 0.1){
                                    un2.setEigenkapitalrendite((float) -1);
                                }
                            }
                    }
                        /**
                         * Punkteliste befüllen: Schritt 2 Gewinnmarge
                         */
                        for (AnalysisRating un2 : analysisRatingsFilled) {
                            query7 = session.getNamedQuery("AnalysisRating.findByName");
                            query7.setString("Companyname_AnalysisRating", company);
                            if (un2.getCompanyname_AnalysisRating().equals(company)) {
                                un2.setEBITMarge((float)0);
                                un2.setCompanyname_AnalysisRating(un1.getCompanyname_AnalysisSteps());
                                if (un1.getEBITMarge() > (float) 0.12) {
                                    un2.setEBITMarge((float) 1);
                                } else if (un1.getEBITMarge() < (float) 0.06) {
                                    un2.setEBITMarge((float) -1);
                                }
                            }
                        }
                        /**
                         * Punkteliste befüllen: Schritt 3 Eigenkapitalquote
                         */
                        //TODO eventuell switch case für den Sonderfall Finanzwerte
                        for (AnalysisRating un2 : analysisRatingsFilled) {
                            query7 = session.getNamedQuery("AnalysisRating.findByName");
                            query7.setString("Companyname_AnalysisRating", company);
                            if (un2.getCompanyname_AnalysisRating().equals(company)) {
                                un2.setEigenkapitalquote((float)0);
                                un2.setCompanyname_AnalysisRating(un1.getCompanyname_AnalysisSteps());
                                if (un1.getEigenkapitalquote() > (float) 0.25) {
                                    un2.setEigenkapitalquote((float) 1);
                                } else if (un1.getEigenkapitalquote() < (float) 0.15)
                                    un2.setEigenkapitalquote((float) -1);
                            }
                        }
                        /**
                         * Punkteliste befüllen: Schritt 4 Kurs-Gewinn-Verhältnis aktuelles Jahr
                         */
                        for (AnalysisRating un2 : analysisRatingsFilled) {
                            query7 = session.getNamedQuery("AnalysisRating.findByName");
                            query7.setString("Companyname_AnalysisRating", company);
                            if (un2.getCompanyname_AnalysisRating().equals(company)) {
                                un2.setKursGewinnVerhaeltnisAktuell((float)0);
                                un2.setCompanyname_AnalysisRating(un1.getCompanyname_AnalysisSteps());
                                if (un1.getKursGewinnVerhaeltnisAktuell() > (float) 0.0 && un1.getKursGewinnVerhaeltnisAktuell() < (float) 12.0) {
                                    un2.setKursGewinnVerhaeltnisAktuell((float) 1);
                                } else if (un1.getKursGewinnVerhaeltnisAktuell() < (float) 0.0 || un1.getKursGewinnVerhaeltnisAktuell() > (float) 16.0) {
                                    un2.setKursGewinnVerhaeltnisAktuell((float) -1);
                                }
                            }
                        }

                        /**
                         * Punkteliste befüllen: Schritt 5 Kurs-Gewinn-Verhältnis über 5 Jahre
                         */
                        for (AnalysisRating un2 : analysisRatingsFilled) {
                            query7 = session.getNamedQuery("AnalysisRating.findByName");
                            query7.setString("Companyname_AnalysisRating", company);
                            if (un2.getCompanyname_AnalysisRating().equals(company)) {
                                un2.setKursGewinnVerhaeltnis((float)0);
                                un2.setCompanyname_AnalysisRating(un1.getCompanyname_AnalysisSteps());
                                if (un1.getKursGewinnVerhaeltnis() > (float) 0.0 && un1.getKursGewinnVerhaeltnis() < (float) 12.0) {
                                    un2.setKursGewinnVerhaeltnis((float) 1);
                                } else if (un1.getKursGewinnVerhaeltnis() < (float) 0.0 || un1.getKursGewinnVerhaeltnis() > (float) 16.0) {
                                    un2.setKursGewinnVerhaeltnis((float) -1);
                                }
                            }
                        }
                        /**
                         * Punkteliste befüllen: Schritt 6 Analystenmeinungen
                         */
                        for (AnalysisRating un2 : analysisRatingsFilled) {
                            query7 = session.getNamedQuery("AnalysisRating.findByName");
                            query7.setString("Companyname_AnalysisRating", company);
                            if (un2.getCompanyname_AnalysisRating().equals(company)) {
                                un2.setAnalystenmeinungen((float)0);
                                un2.setCompanyname_AnalysisRating(un1.getCompanyname_AnalysisSteps());
                                if (un.getHalten() + un.getVerkaufen() + un.getKaufen() <= (float) 5.0){
                                    if (un1.getAnalystenmeinungen() <= (float) 1.5) {
                                        un2.setAnalystenmeinungen((float) 1);
                                    } else if (un1.getAnalystenmeinungen() >= (float) 2.5) {
                                        un2.setAnalystenmeinungen((float) -1);
                                    }
                                }

                                if (un.getHalten() + un.getVerkaufen() + un.getKaufen() > (float) 5.0){
                                    if (un1.getAnalystenmeinungen() >= (float) 2.5) {
                                        un2.setAnalystenmeinungen((float) 1);
                                    } else if (un1.getAnalystenmeinungen() <= (float) 1.5) {
                                        un2.setAnalystenmeinungen((float) -1);
                                    }
                                }
                            }
                        }
                        /**
                         * Punkteliste befüllen: Schritt 7 Reaktion auf Quartalszahlen
                         */
                        for (AnalysisRating un2 : analysisRatingsFilled) {
                            query7 = session.getNamedQuery("AnalysisRating.findByName");
                            query7.setString("Companyname_AnalysisRating", company);
                            if (un2.getCompanyname_AnalysisRating().equals(company)) {
                                un2.setReaktionaufQuartalszahlen((float)0);
                                un2.setCompanyname_AnalysisRating(un1.getCompanyname_AnalysisSteps());
                                if (un1.getReaktionaufQuartalszahlen() > (float) 0.01) {
                                    un2.setReaktionaufQuartalszahlen((float) 1);
                                } else if (un1.getReaktionaufQuartalszahlen() < (float) -0.01)
                                    un2.setReaktionaufQuartalszahlen((float) -1);
                            }
                        }
                        /**
                         * Punkteliste befüllen: Schritt 8 Gewinnrevision
                         */
                        for (AnalysisRating un2 : analysisRatingsFilled) {
                            query7 = session.getNamedQuery("AnalysisRating.findByName");
                            query7.setString("Companyname_AnalysisRating", company);
                            if (un2.getCompanyname_AnalysisRating().equals(company)) {
                                un2.setGewinnrevision((float)0);
                                un2.setCompanyname_AnalysisRating(un1.getCompanyname_AnalysisSteps());
                                if (un1.getGewinnrevision() > (float) 0.05) {
                                    un2.setGewinnrevision((float) 1);
                                } else if (un1.getGewinnrevision() < (float) -0.05)
                                    un2.setGewinnrevision((float) -1);
                            }
                        }
                        /**
                         * Punkteliste befüllen: Schritt 9 6-Monats-Kursverlauf
                         */
                        for (AnalysisRating un2 : analysisRatingsFilled) {
                            query7 = session.getNamedQuery("AnalysisRating.findByName");
                            query7.setString("Companyname_AnalysisRating", company);
                            if (un2.getCompanyname_AnalysisRating().equals(company)) {
                                un2.setKursverlauf6Monate((float)0);
                                un2.setCompanyname_AnalysisRating(un1.getCompanyname_AnalysisSteps());
                                if (un1.getKursverlauf6Monate() > (float) 0.05) {
                                    un2.setKursverlauf6Monate((float) 1);
                                } else if (un1.getKursverlauf6Monate() < (float) -0.05)
                                    un2.setKursverlauf6Monate((float) -1);
                            }
                        }
                        /**
                         * Punkteliste befüllen: Schritt 10 12-Monats-Kursverlauf
                         */
                        for (AnalysisRating un2 : analysisRatingsFilled) {
                            query7 = session.getNamedQuery("AnalysisRating.findByName");
                            query7.setString("Companyname_AnalysisRating", company);
                            if (un2.getCompanyname_AnalysisRating().equals(company)) {
                                un2.setKursverlauf12Monate((float)0);
                                un2.setCompanyname_AnalysisRating(un1.getCompanyname_AnalysisSteps());
                                if (un1.getKursverlauf12Monate() > (float) 0.05) {
                                    un2.setKursverlauf12Monate((float) 1);
                                } else if (un1.getKursverlauf12Monate() < (float) -0.05)
                                    un2.setKursverlauf12Monate((float) -1);
                            }
                        }
                        /**
                         * Punkteliste befüllen: Schritt 11 Kursmomentum
                         */
                        for (AnalysisRating un2 : analysisRatingsFilled) {
                            query7 = session.getNamedQuery("AnalysisRating.findByName");
                            query7.setString("Companyname_AnalysisRating", company);
                            if (un2.getCompanyname_AnalysisRating().equals(company)) {
                                un2.setKursmomentum((float)0);
                                un2.setCompanyname_AnalysisRating(un1.getCompanyname_AnalysisSteps());
                                if (un2.getKursverlauf6Monate() == (float) 1 && un2.getKursverlauf12Monate() != (float) 1) {
                                    un2.setKursmomentum((float) 1);
                                } else if (un2.getKursverlauf6Monate() == (float) -1 && un2.getKursverlauf12Monate() != (float) -1)
                                    un2.setKursmomentum((float) -1);
                            }
                        }

                        /**
                         * Schritt 12 Reversaleffekt
                         */
                        for (AnalysisRating un2 : analysisRatingsFilled) {
                            query7 = session.getNamedQuery("AnalysisRating.findByName");
                            query7.setString("Companyname_AnalysisRating", company);
                            if (un2.getCompanyname_AnalysisRating().equals(company)) {
                                un2.setCompanyname_AnalysisRating(un1.getCompanyname_AnalysisSteps());
                                if (un.getKursVor1Monat() - un.getDaxVor1Monat() < un.getKursanstiegIndex() && un.getKursVor2Monaten() - un.getDaxVor2Monaten() < un.getKursanstiegIndex() && un.getKursVor3Monaten() - un.getDaxVor3Monaten() < un.getKursanstiegIndex()) {
                                    un2.setDreimonatsreversal((float) 1);
                                } else if (un.getKursVor1Monat() - un.getDaxVor1Monat() > un.getKursanstiegIndex() && un.getKursVor2Monaten() - un.getDaxVor2Monaten() > un.getKursanstiegIndex() && un.getKursVor3Monaten() - un.getDaxVor3Monaten() > un.getKursanstiegIndex())
                                    un2.setDreimonatsreversal((float) -1);
                            } else {
                                un2.setDreimonatsreversal((float) 0);
                            }
                        }
                        /**
                         * Punkteliste befüllen: Schritt 13 Gewinnwachstum
                         */
                        for (AnalysisRating un2 : analysisRatingsFilled) {
                            query7 = session.getNamedQuery("AnalysisRating.findByName");
                            query7.setString("Companyname_AnalysisRating", company);
                            if (un2.getCompanyname_AnalysisRating().equals(company)) {
                                un2.setGewinnwachstum((float)0);
                                un2.setCompanyname_AnalysisRating(un1.getCompanyname_AnalysisSteps());
                                if (un1.getGewinnwachstum() > (float) 0.05) {
                                    un2.setGewinnwachstum((float) 1);
                                } else if (un1.getGewinnwachstum() < (float) -0.05)
                                    un2.setGewinnwachstum((float) -1);
                            }
                        }


                        for (AnalysisRating un2 : analysisRatingsFilled) {
                            query7 = session.getNamedQuery("AnalysisRating.findByName");
                            query7.setString("Companyname_AnalysisRating", company);
                            if (un2.getCompanyname_AnalysisRating().equals(company)) {

                                un.setGesamtPunkte( un2.getEigenkapitalrendite() + un2.getEBITMarge() + un2.getEigenkapitalquote()+ un2.getKursGewinnVerhaeltnis()+ un2.getKursGewinnVerhaeltnisAktuell()+ un2.getAnalystenmeinungen()+ un2.getReaktionaufQuartalszahlen()+ un2.getGewinnrevision()+ un2.getKursverlauf6Monate()+ un2.getKursverlauf12Monate()+ un2.getKursmomentum()+ un2.getDreimonatsreversal()+ un2.getGewinnwachstum());
                            }}

                        //TODO Methode, welche die Gesamtpunktezahl in neues Feld Analysisrating speichert
                    }}}

            session.getTransaction().commit();
            session.close();
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