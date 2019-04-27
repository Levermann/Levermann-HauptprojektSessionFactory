/*



 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.dao;

import com.levermann.entityclass.Unternehmen;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Scanner;

abstract public class UpdateUnternehmen implements DaoUnternehmen {

   final static Logger logger = Logger.getLogger(UpdateUnternehmen.class);

    public void DaoName () {
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
     System.out.println("Eingabe:\n 1. ID \n 2.  ");

     //Erzeugen eines Objektes vom Typen Unternehmen
     Unternehmen Unternehmen=new Unternehmen();
     //Select Primärschlüssel
     int cid = scanner.nextInt();
     Unternehmen.setCid(cid);
    //Select Name der Firma
      String name = scanner.next();
     Unternehmen.setName(name);

   //Beginn der Datenübertragung
   session.beginTransaction();
   //Umesetzung der Update Methode auf das ausgewählte Unternehmen
   session.update(Unternehmen);
   // Übertragung bestätigen
   session.getTransaction().commit(); } finally{}}

    public void DaoDatum() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            String datum = scanner.next();
            Unternehmen.setDatum(datum);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoEigenkapital() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int eigenkapital = scanner.nextInt();
            Unternehmen.setEigenkapital(eigenkapital);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoJahresueberschuss() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int jahresueberschuss = scanner.nextInt();
            Unternehmen.setJahresueberschuss(jahresueberschuss);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoGewinnEBIT() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int gewinnebit = scanner.nextInt();
            Unternehmen.setGewinnEBIT(gewinnebit);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoJahresumsatz() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int jahresumsatz = scanner.nextInt();
            Unternehmen.setJahresumsatz(jahresumsatz);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoFremdkapital() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int fremdkapital = scanner.nextInt();
            Unternehmen.setFremdkapital(fremdkapital);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoAktuellerAktienkurs() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int aktuelleraktienkurs = scanner.nextInt();
            Unternehmen.setAktuellerAktienkurs(aktuelleraktienkurs);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoGewinnschaezung() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int gewinnschaezung = scanner.nextInt();
            Unternehmen.setGewinnschaezung(gewinnschaezung);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoGewinnAVG() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int gewinnavg = scanner.nextInt();
            Unternehmen.setGewinnAVG(gewinnavg);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoHalten() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int halten = scanner.nextInt();
            Unternehmen.setHalten(halten);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoVerkaufen() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int verkaufen = scanner.nextInt();
            Unternehmen.setVerkaufen(verkaufen);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoKaufen() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int kaufen = scanner.nextInt();
            Unternehmen.setKaufen(kaufen);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoKursanstiegUnternehmen() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int kursanstiegunernehmen = scanner.nextInt();
            Unternehmen.setKursanstiegUnternehmen(kursanstiegunernehmen);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoKursanstiegIndex() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int kursanstiegindex = scanner.nextInt();
            Unternehmen.setKursanstiegIndex(kursanstiegindex);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoGewinnschaezungVor4Wochen() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int gewinnschaezungvor4wochen = scanner.nextInt();
            Unternehmen.setGewinnschaezungVor4Wochen(gewinnschaezungvor4wochen);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoKursHeute() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int kursheute = scanner.nextInt();
            Unternehmen.setKursHeute(kursheute);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoKursVor6Monaten() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int kursvor6monaten = scanner.nextInt();
            Unternehmen.setKursVor6Monaten(kursvor6monaten);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoKursVor12Monaten() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int kursvor12monaten = scanner.nextInt();
            Unternehmen.setKursVor6Monaten(kursvor12monaten);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoKursVor3Monaten() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int kursvor3monaten = scanner.nextInt();
            Unternehmen.setKursVor3Monaten(kursvor3monaten);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoKursVor2Monaten() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int kursvor2monaten = scanner.nextInt();
            Unternehmen.setKursVor2Monaten(kursvor2monaten);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoKursVor1Monaten() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int kursvor1monaten = scanner.nextInt();
            Unternehmen.setKursVor6Monaten(kursvor1monaten);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoDaxVor1Monat() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int daxvor1monat = scanner.nextInt();
            Unternehmen.setDaxVor1Monat(daxvor1monat);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoDaxVor2Monaten() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int daxvor2monaten = scanner.nextInt();
            Unternehmen.setDaxVor2Monaten(daxvor2monaten);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoDaxVor3Monaten() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int daxvor3monaten = scanner.nextInt();
            Unternehmen.setDaxVor2Monaten(daxvor3monaten);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void GewinnschaezungNaechstesJahr() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int gewinnschaetzungnaechstesjahr = scanner.nextInt();
            Unternehmen.setGewinnschaezungNaechstesJahr(gewinnschaetzungnaechstesjahr);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void GewinnschaezungDiesesJahr() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int gewinnschaezungdiesesjahr = scanner.nextInt();
            Unternehmen.setGewinnschaezungDiesesJahr(gewinnschaezungdiesesjahr);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void Finanzsektor() {
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
            int cid = scanner.nextInt();
            Unternehmen.setCid(cid);
            //Select Name der Firma
            int finanzsektor = scanner.nextInt();
            Unternehmen.setFinanzsektor(finanzsektor);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Unternehmen
            session.update(Unternehmen);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}




}

