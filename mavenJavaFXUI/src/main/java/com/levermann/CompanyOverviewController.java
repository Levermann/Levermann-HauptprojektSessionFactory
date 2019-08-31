package com.levermann;

import com.levermann.entityclass.AnalysisRating;
import com.levermann.entityclass.AnalysisSteps;
import com.levermann.entityclass.Company;
import com.levermann.sessionControlClasses.HibernateUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.apache.log4j.Logger;
import org.hibernate.*;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.util.List;
import java.util.ResourceBundle;
/**
 * this Controller implements a TableView for general overview about Companyname, FinalScore, and creation Date
 */
public class CompanyOverviewController implements Initializable, ControlledScreenInterface {
    final static Logger logger = Logger.getLogger(com.levermann.CompanyOverviewController.class);
    private Connection con;

    public static TableView<Company> tableIDstatic;
    public static TableColumn<Company, String> companyNamestatic;
    public static TableColumn<Company, String> creationDatestatic;
    public static TableColumn<Company, Float> analysisScorestatic;
    public static TextField companyNameDeletestatic;


    @FXML
    private TextField companyNameDelete;
    @FXML
    private TableView<Company> tableID;
    @FXML
    private TableColumn<Company, String> companyName;
    @FXML
    private TableColumn<Company, String> creationDate;
    @FXML
    private TableColumn<Company, Float> analysisScore;

    private void braucheTextfeld(){
        ShowResultController.Companyname2 = companyNameDelete.getText();
    }

    public void initCols(){

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session1 = sessionFactory.getCurrentSession();

        session1.beginTransaction();

        Query query = session1.getNamedQuery("Company.findAll");
        List<Company> unList = (List<Company>) query.list();

        for (Company un : unList) {

            String nameforOverview = un.getCompanyname();
            String datumForOverview = un.getDatum();
            float SumScore = un.getGesamtPunkte();

            final ObservableList<Company> overview = FXCollections.observableArrayList(
                    new Company(nameforOverview, datumForOverview, SumScore)
            );
            companyName.setCellValueFactory(new PropertyValueFactory<Company, String>("Companyname"));
            creationDate.setCellValueFactory(new PropertyValueFactory<Company, String>("datum"));
            analysisScore.setCellValueFactory(new PropertyValueFactory<Company, Float>("GesamtPunkte"));

            tableID.getItems().addAll(overview);
        }

        session1.getTransaction().commit();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tableIDstatic = tableID;
        companyNamestatic = companyName;
        creationDatestatic = creationDate;
        analysisScorestatic = analysisScore;
        companyNameDeletestatic = companyNameDelete;
        initCols();
    }

    ScreensController myController;

    @Override
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    @FXML
    private void tableAktualisieren(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session1 = sessionFactory.getCurrentSession();

        session1.beginTransaction();
        tableID.getItems().clear();

        Query query = session1.getNamedQuery("Company.findAll");
        List<Company> unList = (List<Company>) query.list();

        for (Company un : unList) {

            String nameforOverview = un.getCompanyname();
            String datumForOverview = un.getDatum();
            float SumScore = un.getGesamtPunkte();
            Button deletemach = new Button("delete");

            final ObservableList<Company> overview = FXCollections.observableArrayList(
                    new Company(nameforOverview, datumForOverview, SumScore)
            );
            companyName.setCellValueFactory(new PropertyValueFactory<Company, String>("Companyname"));
            creationDate.setCellValueFactory(new PropertyValueFactory<Company, String>("datum"));
            analysisScore.setCellValueFactory(new PropertyValueFactory<Company, Float>("GesamtPunkte"));

            tableID.getItems().addAll(overview);
        }


        session1.getTransaction().commit();
    }

    @FXML
    private void switchToShowResults() throws IOException {
        braucheTextfeld();
        setResultColumns();
        myController.setScreen(App.showResultID);
        App.setStageTitle("Unternehmensnamen angeben");
    }

    private void setResultColumns(){
        ShowResultController.observableListARstatic.clear();
        ShowResultController.observableListASstatic.clear();
        ShowResultController.Companyname2 = companyNameDelete.getText();

        /**
         * get current session from HibernateUtil
         */
        final Session session = HibernateUtil.getSessionFactory().openSession();
        /**
         * HQL Named Query to find all entries in Table Analysisrating
         */
        Query query7 = session.getNamedQuery("AnalysisRating.findAll");
        final List<AnalysisRating> analysisRatingsFilled = (List<AnalysisRating>) query7.list();

        try {
            Transaction tx = null;
            tx = session.beginTransaction();
            /**
             * HQL Named Query to find all entries in Table Analysissteps
             */
            Query query1 = session.getNamedQuery("AnalysisSteps.findall");
            List<AnalysisSteps> ListAS = (List<AnalysisSteps>) query1.list();
            for (AnalysisSteps steps : ListAS) {

                System.out.println("Analyse Liste = " + steps.getAnalysisStepsName()
                        + ","
                        + steps.getCompanyname_AnalysisSteps());

                /**
                 * gets the correct values for calculated keyfigures after user input
                 * steps.getCompanyname_AnalysisSteps().equals(Companyname1) ||
                 */
                if (steps.getCompanyname_AnalysisSteps().equals(ShowResultController.Companyname2)) {

                    ShowResultController.tableStepsstatic.getItems().clear();

                    steps.setCompanyname_AnalysisSteps(steps.getCompanyname_AnalysisSteps());
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
                    float gewinnwachstumAS = steps.getGewinnwachstum();
                    ShowResultController.observableListASstatic.add(new AnalysisStepsManageUI("Eigenkapitalrendite", eigenkapitalrenditeAS));
                    ShowResultController.observableListASstatic.add(new AnalysisStepsManageUI("EbitMarge", ebitAS));
                    ShowResultController.observableListASstatic.add(new AnalysisStepsManageUI("Eigenkapitalquote", eigenkapitalquoteAS));
                    ShowResultController.observableListASstatic.add(new AnalysisStepsManageUI("KursGewinnVerhältnis", KGVAS));
                    ShowResultController.observableListASstatic.add(new AnalysisStepsManageUI("KursGewinnVerhältnisAktuell", AGVAktuellAS));
                    ShowResultController.observableListASstatic.add(new AnalysisStepsManageUI("Analystenmeinungen", analystenmeinungenAS));
                    ShowResultController.observableListASstatic.add(new AnalysisStepsManageUI("Reaktion auf Quartalszahlen", reaktionQAS));
                    ShowResultController.observableListASstatic.add(new AnalysisStepsManageUI("Gewinnrevision", gewinnrevisionAS));
                    ShowResultController.observableListASstatic.add(new AnalysisStepsManageUI("Kursverlauf 6 Monate", kursverlauf6AS));
                    ShowResultController.observableListASstatic.add(new AnalysisStepsManageUI("Kursverlauf 12 Monate", kursverlauf12AS));
                    ShowResultController.observableListASstatic.add(new AnalysisStepsManageUI("Gewinnwachstum", gewinnwachstumAS));

                    /**
                     * gets the correct values for set points after user input
                     * Companyname1.equals(rating.getCompanyname_AnalysisRating()) ||
                     */
                    for (AnalysisRating rating : analysisRatingsFilled) {

                        if ( ShowResultController.Companyname2.equals(rating.getCompanyname_AnalysisRating())) {
                            ShowResultController.tableRatingstatic.getItems().clear();

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
                            ShowResultController.observableListARstatic.add(new CompanyManageUI("Eigenkapitalrendite", eigenkapitalrenditeAR));
                            ShowResultController.observableListARstatic.add(new CompanyManageUI("EbitMarge", ebitAR));
                            ShowResultController.observableListARstatic.add(new CompanyManageUI("Eigenkapitalquote", eigenkapitalquoteAR));
                            ShowResultController.observableListARstatic.add(new CompanyManageUI("KursGewinnVerhältnis", KGVAR));
                            ShowResultController.observableListARstatic.add(new CompanyManageUI("KursGewinnVerhältnisAktuell", AGVAktuellAR));
                            ShowResultController.observableListARstatic.add(new CompanyManageUI("Analystenmeinungen", analystenmeinungenAR));
                            ShowResultController.observableListARstatic.add(new CompanyManageUI("Reaktion auf Quartalszahlen", reaktionQAR));
                            ShowResultController.observableListARstatic.add(new CompanyManageUI("Gewinnrevision", gewinnrevisionAR));
                            ShowResultController.observableListARstatic.add(new CompanyManageUI("Kursverlauf 6 Monate", kursverlauf6AR));
                            ShowResultController.observableListARstatic.add(new CompanyManageUI("Kursverlauf 12 Monate", kursverlauf12AR));
                            ShowResultController.observableListARstatic.add(new CompanyManageUI("Kursmomentum", kursmomentumAR));
                            ShowResultController.observableListARstatic.add(new CompanyManageUI("Dreimonantsreversal", dreimonrevAR));
                            ShowResultController.observableListARstatic.add(new CompanyManageUI("Gewinnwachstum", gewinnwachstumAR));

                            System.out.println("company   :"  + rating.getCompanyname_AnalysisRating());
                        }
                    }
                }
            }
            session.getTransaction().commit();
            session.close();
            System.out.println("Speichere Unternehmen...");
            System.out.println("Done!");
        } catch (HibernateException e) {
            System.out.println("Hibernate Exception" + e.getMessage());
            session.getTransaction().rollback();
            throw new RuntimeException(e);
        } finally {
        }
        return;
    }

    @FXML
    private void switchToEnterCompanyName(ActionEvent actionEvent) throws IOException {

        clearInput();
        myController.setScreen(App.inputID);
        App.setStageTitle("Unternehmensnamen angeben");
    }
    public void clearInput(){
        InputController.unternehmennameDBTF.clear();
        InputController.jahresueberschussDBTF.clear();
        InputController.eigenkapitalDBTF.clear();
        InputController.datumDBTF.clear();
        InputController.gewinnschaetzungDBTF.clear();
        InputController.gewinnavgDBTF.clear();
        InputController.gewinnVor3JahrenDBTF.clear();
        InputController.gewinnVor2JahrenDBTF.clear();
        InputController.gewinnVor1JahrDBTF.clear();
        InputController.aktuellerErwarteterKursgewinnDBTF.clear();
        InputController.kursgewinnschaetzungNaechstesJahrDBTF.clear();
        InputController.jahresumsatzDBTF.clear();
        InputController.gewinnEBITDBTF.clear();
        InputController.fremdkapitalDBTF.clear();
        InputController.aktuellerAktienkursDBTF.clear();
        InputController.analystenKaufenDBTF.clear();
        InputController.analystenVerkaufenDBTF.clear();
        InputController.analystenHaltenDBTF.clear();
        InputController.kursanstiegUnternehmenDBTF.clear();
        InputController.kursanstiegAktienindexDBTF.clear();
        InputController.gewinnschaetzungVor4WochenDBTF.clear();
        InputController.aktuelleGewinnschaetzungDBTF.clear();
        InputController.aktienkursVor6MonatenDBTF.clear();
        InputController.aktienkursVor12MonatenDBTF.clear();
        InputController.kursVor1MonatDBTF.clear();
        InputController.kursVor2MonatenDBTF.clear();
        InputController.kursVor3MonatenDBTF.clear();
        InputController.aktienkursVor1MonatDBTF.clear();
        InputController.aktienkursVor2MonatenDBTF.clear();
        InputController.aktienkursVor3MonatenDBTF.clear();
        InputController.gewinnschaetzungNaechstesJahrDBTF.clear();
        InputController.gewinnschaetzungDiesesJahrDBTF.clear();
    }
    public void switchToPrimaryPage(ActionEvent actionEvent) throws IOException {
        //App.setRoot("startPage");
        myController.setScreen(App.startPageID);
        App.setStageTitle("Hauptmenü");
    }

    @FXML
    private void deleteCompanyButtonController(ActionEvent actionEvent) throws IOException{

        String deleteName = companyNameDelete.getText();

        //Aufrufen der aktuellen Session aus HibernateUtil
        final Session session = HibernateUtil.getSessionFactory().openSession();
        Query query7 = session.getNamedQuery("AnalysisRating.findAll");
        final List<AnalysisRating> analysisRatingsFilled = (List<AnalysisRating>) query7.list();

        try {
            Transaction tx = null;
            tx = session.beginTransaction();

            //HQL Named Query FindAll Unternehmen
            Query query = session.getNamedQuery("Company.findAll");
            List<Company> unList = (List<Company>) query.list();

            for (Company un : unList) {

                //todo Hier companyname setzen

                String companyUserInput = deleteName;

                //HQL Named Query FindAll Levermannschritte
                Query query1 = session.getNamedQuery("AnalysisSteps.findall");
                List<AnalysisSteps> unList1 = (List<AnalysisSteps>) query1.list();
                for (AnalysisSteps un1 : unList1) {
                    System.out.println("Analyse Liste = " + un1.getAnalysisStepsName()
                            + ","
                            + un1.getCompanyname_AnalysisSteps());

                    // Ausgabe eines Datensatzes mit Cid
                    query1 = session.getNamedQuery("AnalysisSteps.findByName");
                    query1.setString("Companyname_AnalysisSteps", companyUserInput);
                    //unList1 = query1.list();
                    System.out.println("fuck y");

                        for (AnalysisRating un2 : analysisRatingsFilled) {
                            query7 = session.getNamedQuery("AnalysisRating.findByName");
                            query7.setString("Companyname_AnalysisRating", companyUserInput);
                            if (un.getCompanyname().equals(companyUserInput) && un2.getCompanyname_AnalysisRating().equals(companyUserInput) && un1.getCompanyname_AnalysisSteps().equals(companyUserInput)) {
                                //un2.setEigenkapitalrendite((float)0);

                                System.out.println("Das Unternehmen" + un.getCompanyname() + "wurde erfolgreich gelöscht");

                                session.delete(un1);
                                session.delete(un2);
                                session.delete(un);
                            }
                        }
                    }}

            session.getTransaction().commit();
            session.close();
            //    System.out.println("fuck youuuuuuuuuuuu" + un1.getEigenkapitalrendite()+ un1.getCompanyname_AnalysisSteps());
            System.out.println("Speichere Unternehmen...");
            System.out.println("Done!");
        } catch (HibernateException e) {
            System.out.println("Hibernate Exception" + e.getMessage());
            session.getTransaction().rollback();
            throw new RuntimeException(e);
        } finally {
        }



        tableAktualisieren();

    }
}