package com.levermann.mainMethod;

import com.levermann.entityclass.Company;
import com.levermann.sessionControlClasses.Create;
import org.apache.log4j.BasicConfigurator;


abstract public class ConnectionMainFactory  {


 @SuppressWarnings("empty-statement")
 public static void main(String[] args) {
     BasicConfigurator.configure();

     Company company = new Company();

     //KursgewinnVerhaeltnis5Jahre kg5 = new KursgewinnVerhaeltnis5Jahre();

//     kg5.KursgewinnVerhaeltnis5Jahre();

 //Zeigt Systeminfos auf
 // BasicConfigurator.configure();

  // Gibt die Methoden aus dem Interface aus



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

  //   Update drm = new Update();

    // drm.DaoJahresueberschuss("bmw11", 2000);
        Create CreateAnalysisRating = new Create();
     CreateAnalysisRating.CreateAnalysisRating("AppleAG");
//     Create d = new Create();

    // d.CreateUnternehmen( "bmw", (float) 2000.00);

     ///Select de = new Select();
   //  de.SelectUnternehmenByName("bmw");



 }



}
