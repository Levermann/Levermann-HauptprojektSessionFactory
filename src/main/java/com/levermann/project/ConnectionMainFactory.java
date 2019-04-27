package com.levermann.project;

import com.levermann.dao.*;
import org.apache.log4j.BasicConfigurator;
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

     DaoUnternehmen dao3= new SelectLevermannschritte();
     dao3.Dao();




 }



}
