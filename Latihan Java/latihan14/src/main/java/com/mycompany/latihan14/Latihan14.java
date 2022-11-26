/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihan14;

import java.util.Scanner;

/**
 @author : AlfarabyIndra,S.Kom
 */
public class Latihan14 {

    public static void main(String[] args) {
        //program switch case dengan studi kasus pilih menu makanan
        
        Scanner input = new Scanner(System.in);
        String nama;
        int pilih,pesan;
        System.out.print("Masukkan Nama: ");
        nama=input.nextLine();
        System.out.println("Pilihan:\n 1. Nasi Goreng(Rp.15.000.00)\n 2. Mie Ayam(Rp.12.000.00)\n 3. Bakso(Rp.13.000.00)\n");
        System.out.print("Pilih Menu yang ingin dipesan: ");
        pilih=input.nextInt();
        System.out.print("Jumlah Pesan: ");
        pesan=input.nextInt();
        System.out.println("================");
        switch (pilih) {
            case 1:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Nasi Goreng");
                System.out.println("Harga : Rp.15.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : Rp."+pesan*15000);
                break;
            case 2:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Mie Ayam");
                System.out.println("Harga : Rp.12.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : Rp."+pesan*12000);
                break;
            case 3:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Bakso");
                System.out.println("Harga : Rp.13.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : Rp."+pesan*13000);
                break;    
            default:
                System.out.println("Mohon maaf, menu yang anda pilih tidak tersedia ! :(");
        }
    }
}
