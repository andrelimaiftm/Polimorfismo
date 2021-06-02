package br.edu.iftm.polimorfismo.classes;

public class Canguru extends Mamifero{

    public void usarBolsa(){
        System.out.println("usando bolsa");
    }

    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
    
}
