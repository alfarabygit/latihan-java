/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihan13;

/**
 @author: Alfaraby Indra,S.Kom
 */
public class Latihan13 {

    public static void main(String[] args) {
        //program percabangan membandingkan 2 String
        String tv="Panasonic";
        String television="Panasonic";
        
        //contoh menggunakan perbandingan string dengan equals
        if (tv.equals(television)) {
            System.out.println("Kedua Variabelnya memiliki pola huruf yang sama");
        }
        
        //contoh menggunakan perbandingan string dengan compareTo
        if (tv.compareTo(television)==0) {
            System.out.println("Both tv and television are equal using compareTo method of String");
        }
        
        television="PANASONIC";
        
        //contoh perbandingan string dengan equalsIgnoreCase
        if (tv.equalsIgnoreCase(television)) {
            System.out.println("Kedua Variabelnya sama karena menggunakan equalsIgnoreCase");
        }
        
        //contoh perbandingan string dengan compareToIgnoreCase
        if (tv.compareToIgnoreCase(television)==0) {
            System.out.println("tv and television are same by compareToIgnoreCase of String");
        }
        
        String Sony="Sony";
        String Samsung="Samsung";
        
        //contoh perbandingan string yang berbeda variabel dengan compareTo
        if (Sony.compareTo(Samsung)>0) {
            System.out.println("Sony comes after Samsung in lexicographical order");
        }else if(Sony.compareTo(Samsung)<0){
            System.out.println("Sony comes before Samsung in lexicographical order");
        }
    }
}
