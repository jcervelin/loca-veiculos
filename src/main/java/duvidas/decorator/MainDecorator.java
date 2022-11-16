package duvidas.decorator;

public class MainDecorator {

    public static void main(String[] args) {
        System.out.println("O troll junior se aproxima...");
        var trollJunior = new TrollJunior();
        trollJunior.atacar();
        trollJunior.fugir();
        System.out.println("O troll junior tem " +
                trollJunior.poderDeAtaque() + " de poder de ataque");


        TrollPleno trollPleno = new TrollPleno(trollJunior);

        System.out.println("O Troll pleno, com um porrete se prepara para atacar");
        trollPleno.atacar();
        trollPleno.fugir();

        System.out.println("O Troll pleno tem " + trollPleno.poderDeAtaque() + " de poder de ataque");

        System.out.println();
        System.out.println("O troll quase senior se aproxima");

        TrollPleno trollPlenoQuaseSenior = new TrollPleno(trollPleno);
        trollPlenoQuaseSenior.atacar();
        trollPlenoQuaseSenior.fugir();

        System.out.println("O Troll pleno quase senior tem " + trollPlenoQuaseSenior.poderDeAtaque() + " de poder de ataque");

    }
}
