/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2pertemuan15;
import kalkulatorpack.KalkulatorKurang;
import kalkulatorpack.KalkulatorBagi;
import kalkulatorpack.KalkulatorKali;

/**
 *
 * @author dell
 */
public class Soal2Pertemuan15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // Membuat objek dari masing-masing kelas
        KalkulatorKurang kalkulatorKurang = new KalkulatorKurang();
        KalkulatorBagi kalkulatorBagi = new KalkulatorBagi();
        KalkulatorKali kalkulatorKali = new KalkulatorKali();

        // Menghitung hasil operasi
        int hasilKurang = kalkulatorKurang.kurang(10, 5);
        int hasilBagi = kalkulatorBagi.bagi(10, 2);
        int hasilKali = kalkulatorKali.kali(10, 5);

        // Menampilkan hasil output
        System.out.println("Hasil pengurangan: " + hasilKurang);
        System.out.println("Hasil pembagian: " + hasilBagi);
        System.out.println("Hasil perkalian: " + hasilKali);
    }
    
}
