package org.example;

import org.example.enu.TipoConta;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(Pessoa dono, String numeroConta) {
        super(dono, numeroConta, 0);
    }

    @Override
    public TipoConta getTipoConta() {
        return TipoConta.CORRENTE;
    }

    @Override
    public void depositar(double valor) {
        registrarTransacao("Depósito de R$" + valor);
        saldo += valor;
    }

    @Override
    public boolean pagar(double valor) {
        registrarTransacao("Tentativa de pagamento de R$" + valor + " (Contas corrente não suportam pagamentos)");
        return false;
    }
}
