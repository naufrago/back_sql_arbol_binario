package com.back_sql_arbol_binario.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.back_sql_arbol_binario.model.tcus_clientes;

public interface tcus_clientesDAO extends JpaRepository<tcus_clientes, Integer>{
	
	@Query("SELECT tc from tcus_clientes tc order by tc.cus_dsnombres")
    List<tcus_clientes> findAllclient();
}
