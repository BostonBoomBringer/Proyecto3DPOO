package uniandes.dpoo.aerolinea.modelo.cliente;
import java.util.ArrayList;
import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	 protected String clienteID;
	    protected String tipoCliente;
	    protected List<Tiquete> tiquetes;

	    public String getClienteID() {
			return clienteID;
		}

		public String getTipoCliente() {
			return tipoCliente;
		}

		public int calcularTotalTiquetes() {
			return tiquetes.size();
		}
	    public void usarTiquetesVuelo(Vuelo vuelo) {
	        tiquetes.removeIf(tiquete -> tiquete.getVuelo().equals(vuelo));
	    }

		public Cliente(String clienteID, String tipoCliente) {
	        this.clienteID = clienteID;
	        this.tipoCliente = tipoCliente;
	        this.tiquetes = new ArrayList<>();
	    }

}
