package br.com.cartinha.screenmatch.calculos;

import br.com.cartinha.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal(){
        return tempoTotal;
    }
}
