/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihan10;

/**
 *
 * @author User
 */
public class Latihan10 {

    public static void main(String[] args) {
        System.out.println("Latihan membuat Program Decision");
        System.out.println("================================");
       int grade=50;
        if (grade > 65 ) 
        {
            System.out.println("You Passed!");
        }
        
      int a=1, b=7;
        if (a<b) 
        {
            System.out.println("Nilai a lebih kecil dari b");
        } else 
        {
            System.out.println("Nilai a lebih besar dari b"); 
        }
        
        int nilai=75;
        
        if (nilai > 85) {
            System.out.println("Anda mendapat Nilai A");
        }else if(nilai > 80){
            System.out.println("Anda mendapat Nilai B");
        }else if(nilai > 70){
            System.out.println("Anda mendapat Nilai C");
        }else if(nilai >60){
            System.out.println("Anda mendapat Nilai D");
        }else{
            System.out.println("Anda mendapat Nilai E");
        }
        
        int nohari=6;
        switch (nohari) {
            case 1:
                System.out.println("Hari ke-"+nohari+" Adalah Hari Minggu");
                break;
            case 2:
                System.out.println("Hari ke-"+nohari+" Adalah Hari Senin");
                break;
            case 3:
                System.out.println("Hari ke-"+nohari+" Adalah Hari Selasa");
                break;
            case 4:
                System.out.println("Hari ke-"+nohari+" Adalah Hari Rabu");
                break;
            case 5:
                System.out.println("Hari ke-"+nohari+" Adalah Hari Kamis");
                break;
            case 6:
                System.out.println("Hari ke-"+nohari+" Adalah Hari Jum'at");
                break;
            case 7:
                System.out.println("Hari ke-"+nohari+" Adalah Hari Sabtu");
                break;
            default:
               System.out.print("Tidak ada Hari ke-"+nohari);
               break;
        }
    }
}
