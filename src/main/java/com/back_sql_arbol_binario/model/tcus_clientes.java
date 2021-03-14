package com.back_sql_arbol_binario.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class tcus_clientes {
	// campos en la tabla
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer nmid;
	
	@Column(nullable = false, length = 120)
	private int cus_nmcliente;
	
	@Column(nullable = false, length = 120)
	private String cus_dsnombres;
	
	@Column(nullable = false, length = 120)
	private String cus_dsapellidos;
	
	@Column(nullable = false, length = 120)
	private String cus_dsdireccion;
	
	@Column(nullable = false, length = 120)
	private String cus_dscorreo;
	
	@Column(nullable = false, length = 20)
	private String cus_cdtelefono;
	
	@Column(nullable = false, length = 20)
	private String cus_cdtelefonoalter;
	
	@Column(nullable = false, length = 20)
	private String cus_cdcelular;
	
	@Column(nullable = false)
	private int cus_nmcargo;
	
	@Column(nullable = false, length = 120)
	private String cus_dscargo;
	
	@Column(nullable = false)
	private int cus_nmciudad;
	
	@Column(nullable = false, length = 60)
	private String cus_dsciudad;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Calendar cus_fenacimiento;
		
	@Column(nullable = false, length = 1)
	private String cus_genero;
	
	@Column(nullable = false)
	private int cus_nmcomunidad;
	
	@Column(nullable = false, length = 120)
	private String cus_dscomunidad;
	
	@Column(nullable = false, length = 200)
	private String cus_dsempresalabora;
	
	@Column(nullable = false)
	private int cus_nmdivision;
	
	@Column(nullable = false, length = 120)
	private String cus_dsdivision;
	
	@Column(nullable = false)
	private int cus_nmpais;
	
	@Column(nullable = false, length = 120)
	private String cus_dspais;		
	
	@Column(nullable = false, columnDefinition = "text")
	private String  cus_hobbies;	
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
    private Calendar cus_febaja;
	
	@Column (columnDefinition = "timestamp")	
    private String cus_feregistro;

	
	// get y set
	
	public Integer getNmid() {
		return nmid;
	}

	public void setNmid(Integer nmid) {
		this.nmid = nmid;
	}

	public int getCus_nmcliente() {
		return cus_nmcliente;
	}

	public void setCus_nmcliente(int cus_nmcliente) {
		this.cus_nmcliente = cus_nmcliente;
	}

	public String getCus_dsnombres() {
		return cus_dsnombres;
	}

	public void setCus_dsnombres(String cus_dsnombres) {
		this.cus_dsnombres = cus_dsnombres;
	}

	public String getCus_dsapellidos() {
		return cus_dsapellidos;
	}

	public void setCus_dsapellidos(String cus_dsapellidos) {
		this.cus_dsapellidos = cus_dsapellidos;
	}

	public String getCus_dsdireccion() {
		return cus_dsdireccion;
	}

	public void setCus_dsdireccion(String cus_dsdireccion) {
		this.cus_dsdireccion = cus_dsdireccion;
	}

	public String getCus_dscorreo() {
		return cus_dscorreo;
	}

	public void setCus_dscorreo(String cus_dscorreo) {
		this.cus_dscorreo = cus_dscorreo;
	}

	public String getCus_cdtelefono() {
		return cus_cdtelefono;
	}

	public void setCus_cdtelefono(String cus_cdtelefono) {
		this.cus_cdtelefono = cus_cdtelefono;
	}

	public String getCus_cdtelefonoalter() {
		return cus_cdtelefonoalter;
	}

	public void setCus_cdtelefonoalter(String cus_cdtelefonoalter) {
		this.cus_cdtelefonoalter = cus_cdtelefonoalter;
	}

	public String getCus_cdcelular() {
		return cus_cdcelular;
	}

	public void setCus_cdcelular(String cus_cdcelular) {
		this.cus_cdcelular = cus_cdcelular;
	}

	public int getCus_nmcargo() {
		return cus_nmcargo;
	}

	public void setCus_nmcargo(int cus_nmcargo) {
		this.cus_nmcargo = cus_nmcargo;
	}

	public String getCus_dscargo() {
		return cus_dscargo;
	}

	public void setCus_dscargo(String cus_dscargo) {
		this.cus_dscargo = cus_dscargo;
	}

	public int getCus_nmciudad() {
		return cus_nmciudad;
	}

	public void setCus_nmciudad(int cus_nmciudad) {
		this.cus_nmciudad = cus_nmciudad;
	}

	public String getCus_dsciudad() {
		return cus_dsciudad;
	}

	public void setCus_dsciudad(String cus_dsciudad) {
		this.cus_dsciudad = cus_dsciudad;
	}

	public Calendar getCus_fenacimiento() {
		return cus_fenacimiento;
	}

	public void setCus_fenacimiento(Calendar cus_fenacimiento) {
		this.cus_fenacimiento = cus_fenacimiento;
	}

	public String getCus_genero() {
		return cus_genero;
	}

	public void setCus_genero(String cus_genero) {
		this.cus_genero = cus_genero;
	}

	public int getCus_nmcomunidad() {
		return cus_nmcomunidad;
	}

	public void setCus_nmcomunidad(int cus_nmcomunidad) {
		this.cus_nmcomunidad = cus_nmcomunidad;
	}

	public String getCus_dscomunidad() {
		return cus_dscomunidad;
	}

	public void setCus_dscomunidad(String cus_dscomunidad) {
		this.cus_dscomunidad = cus_dscomunidad;
	}

	public String getCus_dsempresalabora() {
		return cus_dsempresalabora;
	}

	public void setCus_dsempresalabora(String cus_dsempresalabora) {
		this.cus_dsempresalabora = cus_dsempresalabora;
	}

	public int getCus_nmdivision() {
		return cus_nmdivision;
	}

	public void setCus_nmdivision(int cus_nmdivision) {
		this.cus_nmdivision = cus_nmdivision;
	}

	public String getCus_dsdivision() {
		return cus_dsdivision;
	}

	public void setCus_dsdivision(String cus_dsdivision) {
		this.cus_dsdivision = cus_dsdivision;
	}

	public int getCus_nmpais() {
		return cus_nmpais;
	}

	public void setCus_nmpais(int cus_nmpais) {
		this.cus_nmpais = cus_nmpais;
	}

	public String getCus_dspais() {
		return cus_dspais;
	}

	public void setCus_dspais(String cus_dspais) {
		this.cus_dspais = cus_dspais;
	}

	public String getCus_hobbies() {
		return cus_hobbies;
	}

	public void setCus_hobbies(String cus_hobbies) {
		this.cus_hobbies = cus_hobbies;
	}

	public Calendar getCus_febaja() {
		return cus_febaja;
	}

	public void setCus_febaja(Calendar cus_febaja) {
		this.cus_febaja = cus_febaja;
	}

	public String getCus_feregistro() {
		return cus_feregistro;
	}

	public void setCus_feregistro(String cus_feregistro) {
		this.cus_feregistro = cus_feregistro;
	}

	
	
	
	
}
