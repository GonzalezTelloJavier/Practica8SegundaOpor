package excepcion.ito.poo;

@SuppressWarnings("serial")
public class CuentaExistente extends Exception {

	public CuentaExistente(String message) {
		super(message);
	}

}