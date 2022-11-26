/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihan2;

/*
  @author: Alfaraby Indra.S,Kom  
*/
public class Latihan2 {

    public static void main(String[] args) {
        // rumus bangun datar di java
        
        //luas persegi atau persegi panjang
        int panjang,lebar,alas,tinggi,luas,r;
        float phi;
        panjang=11;
        lebar=7;
        luas=panjang*lebar;
        System.out.println("Luas Persegi Panjang adalah :  "+luas+"cm");
        
        //luas segitiga
        alas=5;
        tinggi=13;
        luas=alas*tinggi;
        System.out.println("Luas Segitiga adalah: "+luas+"cm");
        
        //luas lingkaran
        phi=3.14f;
        r=30;
        luas=(int) (phi*r*r);
        System.out.println("Luas Lingkaran adalah: "+luas+"cm");
    }
}
