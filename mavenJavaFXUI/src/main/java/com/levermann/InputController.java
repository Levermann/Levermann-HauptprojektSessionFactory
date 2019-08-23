package com.levermann;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.stage.Screen;

import java.io.IOException;
import java.sql.*;

public class InputController implements ControlledScreenInterface {

    @FXML
    private TextField jahresueberschuss;
    @FXML
    private TextField eigenkapital;
    @FXML
    private TextField gewinnEBIT;
    @FXML
    private TextField fremdkapital;
    @FXML
    private TextField aktuellerAktienkurs;
    @FXML
    private TextField geschaetzterGewinn;
    @FXML
    private TextField analystenKaufen;
    @FXML
    private TextField analystenVerkaufen;
    @FXML
    private TextField analystenHalten;
    @FXML
    private TextField kursanstiegUnternehmen;
    @FXML
    private TextField kursanstiegAktienindex;
    @FXML
    private TextField gewinnschaetzungVor4Wochen;
    @FXML
    private TextField aktuelleGewinnschaetzung;
    @FXML
    private TextField aktienkursVor6Monaten;
    @FXML
    private TextField aktienkursVor12Monaten;
    @FXML
    private TextField kursVor1Monat;
    @FXML
    private TextField kursVor2Monaten;
    @FXML
    private TextField kursVor3Monaten;
    @FXML
    private TextField aktienkursVor1Monat;
    @FXML
    private TextField aktienkursVor2Monaten;
    @FXML
    private TextField aktienkursVor3Monaten;
    @FXML
    private TextField gewinnschaetzungNaechstesJahr;
    @FXML
    private TextField gewinnschaetzungDiesesJahr;
    @FXML
    private CheckBox smallCap;
    @FXML
    private CheckBox finanzwerte;

    ScreensController myController;
    private Connection con;

    @Override
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    @FXML
    private void switchToShowResult() throws IOException {
        fillDBvalues();
        //App.setRoot("showResult");
        myController.setScreen(App.showResultID);
        App.setStageTitle("Unternehmensergebnisse");
    }

    public void switchToPrimaryPage(ActionEvent actionEvent) throws IOException {
        //App.setRoot("startPage");
        //TODO Schließe die Session, zurück zu Startseite
        myController.setScreen(App.startPageID);
        App.setStageTitle("Hauptmenü");
    }

    private void fillDBvalues() {
        //TODO Die vom Benutzer eingegebenen Daten in die MySQL Datenbank schreiben
        //Load the jdbc diver
        System.out.println("Trying to load the JDBC driver...");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("JDBC Driver loaded!");
        } catch (Exception e) {
            System.err.println("Cound not load JDBC driver...");
            System.err.println(e);
            throw new IllegalStateException("Failed loading the JDBC driver!");
        }

        //connect to the levermann database
        System.out.println("Trying to connect to Levermann database...");
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/levermann?useSSL=false&serverTimezone=UTC", "Levermann", "Levermann");
            System.out.println("Levermann database connected!");
        } catch (Exception e) {
            System.err.println("Could not connect to Leverman database...");
            System.err.println(e);
            throw new IllegalStateException("Failed connecting to Levermann database!");
        }

        //TODO Füge hier SQL-Queries ein, die die jeweiligen Datensätze in die Table "Company" hinzufügen

        System.out.println("Trying to close the connection to Levermann database...");
        try{
            con.close();
            System.out.println("Levermann database disconnected!");
        }catch(Exception e){
            System.err.println("Could not disconnect Leverman database...");
            System.err.println(e);
            throw new IllegalStateException("Failed disconnecting Levermann database!");
        }
    }

        /**
         *
         * MysqlDataSource dataSource = new MysqlDataSource();
         * dataSource.setUser("Levermann");
         * dataSource.setPassword("Levermann");
         * dataSource.setServerName("jdbc:mysql://localhost:3306/levermann");
         * Connection conn = dataSource.getconnection();**/
         //TODO Füge hier SQL-Queries ein, die die jeweiligen Datensätze in die Table "Company" hinzufügen

        /**
         * conn.close();
         */
    }

