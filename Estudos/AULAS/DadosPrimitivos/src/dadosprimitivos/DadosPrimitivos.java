/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dadosprimitivos;
    import java.util.Scanner;
/**
 *
 * @author josemart
 */
public class DadosPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a idade do " + nome + ":");
        int idade = teclado.nextInt();
        System.out.println(nome + " Tem " + idade);
        
    }
    
}
