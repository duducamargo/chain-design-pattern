package models;

public class gerenteHandler extends absHandler {
    @Override
    public void handleRequest(double valor) {
        if(this.canHandle(valor)) {
            System.out.println("Gerente pode aprovar o produto de valor: " + valor);
        } else if (this.nextHandler != null) {
            this.nextHandler.handleRequest(valor);
        } else {
            System.out.println("Ninguém pode aprovar o produto de valor: " + valor);
        }
    }

    protected boolean canHandle(double valor) {
        return valor >= 1000 && valor < 50000; 
    }
    
}
