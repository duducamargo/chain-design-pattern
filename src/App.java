import chain.HandlerChain;
import models.absHandler;

public class App {
    public static void main(String[] args) throws Exception {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.processRequest(500);
    }
}
