package com.levermann.mainMethod;

import com.levermann.entityclass.Unternehmen;
import com.levermann.sessionControlClasses.Create;


abstract public class ConnectionMainFactory  {


 @SuppressWarnings("empty-statement")
 public static void main(String[] args) {

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
        Create company = new Create();
        company.CreateUnternehmen("AppleAG", (float) 8905.43);
//     Create d = new Create();

    // d.CreateUnternehmen( "bmw", (float) 2000.00);

     ///Select de = new Select();
   //  de.SelectUnternehmenByName("bmw");



 }



}
