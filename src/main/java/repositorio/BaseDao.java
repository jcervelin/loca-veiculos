package repositorio;

import java.util.Collection;

public interface BaseDao<E, K> {

    void salvar(E element);
    Collection<E> listar();
    E buscarPorId(K id);
}
