package com.back_sql_arbol_binario.util;

import java.util.List;

import com.back_sql_arbol_binario.model.tcus_clientes;







public class ArbolBinario {
	// variable que tendra el estado del arbol
    public static NodoArbol raiz;
    public static  List<tcus_clientes> listClientes;
    
    public ArbolBinario() {
    	this.raiz=null;
    	this.listClientes = null;
    }
    
 // inserta el objeto en el arbol
    public static void insertar (tcus_clientes info){
    	NodoArbol nuevo = new NodoArbol (info);
        if (raiz == null) {
            raiz = nuevo;
        } else {
        	NodoArbol anterior = null, reco;
            reco = raiz;
            while (reco != null) {
                anterior = reco;
                if (info.getNmid() < reco.getNodo().getNmid())
                    reco = reco.getIzq();
                else
                    reco = reco.getDer();
            }
            if (info.getNmid() < anterior.getNodo().getNmid())//50<100
                anterior.setIzq(nuevo); 
            else
                anterior.setDer(nuevo);
        }
    }
    
    public void imprimirEntre () {
        imprimirEntre (raiz);
        System.out.println();
    }
    
    public static void imprimirEntre (NodoArbol reco) {
        if (reco != null){    
            imprimirEntre (reco.getIzq());
            //listClientes.add(reco.getNodo());
            System.out.println("{id:"+reco.getNodo().getNmid()+ ", nombre:"+reco.getNodo().getCus_dsnombres() +" "+reco.getNodo().getCus_dsapellidos()+"}");
            imprimirEntre (reco.getDer());
        }
    }
    
    private void imprimirPost (NodoArbol reco) {
        if (reco != null) {
            imprimirPost (reco.getIzq());
            imprimirPost (reco.getDer());
            System.out.println("{id:"+reco.getNodo().getNmid()+ ", nombre:"+reco.getNodo().getCus_dsnombres() +" "+reco.getNodo().getCus_dsapellidos()+"}");
        }
    }


    public void imprimirPost (){
        imprimirPost (raiz);
        System.out.println();
    }
    
    private void imprimirPre (NodoArbol reco) {
        if (reco != null){
        	System.out.println("{id:"+reco.getNodo().getNmid()+ ", nombre:"+reco.getNodo().getCus_dsnombres() +" "+reco.getNodo().getCus_dsapellidos()+"}");
            imprimirPre (reco.getIzq());
            imprimirPre (reco.getDer());
        }
    }

    public void imprimirPre () {
        imprimirPre (raiz);
        System.out.println();
    }
}
