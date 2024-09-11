/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1pertemuan16;

/**
 *
 * @author dell
 */
public class Soal1Pertemuan16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          double a = 9.5;
        double b = 2.5;

        // Membuat objek dari subclass Operasi
        Operasi operasi = new Operasi(a,b);

        // Menampilkan hasil operasi
        System.out.println("Penjumlahan: " + operasi.penjumlahan());
        System.out.println("Pengurangan: " + operasi.pengurangan());
        System.out.println("Perkalian: " + operasi.perkalian());
        try {
            System.out.println("Pembagian: " + operasi.pembagian());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
