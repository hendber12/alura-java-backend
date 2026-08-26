import java.util.Scanner;

public class Exercicio1 {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = leitura.nextDouble();

        if (numero > 0) {
            System.out.println("O número " + numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é negativo.");
        } else {
            System.out.println("o numero é neutre :3");
        }
    }
}
