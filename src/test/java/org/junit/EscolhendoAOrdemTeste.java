package org.junit;

import org.junit.jupiter.api.*;
//Valida pelo nome do método, respeitando ordem alfabética
//@TestMethodOrder(MethodOrderer.MethodName.class)

//Aleatoriza a ordem a ser realizados os testes
//@TestMethodOrder(MethodOrderer.Random.class)

//Permite nomear o teste, ordena por ordem alfabética
@TestMethodOrder(MethodOrderer.DisplayName.class)

//Define que a ordem dos testes a ser realizado sera pela anotação
// @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoAOrdemTeste {

    //Define a ordem de execução do teste
    // @Order(4)
    @DisplayName("Teste que valida se o usuario foi criado")
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

    //Define a ordem de execução do teste
    //@Order(3)
    @DisplayName("B")
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

    //Define a ordem de execução do teste
    //@Order(2)
    @DisplayName("C")
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

    //Define a ordem de execução do teste
    //@Order(1)
    @DisplayName("D")
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}
