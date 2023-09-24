package org.example;

import org.example.enu.TipoConta;

import java.util.ArrayList;
import java.util.List;

public class ContaConjunto extends ContaBancaria{

    private List<Pessoa> titulares = new ArrayList<>();

    public ContaConjunto(Pessoa titular1, Pessoa titular2, String numeroConta, double saldoInicial) {
        super(titular1, numeroConta, saldoInicial);
        if (titular1 instanceof PessoaFisica && titular2 instanceof PessoaFisica) {
            titulares.add(titular1);
            titulares.add(titular2);
        } else {
            System.out.println("Contas conjuntas devem ter no máximo 2 pessoas físicas com algum vínculo ou união civil.");
        }
    }

    @Override
    public void depositar(double valor) {
        if (titulares.contains(getDono())) {
            registrarTransacao("Depósito de R$" + valor);
            saldo += valor;
        } else {
            registrarTransacao("Tentativa de depósito de R$" + valor + " (Apenas titulares podem fazer depósitos)");
        }
    }

    @Override
    public boolean pagar(double valor) {
        if (titulares.contains(getDono())) {
            registrarTransacao("Tentativa de pagamento de R$" + valor + " (Contas conjuntas não suportam pagamentos)");
            return false;
        } else {
            registrarTransacao("Tentativa de pagamento de R$" + valor + " (Apenas titulares podem fazer pagamentos)");
            return false;
        }
    }

    @Override
    public TipoConta getTipoConta() {
        return TipoConta.CONJUNTA;
    }

    public List<Pessoa> getTitulares() {
        return titulares;
    }
}
