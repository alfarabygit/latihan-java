/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaprogram10;

/**
 *
 * @author User
 */
public class JavaProgram10 {

    public static void main(String[] args) {
        //bilangan faktorial di pemrograman java
        
        int fact=1,number=5, i=1;//inisialisasi variabel
        for(i=1; i<=number; i++){
            fact= fact*i;//mencari bilangan faktorial dengan looping for
        }
        
        System.out.println("Bilangan faktorial dari "+number+" adalah "+ fact);//menampilkan hasil
    }
}
