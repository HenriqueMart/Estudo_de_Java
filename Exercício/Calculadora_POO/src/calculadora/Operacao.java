/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author hmart
 */
public class Operacao extends ModeloDeEntrada implements Calculo{
    double resultado;

    public Operacao(double v1, double v2) {
        super(v1, v2);
    }
                  
    public double simbolo(double valor1, double valor2, String simbolo){
        switch(simbolo){
            case "+":
            resultado = soma(valor1, valor2);
            break;

        }
        
        return resultado;
    }
    @Override
    public double soma(double v1, double v2){
        return v1 + v2;
    }

    @Override
    public double menos(double v1, double v2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double multiplicar(double v1, double v2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double dividir(double v1, double v2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
