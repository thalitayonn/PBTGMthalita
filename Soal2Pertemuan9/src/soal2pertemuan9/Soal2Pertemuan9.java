/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2pertemuan9;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Soal2Pertemuan9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner myInput = new Scanner(System.in);
        System.out.println("Masukan bilangan awal: ");
        int awal =  myInput.nextInt();
        System.out.println("Masukan bilangan akhir: ");
        int akhir =  myInput.nextInt();

        System.out.println("Hasil deret bilangan: ");
        boolean bilangan = true;

        for (int i = awal; i <= akhir; i += 5) {
            if (!bilangan) {
                System.out.print(" , ");
            }
            System.out.print(i);
            bilangan = false;
        }
        myInput.close();
    }
    
}
