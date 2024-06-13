/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor_01;

/**
 *
 * @author hmart
 */
public class Vetor_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = new int[4];
        n[0] = 3;
        n[1] = 2;
        n[2] = 9;
        n[3] = 12;
        
        for(int c = 0; c < (n.length-1); c++){
             System.out.println("O valor na posição " + c + " É " + n[c]);
        }
    }
    
}
