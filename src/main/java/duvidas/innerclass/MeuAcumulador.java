package duvidas.innerclass;



interface MinhaInter {
    void fazAlgo();
}

class OutClass {
    class MinhaClas implements MinhaInter {

        @Override
        public void fazAlgo() {

        }
    }

}



public class MeuAcumulador {

    private MeuAcumulador() {
    }

    private static MeuAcumulador INSTANCE;

    public static MeuAcumulador getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MeuAcumulador();
        }
        return INSTANCE;
    }

    private static int valor = 10;

    public void acumula() {
        valor++;
    }

    public int getValor() {
        return valor;
    }

}
