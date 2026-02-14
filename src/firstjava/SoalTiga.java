/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstjava;

import java.util.Scanner;

public class SoalTiga {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Masukkan karakter ke-1 (Pilih 1/2): ");
        char karakter1 = myObj.next().charAt(0);
        
        System.out.print("Masukkan karakter ke-2 (Pilih 1/2): ");
        char karakter2 = myObj.next().charAt(0);
        
        int ascii1 = (int) karakter1;
        int ascii2 = (int) karakter2;
        
        int jumlah = ascii1 + ascii2;
        
        System.out.println("Jumlah kode ASCII: " + jumlah);
    }
}
