/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2pertemuan16;

/**
 *
 * @author dell
 */
public abstract class OperasiAritmatika {

    protected double a;
    protected double b;

    // Constructor untuk inisialisasi bilangan A dan B
    public OperasiAritmatika(double a, double b) {
        this.a = a;
        this.b = b;
    }

     // Method abstract untuk operasi
    public abstract double hitung();
}
