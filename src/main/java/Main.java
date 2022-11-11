import model.*;
import validator.ValidaAnoVeiculo;
import validator.ValidaMarca;
import validator.ValidaModelo;
import validator.ValidaVeiculo;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Veiculo fusca = new Carro("Volks","Fusca",1961,4);
        Veiculo brazilia = new Carro("Fiat","",1966,4);
        Veiculo titanic = new Barco("Titanic", "Afundator", 2022, 3175);
        Bicicleta bike = new Bicicleta("Caloi", "GTS", 2015,1);

        final List<Veiculo> veiculos = List.of(fusca, brazilia, titanic, bike);

        ValidaVeiculo validaVeiculo = new ValidaVeiculo(List.of(
                new ValidaMarca(),
                new ValidaAnoVeiculo(),
                new ValidaModelo()));

        validaVeiculo.validar(veiculos);
    }

}
