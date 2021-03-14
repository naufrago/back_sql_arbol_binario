package com.back_sql_arbol_binario.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.back_sql_arbol_binario.dao.tcus_clientesDAO;
import com.back_sql_arbol_binario.model.tcus_clientes;

@RestController
@RequestMapping("clientes")
public class tcus_clientesRest {
	
	@Autowired
	private tcus_clientesDAO clientesDAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody tcus_clientes cliente){
		clientesDAO.save(cliente);
	}

	@GetMapping("/listar")
	public List<tcus_clientes> listar(){
		//return clientesDAO.findAll();
			
		return clientesDAO.findAllclient();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id){
		clientesDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody tcus_clientes cliente){
		clientesDAO.save(cliente);
	}
	
	
	public List<tcus_clientes> listClientes(){
		return clientesDAO.findAllclient();
	}
	
}
