/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.sessionControlClasses;

import com.levermann.entityclass.Punkteliste;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Scanner;

 public abstract class UpdatePunkteliste {

    final static Logger logger = Logger.getLogger(UpdatePunkteliste.class);

    public void UnName (String punktelisteNameId, String unternehmenname) {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        
        // Eingabeauforderung Punkteliste

        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            // Hinzufügen des Loggers war erfolgreich
            logger.info("Logger for Update was saved successfull");
            System.out.println("Eingabe:\n 1. ID \n 2.  ");

            //Erzeugen eines Objektes vom Typen Punkteliste
            Punkteliste Punkteliste=new Punkteliste();
            //Select Primärschlüssel
            Punkteliste.setPunktelisteNameId(punktelisteNameId);
            //Select Name der Firma
            Punkteliste.setUnternehmenname_Punkteliste (unternehmenname);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void Eigenkapitalquote(String punktelisteNameId, float eigenkapitalquote) {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Punkteliste

        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            // Hinzufügen des Loggers war erfolgreich
            logger.info("Logger for Update was saved successfull");
            System.out.println("Eingabe:\n 1. ID \n 2. Punkteliste \n 3. Datum \n 4. Eigenkapital \n 5. Jahresueberschuss");

            //Erzeugen eines Objektes vom Typen Punkteliste
            Punkteliste Punkteliste=new Punkteliste();
            //Select Primärschlüssel
            
            Punkteliste.setPunktelisteNameId(punktelisteNameId);
            //Select Name der Firma
            Punkteliste.setEigenkapitalquote(eigenkapitalquote);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void EBITMarge(String punktelisteNameId, float ebitmarge) {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Punkteliste

        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            // Hinzufügen des Loggers war erfolgreich
            logger.info("Logger for Update was saved successfull");
            System.out.println("Eingabe:\n 1. ID \n 2. ");

            //Erzeugen eines Objektes vom Typen Punkteliste
            Punkteliste Punkteliste=new Punkteliste();
            //Select Primärschlüssel
            
            Punkteliste.setPunktelisteNameId(punktelisteNameId);
            //Select Name der Firma
            Punkteliste.setEBITMarge(ebitmarge);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void Eigenkaitalquote(String punktelisteNameId, float eigenkaitalquote) {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Punkteliste

        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            // Hinzufügen des Loggers war erfolgreich
            logger.info("Logger for Update was saved successfull");
            System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

            //Erzeugen eines Objektes vom Typen Punkteliste
            Punkteliste Punkteliste=new Punkteliste();
            //Select Primärschlüssel
            
            Punkteliste.setPunktelisteNameId(punktelisteNameId);
            //Select Name der Firma
            Punkteliste.setEigenkapitalquote(eigenkaitalquote);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void KursGewinnVerhaeltnis(String punktelisteNameId, float kursgewinnverhaeltnis) {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Punkteliste

        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            // Hinzufügen des Loggers war erfolgreich
            logger.info("Logger for Update was saved successfull");
            System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

            //Erzeugen eines Objektes vom Typen Punkteliste
            Punkteliste Punkteliste=new Punkteliste();
            //Select Primärschlüssel
            
            Punkteliste.setPunktelisteNameId(punktelisteNameId);
            //Select Name der Firma
            Punkteliste.setKursGewinnVerhaeltnis(kursgewinnverhaeltnis);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void KursGewinnverhaeltnisAktuell(String punktelisteNameId, float kursgewinnverhaeltnisaktuell) {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Punkteliste

        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            // Hinzufügen des Loggers war erfolgreich
            logger.info("Logger for Update was saved successfull");
            System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

            //Erzeugen eines Objektes vom Typen Punkteliste
            Punkteliste Punkteliste=new Punkteliste();
            //Select Primärschlüssel
            
            Punkteliste.setPunktelisteNameId(punktelisteNameId);
            //Select Name der Firma
            Punkteliste.setKursGewinnVerhaeltnisAktuell(kursgewinnverhaeltnisaktuell);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void Analysemeinungen(String punktelisteNameId, float analysemeinungen) {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Punkteliste

        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            // Hinzufügen des Loggers war erfolgreich
            logger.info("Logger for Update was saved successfull");
            System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

            //Erzeugen eines Objektes vom Typen Punkteliste
            Punkteliste Punkteliste=new Punkteliste();
            //Select Primärschlüssel
            
            Punkteliste.setPunktelisteNameId(punktelisteNameId);
            //Select Name der Firma
            Punkteliste.setAnalystenmeinungen(analysemeinungen);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void ReaktionaufQuartalszahlen(String punktelisteNameId, float reaktionaufquartalszahlen) {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Punkteliste

        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            // Hinzufügen des Loggers war erfolgreich
            logger.info("Logger for Update was saved successfull");
            System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

            //Erzeugen eines Objektes vom Typen Punkteliste
            Punkteliste Punkteliste=new Punkteliste();
            //Select Primärschlüssel
            
            Punkteliste.setPunktelisteNameId(punktelisteNameId);
            //Select Name der Firma
            Punkteliste.setReaktionaufQuartalszahlen(reaktionaufquartalszahlen);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void Gewinnrevision(String punktelisteNameId, float gewinnrevision) {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Punkteliste

        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            // Hinzufügen des Loggers war erfolgreich
            logger.info("Logger for Update was saved successfull");
            System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

            //Erzeugen eines Objektes vom Typen Punkteliste
            Punkteliste Punkteliste=new Punkteliste();
            //Select Primärschlüssel
            
            Punkteliste.setPunktelisteNameId(punktelisteNameId);
            //Select Name der Firma
            Punkteliste.setGewinnrevision(gewinnrevision);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void Kursverlauf6Monate(String punktelisteNameId, float kursverlauf6monate) {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Punkteliste

        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            // Hinzufügen des Loggers war erfolgreich
            logger.info("Logger for Update was saved successfull");
            System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

            //Erzeugen eines Objektes vom Typen Punkteliste
            Punkteliste Punkteliste=new Punkteliste();
            //Select Primärschlüssel
            
            Punkteliste.setPunktelisteNameId(punktelisteNameId);
            //Select Name der Firma
            Punkteliste.setKursverlauf6Monate(kursverlauf6monate);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void Kursverlauf12Monate(String punktelisteNameId, float kursverlauf12monate) {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Punkteliste

        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            // Hinzufügen des Loggers war erfolgreich
            logger.info("Logger for Update was saved successfull");
            System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

            //Erzeugen eines Objektes vom Typen Punkteliste
            Punkteliste Punkteliste=new Punkteliste();
            //Select Primärschlüssel
            
            Punkteliste.setPunktelisteNameId(punktelisteNameId);
            //Select Name der Firma
            Punkteliste.setKursverlauf12Monate(kursverlauf12monate);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void Kursmomentum(String punktelisteNameId, float kursmomentum) {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Punkteliste

        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            // Hinzufügen des Loggers war erfolgreich
            logger.info("Logger for Update was saved successfull");
            System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

            //Erzeugen eines Objektes vom Typen Punkteliste
            Punkteliste Punkteliste=new Punkteliste();
            //Select Primärschlüssel
            
            Punkteliste.setPunktelisteNameId(punktelisteNameId);
            //Select Name der Firma
            Punkteliste.setKursmomentum(kursmomentum);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void Dreimonatsreversal(String punktelisteNameId, float dreimonatsreversal) {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Punkteliste

        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            // Hinzufügen des Loggers war erfolgreich
            logger.info("Logger for Update was saved successfull");
            System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

            //Erzeugen eines Objektes vom Typen Punkteliste
            Punkteliste Punkteliste=new Punkteliste();
            //Select Primärschlüssel
            
            Punkteliste.setPunktelisteNameId(punktelisteNameId);
            //Select Name der Firma
            Punkteliste.setDreimonatsreversal(dreimonatsreversal);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void Gewinnwachstum(String punktelisteNameId, float gewinnwachstum) {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Punkteliste

        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            // Hinzufügen des Loggers war erfolgreich
            logger.info("Logger for Update was saved successfull");
            System.out.println("Eingabe:\n 1. ID \n 2. Jahresüberschuss");

            //Erzeugen eines Objektes vom Typen Punkteliste
            Punkteliste Punkteliste=new Punkteliste();
            //Select Primärschlüssel
            
            Punkteliste.setPunktelisteNameId(punktelisteNameId);
            //Select Name der Firma
            Punkteliste.setGewinnwachstum(gewinnwachstum);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}


}