/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2pertemuan11;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Soal2Pertemuan11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner myInput = new Scanner(System.in)) {
            System.out.print("Masukkan ID Karyawan: ");
            String idKaryawan = myInput.nextLine();
            System.out.print("Masukkan Nama Karyawan: ");
            String namaKaryawan = myInput.nextLine();
            System.out.print("Masukkan Golongan (1-5): ");
            int golongan = myInput.nextInt();
            myInput.nextLine();  // Clear the newline character from the buffer
            System.out.print("Masukkan Jabatan: ");
            String jabatan = myInput.nextLine();
            // Variabel untuk menyimpan gaji pokok
            double gajiPokok = switch (golongan) {
                case 1 -> 3000000;
                case 2 -> 3500000;
                case 3 -> 4000000;
                case 4 -> 5000000;
                case 5 -> 6000000;
                default -> {
                    System.out.println("Golongan tidak valid, gaji pokok ditetapkan ke 0.");
                    yield 0;
                }
            };  // Membuat objek Karyawan dengan data yang diinput
            Karyawan karyawan = new Karyawan(idKaryawan, namaKaryawan, golongan, jabatan, gajiPokok);
            // Menampilkan data karyawan
            System.out.println("\nData Karyawan");
            karyawan.tampilkanData();
            // Menutup Scanner
        }
    }
    
}
