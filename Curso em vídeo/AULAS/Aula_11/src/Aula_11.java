/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author hmart
 */
public class Aula_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 1;
        
        while( a < 10){
            a++;
            if(a == 5 || a == 8){
                continue;
                //break;
            }
            System.out.println("Cambalhota " + a);
            
        }
    }
    
}
