/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihan6;

/**
 *
 * @author User
 */

class Mahasiswa
{
    String nim;
    String nama;
    String jurusan;

    public Mahasiswa(String nim, String nama, String jurusan) 
    {
        this.nim=nim;
        this.nama=nama;
        this.jurusan=jurusan;
    }
    
    void tampil()
    {
        System.out.println("Menampilkan Data");
    }
}


public class Latihan6 {

    public static void main(String[] args) {
        //latihan membuat pemrograman oop java
        Mahasiswa mahasiswa = new Mahasiswa("1610031802009", "Alfaraby Indra", "Teknik Informatika");
        
        System.out.println("Menampilkan Data Mahasiswa");
        System.out.println("==========================");
        System.out.println("Nim     : "+mahasiswa.nim);
        System.out.println("Nama    : "+mahasiswa.nama);
        System.out.println("Jurusan : "+mahasiswa.jurusan);
    }
}
