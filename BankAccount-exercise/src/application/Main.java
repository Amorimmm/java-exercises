package application;

import entities.Cliente;
import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá seja bem vindo ao sistema de cadastro de conta corrente !");
        System.out.println("Digite seu nome:");
        String name = sc.nextLine();
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        System.out.println("Digite seu endereço:");
        sc.nextLine();
        String endereco = sc.nextLine();

        Cliente cliente1 = new Cliente(name, idade, endereco);

        Conta conta1 = new Conta(001,00.00, 1000.00, cliente1);

        System.out.println("Deseja entrar no nosso menu de movimentação da conta ? [y/n]");
        char response = sc.next().charAt(0);

         while (response != 121 && response != 110){
            System.out.println("Caractere invalido, digite novamente: [y/n]");
            response = sc.next().charAt(0);
         }

         while (response == 121) {

                System.out.println("Deseja sacar [s], depositar [d], mostrar saldo atual [m] ou mudar o seu limite de saque [l]?");
                char responseSD = sc.next().charAt(0);

                if(responseSD == 100) {
                    System.out.println("Digite o valor que deseja depositar:");
                    conta1.deposite(sc.nextDouble());
                } else if(responseSD == 115) {
                    System.out.println("Digite o valor do saque que deseja realizar:");
                    conta1.withdraw(sc.nextDouble());
                } else if(responseSD == 109) {
                    conta1.show();
                } else if (responseSD == 108) {
                    System.out.println("Digite o valor do limite de saque:");
                    conta1.setWithdrawLimit(sc.nextDouble());
                } else {
                    System.out.println("Caractere invalido !");
                }

                System.out.println("Deseja continuar no menu de movimentação ? [y/n]");
                response = sc.next().charAt(0);

                while (response != 121 && response != 110){
                    System.out.println("Caractere invalido, digite novamente: [y/n]");
                    response = sc.next().charAt(0);
                }

                System.out.println(" ");

        }

        System.out.println("Obrigado por usar nosso sistema, espero te ver em breve !");

        System.out.println("");
        sc.close();
        System.exit(0);
    }
}
