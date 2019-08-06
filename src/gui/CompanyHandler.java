/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

/**
 *
 * @author Nebukatnezar
 * Beinhaltet die volle Liste aller gespeicherten Unternehmen
 * Singleton sichert einzigartigkeit (nicht Threadsicher)
 */
public class CompanyHandler {
    
    private static List<Company> allCompanies = new ArrayList();
    //Erstelle observable List, damit der Tableview später bei änderungen aktualisiert wird.
    public static ObservableList<Company> obsAllCompanies = FXCollections.observableList(allCompanies);
    private static CompanyHandler instance = null;

    private CompanyHandler() {
        //Bei änderungen wird in der Konsole die Änderung vermerkt
        obsAllCompanies.addListener(new ListChangeListener(){
           @Override
           public void onChanged(ListChangeListener.Change change) {
                System.out.println("Ein Element wurde veraendert!"); 
           }
        });
    }

    public static CompanyHandler getInstance() {
            if (instance == null) {
                    instance = new CompanyHandler();
            }
            return instance;
    }    
    
    public void addItem(Company c){
        obsAllCompanies.add(c);
    }
    
    public List<Company> getAllCompanies(){
        return this.obsAllCompanies;
    }
    
    public int getListSize(){
        return obsAllCompanies.size();
    }    
    
    @Override
    public String toString(){
        String s = "";
        try{
            for(int i = 0; i < obsAllCompanies.size(); i++){
                s = s + obsAllCompanies.get(i).toString() + "\n";
            }
            return s;
        }catch(Exception e){
            return s;
        }
    }
    
    //gibt ein spezielles Element der Liste zurück
    public String toString(int x){
        return obsAllCompanies.get(x).toString();
    }
    
}
