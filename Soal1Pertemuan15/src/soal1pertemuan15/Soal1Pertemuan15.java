/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1pertemuan15;
import kalkulatorpack.Kalkulator;

/**
 *
 * @author dell
 */
public class Soal1Pertemuan15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek dari kelas Kalkulator
        Kalkulator objek = new Kalkulator();

        // Menggunakan method pengurangan
        int hasilPengurangan = objek.pengurangan(30, 10);
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);

        // Menggunakan method pembagian
        try {
            float hasilPembagian = objek.pembagian(10.0f, 2.0f);
            System.out.println("Hasil Pembagian: " + hasilPembagian);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Menggunakan method perkalian
        float hasilPerkalian = objek.perkalian(10.0f, 2.0f);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
    }
    
}
