package com.levermann.project;

import com.levermann.DatabaseStatements.Create;
import com.levermann.DatabaseStatements.Select;
import com.levermann.kennzahlen_fertig_review.KursgewinnVerhaeltnis5Jahre;


abstract public class ConnectionMainFactory  {


 @SuppressWarnings("empty-statement")
 public static void main(String[] args) {

     Create crt = new Create();

     crt.CreateLevermannanalyse("Analyse", "BMW");


     //KursgewinnVerhaeltnis5Jahre kg5 = new KursgewinnVerhaeltnis5Jahre();

//     kg5.KursgewinnVerhaeltnis5Jahre();

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

  //   Update drm = new Update();

    // drm.DaoJahresueberschuss("bmw11", 2000);

//     Create d = new Create();

    // d.CreateUnternehmen( "bmw", (float) 2000.00);

     ///Select de = new Select();
   //  de.SelectUnternehmenByName("bmw");



 }



}
