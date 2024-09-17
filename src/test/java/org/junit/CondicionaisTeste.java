package org.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    @DisabledIfEnvironmentVariable(named = "USER", matches = "pedro")
    void validarAlgoSomenteNoUsuarioPedro() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
