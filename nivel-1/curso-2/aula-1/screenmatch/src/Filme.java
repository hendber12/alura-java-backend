public class Filme {
    String nome;
    int anoDeLancamento;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;
    double somaDasAvaliacoes;
    boolean incluidoNoPlano;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Soma das avaliações: " + somaDasAvaliacoes + "(" + totalDeAvaliacoes + ")");
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }
}