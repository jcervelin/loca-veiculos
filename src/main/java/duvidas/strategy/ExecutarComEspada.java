package duvidas.strategy;

public class ExecutarComEspada implements MatadorDragoesStrategy {
    @Override
    public void executar() {
        System.out.println("Executou o dragao com Espada");
    }
}
