package uniandes.dpoo.aerolinea.modelo.cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
public class ClienteNatural {
	   public static final String NATURAL = "Natural";

	    private String nombre;

	    public ClienteNatural(String clienteID, String nombre) {
	        super();
	        this.nombre = nombre;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getTipoCliente() {
	        return NATURAL;
	    }

	    @Override
	    public String toString() {
	        return "ClienteNatural{" +
	                "clienteID='" + getClienteID() + '\'' +
	                ", nombre='" + nombre + '\'' +
	                ", tipoCliente='" + getTipoCliente() + '\'' +
	                '}';
	    }

		private String getClienteID() {
			// TODO Auto-generated method stub
			return getClienteID();
		}
	}

