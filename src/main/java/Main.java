import model.*;
import validator.*;

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
                new ValidaModelo()));

        ValidaVeiculo validaVeiculo1 = new ValidaVeiculo(List.of(
                new ValidaNumPassageiros()));

        validaVeiculo.validar(veiculos);


    }

}
