package uniandes.dpoo.aerolinea.tiquetes;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
    private String codigo;
    private boolean usado;
    private Vuelo vuelo;
    private Cliente clienteComprador;
    private int tarifa;

    public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
        this.codigo = codigo;
        this.vuelo = vuelo;
        this.clienteComprador = clienteComprador;
        this.tarifa = tarifa;
        this.usado = false;
    }

	public Tiquete(Cliente cliente, Vuelo vuelo2) {
		// TODO Auto-generated constructor stub
	}

	public String getCodigo() {
		return codigo;
	}

	public boolean isUsado() {
		return usado;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public Cliente getClienteComprador() {
		return clienteComprador;
	}

	public int getTarifa() {
		return tarifa;
	}
	 public void marcarComoUsado() {
	        this.usado = true;
	    }

	    @Override
	    public String toString() {
	        return "Tiquete{" +
	                "codigo='" + codigo + '\'' +
	                ", vuelo=" + vuelo +
	                ", cliente=" + clienteComprador.getClienteID() +
	                ", tarifa=" + tarifa +
	                ", usado=" + usado +
	                '}';
	    }

}
