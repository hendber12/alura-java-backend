public class Desafio6 {
    public static void main(String[] args) {
        double precoOriginal = 67;
        double percentualDesconto = 15;
        double desconto = precoOriginal * (percentualDesconto/100);
        System.out.println(String.format("R$%.2f com %.0f porcento de desconto sai por R$%.2f.", precoOriginal, percentualDesconto, precoOriginal - desconto));
    }
}
