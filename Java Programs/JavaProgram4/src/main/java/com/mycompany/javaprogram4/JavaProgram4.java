/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaprogram4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaProgram4 {

    public static void main(String[] args) {
          /*
            Program menghitung nilai variabel dari input keyboard
        */
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        //menggunakan scanner utk input nilai terlebih dahulu
        System.out.print("Enter Value a: ");
        a=scanner.nextInt();
        System.out.print("Enter Value b: ");
        b=scanner.nextInt();
        c=a+b;
        System.out.println("Hasil Perhitungannya adalah: "+c);
    }
}
