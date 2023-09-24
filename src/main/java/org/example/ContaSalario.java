package org.example;

import org.example.enu.TipoConta;

public class ContaSalario extends  ContaBancaria{

    public ContaSalario(PessoaFisica dono, String numeroConta) {
        super(dono, numeroConta, 0);
    }

    @Override
    public TipoConta getTipoConta() {
        return TipoConta.SALARIO;
    }

    @Override
    public void depositar(double valor) {
        registrarTransacao("Depósito de R$" + valor);
        saldo += valor;
    }

    @Override
    public boolean pagar(double valor) {
        registrarTransacao("Tentativa de pagamento de R$" + valor + " (Contas salário não suportam pagamentos)");
        return false;
    }
    }
