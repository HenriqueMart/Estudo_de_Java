/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.heranca;

/**
 *
 * @author hmart
 */
public class PeixeBoi extends Animal{
    
    public PeixeBoi(String NomeAnimal, String somAnimal, String locomocaoAnimal, int idadeAnimal) {
        super(NomeAnimal, somAnimal, locomocaoAnimal, idadeAnimal);
    }

    public void setSomAnimal(String somAnimal) {
        this.somAnimal = "Borbulando a água do peixe ";
    }

    public void setLocomocaoAnimal(String locomocaoAnimal) {
        this.locomocaoAnimal = "Nadando...";
    }
    
    
    
}
