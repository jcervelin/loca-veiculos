package duvidas.strategy;

public class MainStrategy {

    public static void main(String[] args) {

        MatadorDeDragoes matadorDeDragoes =
                new MatadorDeDragoes(new ExecutarComEspada());
        System.out.println("Primeira estrategia: ");
        matadorDeDragoes.lutar();

        matadorDeDragoes.trocarEstrategia(new ExecutarComArcoFlecha());
        System.out.println("Segunda estrategia: ");
        matadorDeDragoes.lutar();
    }
}
