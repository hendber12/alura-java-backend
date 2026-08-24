public class Main {
    public static void main(String[] args){

        int anoDeLancaMentos = 9999;
        double notaDoFilme = 9.8;
        boolean incluidoNoPlano = false;

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Interstellar");
        System.out.println("Ano de Lança Mentos: " + anoDeLancaMentos);

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String stringers;
        stringers = """
                      pra escrever
                string em java é
                           mt
                estranho kkkkkkk
                testezao brabo %d""".formatted(anoDeLancaMentos);
        System.out.println(stringers);

        int classificacao;
        classificacao = (byte) (media/2);
        System.out.println(classificacao);
    }
}