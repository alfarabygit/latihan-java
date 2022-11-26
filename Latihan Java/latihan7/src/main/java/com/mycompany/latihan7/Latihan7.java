/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihan7;

/**
 *
 * @author User
 */
public class Latihan7 {

    public static void main(String[] args) {
        //latihan pemrograman operator pada java
        System.out.println("Operasi Aritmatika " + "pada tipe data Integer "+"dan tipe data Floating point(float,double)");
        System.out.println("===================");
        int a = 2+2;
        int b = a-1;
        int c = a*b;
        int d = c/2;
        
        System.out.println("Nilai a: "+a);
        System.out.println("Nilai b: "+b);
        System.out.println("Nilai c: "+c);
        System.out.println("Nilai d:" +d);
        
        float fa = 3f+4f;
        float fb = fa-2f;
        float fc = fa*fb;
        float fd = fc/3f;
        
        System.out.println("Nilai fa: "+fa);
        System.out.println("Nilai fb: "+fb);
        System.out.println("Nilai fc: "+fc);
        System.out.println("Nilai fd: "+fd);
        

       int e =6;
        System.out.println("Operator Increment dan Decrement");
        System.out.println("Nilai e\t:"+e);
        System.out.println("Nilai e pre-increment\t:"+ ++e);
        System.out.println("Nilai e pre-decrement\t:"+ --e);
        
        int f=9;
        f++;
        System.out.println("Post-increment & decrement");
        System.out.println("Nilai f\t:"+f);
        f-=2;
        System.out.println("Nilai f\t:"+f);
        
        System.out.println("Operator Modulus");
        int mod_a=10, mod_b=6;
        int mod_c= mod_a%mod_b;
        
        double da= 14.55;
        double db= da%mod_b;
        
        System.out.println("Modulus "+mod_a+"%"+mod_b+" adalah "+mod_c);
        System.out.println("Modulus "+da+"%"+mod_a+" adalah "+db);
    }
}
