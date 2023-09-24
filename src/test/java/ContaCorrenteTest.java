import org.example.*;
import org.example.enu.TipoConta;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ContaCorrenteTest {

    @Test
    public void criarContaCorrentePeossaFisicaTest() {

        PessoaFisica pessoa3 = new PessoaFisica("Romulo", "132-766-029-26");
        ContaCorrente corrente = new ContaCorrente(pessoa3, "CX001");

        assertEquals(TipoConta.CORRENTE, corrente.getTipoConta());
    }

    @Test
    public void criarContaPoupancaPessoaJuridicaTeste(){

        PessoaJuridica pessoaj1 = new PessoaJuridica("EMPRESA ANB", "01.122.523/0001-73");
        ContaCorrente corrente= new ContaCorrente(pessoaj1,"CX001");

        assertEquals(TipoConta.CORRENTE, corrente.getTipoConta());

    }

    @Test
    public void ContaCorrenteTest() {

        PessoaFisica pessoa4 = new PessoaFisica("Romulo", "132-766-029-26");
        ContaCorrente corrente = new ContaCorrente(pessoa4, "CX001");

        corrente.depositar(100);
        assertEquals(100, corrente.getSaldo());

        boolean pagamento = corrente.pagar(500.00);
        assertFalse(pagamento);

        corrente.financiamento(300.00);
        assertEquals(400.00, corrente.getSaldo(), 0.01);
    }



}










