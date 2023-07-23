package com.listmaster.listMaster.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.listmaster.listMaster.model.ListaDeCompras;

public interface ListaDeComprasRepository extends JpaRepository<ListaDeCompras, Long> {
	List<ListaDeCompras> findAllByNomeListaContainingIgnoreCase(@Param("nomeLista") String nomeLista);

}
