import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o tipo de conta do cliente: ");
        String tipoConta = scanner.nextLine();
        System.out.print("Digite o saldo inicial: R$");
        double saldo = scanner.nextDouble();
        int opcaoMenu = 0;

        System.out.println("****************************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("\nNome:          " + nomeCliente);
        System.out.println("Tipo conta:    " + tipoConta);
        System.out.println("Saldo inicial: R$" + saldo);
        System.out.println("****************************************");

        while (opcaoMenu != 4) {
            System.out.println("""
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    """);
            System.out.print("Digite a opção desejada: ");
            opcaoMenu = scanner.nextInt();
            if (opcaoMenu == 1) {
                System.out.println("O saldo atual é R$" + saldo + "\n");
            } else if (opcaoMenu == 2) {
                System.out.print("Informe o valor a receber: ");
                saldo += scanner.nextDouble();
                System.out.println("Saldo atualizado: R$" + saldo + "\n");
            } else if (opcaoMenu == 3) {
                System.out.print("Informe o valor que deseja transferir: ");
                double transferencia = scanner.nextDouble();
                if (transferencia > saldo) {
                    System.out.println("Não há saldo suficiente para fazer essa transferência. \n");
                } else {
                    saldo -= transferencia;
                    System.out.println("Saldo atualizado: R$" + saldo + "\n");
                }
            } else if (opcaoMenu == 4) {
                System.out.println("Encerrando programa...");
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}