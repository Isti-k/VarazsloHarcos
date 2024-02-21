/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harcosvarazslo;

public class Magyarazat {
    public static void main(String[] args) {
        String eredeti = "abc.12x";
        int hossz = eredeti.length();//7
        boolean vanBennePont = eredeti.contains(".");
        System.out.println("van benne\".\" : " + vanBennePont);
        
        boolean kezdAbc = eredeti.startsWith("abc");
        boolean vege2x = eredeti.endsWith("2x");
        System.out.println("abc-vel kezdődik: " + kezdAbc);
        System.out.println("2x a vége: " + vege2x);
        
        System.out.println("első: " + eredeti.charAt(0));
        System.out.println("utolsó: " + eredeti.charAt(hossz-1));
        
        //eredeti = eredeti.substring(1);
        //System.out.println(eredeti);
        
        String uj = eredeti.substring(1);
        uj = eredeti.substring(0);
        System.out.println(uj);
        uj = eredeti.substring(1);
        System.out.println(uj);
        uj = eredeti.substring(4);
        System.out.println(uj);
        uj = eredeti.substring(0,4);
        System.out.println(uj);
        uj = eredeti.substring(4,6);
        System.out.println(uj);
        uj = eredeti.substring(0,0);
        System.out.println(uj);
        
        uj = eredeti.substring(3);
        uj = eredeti.substring(eredeti.indexOf("."));
        System.out.println(uj);
        
        int k = eredeti.indexOf(".") + 1;
        int v = eredeti.length() - 1;
        uj = eredeti.substring(k,v);
        System.out.println(uj+2);
        int szam = Integer.parseInt(uj);
        System.out.println(szam+2);
        
        uj = eredeti.replaceAll("12x", "hu");
        System.out.println(uj);
    }
}
