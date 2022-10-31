import model.Barco;
import model.Bicicleta;
import model.Carro;
import model.Veiculo;
import validator.ValidaAnoVeiculo;
import validator.ValidaMarca;
import validator.ValidaModelo;
import validator.ValidaVeiculo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Veiculo fusca = new Carro("Volks","Fusca",1961,4);
        Veiculo brazilia = new Carro("Fiat","",1966,4);
        Veiculo titanic = new Barco("Titanic", "Afundator", 2022, 3175);
        Veiculo bike = new Bicicleta("Caloi", "GTS", 2015,1);

        final List<Veiculo> veiculos = List.of(fusca, brazilia, titanic, bike);

        ValidaVeiculo validaVeiculo = new ValidaVeiculo(List.of(
                new ValidaMarca(),
                new ValidaAnoVeiculo(),
                new ValidaModelo()));


        for (Veiculo veiculo : veiculos) {
            validaVeiculo.validar(veiculo);
        }

        final Comparator<Carro> carroComparator = Comparator.comparing(Carro::getMarca)
                .thenComparing((o1, o2) -> o2.getMarca().compareTo(o1.getMarca()));


    }


}
