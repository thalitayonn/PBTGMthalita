/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2pertemuan7;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Soal2Pertemuan7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner scanner = new Scanner(System.in)) {
            System.out.println("NIM : ");
            int nim = scanner.nextInt();
            scanner.nextLine();
            System.out.println("NAMA : ");
            String nama = scanner.nextLine();
            System.out.println("TAHUN : ");
            int tahun = scanner.nextInt();
            scanner.nextLine();
            System.out.println("PILIH PEMINATAN : ");
            char peminatan = scanner.next().charAt(0);
            
            switch (tahun) {
                case 1 -> System.out.println("Bahasa Inggris, Matematika, Sain");
                case 2 -> {
                    switch (peminatan) {
                        case 'C' -> System.out.println("Sistem Operasi, Pemrograman Java, Struktur Data");
                        case 'E' -> System.out.println("Algoritma, Logika Informatika");
                        case 'M' -> System.out.println("DBMS,Manajemen Proyek");
                    }
                }

                case 3 -> {
                    switch (peminatan) {
                        case 'C' -> System.out.println("Organisasi Komputer, MultiMedia");
                        case 'E' -> System.out.println("Perancangan Sistem, Pemrograman WEB");
                        case 'M' -> System.out.println("Pemrograman Mobile, Pemrograman Java 2");
                    }
                }

                case 4 -> {
                    switch (peminatan) {
                        case 'C' -> System.out.println("Komunikasi Data, MultiMedia");
                        case 'E' -> System.out.println(" Sistem Terdistribusi , Image Processing");
                        case 'M' -> System.out.println("SIM , Sistem Jaringan ");
                    }
                }

            }
        }
    }
    
}
