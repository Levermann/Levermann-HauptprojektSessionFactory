package com.levermann;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.*;

public class InputController {

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



    @FXML
    private void switchToShowResult() throws IOException {
        fillDBvalues();
        App.setRoot("showResult");
    }

    public void switchToPrimaryPage(ActionEvent actionEvent) throws IOException {
        App.setRoot("startPage");
    }

    private void fillDBvalues() {
        //TODO Die vom Benutzer eingegebenen Daten in die MySQL Datenbank schreiben
        System.out.println("Connecting to Levermann database...");
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/levermann", "Levermann", "Levermann")){
            System.out.println("Levermann database connected!");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/levermann", "Levermann", "Levermann");
            con.close();
        }catch(SQLException e){
            System.out.println("Ich bin dumm und connecte nicht....");
            //throw new IllegalStateException("Cannot connect to Levermann database!");
        }

        /**
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
}
