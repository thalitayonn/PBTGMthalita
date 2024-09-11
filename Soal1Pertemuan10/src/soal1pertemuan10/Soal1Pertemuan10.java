/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1pertemuan10;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Soal1Pertemuan10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myInput = new Scanner(System.in);

        Aritmatika3 aritmatika = new Aritmatika3();
        System.out.print("Masukkan bilangan pertama: ");
        int a = myInput.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int b = myInput.nextInt();

        // Menampilkan hasil operasi
        System.out.println("Pengurangan: " + aritmatika.pengurangan(a, b));
        System.out.println("Perkalian: " + aritmatika.perkalian(a, b));

        try {
            System.out.println("Pembagian: " + aritmatika.pembagian(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        System.out.println("Pangkat: " + aritmatika.pangkat(a, b));

    }
    
}
