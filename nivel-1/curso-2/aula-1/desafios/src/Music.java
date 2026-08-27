public class Music {
    String titulo;
    String artista;
    int anoLancamento;
    double mediaAvaliacoes;
    double somaAvaliacoes;
    double numAvaliacoes;


    public void mostraFicha() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano: " + anoLancamento);
        System.out.println("Avaliações: " + mediaAvaliacoes + " ★");
        System.out.println("Número de avaliações:" + numAvaliacoes);
    }

    public void avaliaMusica(int nota) {
        somaAvaliacoes += nota;
        numAvaliacoes++;
    }

    public void fazMedia (){
       mediaAvaliacoes = somaAvaliacoes / numAvaliacoes;
    }
}
