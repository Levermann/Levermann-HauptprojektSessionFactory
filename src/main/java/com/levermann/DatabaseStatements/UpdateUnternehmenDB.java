/*



 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.DatabaseStatements;

import com.levermann.entityclass.Unternehmen;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Scanner;

  public class UpdateUnternehmenDB {

    final static Logger logger = Logger.getLogger(UpdateUnternehmenDB.class);

     public void UpdateUnName (String Unternehmenname) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

  try {
      // Hinzufügen des Loggers war erfolgreich
      logger.info("Logger for Update was saved successfull");
      System.out.println("Eingabe:\n 1. ID \n 2.  ");

      //Erzeugen eines Objektes vom Typen Unternehmen
      Unternehmen Unternehmen=new Unternehmen();
      //Select Primärschlüssel
      Unternehmen.setUnternehmenname( Unternehmenname);

    //Beginn der Datenübertragung
    session.beginTransaction();
    //Umesetzung der Update Methode auf das ausgewählte Unternehmen
    session.update(Unternehmen);
    // Übertragung bestätigen
    session.getTransaction().commit(); } finally{}}

     public void UpdateDatum( String name, String datum) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Unternehmen \n 3. Datum \n 4. Eigenkapital \n 5. Jahresueberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setDatum(datum);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateEigenkapital(String name, Float eigenkapital) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. ");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setEigenkapital(eigenkapital);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateJahresueberschuss(String Name, float Jahresueberschuss) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen



         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         // start a transaction


         try {

             session.beginTransaction();
        //HQL Named Query FindAll Unternehmen
         Query query = session.getNamedQuery("Unternehmen.findAll");
             List<Unternehmen> unList = (List<Unternehmen>) query.list();
         for (Unternehmen un : unList) {

             un.setUnternehmenname( Name);
             un.setJahresueberschuss(Jahresueberschuss);
             un.getUnternehmenname() ;
         }

             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");
             //Beginn der Datenübertragung

             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateGewinnEBIT(String name, float gewinnebit) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setGewinnEBIT(gewinnebit);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateJahresumsatz(String name, float jahresumsatz) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setJahresumsatz(jahresumsatz);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateFremdkapital(String name, float fremdkapital) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setFremdkapital(fremdkapital);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateAktuellerAktienkurs(String name, float aktuelleraktienkurs) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setAktuellerAktienkurs(aktuelleraktienkurs);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateGewinnschaezung(String name, float gewinnschaezung) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setGewinnschaezung(gewinnschaezung);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateGewinnAVG(String name, float gewinnavg) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setGewinnAVG(gewinnavg);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateHalten(String name, float halten) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setHalten(halten);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateVerkaufen(String name, float verkaufen) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setVerkaufen(verkaufen);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateKaufen(String name, float kaufen) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setKaufen(kaufen);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateKursanstiegUnternehmen(String name, float kursanstiegunernehmen) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setKursanstiegUnternehmen(kursanstiegunernehmen);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateKursanstiegIndex(String name, float kursanstiegindex) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setKursanstiegIndex(kursanstiegindex);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateGewinnschaezungVor4Wochen(String name, float gewinnschaezungvor4wochen) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";

         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma

             Unternehmen.setGewinnschaezungVor4Wochen(gewinnschaezungvor4wochen);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateKursHeute(String name, float aktienkursTagVeroeffentlichungQartalszahlen) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setAktienkursTagVeroeffentlichungQartalszahlen(aktienkursTagVeroeffentlichungQartalszahlen);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateKursVor6Monaten(String name, float kursvor6monaten) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setKursVor6Monaten(kursvor6monaten);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateKursVor12Monaten(String name, float kursvor12monaten) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setKursVor6Monaten(kursvor12monaten);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateKursVor3Monaten(String name, float kursvor3monaten) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setKursVor3Monaten(kursvor3monaten);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateKursVor2Monaten(String name, float kursvor2monaten) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setKursVor2Monaten(kursvor2monaten);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateKursVor1Monaten(String name, float kursvor1monaten ) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setKursVor6Monaten(kursvor1monaten);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateDaxVor1Monat(String name, float daxvor1monat) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setDaxVor1Monat(daxvor1monat);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateDaxVor2Monaten( String name, float daxvor2monaten) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setDaxVor2Monaten(daxvor2monaten);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void UpdateDaxVor3Monaten(String name, float daxvor3monaten) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setDaxVor2Monaten(daxvor3monaten);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void GewinnschaezungNaechstesJahr(String name, float gewinnschaetzungnaechstesjahr) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setGewinnschaezungNaechstesJahr(gewinnschaetzungnaechstesjahr);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void GewinnschaezungDiesesJahr(String name, float gewinnschaezungdiesesjahr) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setGewinnschaezungDiesesJahr(gewinnschaezungdiesesjahr);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void Finanzsektor(String name, float finanzsektor) {
         //Logger wird für die Methode Delete ausgeführt
         logger.info("Logger is Entering the Execute method Update");
         String returnValue = "";
         Scanner scanner = new Scanner(System.in);
         // Eingabeauforderung Unternehmen

         //Aufrufen der aktuellen Session aus HibernateUtil
         SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
         Session session = sessionFactory.getCurrentSession();

         try {
             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

             //Erzeugen eines Objektes vom Typen Unternehmen
             Unternehmen Unternehmen=new Unternehmen();
             //Select Primärschlüssel
             
             Unternehmen.setUnternehmenname( name);
             //Select Name der Firma
             Unternehmen.setFinanzsektor(finanzsektor);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Unternehmen);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}




 }

