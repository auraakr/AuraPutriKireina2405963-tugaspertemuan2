/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstjava;

import java.util.Scanner;

public class FirstJava {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("masukkan nama: ");
        String name = myObj.nextLine();
        
        System.out.println("masukkan nim: ");
        int nim = myObj.nextInt();
        
        System.out.println("Halo Word " + name + " dan " + nim + ". Saya Senang Belajar Java");
    }
}
