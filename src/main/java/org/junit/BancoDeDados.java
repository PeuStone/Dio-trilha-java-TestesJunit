package org.junit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        // fez algo
        LOGGER.info("iniciou conexao");
    }

    public static void finalizarConexao() {
        //fez algo
        LOGGER.info("finalizou conexao");
    }

    public static void insereDados(Pessoa pessoa) {
        //insere pessoas no DB
        LOGGER.info("inseriu dados");
    }

    public static void removeDados(Pessoa pessoa) {
        //remove pessoas no DB
        LOGGER.info("removeu dados");
    }
}
