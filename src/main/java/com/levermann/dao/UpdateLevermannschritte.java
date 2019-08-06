/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.dao;

import com.levermann.entityclass.Levermannschritte;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Scanner;

abstract public class UpdateLevermannschritte implements DaoLevermannschritte {

    final static Logger logger = Logger.getLogger(UpdateLevermannschritte.class);

    public void DaoCidFremdschlüssel () {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Levermannschritte

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
            int lid = scanner.nextInt();
            Levermannschritte.setLid(lid);
            //Select Name der Firma
            int cid3 = scanner.nextInt();
            Levermannschritte.setCid3(cid3);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoEigenkapitalquote() {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Levermannschritte

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
            int Lid = scanner.nextInt();
            Levermannschritte.setLid(Lid);
            //Select Name der Firma
            int eigenkapitalquote = scanner.nextInt();
            Levermannschritte.setEigenkapitalquote(eigenkapitalquote);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoEBITMarge() {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Levermannschritte

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
            int Lid = scanner.nextInt();
            Levermannschritte.setLid(Lid);
            //Select Name der Firma
            int ebitmarge = scanner.nextInt();
            Levermannschritte.setEBITMarge(ebitmarge);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoEigenkaitalquote() {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Levermannschritte

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
            int Lid = scanner.nextInt();
            Levermannschritte.setLid(Lid);
            //Select Name der Firma
            int eigenkaitalquote = scanner.nextInt();
            Levermannschritte.setEigenkapitalquote(eigenkaitalquote);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoKursGewinnVerhaeltnis() {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Levermannschritte

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
            int Lid = scanner.nextInt();
            Levermannschritte.setLid(Lid);
            //Select Name der Firma
            int kursgewinnverhaeltnis = scanner.nextInt();
            Levermannschritte.setKursGewinnVerhältnis(kursgewinnverhaeltnis);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoKursGewinnverhaeltnisAktuell() {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Levermannschritte

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
            int Lid = scanner.nextInt();
            Levermannschritte.setLid(Lid);
            //Select Name der Firma
            int kursgewinnverhaeltnisaktuell = scanner.nextInt();
            Levermannschritte.setKursGewinnVerhältnisAktuell(kursgewinnverhaeltnisaktuell);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoAnalysemeinungen() {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Levermannschritte

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
            int Lid = scanner.nextInt();
            Levermannschritte.setLid(Lid);
            //Select Name der Firma
            int analysemeinungen = scanner.nextInt();
            Levermannschritte.setAnalystenmeinungen(analysemeinungen);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoReaktionaufQuartalszahlen() {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Levermannschritte

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
            int Lid = scanner.nextInt();
            Levermannschritte.setLid(Lid);
            //Select Name der Firma
            int reaktionaufquartalszahlen = scanner.nextInt();
            Levermannschritte.setReaktionaufQuartalszahlen(reaktionaufquartalszahlen);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoGewinnrevision() {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Levermannschritte

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
            int Lid = scanner.nextInt();
            Levermannschritte.setLid(Lid);
            //Select Name der Firma
            int gewinnrevision = scanner.nextInt();
            Levermannschritte.setGewinnrevision(gewinnrevision);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoKursverlauf6Monate() {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Levermannschritte

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
            int Lid = scanner.nextInt();
            Levermannschritte.setLid(Lid);
            //Select Name der Firma
            int kursverlauf6monate = scanner.nextInt();
            Levermannschritte.setKursverlauf6Monate(kursverlauf6monate);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoKursverlauf12Monate() {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Levermannschritte

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
            int Lid = scanner.nextInt();
            Levermannschritte.setLid(Lid);
            //Select Name der Firma
            int kursverlauf12monate = scanner.nextInt();
            Levermannschritte.setKursverlauf12Monate(kursverlauf12monate);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoKursmomentum() {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Levermannschritte

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
            int Lid = scanner.nextInt();
            Levermannschritte.setLid(Lid);
            //Select Name der Firma
            int kursmomentum = scanner.nextInt();
            Levermannschritte.setKursmomentum(kursmomentum);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoDreimonatsreversal() {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Levermannschritte

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
            int Lid = scanner.nextInt();
            Levermannschritte.setLid(Lid);
            //Select Name der Firma
            int dreimonatsreversal = scanner.nextInt();
            Levermannschritte.setDreimonatsreversal(dreimonatsreversal);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoGewinnwachstum() {
        //Logger wird für die Methode Delete ausgeführt
        logger.info("Logger is Entering the Execute method Update");
        String returnValue = "";
        Scanner scanner = new Scanner(System.in);
        // Eingabeauforderung Levermannschritte

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
            int Lid = scanner.nextInt();
            Levermannschritte.setLid(Lid);
            //Select Name der Firma
            int gewinnwachstum = scanner.nextInt();
            Levermannschritte.setGewinnwachstum(gewinnwachstum);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Levermannschritte
            session.update(Levermannschritte);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

}

