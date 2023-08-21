package services;

import entities.Cliente;

import java.util.Scanner;

public class BankService {

    private Scanner sc;

    public BankService() {
        this.sc = new Scanner(System.in);
    }

    public void printMenu() {
        System.out.println("Digite o número da operação que deseja realizar:");
        System.out.println("[1] Criar conta;");
        System.out.println("[2] Depositar;");
        System.out.println("[3] Sacar;");
        System.out.println("[4] Ver saldo;");
        System.out.println("[5] Alterar Limite de Saque;");
        System.out.println("[0] Sair");
    }

    public Cliente createCustomer() {
        System.out.println("Digite seu nome:");
        String name = sc.nextLine();
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        System.out.println("Digite seu endereço:");
        sc.nextLine();
        String endereco = sc.nextLine();
        return new Cliente(name, idade, endereco);
    }
}
