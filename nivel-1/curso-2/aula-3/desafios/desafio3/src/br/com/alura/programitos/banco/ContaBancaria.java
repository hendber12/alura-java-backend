package br.com.alura.programitos.banco;

public class ContaBancaria {
    protected double saldo;

    public void deposita(double valor){
        saldo += valor;
    }

    public void saca(double valor){
        if (valor > saldo) {
            System.out.println("vai te lascar papai. no money.");
        } else {
            saldo -= valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
