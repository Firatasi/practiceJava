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
public class Manavkasa7 {
    public static void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        
        double kilo,armutFiyat,elmaFiyat,domatFiyat,muzFiyat,patFiyat,toplam;
        
        double armut=2.14;
        double elma=3.67;
        double domat=1.11;
        double muz=0.95;
        double pat=5.00;
        
        System.out.print("Armut Kaç Kilo: ");
        kilo = inp.nextDouble();
        armutFiyat=(armut*kilo);
        System.out.println("Armut Fiyat: " + armutFiyat);
        
        System.out.print("Elma Kaç Kilo: ");
        kilo = inp.nextDouble();
        elmaFiyat = (elma*kilo);
        System.out.println("Elma Fiyat: " + elmaFiyat);
        
        System.out.print("Domates  Kaç Kilo: ");
        kilo = inp.nextDouble();
        domatFiyat = (domat*kilo);
        System.out.println("Domates Fiyat: " + domatFiyat);
        
        System.out.print("Muz  Kaç Kilo: ");
        kilo = inp.nextDouble();
        muzFiyat = (muz*kilo);
        System.out.println("Muz Fiyat: " + muzFiyat);
        
        System.out.print("Patlıcan  Kaç Kilo: ");
        kilo = inp.nextDouble();
        patFiyat = (pat*kilo);
        System.out.println("Patlıcan Fiyat: " + patFiyat);

        toplam = armutFiyat+elmaFiyat+domatFiyat+muzFiyat+patFiyat;
        
        System.out.println("Toplam Fiyat: " + toplam);
        
    }
}
