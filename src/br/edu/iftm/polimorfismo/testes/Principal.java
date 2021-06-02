package br.edu.iftm.polimorfismo.testes;

import br.edu.iftm.polimorfismo.classes.*;

public class Principal {

    public static void main(String[] args) {
        
        //Mamifero m = new Mamifero();
        //Reptil r = new Reptil();
        /*Peixe p = new Peixe();
        Ave a = new Ave();

        m.setCorPelo("Marron");
        m.setPeso(85.5);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();//Correndo
        m.alimentar();//Mamando
        m.emitirSom();//som de Mamífero

        p.setCorEscama("cinza");
        p.setIdade(1);
        p.setPeso(0.35);
        p.setMembros(0);
        p.locomover();//Nadando
        p.alimentar();//Comendo pequenas substânticas
        p.emitirSom();//Peixe não faz som
        p.soltarBolha();//Soltou uma bolha

        a.setCorPena("branca");
        a.setPeso(0.89);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();//Voando
        a.alimentar();//Comendo frutas
        a.emitirSom();//som de ave
        a.fazerNinho();//Construiu um ninho*/

        //Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        //Tartaruga t = new Tartaruga();

        /*m.setPeso(5.70);
        m.setIdade(8);
        m.setMembros(4);
        m.locomover();//Correndo
        m.alimentar();//Mamando
        m.emitirSom();//som mamifero

        c.setPeso(55.30);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();//saltando
        c.alimentar();//mamando
        c.emitirSom();//som de mamífero
        c.usarBolsa();//usando a bolsa

        k.setPeso(3.94);
        k.setIdade(5);
        k.setMembros(4);
        k.locomover();//Correndo
        k.alimentar();//Mamando
        k.emitirSom();//som de Mamífero
        k.abanarRabo();//Abanando o RAbo

        t.locomover();

        r.locomover();*/

        k.reagir("Olá");//Abanar o rabo
        k.reagir("Vai apanhar");//rosnar
        k.reagir(11, 45);//abanar
        k.reagir(21, 00);//ignorar
        k.reagir(true);//abanar
        k.reagir(false);//rosnar e latir
        k.reagir(2, 12.5);//latir
        k.reagir(17, 4.5);//rosnar

    }
    
}
