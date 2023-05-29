/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaprogram3;

import java.util.Scanner;

public class JavaProgram3 {

    public static void main(String[] args) {
        /*
            Program pertukaran nilai variabel
        */
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        //menggunakan scanner utk input nilai terlebih dahulu
        
        System.out.print("Enter Value a: ");
        a=scanner.nextInt();
        System.out.print("Enter Value b: ");
        b=scanner.nextInt();
        //swap(tukar)nilai yang sudah diinputkan
        c=a;
        a=b;
        b=c;
        //menampilkan hasil swap nilai variabel
        System.out.println("Values in a: "+a);
        System.out.println("Values in b: "+b);
    }
}
