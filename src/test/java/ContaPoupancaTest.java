import org.example.ContaPoupanca;
import org.example.PessoaFisica;
import org.example.PessoaJuridica;
import org.example.enu.TipoConta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaPoupancaTest {

    @Test
     public void criarContaPoupancaPessoaFisicaTeste(){

         PessoaFisica pessoa1 = new PessoaFisica("Romulo", "132-766-029-26");
         ContaPoupanca poupanca = new ContaPoupanca(pessoa1,"CX001" , 200);

         assertEquals(TipoConta.POUPANCA, poupanca.getTipoConta());

     }



     @Test
    public void contaPoupancaValorMinimoTest(){

         PessoaFisica pessoa2 = new PessoaFisica("Romulo", "132-766-029-26");
         ContaPoupanca poupanca2 = new ContaPoupanca(pessoa2,"CX001" , 45);

         assertEquals(TipoConta.POUPANCA, poupanca2.getTipoConta());
         ;
     }



        @Test
        public void testExtratoContaPoupanca() {
            PessoaFisica pessoa1 = new PessoaFisica("João", "123.456.789-00");
            ContaPoupanca poupanca = new ContaPoupanca(pessoa1, "CP001", 100.00);


            poupanca.depositar(100.00);


            poupanca.aplicacao(50.00);


            String extratoEsperado = "Depósito de R$100.0, Aplicação de R$50.0";

            assertEquals(extratoEsperado, String.join(", ", poupanca.getExtrato()));
        }
    }


