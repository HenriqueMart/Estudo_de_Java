/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.heranca;

/**
 *
 * @author hmart
 */
public class Preguica extends Animal{
    
    public Preguica(String NomeAnimal, String somAnimal, String locomocaoAnimal, int idadeAnimal) {
        super(NomeAnimal, somAnimal, locomocaoAnimal, idadeAnimal);
    }

    @Override
    public void setLocomocaoAnimal(String locomocaoAnimal) {
        this.locomocaoAnimal = "Subindo na árvore"; 
    }

    @Override
    public void setSomAnimal(String somAnimal) {
    this.somAnimal = "Som da priguiça";
    }
    
}
