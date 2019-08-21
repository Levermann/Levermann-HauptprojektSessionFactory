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
         *  try{
         *           Class.forName("org.mariadb.jdbc.Driver");
         *                 "jdbc:mariadb://localhost:3306/project", "root", "");
         *
         *         Connection connection = DriverManager.getConnection(
         *         Statement statement = connection.createStatement();
         *
         *         String uname="xyz",pass="abc";
         *        statement.executeUpdate("insert into user values('"+uname+"','"+pass+"')");}
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
}
