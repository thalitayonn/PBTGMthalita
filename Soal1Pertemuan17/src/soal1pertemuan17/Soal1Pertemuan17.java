/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1pertemuan17;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Soal1Pertemuan17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner myInput = new Scanner(System.in);

        System.out.println("Masukan Jumlah Kota : ");
        int jumlahKota = myInput.nextInt();

        myInput.nextLine();

        String[] kotaArray = new String[jumlahKota];

        for (int i = 0; i < jumlahKota; i++) {
            System.out.println("Kota ke " + (i + 1) + " : ");
            kotaArray[i] = myInput.nextLine();
        }

        System.out.println("Kota-kota yang dimasukan:");
        for (String kota : kotaArray) {
            System.out.println(kota);
        }
    }
}
