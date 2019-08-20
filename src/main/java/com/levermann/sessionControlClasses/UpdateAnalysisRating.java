/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.sessionControlClasses;

import com.levermann.entityclass.AnalysisRating;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

abstract public class UpdateAnalysisRating  {

    final static Logger logger = Logger.getLogger(UpdateAnalysisRating.class);

    public void UnName (String LevermannschrittAnalyseNameId, String unternehmenname) {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        
        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            // Hinzufügen des Loggers war erfolgreich
            logger.info("Logger for Update was saved successfull");
            System.out.println("Eingabe:\n 1. ID \n 2.  ");

            //Erzeugen eines Objektes vom Typen AnalysisRating
            AnalysisRating AnalysisRating=new AnalysisRating();
            //Select Primärschlüssel
            AnalysisRating.setAnalysisRatingName(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            
            AnalysisRating.setAnalysisRatingName(unternehmenname);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte AnalysisRating
            session.update(AnalysisRating);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void Eigenkapitalquote(String LevermannschrittAnalyseNameId, float eigenkapitalquote) {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        
        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            // Hinzufügen des Loggers war erfolgreich
            logger.info("Logger for Update was saved successfull");
            System.out.println("Eingabe:\n 1. ID \n 2. AnalysisRating \n 3. Datum \n 4. Eigenkapital \n 5. Jahresueberschuss");

            //Erzeugen eines Objektes vom Typen AnalysisRating
            AnalysisRating AnalysisRating=new AnalysisRating();
            //Select Primärschlüssel
            AnalysisRating.setAnalysisRatingName(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            AnalysisRating.setEigenkapitalquote(eigenkapitalquote);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte AnalysisRating
            session.update(AnalysisRating);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void EBITMarge(String LevermannschrittAnalyseNameId, float ebitmarge) {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        
        //Aufrufen der aktuellen Session aus HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            // Hinzufügen des Loggers war erfolgreich
            logger.info("Logger for Update was saved successfull");
            System.out.println("Eingabe:\n 1. ID \n 2. ");

            //Erzeugen eines Objektes vom Typen AnalysisRating
            AnalysisRating AnalysisRating=new AnalysisRating();
            //Select Primärschlüssel
            AnalysisRating.setAnalysisRatingName(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            AnalysisRating.setEBITMarge(ebitmarge);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte AnalysisRating
            session.update(AnalysisRating);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void Eigenkaitalquote(String LevermannschrittAnalyseNameId, float eigenkaitalquote) {
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

            //Erzeugen eines Objektes vom Typen AnalysisRating
            AnalysisRating AnalysisRating=new AnalysisRating();
            //Select Primärschlüssel
            AnalysisRating.setAnalysisRatingName(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            AnalysisRating.setEigenkapitalquote(eigenkaitalquote);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte AnalysisRating
            session.update(AnalysisRating);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void KursGewinnVerhaeltnis(String LevermannschrittAnalyseNameId, float kursgewinnverhaeltnis) {
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

            //Erzeugen eines Objektes vom Typen AnalysisRating
            AnalysisRating AnalysisRating=new AnalysisRating();
            //Select Primärschlüssel
            AnalysisRating.setAnalysisRatingName(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            AnalysisRating.setKursGewinnVerhaeltnis(kursgewinnverhaeltnis);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte AnalysisRating
            session.update(AnalysisRating);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void KursGewinnverhaeltnisAktuell(String LevermannschrittAnalyseNameId, float kursgewinnverhaeltnisaktuell) {
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

            //Erzeugen eines Objektes vom Typen AnalysisRating
            AnalysisRating AnalysisRating=new AnalysisRating();
            //Select Primärschlüssel
            AnalysisRating.setAnalysisRatingName(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            AnalysisRating.setKursGewinnVerhaeltnisAktuell(kursgewinnverhaeltnisaktuell);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte AnalysisRating
            session.update(AnalysisRating);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void Analysemeinungen(String LevermannschrittAnalyseNameId, float analysemeinungen) {
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

            //Erzeugen eines Objektes vom Typen AnalysisRating
            AnalysisRating AnalysisRating=new AnalysisRating();
            //Select Primärschlüssel
            AnalysisRating.setAnalysisRatingName(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            AnalysisRating.setAnalystenmeinungen(analysemeinungen);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte AnalysisRating
            session.update(AnalysisRating);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void ReaktionaufQuartalszahlen(String LevermannschrittAnalyseNameId, float reaktionaufquartalszahlen) {
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

            //Erzeugen eines Objektes vom Typen AnalysisRating
            AnalysisRating AnalysisRating=new AnalysisRating();
            //Select Primärschlüssel
            AnalysisRating.setAnalysisRatingName(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            AnalysisRating.setReaktionaufQuartalszahlen(reaktionaufquartalszahlen);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte AnalysisRating
            session.update(AnalysisRating);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void Gewinnrevision(String LevermannschrittAnalyseNameId, float gewinnrevision) {
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

            //Erzeugen eines Objektes vom Typen AnalysisRating
            AnalysisRating AnalysisRating=new AnalysisRating();
            //Select Primärschlüssel
            AnalysisRating.setAnalysisRatingName(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            AnalysisRating.setGewinnrevision(gewinnrevision);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte AnalysisRating
            session.update(AnalysisRating);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void Kursverlauf6Monate(String LevermannschrittAnalyseNameId, float kursverlauf6monate) {
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

            //Erzeugen eines Objektes vom Typen AnalysisRating
            AnalysisRating AnalysisRating=new AnalysisRating();
            //Select Primärschlüssel
            AnalysisRating.setAnalysisRatingName(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            AnalysisRating.setKursverlauf6Monate(kursverlauf6monate);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte AnalysisRating
            session.update(AnalysisRating);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void Kursverlauf12Monate(String LevermannschrittAnalyseNameId, float kursverlauf12monate) {
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

            //Erzeugen eines Objektes vom Typen AnalysisRating
            AnalysisRating AnalysisRating=new AnalysisRating();
            //Select Primärschlüssel
            AnalysisRating.setAnalysisRatingName(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            AnalysisRating.setKursverlauf12Monate(kursverlauf12monate);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte AnalysisRating
            session.update(AnalysisRating);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void Kursmomentum(String LevermannschrittAnalyseNameId, float kursmomentum) {
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

            //Erzeugen eines Objektes vom Typen AnalysisRating
            AnalysisRating AnalysisRating=new AnalysisRating();
            //Select Primärschlüssel
            AnalysisRating.setAnalysisRatingName(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            AnalysisRating.setKursmomentum(kursmomentum);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte AnalysisRating
            session.update(AnalysisRating);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void Dreimonatsreversal(String LevermannschrittAnalyseNameId, float dreimonatsreversal) {
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

            //Erzeugen eines Objektes vom Typen AnalysisRating
            AnalysisRating AnalysisRating=new AnalysisRating();
            //Select Primärschlüssel
            AnalysisRating.setAnalysisRatingName(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            AnalysisRating.setDreimonatsreversal(dreimonatsreversal);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte AnalysisRating
            session.update(AnalysisRating);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void Gewinnwachstum(String LevermannschrittAnalyseNameId, float gewinnwachstum) {
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

            //Erzeugen eines Objektes vom Typen AnalysisRating
            AnalysisRating AnalysisRating=new AnalysisRating();
            //Select Primärschlüssel
            AnalysisRating.setAnalysisRatingName(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            AnalysisRating.setGewinnwachstum(gewinnwachstum);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte AnalysisRating
            session.update(AnalysisRating);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

}

