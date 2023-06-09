/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaprogram9;

/**
 *
 * @author User
 */
public class JavaProgram9 {

    public static void main(String[] args) {
        //tipe data primitif di pemrograman java
        byte b1=120; //batas nilainya antara -128 s/d 127
        short s2=1000; //batas nilainya antara -32,768 s/d 32,767
        int i3=10000; //batas nilainya antara-2147483648 s/d 2147483647
        long l4=100000L;//batas nilainya antara -9 milyar lebih s/d 9 milyar lebih
        float f5=65.5f;//presisi(jumlah digit) pada float maksimal antara 6-7
        double d6=500.50;//presisi(jumlah digit) pada double maksimalnya 15
        boolean b7= true;//memiliki 2 nilai yaitu true dan false
        char c8='A';//ditandai dengan kutip satu
        
        System.out.println("Byte value is: "+b1);
        System.out.println("Short value is: "+s2);
        System.out.println("Int value is: "+i3);
        System.out.println("Long value is: "+l4);
        System.out.println("Float value is: "+f5);
        System.out.println("Double value is: "+d6);
        System.out.println("Boolean value is: "+b7);
        System.out.println("Char value is: "+c8);
    }
}
