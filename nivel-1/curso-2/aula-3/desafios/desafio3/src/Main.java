import br.com.alura.programitos.banco.ContaCorrente;

public class Main {
    static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        System.out.println(conta1.getSaldo());
        conta1.deposita(9999);
        System.out.println(conta1.getSaldo());
        conta1.saca(6767);
        System.out.println(conta1.getSaldo());
        conta1.tarifararaMensal(67);
        System.out.println(conta1.getSaldo());
        conta1.saca(999999);
        System.out.println(conta1.getSaldo());
    }
}
