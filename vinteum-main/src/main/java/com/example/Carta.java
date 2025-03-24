package com.example;

public class Carta {

    private int numero;
    private Naipe naipe;
    private String[] NAIPES = {"","Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public String imagePath (){
        
        return "classic-cards/" + NAIPES[numero] + naipe + ".png";
    }

    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }
}
