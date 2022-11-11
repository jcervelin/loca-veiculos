package duvidas.innerclass;

import static java.lang.System.*;

public class MainSuperIterator {

    public static void meuMetodoEstatico() {
        MainSuperIterator.meuMetodoEstatico();
    }

    public void metodoNaoEstatico() {

        MainSuperIterator msi = new MainSuperIterator();
        msi.meuMetodoEstatico();
        this.meuMetodoEstatico();
    }


    public static void main(String[] args) {


        MainSuperIterator msi = new MainSuperIterator();
        msi.metodoNaoEstatico();


        SuperIterador superIterador = new SuperIterador();

        SuperIterador.No no1 = superIterador.new No("1");
        SuperIterador.No no2 = superIterador.new No("2");


        out.println("Hello Workd");

    }
}
