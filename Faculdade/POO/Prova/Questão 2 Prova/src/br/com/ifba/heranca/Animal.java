/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.heranca;

/**
 *
 * @author hmart
 */
public class Animal {
    //Atributos
    String NomeAnimal, somAnimal, locomocaoAnimal;
    int idadeAnimal;

       //Construct do classe abstrat Pai dos atributos
    public Animal(String NomeAnimal, String somAnimal, String locomocaoAnimal, int idadeAnimal) {
        this.NomeAnimal = NomeAnimal;
        this.somAnimal = somAnimal;
        this.locomocaoAnimal = locomocaoAnimal;
        this.idadeAnimal = idadeAnimal;
    }
    
    //Encapsulamento com getter e setter
    public String getNomeAnimal() {
        return NomeAnimal;
    }

    public void setNomeAnimal(String NomeAnimal) {
        this.NomeAnimal = NomeAnimal;
    }

    public String getSomAnimal() {
        return somAnimal;
    }

    public void setSomAnimal(String somAnimal) {
        this.somAnimal = somAnimal;
    }

    public String getLocomocaoAnimal() {
        return locomocaoAnimal;
    }

    public void setLocomocaoAnimal(String locomocaoAnimal) {
        this.locomocaoAnimal = locomocaoAnimal;
    }

    public int getIdadeAnimal() {
        return idadeAnimal;
    }

    public void setIdadeAnimal(int idadeAnimal) {
        this.idadeAnimal = idadeAnimal;
    }
}
