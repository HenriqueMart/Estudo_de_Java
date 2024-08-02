/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula09.estrutura.condicional;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hmart
 */
public class AULA09EstruturaCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variável
        float nota1, nota2;
        int anoDeNascimento;
        //criando o objeto teclado
        Scanner teclado = new Scanner(System.in); 
        
        //pegando a data
        Date ano = new Date();
        System.out.println("Digite o ano de nascimento: ");
         //Salvando dados do teclado
        anoDeNascimento = teclado.nextInt();
        
        System.out.println("Digite a Primeira nota do Aluno: ");
        nota1 = teclado.nextFloat();
        
        System.out.println("Digite a Segunda nota do Aluno: ");
        nota2 = teclado.nextFloat();
        
        //Calculando a média
        float media = (nota1+nota2) / 2;
        anoDeNascimento =  2024 - anoDeNascimento;
    
        System.out.println("Ano de Nascimento: " + anoDeNascimento + ", Sua Média è " + media);
        //Verificando ser a média é maior que 8
        if(media > 8){
            System.out.println("Parabéns! Sua Média foi alta!");
        }
        if(anoDeNascimento > 18){
            System.out.println("Você é Maior");
        }else{
            System.out.println("Você é Menor");
        }
    }
    
}
