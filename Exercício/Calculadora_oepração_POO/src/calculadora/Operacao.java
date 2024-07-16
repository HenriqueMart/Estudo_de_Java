/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author hmart
 */

public class Operacao implements Calculo{
    //Criando método de resultado 
    double resultado = 0;
    public double escolha(double valor1, double valor2, String simbolo){
        
        switch(simbolo){
            case "+":
                 resultado = soma(valor1, valor2);
            break;
            case "-":
                 resultado = menos(valor1, valor2);
            break;
            case "*":
                 resultado = multiplicar(valor1, valor2);
            break;
            case "/":
                 resultado = dividir(valor1, valor2);
            break;
            default:
                    System.out.println("ERRO na operação, Tente novamente!");
                    return 0;
        }
        
        return resultado;
    }

    @Override
    public double menos(double valor1, double valor2) {
        return valor1 - valor2;
    }

    @Override
    public double multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }

    @Override
    public double dividir(double valor1, double valor2) {
        return valor1 / valor2;
    }

    @Override
    public double soma(double valor1, double valor2) {
        return valor1 + valor2;
    }
}
