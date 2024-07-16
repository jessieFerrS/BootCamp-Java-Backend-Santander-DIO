import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade() {
        Pessoa pessoa1 = new Pessoa("Julia", LocalDate.of(2020, 1, 1));
        Assertions.assertEquals(4,pessoa1.getIdade());
    }

    @Test
    void validarSeEhMaiorDeIdade(){
        Pessoa pessoa2 = new Pessoa("Bia", LocalDate.of(2000,1,1 ));
        Assertions.assertTrue(pessoa2.ehMaiorDeIdade());

        Pessoa pessoa3 = new Pessoa("Caio", LocalDate.of(2022,1,1 ));
        Assertions.assertFalse(pessoa3.ehMaiorDeIdade());
    }
}
