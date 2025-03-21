/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package corrida2416beecrowd;
import java.util.Scanner;
/**
 *
 * @author alxdr
 */
public class Corrida2416Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int C = teclado.nextInt();
        int N = teclado.nextInt();
        
        int termino = (C % N);
        
        System.out.println(termino);
    }
    
}
