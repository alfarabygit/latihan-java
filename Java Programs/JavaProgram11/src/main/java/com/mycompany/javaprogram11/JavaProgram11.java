/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaprogram11;

/**
 *
 * @author User
 */
public class JavaProgram11 {

    public static void main(String[] args) {
        //bilangan prima di pemrograman java
        int a,b=0, flag=0;
        int n=11;//angka yg dicek apakah bilangan prima atau tidak
        b=n/2;
        
        for(a=2; a<=b; a++){
            if(n%a==0){//mengecek apakah bilangan prima atau bukan
                System.out.println("Bukan bilangan prima!");
                flag=1;
                break;
            }
        }
        if(flag==0){
        System.out.println("Bilangan Prima!");    
        }
        
    }
}
