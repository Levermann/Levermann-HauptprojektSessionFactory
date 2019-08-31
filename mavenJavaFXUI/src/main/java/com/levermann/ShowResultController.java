package com.levermann;

import com.levermann.entityclass.AnalysisRating;
import com.levermann.entityclass.AnalysisSteps;
import com.levermann.entityclass.Company;
import com.levermann.sessionControlClasses.HibernateUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.hibernate.*;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.ResourceBundle;
/**
 * This class contains two Table views to show the calculated results for table analysisrating and analysissteps for each Company
 */
public class ShowResultController implements Initializable, ControlledScreenInterface{
    private Connection con;

    public static String Companyname1;
    public static String Companyname2;

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
        getDataAnalysis();
    }
    private void getDataAnalysis(){
        observableListAR.clear();
        observableListAS.clear();
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
                 */
                if (steps.getCompanyname_AnalysisSteps().equals(Companyname1) || steps.getCompanyname_AnalysisSteps().equals(Companyname2)) {
                    System.out.println("Fuuuuuuuuuuuuuuuuck");

                    tableSteps.getItems().clear();

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
                    observableListAS.add(new AnalysisStepsManageUI("Gewinnwachstum", gewinnwachstumAS));

                    /**
                     * gets the correct values for set points after user input
                     */
                    for (AnalysisRating rating : analysisRatingsFilled) {

                        if (Companyname1.equals(rating.getCompanyname_AnalysisRating()) || Companyname2.equals(rating.getCompanyname_AnalysisRating())) {
                            tableRating.getItems().clear();

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
    private void switchToCompanyOverview() throws IOException{

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session1 = sessionFactory.getCurrentSession();

        session1.beginTransaction();
        CompanyOverviewController.tableIDstatic.getItems().clear();

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
            CompanyOverviewController.companyNamestatic.setCellValueFactory(new PropertyValueFactory<Company, String>("Companyname"));
            CompanyOverviewController.creationDatestatic.setCellValueFactory(new PropertyValueFactory<Company, String>("datum"));
            CompanyOverviewController.analysisScorestatic.setCellValueFactory(new PropertyValueFactory<Company, Float>("GesamtPunkte"));

            CompanyOverviewController.tableIDstatic.getItems().addAll(overview);
        }
        /**
         * saves the transaction within the commit
         */
        session1.getTransaction().commit();

        myController.setScreen(App.companyOverviewID);
        App.setStageTitle("Allgemeine Unternehmensübersicht");
    }

    @FXML
    private void switchToShowUserInputs() throws IOException{
        myController.setScreen(App.showUserInputID);
        App.setStageTitle("Allgemeine Unternehmensübersicht");
    }

}