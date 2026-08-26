public class Condicional {
    public static void main() {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 0){
            System.out.println("Esse filme lançou depois de cristo.");
        } else {
            System.out.println("Esse filme lançou antes de cristo xD");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("bora!!");
        } else {
            System.out.println("F");
        }


    }
}
