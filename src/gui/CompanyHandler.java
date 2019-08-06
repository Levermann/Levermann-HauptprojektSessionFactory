/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Nebukatnezar
 * Beinhaltet die volle Liste aller gespeicherten Unternehmen
 * Singleton sichert einzigartigkeit (nicht Threadsicher)
 */
public class CompanyHandler {
    
    private List<Company> allCompanies;
    private static CompanyHandler instance = null;

    private CompanyHandler() {
        allCompanies = new ArrayList();
    }

    public static CompanyHandler getInstance() {
            if (instance == null) {
                    instance = new CompanyHandler();
            }
            return instance;
    }    
    
    public void addItem(Company c){
        allCompanies.add(c);
    }
    
    public List<Company> getAllCompanies(){
        return this.allCompanies;
    }
    
    public int getListSize(){
        return allCompanies.size();
    }    
    
    @Override
    public String toString(){
        String s = "";
        try{
            for(int i = 0; i < allCompanies.size(); i++){
                s = s + allCompanies.get(i).toString() + "\n";
            }
            return s;
        }catch(Exception e){
            return s;
        }
    }
    
    //gibt ein spezielles Element der Liste zurück
    public String toString(int x){
        return allCompanies.get(x).toString();
    }
    
}
