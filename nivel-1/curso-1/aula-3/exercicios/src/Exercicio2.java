import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float primeiroNumero = leitura.nextFloat();
        System.out.print("Digite o segundo número: ");
        float segundoNumero = leitura.nextFloat();

        if (primeiroNumero == segundoNumero) {
            System.out.println("Os números digitados são iguais.");
        } else if (primeiroNumero > segundoNumero) {
            System.out.println(primeiroNumero + " é maior que " + segundoNumero + ".");
        } else {
            System.out.println(primeiroNumero + " é menor que " + segundoNumero + ".");
        }
    }
}
