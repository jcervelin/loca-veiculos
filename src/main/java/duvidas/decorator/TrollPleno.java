package duvidas.decorator;

public class TrollPleno implements Troll {

    private final Troll decorado;

    public TrollPleno(Troll decorado) {
        this.decorado = decorado;
    }

    @Override
    public void atacar() {
        decorado.atacar();
        System.out.println("O Troll pleno atacou com um porrete");
    }

    @Override
    public int poderDeAtaque() {
        return decorado.poderDeAtaque() + 5;
    }


    // AOP
    @Override
    public void fugir() {
        decorado.fugir();
    }
}
