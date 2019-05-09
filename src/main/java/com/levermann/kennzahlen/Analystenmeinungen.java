package com.levermann.kennzahlen;

import com.levermann.dao.HibernateUtil;
import com.levermann.entityclass.Levermannschritte;
import com.levermann.entityclass.Unternehmen;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;




public class Analystenmeinungen {
    
    final static Logger logger = Logger.getLogger(Analystenmeinungen.class);
    
    
public void Analystenmeinungen() {    
     System.out.println(" Bitte \n 1. Unternehmen \n 2. Datum \n 3. Eigenkapital \n 4. JahresÃ¼berschuss");
    String returnValue = "";
       //Aufrufen der aktuellen Session aus HibernateUtil
       SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
       Session session = sessionFactory.getCurrentSession();
       Session session1 = sessionFactory.getCurrentSession();
       Scanner scanner = new Scanner(System.in);
       
       
    try {
          //create a unternehmen object
           System.out.println("Creating new Unternehmen Object");
           // Hinzufügen
           logger.info("Logger for Create was saved successfull");

           // start a transaction
           session.beginTransaction();

           //HQL Named Query FindAll Unternehmen
           Query query = session.getNamedQuery("Unternehmen.findAll");
           List<Unternehmen> unList = (List<Unternehmen>) query.list();
           for (Unternehmen un : unList) {

               // Berechnung der WerteVeränderung für Punkteverteilung
              float i;
              i =  (((float)un.getAnalystenmeinungKaufen()*1)+((float)un.getAnalystenmeinungHalten()*2)+((float)un.getAnalystenmeinungVerkaufen()*3))/un.getSummeAnalystenmeinungen();
               DecimalFormat f = new DecimalFormat("#0.00");
               double toFormat = ((double)Math.round(i*100))/100;
               f.format(toFormat);
               
                // Aufrunden
               i = Math.round(i);
               i = i / 100;
               
               // FAll 1, Mehr als 5 Analystenmeinungen und Durchschnitt der Bewertung gröößer als 2,5
               
               if (i > 2.5 == true){
                     //HQL Named Query FindAll Levermannschritte
                     Query query1 = session.getNamedQuery("Levermannschritte.findAll");
                     List<Levermannschritte> unList1 = (List<Levermannschritte>) query1.list();
                     for (Levermannschritte lvsch : unList1) {
                         if (lvsch.getCid3() == un.getCid() == true && i >= 2.5 == true && SummeAnalystenmeinungen){
                             System.out.println("Richtig :D" + lvsch.getCid3() +" = " + un.getCid()+ "i = " + i);
                             lvsch.setAnalystenmeinung(1); }                         
                     }                   
               }
               
    }   
    //berechnet die Analystenmeinung
    public static float analystenmeinungen(float sumam, float kaufen, float halten, float verkaufen){
        float amd;//Analystenmeinungendurchschnitt
        amd = ((kaufen*1)+(halten*2)+(verkaufen*3))/sumam;
        return amd;
    }

    //berechne die Levermannwertung für die gegebene Analystenmeinung
    public static int analystenmeinungLevermann(float amd, float sumam){
        int retval;

        float upperLimit = (float)2.5;
        float lowerLimit = (float)1.5;
        /*
        retval > 0 falls amd > Grenze
        retval = 0 falls amd = Grenze
        retval < 0 falls amd < Grenze
        */
        if(sumam > 5){
            retval = Float.compare(amd, upperLimit);
            if (retval > 0){
                return 1;
            }else{
                retval = Float.compare(amd, lowerLimit);
                if (retval >= 0){
                    return 0;
                }else{
                    return -1;
                }
            }
        }
        else {
            retval = Float.compare(amd, upperLimit);
            if (retval > 0){
                return -1;
            }else{
                retval = Float.compare(amd, lowerLimit);
                if (retval >= 0){
                    return 0;
                }else{
                    return 1;
                }
            }
        }
    }
}
}
