package com.example;

public class Jogo {

    protected Monte monte = new Monte();

    protected Jogador jogador = new Jogador();

    protected Computador computador = new Computador();

    public Jogo() {
        this.monte.embaralhar();
    }

    public Carta distribuirCartaParaJogador(Jogador jogador){

        if (jogador.parou())
            return null;
          Carta carta = monte.virar();
          jogador.receberCarta(carta);
          return carta;
    }

    public boolean acabou(){
        if (alguemEstourou()||computador.parou() && jogador.parou())
            return true;
        
        return false;
    }

    public String resultado(){
        if(jogadorEstourou()&&computadorEstourou()||jogador.getPontos() ==computador.getPontos()){
            return "Empatou";
        }
        if(computadorEstourou()||!jogadorEstourou() && jogador.getPontos() >computador.getPontos()){
            return "Voce ganhou";
        }
        return "Voce perdeu";
    }

    private boolean jogadorEstourou(){
       return jogador.getPontos() > 21;
    }
    private boolean computadorEstourou(){
       return computador.getPontos() > 21;
    }

    private boolean alguemEstourou(){
      return jogadorEstourou()||computadorEstourou();
    }
}

// arlie return