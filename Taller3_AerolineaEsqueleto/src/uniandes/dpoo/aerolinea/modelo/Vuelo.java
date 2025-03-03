package uniandes.dpoo.aerolinea.modelo;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Vuelo {
	private String fecha;
	private Ruta ruta;
	private Avion avion;
	private Map<String, Tiquete> tiquetes;
	
	public Vuelo(Ruta ruta, String fecha, Avion avion) {
		this.ruta = ruta;
		this.fecha = fecha;
		this.avion = avion;
		this.tiquetes = new HashMap<>();
	}

	public String getFecha() {
		return fecha;
	}

	public Ruta getRuta() {
		return ruta;
	}

	public Avion getAvion() {
		return avion;
	}

	public Collection<Tiquete> getTiquetes() {
		return tiquetes.values();
	}
	
	public void venderTiquete(String codigoTiquete, Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
}}
