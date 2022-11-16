package duvidas.strategy;

public class MatadorDeDragoes {

    private MatadorDragoesStrategy strategy;

    public MatadorDeDragoes(MatadorDragoesStrategy strategy) {
        this.strategy = strategy;
    }

    public void trocarEstrategia(MatadorDragoesStrategy strategy) {
        this.strategy = strategy;
    }

    public void lutar() {
        strategy.executar();
    }
}
