/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2pertemuan16;

/**
 *
 * @author dell
 */
public class Soal2Pertemuan16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a = 9.5;
        double b = 2.5;

         OperasiAritmatika[] operasi = new OperasiAritmatika[]{
            new Penjumlahan(a, b),
            new Pengurangan(a, b),
            new Perkalian(a, b),
            new Pembagian(a, b)
         };

         // Menampilkan hasil operasi
        for (OperasiAritmatika op : operasi) {
            try {
                System.out.println(op.getClass().getSimpleName() + ": " + op.hitung());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
   