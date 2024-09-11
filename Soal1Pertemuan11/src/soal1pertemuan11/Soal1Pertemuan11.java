/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1pertemuan11;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Soal1Pertemuan11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myInput = new Scanner(System.in);

        // Input data karyawan
        System.out.println("Masukkan ID Karyawan: ");
        String idKaryawan = myInput.nextLine();

        System.out.println("Masukkan Nama Karyawan: ");
        String namaKaryawan = myInput.nextLine();

        System.out.println("Masukkan Golongan: ");
        String golongan = myInput.nextLine();

        System.out.println("Masukkan Jabatan: ");
        String jabatan = myInput.nextLine();

        System.out.println("Masukkan Gaji Pokok: ");
        double gajiPokok = myInput.nextDouble();

        // Membuat objek Karyawan dengan data yang diinput
        Karyawan karyawan = new Karyawan(idKaryawan, namaKaryawan, golongan, jabatan, gajiPokok);

        // Menampilkan data karyawan
        System.out.println("\nData Karyawan");
        karyawan.tampilkanData();
    }
}
  