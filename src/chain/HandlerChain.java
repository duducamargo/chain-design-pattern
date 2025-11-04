package chain;

import models.absHandler;
import models.compradorHandler;
import models.gerenteHandler;
import models.diretorHandler;

public class HandlerChain {

    private absHandler chain;

    public HandlerChain() {
        absHandler comprador = new compradorHandler();
        absHandler gerente = new gerenteHandler();
        absHandler diretor = new diretorHandler();

        comprador.setNextHandler(gerente);
        gerente.setNextHandler(diretor);

        this.chain = comprador;
    }

    public void processRequest(double valor) {
        chain.handleRequest(valor);
    }
}
