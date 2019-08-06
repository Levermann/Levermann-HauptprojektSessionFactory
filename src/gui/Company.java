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
    private float jahresuberschuss;
    private float eigenkapital;
    private String name;
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
        this.jahresuberschuss = jue;
    }    
    public void setEigenkapital(float ek){
        this.eigenkapital = ek;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public float getJahresuberschuss(){
        return this.jahresuberschuss;
    }    
    public float getEigenkapital(){
        return this.eigenkapital;
    }
    public String getName(){
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
