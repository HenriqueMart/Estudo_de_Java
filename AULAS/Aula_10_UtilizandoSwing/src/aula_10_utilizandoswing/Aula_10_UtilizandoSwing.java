/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_10_utilizandoswing;

import java.util.Scanner;

/**
 *
 * @author hmart
 */
public class Aula_10_UtilizandoSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite quantas pernas esse indivíduo? ");
        int valor = teclado.nextInt();
        switch(valor){
            case 1:
                System.out.println("Saci?");
            break;
            case 2:
                System.out.println("Bíbepe");
            break;
            case 4:
                System.out.println("Quadrúpete");
            break;
            case 6, 8:
                System.out.println("Aranha");
            break;
            default:
                System.out.println("ET?");
    }
    }
    
}
