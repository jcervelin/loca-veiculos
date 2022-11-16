package duvidas.decorator;

public class TrollJunior implements Troll {
    @Override
    public void atacar() {
        System.out.println("O Troll junior atacou com as maos");
    }

    @Override
    public int poderDeAtaque() {
        return 10;
    }

    @Override
    public void fugir() {
        System.out.println("O Troll fugiu");
    }
}
