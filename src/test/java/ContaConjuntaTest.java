import org.example.ContaConjunto;
import org.example.PessoaFisica;
import org.example.enu.TipoConta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ContaConjuntaTest {

    @Test
    public void testContaConjunta() {
        PessoaFisica pessoa1 = new PessoaFisica("Leon", "123.456.789-47");
        PessoaFisica pessoa2 = new PessoaFisica("Maria", "987.654.321-14");

        ContaConjunto conta = new ContaConjunto(pessoa1, pessoa2, "CJ001", 0.00);

        assertEquals(TipoConta.CONJUNTA, conta.getTipoConta());

        conta.depositar(500.00);
        assertEquals(500.00, conta.getSaldo(), 0.01);

        boolean pagamento = conta.pagar(200.00);
        assertFalse(pagamento);

        conta.financiamento(300.00);
        assertEquals(800.00, conta.getSaldo(), 0.01);
    }

}
