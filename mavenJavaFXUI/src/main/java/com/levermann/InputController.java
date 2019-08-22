package com.levermann;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.stage.Screen;

import java.io.IOException;
import java.sql.*;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

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

        //Load the jdbc diver
        System.out.println("Trying to load the JDBC driver...");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC Driver loaded!");
        } catch (Exception e) {
            System.err.println("Cound not load JDBC driver...");
            System.err.println(e);
            throw new IllegalStateException("Failed loading the JDBC driver!");
        }

        //connect to the levermann database
        System.out.println("Trying to connect to Levermann database...");
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/levermann", "Levermann", "Levermann");
            System.out.println("Levermann database connected!");
        } catch (Exception e) {
            System.err.println("Could not connect to Leverman database...");
            System.err.println(e);
            throw new IllegalStateException("Failed connecting to Levermann database!");
        }

        //TODO Füge hier SQL-Queries ein, die die jeweiligen Datensätze in die Table "Company" hinzufügen

        System.out.println("Trying to write input data into table company...");
        try{
            //get current date, format it
            //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy");
            //LocalDate now = LocalDate.now();
            //System.out.println(dtf.format(now));

            Statement statement = con.createStatement();
            statement.executeUpdate("INSERT INTO 'company'(`Companyname`, `id`, `datum`, `eigenkapital`, `jahresueberschuss`, `GewinnEBIT`, `Jahresumsatz`, `Fremdkapital`, `AktuellerAktienkurs`, `Gewinnschaezung`, `GewinnAVG`, `Halten`, `Verkaufen`, `Kaufen`, `KursanstiegUnternehmen`, `KursanstiegIndex`, `GewinnschaezungVor4Wochen`, `AktienkursTagVeroeffentlichungQartalszahlen`, `KursVor6Monaten`, `KursVor12Monaten`, `KursVor3Monaten`, `KursVor2Monaten`, `KursVor1Monat`, `DaxVor1Monat`, `DaxVor2Monaten`, `DaxVor3Monaten`, `GewinnschaezungNaechstesJahr`, `GewinnschaezungDiesesJahr`, `Finanzsektor`, `PerfInJedemMonat`, `KursgewinnVor3Jahren`, `KursgewinnVor2Jahren`, `KursgewinnVor1Jahr`, `AktuellenErwartetenKursgewinn`, `KursgewinnschaezungNaechstesJahr`)"+
                    " VALUES ("+
                            "'" + EnterCompanyNameController.companyName.getText() + "'," +
                            " '" + (float)1 + "'," +
                            " '" + (float)404 + "'," +
                            " '" + Float.parseFloat(this.eigenkapital.getText())+ "'," +
                            " '" + Float.parseFloat(this.jahresueberschuss.getText()) + "'," +
                            " '" + Float.parseFloat(this.gewinnEBIT.getText()) + "'," +
                            " '" + (float)404 + "'," +
                            " '" + Float.parseFloat(this.fremdkapital.getText()) + "'," +
                            " '" + Float.parseFloat(this.aktuellerAktienkurs.getText()) + "'," +
                            " '" + Float.parseFloat(this.aktuelleGewinnschaetzung.getText()) + "'," +
                            " '" + (float)404 + "'," +
                            " '" + Float.parseFloat(this.analystenHalten.getText()) + "'," +
                            " '" + Float.parseFloat(this.analystenVerkaufen.getText()) + "'," +
                            " '" + Float.parseFloat(this.analystenKaufen.getText()) + "'," +
                            " '" + Float.parseFloat(this.kursanstiegUnternehmen.getText()) + "'," +
                            " '" + Float.parseFloat(this.kursanstiegAktienindex.getText()) + "'," +
                            " '" + Float.parseFloat(this.gewinnschaetzungVor4Wochen.getText()) + "'," +
                            " '" + (float)404 + "'," +
                            " '" + Float.parseFloat(this.aktienkursVor6Monaten.getText()) + "'," +
                            " '" + Float.parseFloat(this.aktienkursVor12Monaten.getText()) + "'," +
                            " '" + Float.parseFloat(this.kursVor3Monaten.getText()) + "'," +
                            " '" + Float.parseFloat(this.kursVor2Monaten.getText()) + "'," +
                            " '" + Float.parseFloat(this.kursVor1Monat.getText()) + "'," +
                            " '" + Float.parseFloat(this.aktienkursVor3Monaten.getText()) + "'," +
                            " '" + Float.parseFloat(this.aktienkursVor2Monaten.getText()) + "'," +
                            " '" + Float.parseFloat(this.aktienkursVor1Monat.getText()) + "'," +
                            " '" + Float.parseFloat(this.gewinnschaetzungNaechstesJahr.getText()) + "'," +
                            " '" + Float.parseFloat(this.gewinnschaetzungDiesesJahr.getText()) + "'," +
                            " '" + (float)404 + "'," +
                            " '" + (float)404 + "'," +
                            " '" + (float)404 + "'," +
                            " '" + (float)404 + "'," +
                            " '" + (float)404 + "'," +
                            " '" + (float)404 + "'," +
                            " '" + (float)404 + "'" +
                            ")"
                    );
        }catch(Exception e){
            System.err.println("Data could not be written into table company...");
            System.err.println(e);
            throw new IllegalStateException("Failed to write data into table company!");
        }


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
}
