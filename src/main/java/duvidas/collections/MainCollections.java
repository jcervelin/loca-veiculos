package duvidas.collections;

import model.Cliente;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainCollections {


    public static void main(String[] args) {

        Cliente c1 = new Cliente("Alexandre", 10_000);
        Cliente c2 = new Cliente("Renan", 50);
        Cliente c3 = new Cliente("Higor", 77);

        GerenciamentoCliente gerenciamentoCliente = new GerenciamentoCliente(c1, c2, c3);

        Map<String, Cliente> map = new HashMap<>();

        map.put(c1.getNome(), c1);
        map.put(c2.getNome(), c2);
        map.put(c3.getNome(), c3);

        Cliente cliente = map.remove("Alexandre");


        Set<Cliente> set = new HashSet<>();

        for (Cliente c :set) {

        }

        Map<String, Cliente> map1 = new HashMap<>();

        for (String str : map1.keySet()) {
            map1.get(str);
        }




    }
}
