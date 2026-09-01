public class GeradorPrimo extends NumerosPrimos {
    public int gerarProximoPrimo(int ultimoNumero) {
        int proximoNumero = ultimoNumero + 1;
        while (!verificarPrimalidade(proximoNumero)) {
            proximoNumero++;
        }
        return proximoNumero;
    }
}
