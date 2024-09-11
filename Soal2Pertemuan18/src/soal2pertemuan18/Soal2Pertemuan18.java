/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2pertemuan18;

/**
 *
 * @author dell
 */
public class Soal2Pertemuan18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
        //below code do not throw any exception 
            Float data=500f/ 15;
            System.out.println(data);
        } 
        catch (NullPointerException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("blok finally akan selalu di eksekusi "); 
        }
    }
    
}
