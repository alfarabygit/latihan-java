/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihan5;

/**
 *
 * @author User
 */
public class Latihan5 {

    //property class
    String merk="Celana Jeans Levis";
    int stok=50;
    
    //method class
    public void tampilkanBarang()
    {
        System.out.println("Merk :"+merk);
        System.out.println("Stok :"+stok);
    }
    
    public static void main(String[] args) {
         Latihan5 barang = new Latihan5();
        
         barang.tampilkanBarang();
    }
}
