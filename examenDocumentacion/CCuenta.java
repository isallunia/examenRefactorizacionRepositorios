package src.examenDocumentacion;

/**
 * Objeto o clase CCuenta. En la que se realizarán las siguientes actividades:
 * <ol>
 * <li>CCuenta.java: Cambia el nombre del método "estado" por "getSaldo"</li>
 * <li>CCuenta.java: Encapsula los campos y usa los métodos generados.</li>
 * </ol>
 * 
 * @author Isabel María Gómez Palomeque
 * @version 1.0
 */
public class CCuenta {
	/**
	 * Campo del objeto CCuenta que indica el nombre del titular de la cuenta.
	 */
	private String nombre;
	/**
	 * Campo del objeto CCuenta que indica el número de cuenta.
	 */
	private String cuenta;
	/**
	 * Campo del objeto CCuenta que indica el saldo de la cuenta.
	 */
	private double saldo;
	/**
	 * Campo del objeto CCuenta que indica la retribución aplicada a la cuenta.
	 */
	private double tipoInteres;

	/**
	 * Devuelve el tipo de interés o retribución aplicada a la cuenta.
	 * 
	 * @return tipoInteres, retribución aplicada a la cuenta.
	 */
	double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Asigna el tipo de interés o retribución aplicada a la cuenta.
	 * 
	 * @param tipoInteres
	 *            retribución aplicada a la cuenta.
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
	 *            interés de la cuenta.
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
	 * Método que permite ingresar una cantidad pasada por parámetro y devuelve
	 * una excepción en caso de que la cantidad fuese negativa
	 * 
	 * @param cantidad,
	 *            cantidad que se va a ingresar en la cuenta.
	 * @throws Exception,
	 *             Excepción usada en caso de que insertemos una cantidad
	 *             negativa.
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		setSaldo(saldo + cantidad);
	}

	/**
	 * Método que permite retirar una cantidad pasada por parámetro y devuelve
	 * una excepción en caso de que la cantidad fuese negativa.
	 * 
	 * @param cantidad,
	 *            cantidad que se va a retirar en la cuenta.
	 * @throws Exception,
	 *             Excepción usada en caso de que insertemos una cantidad
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
	 *            nombre que se le asignará a la cuenta.
	 */
	void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
}
