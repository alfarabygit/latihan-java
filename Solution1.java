/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solution;

//belajar oop di java   

//membuat class
    class mobil
    {
        //membuat property(atribut) class
        int roda;
        
        //membuat method class
        void jalan()
        {
            System.out.println("Mobil Berjalan");
        }
    }

public class Solution 
{
    //membuat method main utk menjalankan class yang dibuat
    public static void main(String[] args) {
    
    //membuat objek    
    mobil atribut = new mobil();
    atribut.roda=4;
    
    //memanggil class
    atribut.jalan();
    System.out.println("Mobil berjalan dengan "+atribut.roda+" roda");
        
        
    }
   
}
