package models;

public class compradorHandler extends absHandler {
    @Override
    public void handleRequest(double valor) {
        if(this.canHandle(valor)) {
            System.out.println("Comprador pode comprar o produto de valor: " + valor);
        } else if (this.nextHandler != null) {
            this.nextHandler.handleRequest(valor);
        } else {
            System.out.println("Ninguém pode comprar o produto de valor: " + valor);
        }
}

    protected boolean canHandle(double valor) {
        return valor < 1000; 
    }
}
