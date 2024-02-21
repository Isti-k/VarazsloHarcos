/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package harcosvarazslo;

import java.util.Random;


public class HarcosVarazslo {
    
    static Random rnd = new Random();
    
    public static void main(String[] args) {
        final int MERET = 3;
        
        
        for (int i = 0; i < 10; i++){
            int harPoz = (int)(Math.random()*MERET);
            int varPoz = (int)(Math.random()*MERET);
            String palya = "___";
            
            if(harPoz == varPoz){
                palya = palya.substring(0,harPoz) + "X" + palya.substring(1,varPoz);
            }
            else{
                palya = palya.substring(0,harPoz) + "H" + palya.substring(harPoz+1);
                palya = palya.substring(0,varPoz) + "V" + palya.substring(varPoz+1);
            }
        }System.out.println("");
        
    }
    
}
