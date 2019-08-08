/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.DatabaseStatements;

import com.levermann.entityclass.Levermannschritte;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Scanner;

abstract public class UpdateLevermannschritte  {

    final static Logger logger = Logger.getLogger(UpdateLevermannschritte.class);

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

            //Erzeugen eines Objektes vom Typen Levermannschritte
            Levermannschritte Levermannschritte=new Levermannschritte();
            //Select Primärschlüssel
            Levermannschritte.setLevermannschrittAnalyseNameId(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            
            Levermannschritte.setUnternehmenname_Levermannschritte(unternehmenname);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
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
            System.out.println("Eingabe:\n 1. ID \n 2. Levermannschritte \n 3. Datum \n 4. Eigenkapital \n 5. Jahresueberschuss");

            //Erzeugen eines Objektes vom Typen Levermannschritte
            Levermannschritte Levermannschritte=new Levermannschritte();
            //Select Primärschlüssel
            Levermannschritte.setLevermannschrittAnalyseNameId(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            Levermannschritte.setEigenkapitalquote(eigenkapitalquote);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
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

            //Erzeugen eines Objektes vom Typen Levermannschritte
            Levermannschritte Levermannschritte=new Levermannschritte();
            //Select Primärschlüssel
            Levermannschritte.setLevermannschrittAnalyseNameId(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            Levermannschritte.setEBITMarge(ebitmarge);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
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

            //Erzeugen eines Objektes vom Typen Levermannschritte
            Levermannschritte Levermannschritte=new Levermannschritte();
            //Select Primärschlüssel
            Levermannschritte.setLevermannschrittAnalyseNameId(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            Levermannschritte.setEigenkapitalquote(eigenkaitalquote);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
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

            //Erzeugen eines Objektes vom Typen Levermannschritte
            Levermannschritte Levermannschritte=new Levermannschritte();
            //Select Primärschlüssel
            Levermannschritte.setLevermannschrittAnalyseNameId(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            Levermannschritte.setKursGewinnVerhaeltnis(kursgewinnverhaeltnis);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
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

            //Erzeugen eines Objektes vom Typen Levermannschritte
            Levermannschritte Levermannschritte=new Levermannschritte();
            //Select Primärschlüssel
            Levermannschritte.setLevermannschrittAnalyseNameId(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            Levermannschritte.setKursGewinnVerhaeltnisAktuell(kursgewinnverhaeltnisaktuell);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
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

            //Erzeugen eines Objektes vom Typen Levermannschritte
            Levermannschritte Levermannschritte=new Levermannschritte();
            //Select Primärschlüssel
            Levermannschritte.setLevermannschrittAnalyseNameId(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            Levermannschritte.setAnalystenmeinungen(analysemeinungen);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
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

            //Erzeugen eines Objektes vom Typen Levermannschritte
            Levermannschritte Levermannschritte=new Levermannschritte();
            //Select Primärschlüssel
            Levermannschritte.setLevermannschrittAnalyseNameId(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            Levermannschritte.setReaktionaufQuartalszahlen(reaktionaufquartalszahlen);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
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

            //Erzeugen eines Objektes vom Typen Levermannschritte
            Levermannschritte Levermannschritte=new Levermannschritte();
            //Select Primärschlüssel
            Levermannschritte.setLevermannschrittAnalyseNameId(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            Levermannschritte.setGewinnrevision(gewinnrevision);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
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

            //Erzeugen eines Objektes vom Typen Levermannschritte
            Levermannschritte Levermannschritte=new Levermannschritte();
            //Select Primärschlüssel
            Levermannschritte.setLevermannschrittAnalyseNameId(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            Levermannschritte.setKursverlauf6Monate(kursverlauf6monate);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
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

            //Erzeugen eines Objektes vom Typen Levermannschritte
            Levermannschritte Levermannschritte=new Levermannschritte();
            //Select Primärschlüssel
            Levermannschritte.setLevermannschrittAnalyseNameId(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            Levermannschritte.setKursverlauf12Monate(kursverlauf12monate);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
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

            //Erzeugen eines Objektes vom Typen Levermannschritte
            Levermannschritte Levermannschritte=new Levermannschritte();
            //Select Primärschlüssel
            Levermannschritte.setLevermannschrittAnalyseNameId(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            Levermannschritte.setKursmomentum(kursmomentum);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
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

            //Erzeugen eines Objektes vom Typen Levermannschritte
            Levermannschritte Levermannschritte=new Levermannschritte();
            //Select Primärschlüssel
            Levermannschritte.setLevermannschrittAnalyseNameId(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            Levermannschritte.setDreimonatsreversal(dreimonatsreversal);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
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

            //Erzeugen eines Objektes vom Typen Levermannschritte
            Levermannschritte Levermannschritte=new Levermannschritte();
            //Select Primärschlüssel
            Levermannschritte.setLevermannschrittAnalyseNameId(LevermannschrittAnalyseNameId);
            //Select Name der Firma
            Levermannschritte.setGewinnwachstum(gewinnwachstum);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

}

