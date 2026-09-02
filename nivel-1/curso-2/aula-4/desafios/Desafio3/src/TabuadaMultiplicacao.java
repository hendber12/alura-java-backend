public class TabuadaMultiplicacao implements Tabuada {
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostraTabuada() {
        for (int i = 1; i <=10; i++) {
            System.out.println(this.numero + " x " + i + " = " + (this.numero*i));
        }
    }
}
