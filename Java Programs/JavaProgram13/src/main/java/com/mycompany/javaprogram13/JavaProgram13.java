/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaprogram13;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaProgram13 {

    public static void main(String[] args) {
        //membuat daftar bilangan ganjil atau genap
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number between 1 and : ");
        number=scanner.nextInt();
        for(int a=1; a<=number; a++){
            if(a%2==0){
                System.out.print(a+" ");
            }
        }
        System.out.println("");
        
        for(int b=1; b<=number; b++){
            if(b%2!=0){
                System.out.print(b+" ");
            }
        }
    }
}
