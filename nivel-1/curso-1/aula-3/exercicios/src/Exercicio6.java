import java.util.Scanner;

public class Exercicio6 {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite um número para obter seu fatorial: ");
        int numero = leitura.nextInt();
        int fatorial = numero;
        String fatorialTexto = "";

        for (int i = numero-1; i > 1; i--) {
            fatorial = fatorial * i;
            fatorialTexto += (i + " x ");
        }

        System.out.println(numero +  "! = " + numero + " x " + fatorialTexto + "1 = " + fatorial);
    }
}
