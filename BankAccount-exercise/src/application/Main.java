package application;

import entities.Cliente;
import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta1 = null;
        Cliente cliente1;

        System.out.println("Olá seja bem vindo ao sistema de cadastro de conta corrente !");
        System.out.println("");

        while (true) {

            System.out.println("Digite o número da operação que deseja realizar:");
            System.out.println("[1] Criar conta;");
            System.out.println("[2] Depositar;");
            System.out.println("[3] Sacar;");
            System.out.println("[4] Ver saldo;");
            System.out.println("[5] Alterar Limite de Saque;");
            System.out.println("[0] Sair");
            int response = sc.nextInt();

            /* Caso tenha selecionado tomar uma ação antes de criar a conta ira surgir uma exceção dizendo que o objeto conta1 está com o valor null*/

            if (response == 1) {
                System.out.println("Digite seu nome:");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Digite sua idade:");
                int idade = sc.nextInt();
                System.out.println("Digite seu endereço:");
                sc.nextLine();
                String endereco = sc.nextLine();

                cliente1 = new Cliente(name, idade, endereco);

                conta1 = new Conta(001, 00.00, 1000.00, cliente1);
            } else if (response == 2) {
                System.out.println("Digite o valor que deseja depositar:");
                conta1.deposite(sc.nextDouble());
            } else if (response == 3) {
                System.out.println("Digite o valor do saque que deseja realizar:");
                conta1.withdraw(sc.nextDouble());
                System.out.println("");
            } else if (response == 4) {
                conta1.show();
            } else if (response == 5) {
                System.out.println("Digite o valor do limite de saque:");
                conta1.setWithdrawLimit(sc.nextDouble());
            } else if (response == 0) {
                System.out.println(" ");
                System.out.println("Obrigado por usar nosso sistema, espero te ver em breve !");
                sc.close();
                System.exit(0);
            } else {
                System.out.println("Caractere invalido !");
            }
        }
    }
}

