/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solution;

//belajar oop di java

//membuat class
class Manusia
{
    //membuat property class
    String nama;
    String asal;
    
    //membuat method
    void nama()
    {
        System.out.println("Halo nama saya adalah");
    }
    
    void asal()
    {
        System.out.println("Saya berasal dari");
    }
}

public class Solution 
{
    public static void main(String[] args) 
    {
        //membuat objek
        Manusia manusia = new Manusia();
        
        //isi value atribut class
        manusia.nama="Alfaraby";
        manusia.asal="Pekanbaru";
        
        //print hasilnya
        manusia.nama();
        System.out.print(manusia.nama);
        System.out.println("");
        
        manusia.asal();
        System.out.println(manusia.asal);
    }
    
}
