/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1pertemuan8;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Soal1Pertemuan8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner myInput = new Scanner(System.in);
        System.out.println("Nilai Awal?: ");
        int nilaiAwal =  myInput.nextInt();

        System.out.println("Nilai Akhir?: ");
        int nilaiAkhir =  myInput.nextInt();

        System.out.println("Hasil nya : ");
        for (int i = nilaiAwal; i <= nilaiAkhir; i+=5) {
            System.out.println(i);
        }
    }
    
}
