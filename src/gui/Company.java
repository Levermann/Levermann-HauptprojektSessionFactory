/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Maximilian Bachmaier
 */
public class Company {
    private String name;
    private float jahresuberschuss;
    private float eigenkapital;
    private float gewinnEBIT;
    private float jahresumsatz;
    private float fremdkapital;
    private float aktuellerAktienkurs;
    private float geschaetzterGewinn;
    //Anzahl der Analysten zur jeweiligen Meinung
    //wenn mehr als 5, andere Bewertung
    private int analystenKaufen;
    private int analystenHalten;
    private int analystenVerkaufen;
    private float kursAnstiegUnternehmen;
    //z.B. DAX
    private float kursAnstiegIndex; 
    
    //Enthält alle Levermann-Kennziffern
    private int[] kennziffern = new int[12]; 
    private int ergebnis;
    
    public Company(){
        
    }
    
    public Company(float jue, float ek, String name){        
        this.jahresuberschuss = jue;
        this.eigenkapital = ek;
        this.name = name;
        kennziffern[0] = setLevermannEKRendite(); 
        setLevermannSum();
    }
    
    //refresh precalculated values
    public void refreshCompany(){
        kennziffern[0] = setLevermannEKRendite(); 
        setLevermannSum();
    }
    
    public void setJahresuberschuss(float jue){
        //hole wert aus Datenbank
        this.jahresuberschuss = jue;
    }    
    public void setEigenkapital(float ek){
        //hole wert aus Datenbank
        this.eigenkapital = ek;
    }
    public void setName(String name){
        //hole wert aus Datenbank
        this.name = name;
    }
    
    //getXY geben den lokalen Wert zurück, wird benutzt für Guifelder
    public float getJahresuberschuss(){
        //return den lokalen wert
        return this.jahresuberschuss;
    }    
    public float getEigenkapital(){
        //return den lokalen wert
        return this.eigenkapital;
    }
    public String getName(){
        //return den lokalen wert
        return this.name;
    }  
    
    private void setLevermannSum(){
        for(int i = 0; i < 12; i++){
            ergebnis += kennziffern[i];
        }
    }
    
    public float calcEigenkapitalrendite(){
        return this.jahresuberschuss/this.eigenkapital;
    }
    private int setLevermannEKRendite(){
        float val = calcEigenkapitalrendite();
        if(0.2 - val < 0){
            return 1;
        }else if(0.1 - val > 0){
            return -1;
        }else{
            return 0;
        }
    }
    
    @Override
    public String toString(){
        return this.name + " | " + this.jahresuberschuss + " : " + this.eigenkapital + " = " + this.calcEigenkapitalrendite() + " |Levermann: " + this.ergebnis;
    }
}
