package repositorio;

import java.util.Collection;
import java.util.List;

public interface BaseDao<E, K> {

    void salvar(E element);
    Collection<E> listar();
    E buscarPorId(K id);
}
