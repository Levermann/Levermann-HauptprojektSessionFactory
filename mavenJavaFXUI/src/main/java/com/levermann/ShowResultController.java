package com.levermann;

import com.levermann.entityclass.AnalysisRating;
import com.levermann.sessionControlClasses.HibernateUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.ResourceBundle;

public class ShowResultController implements Initializable, ControlledScreenInterface{
    private Connection con;

    //Werte aus DB AnalysisRating ziehen

  //  public static Float eigenkapitalrenditeAR;

    @FXML
    public TableView<CompanyManageUI> tableRating;
    @FXML
    TableColumn<CompanyManageUI, String> keyFiguresRating;
    @FXML
    TableColumn<CompanyManageUI, Float> resultRating;


    private final ObservableList<CompanyManageUI> observableListAR = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        keyFiguresRating.setCellValueFactory((new PropertyValueFactory<CompanyManageUI, String>("kennzahlenfürAR")));
        resultRating.setCellValueFactory((new PropertyValueFactory<CompanyManageUI, Float>("ergebnissefürAR")));
        tableRating.setItems(observableListAR);

    }


    ScreensController myController;

    @Override
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    @FXML
    public void zeigeInputAnUI (ActionEvent actionEvent) throws IOException {
    }
    @FXML
    private void switchToCompanyOverview() throws IOException{
        //App.setRoot("companyOverview");
        myController.setScreen(App.companyOverviewID);
        App.setStageTitle("Allgemeine Unternehmensübersicht");
    }

    @FXML
    private void switchToShowUserInputs() throws IOException{
        //App.setRoot("companyOverview");
        myController.setScreen(App.showUserInputID);
        App.setStageTitle("Allgemeine Unternehmensübersicht");
    }
    private void getDataAnalysisRating(){
        ConnectionDB();
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session1 = sessionFactory.getCurrentSession();

        session1.beginTransaction();
        /*
        Company company1 = (Company) session1.get(Company.class, 1L);
        company1.getGesamtPunkte();
        company1.getCompanyname();
        company1.getDatum();

         */
        Query queryAR = session1.getNamedQuery("AnalysisRating.findAll");
        List<AnalysisRating> ListAR = (List<AnalysisRating>) queryAR.list();

        for (AnalysisRating rating : ListAR) {

            float eigenkapitalrenditeAR = rating.getEigenkapitalrendite();
            float ebitAR = rating.getEBITMarge();
            float eigenkapitalquoteAR = rating.getEigenkapitalquote();
            float KGVAR = rating.getKursGewinnVerhaeltnis();
            float AGVAktuellAR = rating.getKursGewinnVerhaeltnisAktuell();
            float analystenmeinungenAR = rating.getAnalystenmeinungen();
            float reaktionQAR = rating.getReaktionaufQuartalszahlen();
            float gewinnrevisionAR = rating.getGewinnrevision();
            float kursverlauf6AR = rating.getKursverlauf6Monate();
            float kursverlauf12AR = rating.getKursverlauf12Monate();
            float kursmomentumAR = rating.getKursmomentum();
            float dreimonrevAR = rating.getDreimonatsreversal();
            float gewinnwachstumAR = rating.getGewinnwachstum();
            observableListAR.add(new CompanyManageUI("Eigenkapitalrendite", eigenkapitalquoteAR));

        }
        DisconnectionDB();

        session1.getTransaction().commit();
    }


    private void ConnectionDB() {
        //TODO Die vom Benutzer eingegebenen Daten in die MySQL Datenbank schreiben
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
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/levermann?useSSL=false&serverTimezone=UTC", "Levermann", "Levermann");
            System.out.println("Levermann database connected!");
        } catch (Exception e) {
            System.err.println("Could not connect to Leverman database...");
            System.err.println(e);
            throw new IllegalStateException("Failed connecting to Levermann database!");
        }
    }

    //TODO Füge hier SQL-Queries ein, die die jeweiligen Datensätze in die Table "Company" hinzufügen
    private void DisconnectionDB(){
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