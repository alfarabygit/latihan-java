/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaprogram5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaProgram5 {

    public static void main(String[] args) {
        /*
            Program membalikkan angka(Reverse Number)
        */
       int no, rev=0, r,a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number: ");//input angka yang mau di reverse
        no=scanner.nextInt();
        
        //melakukan reverse number dengan while loop
        while(no > 0){
           // get last digit from num
            r=no%10;
            rev=rev*10+r;
            
             // remove the last digit from num
            no=no/10;
        }
        System.out.println("Reverse Number: "+rev);
    }
}
