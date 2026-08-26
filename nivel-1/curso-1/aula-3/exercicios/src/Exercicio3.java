import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("""
             Bem vindo ao pro grama. Digite a opção deseijada:
             1. Calcular área do quadrado
             2. Calcular área do círculo
             3. Sair""");
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o lado do quadrado:");
                double ladoQuadrado = leitura.nextFloat();
                double areaQuadrado = ladoQuadrado * ladoQuadrado;
                System.out.println("A área de um quadrado de lado " + ladoQuadrado + " é " + areaQuadrado + ".");
            } else if (opcao == 2) {
                System.out.print("Digite o raio do círculo: ");
                double raioCirculo = leitura.nextFloat();
                double areaCirculo = 3.14 * raioCirculo * raioCirculo;
                System.out.println("A área de um círculo de raio " + raioCirculo + " é " + areaCirculo + ".");
            } else if (opcao == 3) {
                System.out.println("Encerrando programa...");
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}
