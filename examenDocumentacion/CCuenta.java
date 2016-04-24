package src.examenDocumentacion;

/**
 * Objeto o clase CCuenta. En la que se realizar�n las siguientes actividades:
 * <ol>
 * <li>CCuenta.java: Cambia el nombre del m�todo "estado" por "getSaldo"</li>
 * <li>CCuenta.java: Encapsula los campos y usa los m�todos generados.</li>
 * </ol>
 * 
 * @author Isabel Mar�a G�mez Palomeque
 * @version 1.0
 */
public class CCuenta {
	/**
	 * Campo del objeto CCuenta que indica el nombre del titular de la cuenta.
	 */
	private String nombre;
	/**
	 * Campo del objeto CCuenta que indica el n�mero de cuenta.
	 */
	private String cuenta;
	/**
	 * Campo del objeto CCuenta que indica el saldo de la cuenta.
	 */
	private double saldo;
	/**
	 * Campo del objeto CCuenta que indica la retribuci�n aplicada a la cuenta.
	 */
	private double tipoInteres;

	/**
	 * Devuelve el tipo de inter�s o retribuci�n aplicada a la cuenta.
	 * 
	 * @return tipoInteres, retribuci�n aplicada a la cuenta.
	 */
	double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Asigna el tipo de inter�s o retribuci�n aplicada a la cuenta.
	 * 
	 * @param tipoInteres
	 *            retribuci�n aplicada a la cuenta.
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	/**
	 * Constructor del objeto CCuenta.
	 * 
	 * @param nom,
	 *            nombre del titular de la cuenta.
	 * @param cue,
	 *            cuenta del titular de la cuenta.
	 * @param sal.
	 *            saldo del titular de la cuenta.
	 * @param tipo,
	 *            inter�s de la cuenta.
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
		setTipoInteres(tipo);
	}

	/**
	 * Devuelve el nombre del titular de la cuenta.
	 * 
	 * @return nombre, titular de la cuenta.
	 */
	String getNombre() {
		return nombre;
	}

	/**
	 * Asigna el nombre del titular de la cuenta.
	 * 
	 * @param nombre,
	 *            titular de la cuenta.
	 */
	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el saldo del titular de la cuenta.
	 * 
	 * @return saldo, saldo del titular de la cuenta.
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * M�todo que permite ingresar una cantidad pasada por par�metro y devuelve
	 * una excepci�n en caso de que la cantidad fuese negativa
	 * 
	 * @param cantidad,
	 *            cantidad que se va a ingresar en la cuenta.
	 * @throws Exception,
	 *             Excepci�n usada en caso de que insertemos una cantidad
	 *             negativa.
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		setSaldo(saldo + cantidad);
	}

	/**
	 * M�todo que permite retirar una cantidad pasada por par�metro y devuelve
	 * una excepci�n en caso de que la cantidad fuese negativa.
	 * 
	 * @param cantidad,
	 *            cantidad que se va a retirar en la cuenta.
	 * @throws Exception,
	 *             Excepci�n usada en caso de que insertemos una cantidad
	 *             negativa.
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (getSaldo() < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		setSaldo(saldo - cantidad);
	}

	/**
	 * Asigna el valor saldo a su campo.
	 * 
	 * @param saldo,
	 *            cantidad de dinero en la cuenta.
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Devuelve la variable o campo cuenta.
	 * 
	 * @return cuenta, devuelve el nombre de la cuenta.
	 */
	String getCuenta() {
		return cuenta;
	}

	/**
	 * Asigna un nombre a la cuenta.
	 * 
	 * @param cuenta,
	 *            nombre que se le asignar� a la cuenta.
	 */
	void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
}
