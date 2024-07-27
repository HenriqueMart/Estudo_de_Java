/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.heranca;

/**
 *
 * @author hmart
 */
public class Cachorro extends Animal{
    
    //Chamando o construct
    public Cachorro(String NomeAnimal, String somAnimal, String locomocaoAnimal, int idadeAnimal) {
        super(NomeAnimal, somAnimal, locomocaoAnimal, idadeAnimal);
    }
    
    //Alterando métodos do Pai para essa classe 
    @Override
    public void setLocomocaoAnimal(String locomocaoAnimal) {
        this.locomocaoAnimal = "Correndo...";
    }

    @Override
    public void setSomAnimal(String somAnimal) {
        this.somAnimal = "Latino";
    }
}
