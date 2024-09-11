/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2pertemuan17;

/**
 *
 * @author dell
 */
public class Soal2Pertemuan17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String[][] negaraIbukota = {
            {"Indonesia", "Jakarta"},{"Jepang", "Tokyo"},
            {"Iran", "Teheran"},{"Malaysia", "Kuala Lumpur"},{"Thailand", "Bangkok"}
        };

        for (String[] negaraIbukota1 : negaraIbukota) {
            String negara = negaraIbukota1[0];
            String ibukota = negaraIbukota1[1];
            System.out.println("Ibukota " + negara + " adalah " + ibukota);
        }
    }
    
}
