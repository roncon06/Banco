import org.example.ContaSalario;
import org.example.PessoaFisica;
import org.example.enu.TipoConta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class ContaSalarioTest {

    @Test
    public void contaSalarioTest() {
        PessoaFisica pessoa = new PessoaFisica("Luzia", "987.654.321-00");
        ContaSalario conta = new ContaSalario(pessoa, "CS455");

        assertEquals(TipoConta.SALARIO, conta.getTipoConta());

        conta.depositar(5000.00);
        assertEquals(5000.00, conta.getSaldo(), 0.01);

        boolean pagamento = conta.pagar(50.00);
        assertFalse(pagamento);

        conta.financiamento(1000.00);
        assertEquals(6000.00, conta.getSaldo(), 0.01);
    }
}

