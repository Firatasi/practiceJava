/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Giris;


import java.util.Scanner;
/**
 *
 * @author FIRAT
 */
public class KullaniciGirisi9 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    String userName, password;
 
    System.out.print("Lütfen kullanıcı adınızı giriniz: ");
    userName = input.nextLine(); //string değeri tutmak için line ifadesi kullanılır.
    
    System.out.print("Lütfen şifrenizi giriniz: ");
    password = input.nextLine();
    
    if(userName.equals("firat") && password.equals("firat101")) { //.equals belirtilen değere eşit olup olmadığını kontrol eden bir sınıftır.
        
        System.out.println("Başarılı bir şekilde giriş yaptınız. ");
        
    }else {
        System.out.println("Kullanıcı adı veya parola hatalı. ");
    }
    
    }
    
}
