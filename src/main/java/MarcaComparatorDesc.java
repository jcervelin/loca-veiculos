import model.Carro;

import java.util.Comparator;

public class MarcaComparatorDesc implements Comparator<Carro> {

    @Override
    public int compare(Carro carro1, Carro carro2) {
        if (carro1.getMarca() == null) {
            return 1;
        }

        if (carro2.getMarca() == null) {
            return -1;
        }
        return carro2.getMarca().compareTo(carro1.getMarca());
    }
}
