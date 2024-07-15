/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author hmart
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bem vindo a Calculadora");
        Scanner teclado = new Scanner(System.in);
        Operacao calculo = new Operacao();
        
        System.out.println("Digite o primeiro valor: ");
        double v1 = teclado.nextDouble();
        
        System.out.println("Digite o Segundo valor: ");
        double v2 = teclado.nextDouble();
        
        
        System.out.println("Digite a operacação: ");
        String simbolo = teclado.next(); 
        
        double resultado = calculo.simbolo(v1, v2, simbolo);
        
        System.out.println("O valor escolhido foi de: " + v1 + " e " + v2 + ", A operacação escolhida foi " + simbolo + ", Resultado: " + resultado);
    }
    
}
