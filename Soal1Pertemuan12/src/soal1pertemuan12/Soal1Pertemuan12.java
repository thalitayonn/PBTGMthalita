/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1pertemuan12;

/**
 *
 * @author dell
 */
public class Soal1Pertemuan12 {
     class pegawai {
        int gaji = 4000000;
        int tunjanganMakan = 400000;
        int transport = 500000;
        int bonus = 1000000;
    }
    class SystemAnalyst extends pegawai {
        public int hitungGajiTotal() {
            return gaji + bonus + tunjanganMakan + transport;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Soal1Pertemuan12 outer = new Soal1Pertemuan12();
            SystemAnalyst SA = outer.new SystemAnalyst();

            System.out.println("Gaji System Analyst : "+SA.gaji); 
            System.out.println("Bonus : "+SA.bonus); 
            System.out.println("Tunjangan Makan : "+SA.tunjanganMakan); 
            System.out.println("Transport : "+SA.transport); 
            System.out.println("Gaji Total : "+SA.hitungGajiTotal());
    }
    
}
