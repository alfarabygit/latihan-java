/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihan11;

import java.util.Scanner;

/**
 @author: Alfaraby Indra,S.Kom
 */
public class Latihan11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nilai=77;
        if (nilai > 75) {
            System.out.println("Kamu Lulus!");
        } else {
            System.out.println("Kamu Gagal!");
        }
        


    String jurusan;
        System.out.print("Input Jurusan yang anda pilih: ");
        jurusan=scan.nextLine();
        
        if (jurusan.equals("PTI")) {
            System.out.println("Anda memilih Jurusan PTI");
        }else if(jurusan.equals("PGSD")){
            System.out.println("Anda memilih Jurusan PGSD");
        }else if(jurusan.equals("PAUD")){
            System.out.println("Anda memilih Jurusan PAUD");
        }else if(jurusan.equals("PBI")){
            System.out.println("Anda memilih Jurusan PBI");
        }else if(jurusan.equals("MIPA")){
            System.out.println("Anda memilih Jurusan MIPA");
        }else{
            System.out.println("Anda Salah Memilih Jurusan");
        }
    
        
    switch(jurusan)
    {
        case "PTI":     
                System.out.println("Anda memilih Jurusan PTI");        
            break;
        case "PGSD":
                System.out.println("Anda memilih Jurusan PGSD");
            break;
        case "PAUD":
                System.out.println("Anda memilih Jurusan PAUD");
            break;
        case "PBI":
                System.out.println("Anda memilih Jurusan PBI");
            break;
        case "MIPA":
                System.out.println("Anda memilih Jurusan MIPA");
            break;
        default:
            System.out.println("Anda salah memilih Jurusan");
            break;
    }
    
    }
}
