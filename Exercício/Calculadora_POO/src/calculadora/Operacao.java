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
    public double escolha(double valor1, double valor2, String simbolo){
        
        switch(simbolo){
            case "+":
                double resultaod  = soma(valor1, valor2);
            
        }
        
        return resultado;
    }

    @Override
    public double soma(double valor1, double valor2){
        double resultado = valor1 + valor2;
        return resultado;
    }

    @Override
    public double menos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double multiplicar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double dividir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
