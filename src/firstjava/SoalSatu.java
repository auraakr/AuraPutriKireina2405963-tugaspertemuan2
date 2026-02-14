/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstjava;

import java.util.Scanner;

public class SoalSatu {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("angka 1: ");
        int angka1 = myObj.nextInt();
        
        System.out.print("angka 2: ");
        int angka2 = myObj.nextInt();
        
        System.out.print("anga 3: ");
        int angka3 = myObj.nextInt();
        
        // hasil
        int jumlah = angka1 + angka2 + angka3;
        int kurang = angka1 - angka2 - angka3;
        int kali = angka1 * angka2 * angka3;
        int bagi = angka1 / angka2 / angka3;
        
        // output
        System.out.println("Hasil penjumlahan: " + jumlah);
        System.out.println("Hasil pengurangan: " + kurang);
        System.out.println("Hasil perkalian: " + kali);
        System.out.println("Hasil pembagian: " + bagi);
    }
}
