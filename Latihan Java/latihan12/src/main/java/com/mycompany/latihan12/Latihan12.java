/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihan12;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Latihan12 {

    public static void main(String[] args) {
        System.out.println("Program Select Character Class in Game");
        
        Scanner scan = new Scanner(System.in);
        String name;
        
        System.out.print("Choose your Character Class: ");
        name=scan.nextLine();
        
        if (name.equals("General")) {
            System.out.println("*Heavy Steps* Taste My Heavy Weapons!");
        }else if (name.equals("Hero")) {
            System.out.println("It's time to be Hero!");
        }else if (name.equals("Paladin")) {
            System.out.println("I'm Superior Cavalry");
        }else if(name.equals("Great Knight")){
            System.out.println("Nobody can defeat me because my sturdies armor");
        }else if(name.equals("Sniper")){
            System.out.println("I can takedown enemies with single blow");
        }else if(name.equals("Nomadic Trooper")){
            System.out.println("I can shoot down enemies while running");
        }else if(name.equals("Berserker")){
            System.out.println("RAAAARGH, Berserker Fury!!!");
        }else if(name.equals("Rogue")){
            System.out.println("I can steal while kill enemies");
        }else if(name.equals("Sage")){
            System.out.println("*take breath* ELFIRE!");
        }else if(name.equals("Druid")){
            System.out.println("Hahaaha, feel darkness power!");
        }else if(name.equals("Valkyrie")){
            System.out.println("fight and healing is my job!");
        }else if(name.equals("Mage Knight")){
            System.out.println("I can fight enemies with horseback and magic");
        }else if(name.equals("Bishop")){
            System.out.println("I shall deliver message from god");
        }else{
            System.out.println("Sorry, no Character Class Available");
        }
    }
}
