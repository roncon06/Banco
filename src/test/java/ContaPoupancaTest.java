import org.example.ContaBancaria;
import org.example.ContaPoupanca;
import org.example.PessoaFisica;
import org.example.enu.TipoConta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SistemaBancarioTest {

    @Test
     public void contaPoupancaTeste(){

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

}
