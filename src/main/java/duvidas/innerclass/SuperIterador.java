package duvidas.innerclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


interface MinhaInterface {

    default void fazAlgo() {
        System.out.println("Mamae eu quero");
        List list = new ArrayList<>();
    }
}





public class SuperIterador {

    private No head;

    class IteradorInfinito implements Iterator<String> {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public String next() {

            class ClasseDentroDoMetodo implements MinhaInterface {


                @Override
                public void fazAlgo() {
                    System.out.println("Fiz algo");
                }
            }

            ClasseDentroDoMetodo dentro = new ClasseDentroDoMetodo();
            dentro.fazAlgo();

            return "";
        }
    }

    class No {

        public No(String valor) {
            this.valor = valor;
        }

        String valor;
        No next;
    }

   public void add(String valor) {
        if (head == null) {
            head = new No(valor);
        }


   }

}
