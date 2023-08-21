package application;

import entities.Cliente;
import entities.Conta;
import services.BankService;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta1 = null;
        Cliente cliente1;
        BankService bankService = new BankService();

        System.out.println("Olá seja bem vindo ao sistema de cadastro de conta corrente !");
        System.out.println("");

        while (true) {
            bankService.printMenu();
            int response = sc.nextInt();

            /* Caso tenha selecionado tomar uma ação antes de criar a conta ira surgir uma exceção dizendo que o objeto conta1 está com o valor null*/

            if (response == 1) {
                cliente1 = bankService.createCustomer();
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

