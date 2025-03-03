package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteNatural;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas {
	private static final int costo_km_natu = 600;
	private static final int costo_km_corpo = 900;
	private static final double desc_peq = 0.02;
	private static final double desc_med = 0.1;
	private static final double desc_gran = 0.2;

	@Override
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		int distancia = calcularDistanciaVuelo(vuelo.getRuta());
		if (cliente instanceof ClienteCorporativo) {
			return distancia * costo_km_corpo; }
		else {
			return distancia * costo_km_natu;
		}
	}
	
	@Override
	protected double calcularPorcentajeDescuento(Cliente cliente) {
		if (cliente instanceof ClienteCorporativo) {
			ClienteCorporativo corporativo = (ClienteCorporativo) cliente;
			int tamano = corporativo.getTamanoEmpresa();
			if (tamano < 10) {
				return desc_peq;}
			else if  (tamano <= 50){
				return desc_med;
			}
			else {
				return desc_gran;
			}
		// TODO Auto-generated method stub
		return 0.0;
	}

}
