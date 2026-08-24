public class Desafio4 {
    public static void main(String[] args) {
        double precoProduto = 6.7;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;

        System.out.println(String.format("O valor total é de R$%.2f", valorTotal));
    }
}
