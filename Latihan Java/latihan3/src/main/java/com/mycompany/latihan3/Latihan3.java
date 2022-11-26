/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihan3;

import java.util.Scanner;

/*
    @author: Alfaraby Indra,S.Kom
    */
   
public class Latihan3 {

    public static void main(String[] args) {
        // menghitung nilai akhir di java
        Scanner scan = new Scanner(System.in);
        String nim,nama;
        int harian,tugas,uts,uas,akhir;
        float nharian,ntugas,nuts,nuas;
        System.out.println("Program Input Nilai Akhir dan Decision Ranking Nilai");
        System.out.println("====================================================");
        System.out.print("Nim: ");
        nim = scan.nextLine();
        System.out.print("Nama: ");
        nama = scan.nextLine();
        
      
        
        System.out.print("Nilai Harian: ");
        harian=scan.nextInt();
        System.out.print("Nilai Tugas: ");
        tugas=scan.nextInt();
        System.out.print("Nilai UTS: ");
        uts=scan.nextInt();
        System.out.print("Nilai UAS: ");
        uas=scan.nextInt();
        
        scan.close();
        
        nharian =0.10f*harian;
        ntugas  =0.25f*tugas;
        nuts    =0.30f*uts;
        nuas    =0.35f*uas;
        akhir=(int) (nharian+ntugas+nuts+nuas);
        
        //akhir=(0.15*harian+0.25*tugas+0.30*uts+0.35*uas) 
        //bisa menggunakan rumus ini utk perhitungan nilai akhir dengan catatan variabelnya bertipe double
        
        System.out.println("\t\tHasil Akhir");
        System.out.println("====================================================");
        System.out.println("Nim             : "+nim);
        System.out.println("Nama            : "+nama);
        System.out.println("Nilai Harian    : "+harian);
        System.out.println("Nilai Tugas     : "+tugas);
        System.out.println("Nilai UTS       : "+uts);
        System.out.println("Nilai UAS       : "+uas);
        System.out.println("Nilai Akhir     : "+akhir);
        
        
        if (akhir >85) {
            System.out.println("Kamu dapat Nilai A");
        }
        else if(akhir>=80){
            System.out.println("Kamu dapat Nilai A-");
        }
        else if(akhir>=70){
            System.out.println("Kamu dapat Nilai B");
        }
        else if(akhir>=60){
            System.out.println("Kamu dapat Nilai C");
        }
        else if(akhir>=50){
            System.out.println("Kamu dapat Nilai D");
        }
        else{
            System.out.println("Kamu dapat Nilai E");
        }
    }
}
