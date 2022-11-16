package model;

public class Bicicleta extends Veiculo {


    public Bicicleta(String marca, String modelo, int ano, int numPassageiros) {
        super(marca, modelo, ano, numPassageiros);
    }

    @Override
    void locomover() {
        // pedala, menino
    }
}
