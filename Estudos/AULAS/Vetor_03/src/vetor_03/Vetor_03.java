/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor_03;

import java.util.Arrays;

/**
 *
 * @author hmart
 */
public class Vetor_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {1,8,3,4,235,12};
        Arrays.sort(vet);
        int pos = Arrays.binarySearch(vet, 1);
        System.out.println("Encontrei o valor na posição: " + pos);
        for(int valor: vet){
            System.out.println(valor);
            
        }
    }
    
}
