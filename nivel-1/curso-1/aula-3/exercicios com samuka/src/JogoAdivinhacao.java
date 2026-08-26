import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        int numeroAleatorio = new Random().nextInt(67);
        Scanner leitura = new Scanner(System.in);


        for (int i = 4; i >= 0; i--) {
            System.out.println("Digite um número de 0 a 67:");
            int tentativa = leitura.nextInt();
            if (i > 0) {
                if (tentativa == numeroAleatorio) {
                    System.out.println("Era " + numeroAleatorio + " mesmo.\nVocê é o Mestre Dos Magos.\nGG.\nVocê acertou em " + (5 - i) + " tentativas.");
                    break;
                } else if (tentativa > numeroAleatorio) {
                    System.out.println("o número inserido é maior que a resposta.\nVocê tem " + i + " tentativas.");
                } else {
                    System.out.println("o número inserido é menor que a resposta.\nVocê tem " + i + " tentativas.");
                }
            } else {
                System.out.println("voze berdeu. o numero zegredo era " + numeroAleatorio);
            }
        }
    }
}
