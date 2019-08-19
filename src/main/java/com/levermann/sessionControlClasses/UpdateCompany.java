/*



 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.sessionControlClasses;

import com.levermann.entityclass.Company;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Scanner;

  public class UpdateCompany {

    final static Logger logger = Logger.getLogger(UpdateCompany.class);

     public void UnName (String Unternehmenname) {
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
      Company Company =new Company();
      //Select Primärschlüssel
      Company.setCompanyname( Unternehmenname);

    //Beginn der Datenübertragung
    session.beginTransaction();
    //Umesetzung der Update Methode auf das ausgewählte Unternehmen
    session.update(Company);
    // Übertragung bestätigen
    session.getTransaction().commit(); } finally{}}

     public void Datum( String name, String datum) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setDatum(datum);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void Eigenkapital(String name, Float eigenkapital) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setEigenkapital(eigenkapital);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void Jahresueberschuss(String Name, float Jahresueberschuss) {
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
         Query query = session.getNamedQuery("Company.findAll");
             List<Company> unList = (List<Company>) query.list();
         for (Company un : unList) {

             un.setCompanyname( Name);
             un.setJahresueberschuss(Jahresueberschuss);
             un.getCompanyname() ;
         }

             // Hinzufügen des Loggers war erfolgreich
             logger.info("Logger for Update was saved successfull");
             System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");
             //Beginn der Datenübertragung

             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void GewinnEBIT(String name, float gewinnebit) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setGewinnEBIT(gewinnebit);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void Jahresumsatz(String name, float jahresumsatz) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setJahresumsatz(jahresumsatz);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void Fremdkapital(String name, float fremdkapital) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setFremdkapital(fremdkapital);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void AktuellerAktienkurs(String name, float aktuelleraktienkurs) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setAktuellerAktienkurs(aktuelleraktienkurs);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void Gewinnschaezung(String name, float gewinnschaezung) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setGewinnschaezung(gewinnschaezung);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void GewinnAVG(String name, float gewinnavg) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setGewinnAVG(gewinnavg);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void Halten(String name, float halten) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setHalten(halten);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void Verkaufen(String name, float verkaufen) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setVerkaufen(verkaufen);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void Kaufen(String name, float kaufen) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setKaufen(kaufen);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void KursanstiegUnternehmen(String name, float kursanstiegunernehmen) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setKursanstiegUnternehmen(kursanstiegunernehmen);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void KursanstiegIndex(String name, float kursanstiegindex) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setKursanstiegIndex(kursanstiegindex);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void GewinnschaezungVor4Wochen(String name, float gewinnschaezungvor4wochen) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             
             Company.setCompanyname( name);
             //Select Name der Firma

             Company.setGewinnschaezungVor4Wochen(gewinnschaezungvor4wochen);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void KursHeute(String name, float aktienkursTagVeroeffentlichungQartalszahlen) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setAktienkursTagVeroeffentlichungQartalszahlen(aktienkursTagVeroeffentlichungQartalszahlen);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void KursVor6Monaten(String name, float kursvor6monaten) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setKursVor6Monaten(kursvor6monaten);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void KursVor12Monaten(String name, float kursvor12monaten) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setKursVor6Monaten(kursvor12monaten);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void KursVor3Monaten(String name, float kursvor3monaten) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setKursVor3Monaten(kursvor3monaten);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void KursVor2Monaten(String name, float kursvor2monaten) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setKursVor2Monaten(kursvor2monaten);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void KursVor1Monaten(String name, float kursvor1monaten ) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setKursVor6Monaten(kursvor1monaten);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void DaxVor1Monat(String name, float daxvor1monat) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setDaxVor1Monat(daxvor1monat);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void DaxVor2Monaten( String name, float daxvor2monaten) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setDaxVor2Monaten(daxvor2monaten);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}

     public void DaxVor3Monaten(String name, float daxvor3monaten) {
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
             Company Company =new Company();
             //Select Primärschlüssel
             
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setDaxVor2Monaten(daxvor3monaten);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
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
             Company Company =new Company();
             //Select Primärschlüssel
             
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setGewinnschaezungNaechstesJahr(gewinnschaetzungnaechstesjahr);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
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
             Company Company =new Company();
             //Select Primärschlüssel
             
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setGewinnschaezungDiesesJahr(gewinnschaezungdiesesjahr);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
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
             Company Company =new Company();
             //Select Primärschlüssel
             
             Company.setCompanyname( name);
             //Select Name der Firma
             Company.setFinanzsektor(finanzsektor);

             //Beginn der Datenübertragung
             session.beginTransaction();
             //Umesetzung der Update Methode auf das ausgewählte Unternehmen
             session.update(Company);
             // Übertragung bestätigen
             session.getTransaction().commit(); } finally{}}




 }

