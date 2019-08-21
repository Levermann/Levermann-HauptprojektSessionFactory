package com.levermann;

import java.util.HashMap;
import javafx.animation.*;
import javafx.beans.property.DoubleProperty;
import javafx.event.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class ScreensController extends StackPane {

    private HashMap<String, Node> screens = new HashMap<>();

    public ScreensController(){
        super();
    }

    public void addScreen(String name, Node screen){
        screens.put(name, screen);
    }

    public Node getScreen(String name){
        return screens.get(name);
    }

    public boolean loadScreen(String name, String resource){
        try{
            //System.out.println("t0");
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource(resource));
            //System.out.println("t1");
            Parent loadScreen = (Parent) myLoader.load();
            //System.out.println("t2");
            ControlledScreenInterface myScreenController = ((ControlledScreenInterface) myLoader.getController());
            //System.out.println("t3");
            myScreenController.setScreenParent(this);
            //System.out.println("t4");
            addScreen(name, loadScreen);
            System.out.println(name+" - "+resource + " erfolgreich geladen!");
            return true;
        } catch(Exception e){
            System.out.println("yo" + e.getMessage());
            return false;
        }
    }

    public boolean setScreen(final String name) {
        if(screens.get(name) != null) {
            final DoubleProperty opacity = opacityProperty();

            if (!getChildren().isEmpty()){
                setOpacity(0.0);
                getChildren().remove(0);
                getChildren().add(0, screens.get(name));
                setOpacity(1.0);
            }else {
                setOpacity(0.0);
                getChildren().add(screens.get(name));
                setOpacity(1.0);
            }
            return true;
        } else {
            System.out.println("no screen has been loaded\n");
            return false;
        }
    }

    public boolean unloadScreen(String name) {
        if(screens.remove(name) == null){
            System.out.println("Screen does not exist\n");
            return false;
        } else {
            return true;
        }
    }

}
