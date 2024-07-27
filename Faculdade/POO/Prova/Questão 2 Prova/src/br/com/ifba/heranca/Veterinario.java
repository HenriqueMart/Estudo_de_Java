/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.heranca;

/**
 *
 * @author hmart
 */
public class Veterinario {
    
    
    public void examinar(Animal ani){
        System.out.println("Examinando... Barulho do Animal: " + ani.somAnimal);
        
    }
    public void examinar(Animal Cachorro, Animal cavalo, Animal preguica, Animal peixeboi){
        System.out.println("Examinando... Barulho do Animal: " + Cachorro.somAnimal);
        System.out.println("Examinando... Barulho do Animal: " + cavalo.somAnimal);
        System.out.println("Examinando... Barulho do Animal: " + preguica.somAnimal);
        System.out.println("Examinando... Barulho do Animal: " + peixeboi.somAnimal);
        
    }
}
