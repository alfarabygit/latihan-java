/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solution;

//class
class OOP
{
    //constructor tanpa parameter.
    public OOP()
    {
        System.out.println("ini contoh constructor default");
    }
    
}

//class
class User
{
    //property class
    String username;
    String password;

    //constructor dengan parameter
    public User(String username, String password) 
    {
        this.username = username;
        this.password = password;
    }
    
    
}

class Koneksi
{
    String user;
    String pass;
    int port;
    
    public Koneksi(String user, String pass, int port) 
    {
        this.user=user;
        this.pass=pass;
        this.port=port;
    }
    
}


public class Solution 
{
    //main method
    public static void main(String[] args) 
    {
        //membuat objek class
        OOP objek = new OOP();
        System.out.println("========");
        //ketika membuat objek class, tambahkan nilai parameternya sesuai dengan tipe data parameter yang dibuat
        System.out.println("contoh eksekusi constructor dengan parameter");
        System.out.println("========");
        User admin = new User("admin","admin12345");
        Koneksi konek = new Koneksi("admin", "admin123", 8080);
        System.out.println("Username: "+ admin.username);
        System.out.println("Passowrd: "+ admin.password);
        System.out.println("=========");
        System.out.println("Username: "+konek.user);
        System.out.println("Password: "+konek.pass);
        System.out.println("Port: "+konek.port);
    //ketika dijalankan, construct akan dijalankan terlebih dahulu sebelum function dari class.
    }
  //di pemrograman java, tidak ada destructor hanya constructor karena memiliki sistem garbage collector. 
    //sedangkan di bahasa pemrograman selain java, kemungkinan ada destructor seperti C++
}
