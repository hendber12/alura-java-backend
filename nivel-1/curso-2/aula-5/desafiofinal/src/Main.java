import br.com.receba.spotifivesixseven.modelos.Musica;
import br.com.receba.spotifivesixseven.modelos.Podcasts;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        //Declaração de Variáveis
        int opcao = 67;
        int opcaoMusica = 67;


        //Instanciação dos objetos
        Scanner leitor = new Scanner(System.in);

        Musica musica1 = new Musica();
        Musica musica2 = new Musica();
        Podcasts podcast1 = new Podcasts();
        Podcasts podcast2 = new Podcasts();

        musica1.setArtista("Pedrinho69");
        musica1.setAlbum("possesoes de cama");
        musica1.setGenero("sertanejo");
        musica1.setTitulo("duro igual cavalo");

        musica2.setArtista("Carlinhos67");
        musica2.setAlbum("Inversões de aura");
        musica2.setGenero("phonk");
        musica2.setTitulo("Montagem Espanca Burro");

        podcast1.setTitulo("Entrevista com Carlinhos67 - #67");
        podcast1.setDescricao("Fumando ci-Fumando cigarro com carlinhos, e farmando muita aura.");
        podcast1.setHost("Monark");

        podcast2.setDescricao("Novo champion do aram cartinha? Feito de Skarner ou minion?");
        podcast2.setHost("Riot");
        podcast2.setTitulo("Leaked dos crias com pedrinho69 - #69");


        //Programa Principal
        System.out.println("**** Bem vindo ao SpotiFiveSixSeven!! ****");
        while (opcao != 9) {
            System.out.println("Músicas:");
            System.out.println("1 - " + musica1.getTitulo());
            System.out.println("2 - " + musica2.getTitulo());
            System.out.println("Podcasts:");
            System.out.println("3 - " + podcast1.getTitulo());
            System.out.println("4 - " + podcast2.getTitulo());
            System.out.println("9 - Sair");
            System.out.print("Digite uma opção: ");
            opcao = leitor.nextInt();
            if (opcao == 1) {
                System.out.print("""
                        1- Reproduzir
                        2- Curtir
                        Digite uma opção:
                        """);
                opcaoMusica = leitor.nextInt();
                switch (opcaoMusica) {
                    case 1:
                        musica1.reproduz();
                    case 2:
                        musica1.curte();
                    default:
                        System.out.println("Opcao invalida.");
                }
            } else if (opcao == 2) {
                System.out.print("""
                        1- Reproduzir
                        2- Curtir
                        Digite uma opção:
                        """);
                opcaoMusica = leitor.nextInt();
                switch (opcaoMusica) {
                    case 1:
                        musica2.reproduz();
                    case 2:
                        musica2.curte();
                    default:
                        System.out.println("Opcao invalida.");
                }
            } else if (opcao == 9) {
                System.out.println("Encerrando programa...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }
}
