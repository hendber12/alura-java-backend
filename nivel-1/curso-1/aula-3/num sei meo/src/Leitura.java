import java.util.Scanner;

public class Leitura {
    static void main() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do seu amigo:");
        String nomeAmigo = leitura.nextLine();

        System.out.println("Digite o tamanho do seu amigo:");
        int tamanhoAmigo = leitura.nextInt();

        System.out.println("Digite uma avaliação de 0 a 10 para o seu amigo:");
        double avaliacao = leitura.nextDouble();

        System.out.println(nomeAmigo);
        System.out.println(tamanhoAmigo);
        System.out.println(avaliacao);
    }
}
