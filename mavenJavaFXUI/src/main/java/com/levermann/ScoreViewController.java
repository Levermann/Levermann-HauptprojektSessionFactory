package com.levermann;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class ScoreViewController implements ControlledScreenInterface  {

    ScreensController myController;

    @Override
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

/*
    public void switchToPrimaryPage(ActionEvent actionEvent) throws IOException {
        //App.setRoot("startPage");
        //TODO Schließe die Session, zurück zu Startseite
        myController.setScreen(App.startPageID);
        App.setStageTitle("Hauptmenü");
    }

 private void loadData(){
        paneScoreView.getChildren().clear();
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
        paneScoreView.getChildren().add(scoreChart);




    } */


}
