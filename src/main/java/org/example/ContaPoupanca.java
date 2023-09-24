package org.example;

import org.example.enu.TipoConta;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(PessoaFisica dono, String numeroConta, double saldoInicial) {
        super(dono, numeroConta, saldoInicial);
        if (saldoInicial < 50.00) {
            System.out.println("Conta Poupança deve ser aberta com valor mínimo de R$50,00.");
            saldo = 0;
        }
    }

    @Override
    public TipoConta getTipoConta() {
        return TipoConta.POUPANCA;
    }

    @Override
    public void depositar(double valor) {
        registrarTransacao("Depósito de R$" + valor);
        saldo += valor;
    }

    @Override
    public boolean pagar(double valor) {
        registrarTransacao("Tentativa de pagamento de R$" + valor + " (Contas poupança não suportam pagamentos)");
        return false;
    }
}
