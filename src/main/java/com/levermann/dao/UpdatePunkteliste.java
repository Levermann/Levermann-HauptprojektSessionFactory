/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.levermann.dao;

import com.levermann.entityclass.Punkteliste;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Scanner;

 public abstract class UpdatePunkteliste implements DaoPunkteliste {

    final static Logger logger = Logger.getLogger(UpdatePunkteliste.class);

    public void DaoCidFremdschlüssel () {
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
            System.out.println("Eingabe:\n 1. ID \n 2.  ");

            //Erzeugen eines Objektes vom Typen Punkteliste
            Punkteliste Punkteliste=new Punkteliste();
            //Select Primärschlüssel
            int pid = scanner.nextInt();
            Punkteliste.setPid(pid);
            //Select Name der Firma
            int cid2 = scanner.nextInt();
            Punkteliste.setCid2(cid2);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoEigenkapitalquote() {
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
            int Pid = scanner.nextInt();
            Punkteliste.setPid(Pid);
            //Select Name der Firma
            int eigenkapitalquote = scanner.nextInt();
            Punkteliste.setEigenkapitalquote(eigenkapitalquote);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoEBITMarge() {
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
            int pid = scanner.nextInt();
            Punkteliste.setPid(pid);
            //Select Name der Firma
            int ebitmarge = scanner.nextInt();
            Punkteliste.setEBITMarge(ebitmarge);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoEigenkaitalquote() {
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
            int Pid = scanner.nextInt();
            Punkteliste.setPid(Pid);
            //Select Name der Firma
            int eigenkaitalquote = scanner.nextInt();
            Punkteliste.setEigenkapitalquote(eigenkaitalquote);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoKursGewinnVerhaeltnis() {
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
            int Pid = scanner.nextInt();
            Punkteliste.setPid(Pid);
            //Select Name der Firma
            int kursgewinnverhaeltnis = scanner.nextInt();
            Punkteliste.setKursGewinnVerhaeltnis(kursgewinnverhaeltnis);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoKursGewinnverhaeltnisAktuell() {
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
            int Pid = scanner.nextInt();
            Punkteliste.setPid(Pid);
            //Select Name der Firma
            int kursgewinnverhaeltnisaktuell = scanner.nextInt();
            Punkteliste.setKursGewinnVerhaeltnisAktuell(kursgewinnverhaeltnisaktuell);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoAnalysemeinungen() {
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
            int Pid = scanner.nextInt();
            Punkteliste.setPid(Pid);
            //Select Name der Firma
            int analysemeinungen = scanner.nextInt();
            Punkteliste.setAnalystenmeinungen(analysemeinungen);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoReaktionaufQuartalszahlen() {
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
            int Pid = scanner.nextInt();
            Punkteliste.setPid(Pid);
            //Select Name der Firma
            int reaktionaufquartalszahlen = scanner.nextInt();
            Punkteliste.setReaktionaufQuartalszahlen(reaktionaufquartalszahlen);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoGewinnrevision() {
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
            int Pid = scanner.nextInt();
            Punkteliste.setPid(Pid);
            //Select Name der Firma
            int gewinnrevision = scanner.nextInt();
            Punkteliste.setGewinnrevision(gewinnrevision);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoKursverlauf6Monate() {
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
            int Pid = scanner.nextInt();
            Punkteliste.setPid(Pid);
            //Select Name der Firma
            int kursverlauf6monate = scanner.nextInt();
            Punkteliste.setKursverlauf6Monate(kursverlauf6monate);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoKursverlauf12Monate() {
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
            int Pid = scanner.nextInt();
            Punkteliste.setPid(Pid);
            //Select Name der Firma
            int kursverlauf12monate = scanner.nextInt();
            Punkteliste.setKursverlauf12Monate(kursverlauf12monate);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoKursmomentum() {
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
            int Pid = scanner.nextInt();
            Punkteliste.setPid(Pid);
            //Select Name der Firma
            int kursmomentum = scanner.nextInt();
            Punkteliste.setKursmomentum(kursmomentum);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoDreimonatsreversal() {
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
            int Pid = scanner.nextInt();
            Punkteliste.setPid(Pid);
            //Select Name der Firma
            int dreimonatsreversal = scanner.nextInt();
            Punkteliste.setDreimonatsreversal(dreimonatsreversal);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}

    public void DaoGewinnwachstum() {
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
            int Pid = scanner.nextInt();
            Punkteliste.setPid(Pid);
            //Select Name der Firma
            int gewinnwachstum = scanner.nextInt();
            Punkteliste.setGewinnwachstum(gewinnwachstum);

            //Beginn der Datenübertragung
            session.beginTransaction();
            //Umesetzung der Update Methode auf das ausgewählte Punkteliste
            session.update(Punkteliste);
            // Übertragung bestätigen
            session.getTransaction().commit(); } finally{}}


}