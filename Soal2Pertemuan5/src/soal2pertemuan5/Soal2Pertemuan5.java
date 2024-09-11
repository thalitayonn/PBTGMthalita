/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2pertemuan5;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Soal2Pertemuan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner myInput = new Scanner(System.in);
        System.out.println("Masukan Alas segitiga:");
                double alas = myInput.nextDouble();
        System.out.println("Masukan Tinggi segitiga:");        
                double tinggi = myInput.nextDouble();
        double luas = (alas * tinggi) / 2;
        // Output input by user
        System.out.println("Luas Segitiga : " + luas);
    }
    
}
