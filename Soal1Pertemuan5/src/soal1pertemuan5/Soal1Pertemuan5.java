/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1pertemuan5;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Soal1Pertemuan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myInput = new Scanner(System.in);
        System.out.println("Masukan Nama Anda:");
        // String input
        String name = myInput.nextLine();
        System.out.println("Masukan Alamat Anda:");
        // String input
        String alamat = myInput.nextLine();
        // Numerical input
        System.out.println("Masukan Usia Anda:");
        int usia = myInput.nextInt();
        System.out.println("Masukan Gaji Anda:");
        double salary = myInput.nextDouble();
        // Output input by user
        System.out.println("### Pendataan Karyawan PT. Petani Kode ### ");
        System.out.println("Nama Karyawan: " + name);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia);
        System.out.println("Gaji: " + salary);
    }
    
}
