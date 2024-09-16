package org.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTeste {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa luan = new Pessoa("Luan", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertEquals(24, luan.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa julin = new Pessoa("Julin", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertTrue(julin.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }

}
