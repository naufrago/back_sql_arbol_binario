package com.back_sql_arbol_binario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



import com.back_sql_arbol_binario.dao.tcus_clientesDAO;
import com.back_sql_arbol_binario.model.tcus_clientes;
import com.back_sql_arbol_binario.rest.tcus_clientesRest;
import com.back_sql_arbol_binario.util.*;








@SpringBootApplication
public class BackSqlArbolBinarioApplication {
	
		class Nodo {
	      //int info;
		  objeto info;
	      Nodo izq, der;
	    }
		
		// cuerpo del objeto
		static public class objeto {
			int id, edad;
			String nombre, apellido;
			
		}
		
		
		// variable que tendra el estado del arbol
	    static public Nodo raiz;

	    //constructor
	    public BackSqlArbolBinarioApplication() {
	        raiz=null;
	    }
	    
	    // inserta el objeto en el arbol
	    public void insertar (objeto info){
	        Nodo nuevo;
	        nuevo = new Nodo ();
	        nuevo.info = info;
	        nuevo.izq = null;
	        nuevo.der = null;
	        if (raiz == null) {
	            raiz = nuevo;
	        } else {
	            Nodo anterior = null, reco;
	            reco = raiz; //100,null,null
	            while (reco != null) {
	                anterior = reco; //100,null,nul
	                if (info.id < reco.info.id)//50<100
	                    reco = reco.izq;//null
	                else
	                    reco = reco.der;
	            }
	            if (info.id < anterior.info.id)//50<100
	                anterior.izq = nuevo; //100,50,null
	            else
	                anterior.der = nuevo;
	        }
	    }
	    
	    private void imprimirEntre (Nodo reco) {
	        if (reco != null){    
	            imprimirEntre (reco.izq);
	            System.out.println("{id:"+reco.info.id + ", nombre:"+reco.info.nombre +" "+reco.info.apellido+", edad:"+reco.info.edad+"}");
	            imprimirEntre (reco.der);
	        }
	    }
	    
	    public void imprimirEntre () {
	        imprimirEntre (raiz);
	        System.out.println();
	    }
	
	    @Autowired
		public static tcus_clientesDAO clientesDAO;
	    
	    
	    public static DriverManagerDataSource conectar(){
	        DriverManagerDataSource dm=new DriverManagerDataSource();
	        dm.setDriverClassName("com.mysql.cj.jdbc.Driver");
	        dm.setUrl("jdbc:mysql://localhost/softcaribbeans");
	        dm.setUsername("root");
	        dm.setPassword("");
	        return dm;
	    }
	    
	    private static JdbcTemplate template;
	    
	public static void main(String[] args) throws ParseException {
		
		
		SpringApplication.run(BackSqlArbolBinarioApplication.class, args);
		BackSqlArbolBinarioApplication abo = new BackSqlArbolBinarioApplication ();
		System.out.println ("aca es el main");
		
		
		// trae los datos de los clientes
		String sql = "SELECT tc.* from tcus_clientes tc order by tc.cus_dsnombres";
		template=new JdbcTemplate(abo.conectar()); 

        List<Map<String, Object>> rows = template.queryForList(sql);
        ArbolBinario obj = new ArbolBinario();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        // recorre la lista de clientes 
        for (Map row : rows) {
        	tcus_clientes c= new tcus_clientes();
        	c.setNmid((int)row.get("nmid"));
        	c.setCus_nmcliente((int) row.get("cus_nmcliente"));
        	c.setCus_dsnombres((String) row.get("cus_dsnombres"));
        	c.setCus_dsapellidos((String) row.get("cus_dsapellidos"));
        	c.setCus_dsdireccion((String) row.get("cus_dsdireccion"));
        	c.setCus_dscorreo((String) row.get("cus_dscorreo"));
        	c.setCus_cdtelefono((String) row.get("cus_cdtelefono"));
        	c.setCus_cdtelefonoalter((String) row.get("cus_cdtelefonoalter"));
        	c.setCus_cdcelular((String) row.get("cus_cdcelular"));
        	c.setCus_nmcargo((int) row.get("cus_nmcargo"));
        	c.setCus_dscargo((String) row.get("cus_dscargo"));
        	c.setCus_nmciudad((int) row.get("cus_nmciudad"));
        	c.setCus_dsciudad((String) row.get("cus_dsciudad"));
    		//c.setCus_fenacimiento((Calendar)row.get("cus_fenacimiento"));
    		c.setCus_genero((String) row.get("cus_genero"));
    		c.setCus_nmcomunidad((int) row.get("cus_nmcomunidad"));
    		c.setCus_dscomunidad((String) row.get("cus_dscomunidad"));
    		c.setCus_dsempresalabora((String) row.get("cus_dsempresalabora"));
    		c.setCus_nmdivision((int) row.get("cus_nmdivision"));
    		c.setCus_dsdivision((String) row.get("cus_dsdivision"));
    		c.setCus_nmpais((int) row.get("cus_nmpais"));
    		c.setCus_dspais((String) row.get("cus_dspais"));
    		c.setCus_hobbies((String) row.get("cus_hobbies"));
    		//c.setCus_febaja((Calendar) row.get("cus_febaja"));
    		//c.setCus_feregistro((String) row.get("cus_feregistro"));
    		System.out.println ( row);
        	obj.insertar(c);
        	
        }
		
        System.out.println ("Impresion entreorden: ");
        obj.imprimirEntre();
        
        System.out.println ("Impresion postorden: ");
        obj.imprimirPost ();
        
        System.out.println ("Impresion preorden: ");
        obj.imprimirPre ();

		
		
		
        
		
		
		
		
	}

}
