/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaprogram12;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaProgram12 {

    public static void main(String[] args) {
        //program mencari bilangan ganjil atau genap di java
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        number = scanner.nextInt();
        //mengecek apakah bilangan yang diinput ganjil atau genap
        if(number % 2==0){
            System.out.println("Bilangan Genap!");    
        }else{
            System.out.println("Bilangan Ganjil!");
        }
        
    }
}
