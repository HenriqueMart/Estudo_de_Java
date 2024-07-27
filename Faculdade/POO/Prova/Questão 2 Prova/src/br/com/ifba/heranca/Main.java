/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.ifba.heranca;

/**
 *
 * @author hmart
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Prova Questão 2");
        Veterinario vet = new Veterinario();
        
        //Criando a classes que tem herança
        Cachorro ani = new Cachorro("Donault", "Rau Rau", "Correndo", 2);
        Cavalo cav = new Cavalo("Beto", "Som do Cavalo", "Correndo", 3);
        Preguica preg = new Preguica("Flesh", "Som de Priguiça", "Subindo na árvore", 2);
        PeixeBoi pei = new PeixeBoi("Peixe", "Bolhas", "Nadando", 2);
        
        //Instância para examinar 1 animal
        vet.examinar(ani);
        //Instância Para examinar os 4 animais
        //vet.examinar(ani, cav, preg, pei);
        
    }
    
}
