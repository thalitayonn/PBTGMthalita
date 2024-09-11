/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1pertemuan13;

/**
 *
 * @author dell
 */
public class Soal1Pertemuan13 {
      class CalculatorSederhana {

        public int tambah(int a, int b) {
            return a + b;
        }

        public int kurang(int a, int b) {
            return a - b;
        }

        public int kali(int a, int b) {
            return a * b;
        }

        public int bagi(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagi tidak boleh nol.");
        }
        return a / b;
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Soal1Pertemuan13 objekLuar = new Soal1Pertemuan13();
        CalculatorSederhana kalkulator = objekLuar.new CalculatorSederhana();

        System.out.println("Hasil Pertambahan : " + kalkulator.tambah(20, 10));
        System.out.println("Hasil Penguranagan : " + kalkulator.kurang(20, 10));
        System.out.println("Hasil Perkalian : " + kalkulator.kali(20, 10));
        System.out.println("Hasil Pembagian : " + kalkulator.bagi(20, 10));
    }
    
}
