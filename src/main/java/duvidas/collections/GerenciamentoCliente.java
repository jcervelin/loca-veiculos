package duvidas.collections;

import model.Cliente;

import java.util.*;

public class GerenciamentoCliente {


    private final Set<Cliente> clientes;

    public GerenciamentoCliente(Cliente... clientesArray) {
        this.clientes = new HashSet<>();
        clientes.addAll(Arrays.asList(clientesArray));
    }

    public void removeCliente(String nome) {
        clientes.remove(nome);
    }

    public void printaClientes() {
        System.out.println(clientes);
    }
}
