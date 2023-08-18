package entities;

import java.time.ZonedDateTime;

public class Conta {

    private int numero;
    private double saldo;
    private double withdrawLimit;
    private Cliente cliente;

    public Conta(int numero, double saldo, double withdrawLimit, Cliente cliente) {
        if (cliente == null) {
            throw new RuntimeException("A account can't be null!!");
        }
        this.numero = numero;
        this.saldo = saldo;
        this.withdrawLimit = withdrawLimit;
        this.cliente = cliente;
        System.out.println(" ");
        System.out.println("Conta criada com sucesso !");
        show();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double limit) {
        this.withdrawLimit = limit;
    }

    public double deposite(double value) {
        this.saldo += value;
        System.out.printf("Depósito realizado com sucesso, você depositou R$%.2f em dua conta. \n", value);
        return saldo;
    }

    public double withdraw(double value) {
        if(value > this.saldo) {
            System.out.println("Saldo insuficiente !");
            System.out.println("");
        } else if (value > withdrawLimit) {
            System.out.println("Esse valor excede o limite de saque !");
        } else {
            this.saldo -= value;
            System.out.printf("Saque realizado com sucesso, você sacou R$%.2f da sua conta corrente, \n", value);
        }
        return saldo;
    }

    public void show() {
        System.out.println("Número: " + numero);
        System.out.printf("Saldo: R$%.2f \n", saldo);
        System.out.println("Nome: " + this.cliente.getName());
        System.out.println("Idade: " + this.cliente.getIdade());
        System.out.println("Endereço: " + this.cliente.getEndereco());
        System.out.println("");
    }
}
