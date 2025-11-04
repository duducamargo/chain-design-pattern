package models;

public abstract class absHandler {
    protected absHandler nextHandler;

    public void setNextHandler(absHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(double valor);

    private boolean canHandle(double valor) {
        return false;
    }
}