package com.algaworks.algafood.domain.repository;

import java.util.List;

public interface Repository<T> {

    List<T> listar();

    T buscar(Long id);

    T salvar(T T);

    void remover(Long id);
}
