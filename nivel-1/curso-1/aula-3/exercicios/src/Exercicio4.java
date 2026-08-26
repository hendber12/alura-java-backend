import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número para obter sua taboada: ");
        double numero = leitura.nextDouble();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero*i);
        }
    }
}
