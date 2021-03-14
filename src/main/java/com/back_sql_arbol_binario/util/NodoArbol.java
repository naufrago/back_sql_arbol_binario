package com.back_sql_arbol_binario.util;

import com.back_sql_arbol_binario.model.tcus_clientes;

public class NodoArbol {
	tcus_clientes nodo;
	NodoArbol izq, der;
	
	// constructor
	public NodoArbol(tcus_clientes cliente){
		this.nodo = cliente;
		this.izq = null;
		this.der= null;
	}

	// get y set
	public tcus_clientes getNodo() {
		return nodo;
	}

	public void setNodo(tcus_clientes nodo) {
		this.nodo = nodo;
	}

	public NodoArbol getIzq() {
		return izq;
	}

	public void setIzq(NodoArbol izq) {
		this.izq = izq;
	}

	public NodoArbol getDer() {
		return der;
	}

	public void setDer(NodoArbol der) {
		this.der = der;
	}
	
	
	
}
