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
public class TaksimetreProgramı5 {
    
    public static void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        
        int kiloMetre;
        int acilisTutar = 10;
        double tutar;
        double kmFiyat = 2.20;
        
        
        System.out.print("Gidilen kilometreyi giriniz: ");
        kiloMetre = inp.nextInt();
        tutar = acilisTutar+(kmFiyat*kiloMetre);
        
        
        if(tutar<20) {
            System.out.println("Tutar: 20TL");
        }else {
            System.out.println("Tutar: " + tutar);
        }
    }
    
}
