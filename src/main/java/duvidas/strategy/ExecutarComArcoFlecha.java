package duvidas.strategy;

public class ExecutarComArcoFlecha implements MatadorDragoesStrategy {
    @Override
    public void executar() {
        System.out.println("Executou o dragao com Arco e flecha");
    }
}
