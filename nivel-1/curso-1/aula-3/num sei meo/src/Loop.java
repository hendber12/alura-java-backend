import java.util.Scanner;

public class Loop {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota:");
            nota = leitura.nextDouble();
            media += nota;
        }

        System.out.println("A média das notas é " + media/3);
    }
}
