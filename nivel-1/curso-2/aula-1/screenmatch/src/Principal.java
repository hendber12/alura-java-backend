import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Filme meuFilme = new Filme();
        meuFilme.nome = "HOMEM-ARANHA: De volta ao lar";
        meuFilme.anoDeLancamento = 2017;
        meuFilme.duracaoEmMinutos = 150;

        meuFilme.exibeFichaTecnica();
        System.out.print("Dê uma avaliação para o filme: ");
        meuFilme.avalia(scanner.nextDouble());
        System.out.print("Dê uma avaliação para o filme: ");
        meuFilme.avalia(scanner.nextDouble());
        System.out.print("Dê uma avaliação para o filme: ");
        meuFilme.avalia(scanner.nextDouble());
        System.out.println(meuFilme.pegaMedia());
    }
}
