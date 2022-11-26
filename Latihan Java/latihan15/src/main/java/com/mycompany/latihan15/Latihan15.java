/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihan15;

import java.util.Scanner;

/**
 @author Alfaraby Indra,S.Kom
 */
public class Latihan15 {

    public static void main(String[] args) {
        //program percabangan
        
        // membuat variabel belanja dan scanner
        int belanja = 0;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Total Belanjaan: Rp ");
        belanja = scan.nextInt();

        // cek apakah dia belanja di atas 100000
        if ( belanja > 100000 ) {
            System.out.println("Selamat, anda mendapatkan hadiah!");
        }

        System.out.println("Terima kasih...");
        
        int nilai;
        String nama;

        // mengambil input
        System.out.print("Nama: ");
        nama = scan.nextLine();
        System.out.print("Nilai: ");
        nilai = scan.nextInt();

        // cek apakah dia lulus atau tidak
        if( nilai >= 70 ) {
            System.out.println("Selemat " + nama + ", anda lulus!");
        } else {
            System.out.println("Maaf " + nama + ", anda gagal");
        }
        
        //percabangan ternary
        boolean suka = true;
        String jawaban;

        // menggunakan operator ternary
        jawaban = suka ? "iya" : "tidak";

        // menampilkan jawaban
        System.out.println(jawaban);
        
        int score;
        String grade;
       

        // mengambil input
        System.out.print("Inputkan nilai: ");
        score = scan.nextInt();

        // higung gradenya
        if ( score >= 90 ) {
            grade = "A";
        } else if ( score >= 80 ){
            grade = "B+";
        } else if ( score >= 70 ){
            grade = "B";
        } else if ( score >= 60 ){
            grade = "C+";
        } else if ( score >= 50 ){
            grade = "C";
        } else if ( score >= 40 ){
            grade = "D";
        } else {
            grade = "E";
        }

        // cetak hasilnya
        System.out.println("Grade: " + grade);
        
        //membuat variabel
        String lampu;
        
        // mengambil input
        System.out.print("Inputkan nama warna: ");
        lampu = scan.nextLine();

        switch(lampu){
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silahkan jalan!");
                break;
            default:
                System.out.println("Warna lampu salah!");
        }
        //operator logika dalam percabangan
        boolean SIM = false;
        boolean STNK = true;

        // cek apakah dia akan ditilang atau tidak
        if(SIM == true){
            if( STNK == true ) {
                System.out.println("Tidak ditilang!");
            }
        } else {
            System.out.println("Anda ditilang!");
        }
    }
}
