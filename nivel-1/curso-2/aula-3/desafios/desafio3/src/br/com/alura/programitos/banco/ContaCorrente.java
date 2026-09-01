package br.com.alura.programitos.banco;

public class ContaCorrente extends ContaBancaria{
    public void tarifararaMensal(double tarifa){
        saldo -= tarifa;
    }
}
