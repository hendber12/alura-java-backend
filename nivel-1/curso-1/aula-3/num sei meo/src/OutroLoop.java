import java.util.Scanner;

public class OutroLoop {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        int dividendo = 0;
        double nota = 0;

        while (nota >= 0){
            System.out.println("Digite uma nota ou digite -1 para encerrar:");
            nota = leitura.nextDouble();
            if (nota >= 0) {
                mediaAvaliacao += nota;
                dividendo++;
            }
        }

        System.out.println("A média das notas é " + mediaAvaliacao/dividendo);
    }
}
