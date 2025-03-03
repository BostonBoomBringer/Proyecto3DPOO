package uniandes.dpoo.aerolinea.modelo.tarifas;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Aeropuerto;


public abstract class CalculadoraTarifas {
	public static final double impuesto = 0.28;
	
	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		int costoBase = calcularCostoBase(vuelo, cliente);
		int valorImpuestos = calcularValorImpuestos(costoBase);
		double descuento = calcularPorcentajeDescuento(cliente);
		return (int) ((costoBase + valorImpuestos)*(1 - descuento));
		
	}
	protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);
	protected abstract double calcularPorcentajeDescuento(Cliente cliente);
	
	protected int calcularDistanciaVuelo(Ruta ruta) {
		return Aeropuerto.calcularDistancia(ruta.getOrigen(), ruta.getDestino());
	}
	protected int calcularValorImpuestos(int costoBase) {
		return (int) (costoBase * impuesto);
	}
}
