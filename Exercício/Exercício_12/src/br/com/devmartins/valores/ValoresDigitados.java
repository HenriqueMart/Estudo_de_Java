/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.devmartins.valores;

import javax.swing.JOptionPane;

/**
 *
 * @author hmart
 */
public class ValoresDigitados {
     public static void main(String[] arg){
         int total = 0, a, soma = 0, pares = 0, impares = 0, cem = 0;
         float media = 0;
         do{
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Digite um valor:<br><em>Digite 0 para terminar a execução</em></html>"));
        soma += a;
        if(a % 2 == 0){
            pares ++;
        }else{
            impares ++;
        }
        if(a > 100){
            cem ++;
        }
        total ++;
         }while(a != 0);
         media = soma / total;
         JOptionPane.showMessageDialog(null, "<html> Resultado da soma é: " + soma +"<br>PARES: : " + pares + "<br>IMPARES:" + impares + "<br>MEDIA:"+ media +"<br>TOTAL ACIMA DE 100:"+ cem +"</html>");
    }
}
