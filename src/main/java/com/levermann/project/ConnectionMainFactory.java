package com.levermann.project;

import com.levermann.dao.SelectSchritt1jahresueberschuss;
import com.levermann.kennzahlen_fertig_review.Dreimonatsreversal;
import com.levermann.kennzahlen_fertig_review.Gewinnwachstum;
import com.levermann.kennzahlen_fertig_review.Kursmomentum;


abstract public class ConnectionMainFactory  {


 @SuppressWarnings("empty-statement")
 public static void main(String[] args) {

 //Zeigt Systeminfos auf
 // BasicConfigurator.configure();

  // Gibt die Methoden aus dem Interface aus


    // DaoUnternehmen dao0= new Create();
    // dao0.Dao();


     // DaoUnternehmen dao1= new Delete();
     //dao1.Dao();

     // DaoUnternehmen dao2= new Update();
     // dao2.Dao();

   //  Gewinnrevision gwr = new Gewinnrevision();
  //   gwr.Gewinnrevision();

   //  KursheuteggKursvor1Jahr kw6 = new KursheuteggKursvor1Jahr();
     //kw6.KursheuteggKursvor12Monaten();

   //  Kursmomentum km = new Kursmomentum();
    // km.Kursmomentum();

     // Gewinnwachstum gww = new Gewinnwachstum();
     // gww.Gewinnwachstum();

    // Select select = new Select();
     // select.Dao();

     SelectSchritt1jahresueberschuss drm = new SelectSchritt1jahresueberschuss();

     drm.Dao("bmw1");

 }



}
