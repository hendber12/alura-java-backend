public class NumerosPrimos {
    private String listaPrimos;

    public boolean verificarPrimalidade(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String listaPrimos(int maiorNumero){
        this.listaPrimos = "Os números primos entre 0 e " + maiorNumero + " são: ";
        for (int i = 1; i <= maiorNumero; i++) {
            if (verificarPrimalidade(i)) {
                this.listaPrimos += (i + ", ");
            }
        }
        return listaPrimos;
    }
}