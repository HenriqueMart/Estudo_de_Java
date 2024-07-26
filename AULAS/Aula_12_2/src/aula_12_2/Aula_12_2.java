/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_12_2;

import java.util.Scanner;

/**
 *
 * @author hmart
 */
public class Aula_12_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        String resp;
        //criando um objeto do tipo teclado
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Digite um número: ");
            //Pegando dados digitado no cmd
            n = teclado.nextInt();
            s += n;
            System.out.println("Deseja continuar? [S/n}: ");
            //Chamando a função (regra de negocio)
            resp = teclado.next();
            //Verificando ser o usuário deseja continuar
        }while(resp.equals("S"));
       System.out.println("O total é: " + s);
    }
    
}
