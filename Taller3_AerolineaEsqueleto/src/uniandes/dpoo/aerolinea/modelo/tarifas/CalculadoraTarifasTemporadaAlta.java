package uniandes.dpoo.aerolinea.modelo.tarifas;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas{
	private static final int costo_por_KM = 1000;
	
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		int distancia = calcularDistanciaVuelo(vuelo.getRuta());
		return distancia * costo_por_KM;
	}
	@Override
	protected double calcularPorcentajeDescuento(Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
	}
}
