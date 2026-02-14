/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstjava;

import java.util.Scanner;

public class SoalDua {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("uang anda: ");
        int uang = myObj.nextInt();
        
        System.out.println("Apakah hari ini hujan: ");
        boolean hujan = myObj.nextBoolean();
        
        boolean beliGorengan = (uang > 5000) && (!hujan);
        
        System.out.println("Beli gorengan: " + beliGorengan);
        System.out.println(beliGorengan ? "Saya akan keluar membeli gorengan" : "Saya tidak jadi membeli gorengan");
        
    }
}
