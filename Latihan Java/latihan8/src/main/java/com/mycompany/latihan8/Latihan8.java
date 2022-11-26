/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihan8;

/**
 *
 * @author User
 */
public class Latihan8 {

    public static void main(String[] args) {
         // TODO code application logic here
        
        System.out.println("Operator Logika");
        System.out.println("===============");
        
        System.out.println("Operasi AND");
        System.out.println("true && true   :"+(true&&true));
        System.out.println("true && false  :"+(true&&false));
        System.out.println("false && true  :"+(false&&true));
        System.out.println("false && false :"+(false&&false));
        
        System.out.println("\nOperasi OR");
        System.out.println("true || true   :"+(true||true));
        System.out.println("true || false  :"+(true||false));
        System.out.println("false || true  :"+(false||true));
        System.out.println("false || false :"+(false||false));
        
        System.out.println("\nOperasi NOT");
        System.out.println("!true  :"+(!true));
        System.out.println("!false :"+(!false));
        
        System.out.println("\nOperasi XOR");
        System.out.println("true  ^ true  :"+(true^true));
        System.out.println("true  ^ false :"+(true^false));
        System.out.println("false ^ true  :"+(false^true));
        System.out.println("false ^ false :"+(false^false));
        
        
        int a=5, b=10;
        System.out.println("a==b bernilai : "+(a==b));
        System.out.println("a!=b bernilai : "+(a!=b));
        System.out.println("a>b bernilai : "+(a>b));
        System.out.println("a<b bernilai : "+(a<b));
        System.out.println("a>=b bernilai : "+(a>=b));
        System.out.println("a<=b bernilai : "+(a<=b));
    }
}
