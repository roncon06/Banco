package org.example;

import org.example.enu.TipoConta;
import org.example.interfac.ConsultaSaldo;
import org.example.interfac.TransacoesBancarias;

import java.util.ArrayList;
import java.util.List;

abstract public class ContaBancaria implements TransacoesBancarias , ConsultaSaldo {

    private Pessoa dono;
    protected String numeroConta;
    protected double saldo;
    private List<String> extrato = new ArrayList<>();

    public ContaBancaria(Pessoa dono, String numeroConta, double saldoInicial) {
        this.dono = dono;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public ContaBancaria() {
    }

    public abstract TipoConta getTipoConta();

    public void imprimirExtrato() {
        System.out.println("Extrato da " + getTipoConta().getDescricao() + " " + numeroConta + ":");
        for (String transacao : extrato) {
            System.out.println(transacao);
        }
    }


    public void extratoPorPeriodo(String inicio, String fim) {
        System.out.println("Extrato da " + getTipoConta().getDescricao() + " " + numeroConta + " no período de " + inicio + " a " + fim + ":");
        for (String transacao : extrato) {
            if (transacao.contains(inicio) && transacao.contains(fim)) {
                System.out.println(transacao);
            }
        }
    }


    public void financiamento(double valor) {
        registrarTransacao("Financiamento de R$" + valor);
        saldo += valor;
    }


    public void aplicacao(double valor) {
        registrarTransacao("Aplicação de R$" + valor);
        saldo -= valor;
    }

    protected void registrarTransacao(String transacao) {
        extrato.add(transacao);
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    public Pessoa getDono() {
        return dono;
    }

    public List<String> getExtrato() {
        return extrato;
    }
}

