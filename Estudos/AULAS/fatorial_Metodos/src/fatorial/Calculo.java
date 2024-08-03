/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatorial;

/**
 *
 * @author hmart
 */
public class Calculo {
    public static String valor(int v){
        //Criando variável
        int resultado = 1;
        String ms = " ";
        
        //Cálculo e a mensagem
        for(int i = v; i > 0; i--){
            resultado *= i;
            ms += " " + Integer.toString(i);
            
        }
        //convertendo e retorno do método
        ms += " = " + Integer.toString(resultado);
        return ms;
    }
}
