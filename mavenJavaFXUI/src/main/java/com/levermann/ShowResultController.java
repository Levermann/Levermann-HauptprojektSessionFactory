package com.levermann;

import com.levermann.entityclass.AnalysisRating;
import com.levermann.entityclass.AnalysisSteps;
import com.levermann.entityclass.Company;
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

    public static String Companyname1;
    //Werte aus DB AnalysisRating ziehen

  //  public static Float eigenkapitalrenditeAR;

    @FXML
    public TableView<CompanyManageUI> tableRating;
    @FXML
    TableColumn<CompanyManageUI, String> keyFiguresRating;
    @FXML
    TableColumn<CompanyManageUI, Float> resultRating;

    @FXML
    public TableView<AnalysisStepsManageUI> tableSteps;
    @FXML
    TableColumn<AnalysisStepsManageUI, String> keyFiguresSteps;
    @FXML
    TableColumn<AnalysisStepsManageUI, Float> resultSteps;


    private final ObservableList<CompanyManageUI> observableListAR = FXCollections.observableArrayList();
    private final ObservableList<AnalysisStepsManageUI> observableListAS = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        keyFiguresRating.setCellValueFactory((new PropertyValueFactory<CompanyManageUI, String>("kennzahlenfürAR")));
        resultRating.setCellValueFactory((new PropertyValueFactory<CompanyManageUI, Float>("ergebnissefürAR")));
        tableRating.setItems(observableListAR);


        keyFiguresSteps.setCellValueFactory((new PropertyValueFactory<AnalysisStepsManageUI, String>("kennzahlenfürAS")));
        resultSteps.setCellValueFactory((new PropertyValueFactory<AnalysisStepsManageUI, Float>("ergebnissefürAS")));
        tableSteps.setItems(observableListAS);
    }


    ScreensController myController;

    @Override
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    @FXML
    public void zeigeInputAnUI () throws IOException {
      //  getDataAnalysisSteps();
        getDataAnalysisRating();
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


                Query queryAR = session1.getNamedQuery("AnalysisRating.findAll");
                List<AnalysisRating> ListAR = (List<AnalysisRating>) queryAR.list();

                for (AnalysisRating rating : ListAR) {
                    if (Companyname1.equals(rating.getCompanyname_AnalysisRating())) {
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
                        observableListAR.add(new CompanyManageUI("Eigenkapitalrendite", eigenkapitalrenditeAR));
                        observableListAR.add(new CompanyManageUI("EbitMarge", ebitAR));
                        observableListAR.add(new CompanyManageUI("Eigenkapitalquote", eigenkapitalquoteAR));
                        observableListAR.add(new CompanyManageUI("KursGewinnVerhältnis", KGVAR));
                        observableListAR.add(new CompanyManageUI("KursGewinnVerhältnisAktuell", AGVAktuellAR));
                        observableListAR.add(new CompanyManageUI("Analystenmeinungen", analystenmeinungenAR));
                        observableListAR.add(new CompanyManageUI("Reaktion auf Quartalszahlen", reaktionQAR));
                        observableListAR.add(new CompanyManageUI("Gewinnrevision", gewinnrevisionAR));
                        observableListAR.add(new CompanyManageUI("Kursverlauf 6 Monate", kursverlauf6AR));
                        observableListAR.add(new CompanyManageUI("Kursverlauf 12 Monate", kursverlauf12AR));
                        observableListAR.add(new CompanyManageUI("Kursmomentum", kursmomentumAR));
                        observableListAR.add(new CompanyManageUI("Dreimonantsreversal", dreimonrevAR));
                        observableListAR.add(new CompanyManageUI("Gewinnwachstum", gewinnwachstumAR));

                    }
                }

        Query queryAS = session1.getNamedQuery("AnalysisSteps.findall");
        List<AnalysisSteps> ListAS = (List<AnalysisSteps>) queryAS.list();

        for (AnalysisSteps steps : ListAS) {
            if (Companyname1.equals(steps.getCompanyname_AnalysisSteps())) {
                float eigenkapitalrenditeAS = steps.getEigenkapitalrendite();
                float ebitAS = steps.getEBITMarge();
                float eigenkapitalquoteAS = steps.getEigenkapitalquote();
                float KGVAS = steps.getKursGewinnVerhaeltnis();
                float AGVAktuellAS = steps.getKursGewinnVerhaeltnisAktuell();
                float analystenmeinungenAS = steps.getAnalystenmeinungen();
                float reaktionQAS = steps.getReaktionaufQuartalszahlen();
                float gewinnrevisionAS = steps.getGewinnrevision();
                float kursverlauf6AS = steps.getKursverlauf6Monate();
                float kursverlauf12AS = steps.getKursverlauf12Monate();
                float kursmomentumAS = steps.getKursmomentum();
                float dreimonrevAS = steps.getDreimonatsreversal();
                float gewinnwachstumAS = steps.getGewinnwachstum();
                observableListAS.add(new AnalysisStepsManageUI("Eigenkapitalrendite", eigenkapitalrenditeAS));
                observableListAS.add(new AnalysisStepsManageUI("EbitMarge", ebitAS));
                observableListAS.add(new AnalysisStepsManageUI("Eigenkapitalquote", eigenkapitalquoteAS));
                observableListAS.add(new AnalysisStepsManageUI("KursGewinnVerhältnis", KGVAS));
                observableListAS.add(new AnalysisStepsManageUI("KursGewinnVerhältnisAktuell", AGVAktuellAS));
                observableListAS.add(new AnalysisStepsManageUI("Analystenmeinungen", analystenmeinungenAS));
                observableListAS.add(new AnalysisStepsManageUI("Reaktion auf Quartalszahlen", reaktionQAS));
                observableListAS.add(new AnalysisStepsManageUI("Gewinnrevision", gewinnrevisionAS));
                observableListAS.add(new AnalysisStepsManageUI("Kursverlauf 6 Monate", kursverlauf6AS));
                observableListAS.add(new AnalysisStepsManageUI("Kursverlauf 12 Monate", kursverlauf12AS));
                observableListAS.add(new AnalysisStepsManageUI("Kursmomentum", kursmomentumAS));
                observableListAS.add(new AnalysisStepsManageUI("Dreimonantsreversal", dreimonrevAS));
                observableListAS.add(new AnalysisStepsManageUI("Gewinnwachstum", gewinnwachstumAS));
            }
        }


        session1.getTransaction().commit();
        DisconnectionDB();





    }
/*
    private void getDataAnalysisSteps(){
        ConnectionDB();
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session1 = sessionFactory.getCurrentSession();

        session1.beginTransaction();


             Query queryAR = session1.getNamedQuery("AnalysisSteps.findall");
        List<AnalysisSteps> ListAS = (List<AnalysisSteps>) queryAR.list();

        for (AnalysisSteps steps : ListAS) {
            if (Companyname1.equals(steps.getCompanyname_AnalysisSteps())) {
                float eigenkapitalrenditeAS = steps.getEigenkapitalrendite();
                float ebitAS = steps.getEBITMarge();
                float eigenkapitalquoteAS = steps.getEigenkapitalquote();
                float KGVAS = steps.getKursGewinnVerhaeltnis();
                float AGVAktuellAS = steps.getKursGewinnVerhaeltnisAktuell();
                float analystenmeinungenAS = steps.getAnalystenmeinungen();
                float reaktionQAS = steps.getReaktionaufQuartalszahlen();
                float gewinnrevisionAS = steps.getGewinnrevision();
                float kursverlauf6AS = steps.getKursverlauf6Monate();
                float kursverlauf12AS = steps.getKursverlauf12Monate();
                float kursmomentumAS = steps.getKursmomentum();
                float dreimonrevAS = steps.getDreimonatsreversal();
                float gewinnwachstumAS = steps.getGewinnwachstum();
                observableListAS.add(new AnalysisStepsManageUI("Eigenkapitalrendite", eigenkapitalrenditeAS));
                observableListAS.add(new AnalysisStepsManageUI("EbitMarge", ebitAS));
                observableListAS.add(new AnalysisStepsManageUI("Eigenkapitalquote", eigenkapitalquoteAS));
                observableListAS.add(new AnalysisStepsManageUI("KursGewinnVerhältnis", KGVAS));
                observableListAS.add(new AnalysisStepsManageUI("KursGewinnVerhältnisAktuell", AGVAktuellAS));
                observableListAS.add(new AnalysisStepsManageUI("Analystenmeinungen", analystenmeinungenAS));
                observableListAS.add(new AnalysisStepsManageUI("Reaktion auf Quartalszahlen", reaktionQAS));
                observableListAS.add(new AnalysisStepsManageUI("Gewinnrevision", gewinnrevisionAS));
                observableListAS.add(new AnalysisStepsManageUI("Kursverlauf 6 Monate", kursverlauf6AS));
                observableListAS.add(new AnalysisStepsManageUI("Kursverlauf 12 Monate", kursverlauf12AS));
                observableListAS.add(new AnalysisStepsManageUI("Kursmomentum", kursmomentumAS));
                observableListAS.add(new AnalysisStepsManageUI("Dreimonantsreversal", dreimonrevAS));
                observableListAS.add(new AnalysisStepsManageUI("Gewinnwachstum", gewinnwachstumAS));
            }
        }
        DisconnectionDB();

        session1.getTransaction().commit();
    }



 */


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