package com.levermann;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.chart.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class ScoreViewController implements Initializable, ControlledScreenInterface  {

    ScreensController myController;

    @Override
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }


    public void switchToPrimaryPage(ActionEvent actionEvent) throws IOException {
        //App.setRoot("startPage");
        myController.setScreen(App.startPageID);
        App.setStageTitle("Hauptmenü");
    }

    @FXML
    LineChart meinersterchart;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        XYChart.Series series1 = new XYChart.Series();
        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("X Axis");
        yAxis.setLabel("Y Axis");
        series1.setName("Series 1");
        meinersterchart = new LineChart(xAxis, yAxis);
        series1.getData().add(new XYChart.Data<>(1, 20));
        series1.getData().add(new XYChart.Data<>(2, 100));
        series1.getData().add(new XYChart.Data<>(3, 80));
        series1.getData().add(new XYChart.Data<>(4, 180));
        series1.getData().add(new XYChart.Data<>(5, 20));
        series1.getData().add(new XYChart.Data<>(6, -10));
        meinersterchart.getData().add(series1);
    }

/*

 private void loadData(){
     VBox.getChildren().clear();
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel( "Country");
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Y-Werte");
        BarChart scoreChart = new BarChart(xAxis, yAxis);
        scoreChart.setTitle("Totalscores");
        XYChart.Series series = new XYChart.Series();
        series.setName("Points");
        series.getData().add(new XYChart.Data<>("BMW", 300000));
        series.getData().add(new XYChart.Data<>("Audi", 20000));
        scoreChart.getData().add(series);
        VBox.getChildren().add(scoreChart);






    }
 */

}
