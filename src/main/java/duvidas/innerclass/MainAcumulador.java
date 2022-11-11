package duvidas.innerclass;

public class MainAcumulador {

    public static void main(String[] args) {

        MeuAcumulador acc1 = MeuAcumulador.getInstance();

        System.out.println(acc1.getValor());

        MeuAcumulador acc2 = MeuAcumulador.getInstance();
        System.out.println(acc2.getValor());

        acc1.acumula();

        System.out.println(acc1.getValor());
        System.out.println(acc2.getValor());

    }
}
