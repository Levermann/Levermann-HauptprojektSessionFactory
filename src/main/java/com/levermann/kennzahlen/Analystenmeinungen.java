package com.levermann.kennzahlen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chlad
 */
public class Analystenmeinungen {
    public static void main(String[] args) {
        // TODO code application logic here

        float kauf=5;
        float halt=6;
        float verkau=7;
        float sum=kauf+halt+verkau;
        int levermann;
        float anmei = analystenmeinungen (sum,kauf,halt,verkau);
        System.out.println("6. Analystenmeinungen: " + anmei);
        levermann = analystenmeinungLevermann(anmei,sum);
        System.out.println("Levermannwertung: " + levermann);
    }

    //berechnet die Analystenmeinung
    public static float analystenmeinungen(float sumam, float kaufen, float halten, float verkaufen){
        float amd;//Analystenmeinungendurchschnitt
        amd = ((kaufen*1)+(halten*2)+(verkaufen*3))/sumam;
        return amd;
    }

    //berechne die Levermannwertung für die gegebene Analystenmeinung
    public static int analystenmeinungLevermann(float amd, float sumam){
        int retval;

        float upperLimit = (float)2.5;
        float lowerLimit = (float)1.5;
        /*
        retval > 0 falls amd > Grenze
        retval = 0 falls amd = Grenze
        retval < 0 falls amd < Grenze
        */
        if(sumam > 5){
            retval = Float.compare(amd, upperLimit);
            if (retval > 0){
                return 1;
            }else{
                retval = Float.compare(amd, lowerLimit);
                if (retval >= 0){
                    return 0;
                }else{
                    return -1;
                }
            }
        }
        else {
            retval = Float.compare(amd, upperLimit);
            if (retval > 0){
                return -1;
            }else{
                retval = Float.compare(amd, lowerLimit);
                if (retval >= 0){
                    return 0;
                }else{
                    return 1;
                }
            }
        }
    }
}
