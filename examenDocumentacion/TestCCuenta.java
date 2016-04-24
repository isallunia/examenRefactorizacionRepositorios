package src.examenDocumentacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * TestCCuenta es la clase principal de la que depende el objeto CCuenta. Y
 * realiza las siguientes actividades:
 * <ol>
 * <li>En la clase TestCCuenta TestCCuenta.java: Extrae los m�todos
 * recogerOpcion, mostrarMenu, ingresar, retirar</li>
 * <li>TestCCuenta.java: Convierte dato en campo</li>
 * <li>TestCCuenta.java: Incorpora saldoActual en la misma l�nea.</li>
 * <li>TestCCuenta.java: Renombra la variable local cuenta1 con tu cuenta en el
 * sistema (d13macom, por ejemplo)</li>
 * </ol>
 * 
 * @author Isabel Mar�a G�mez Palomeque
 * @version 1.0
 */
public class TestCCuenta {
	/**
	 * Declaraci�n e inicializaci�n de un BufferedReader dato.
	 */
	private static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
	/**
	 * Declaraci�n del campo saldoActual.
	 */
	private static double saldoActual;

	public static void main(String[] args) {
		/**
		 * Declaraci�n de la variable d15gopai de tipo CCuenta.
		 */
		CCuenta d15gopai;
		/**
		 * Variable local inicializada que nos servir� la creaci�n del men�.
		 */
		int opcion = 0;
		/**
		 * Inicializaci�n de la variable d15gopai invocando al constructor de
		 * CCuenta.
		 */
		d15gopai = new CCuenta("Rigoberta Piedra", "0000-6523-85-678912345", 2500, 0);
		do {
			try {
				mostrarMenu();
				opcion = recogerOpcion(dato);

				switch (opcion) {
				case 1:
					ingresar(dato, d15gopai);
					break;
				case 2:
					retirar(dato, d15gopai);
					break;
				case 3:
					System.out.println("Aaaaaaaaaadios");
				}
			} catch (IOException ex) {
				Logger.getLogger(TestCCuenta.class.getName()).log(Level.SEVERE, null, ex);
			}
		} while (opcion != 3);
		saldoActual = d15gopai.getSaldo();
		System.out.println("Saldo actual: " + saldoActual);
	}

	/**
	 * M�todo que efect�a una retirada de saldo en una cuenta determinada.
	 * 
	 * @param dato
	 *            cantidad que se desea retirar.
	 * @param cuenta1
	 *            cuenta de la que se quiere retirar saldo.
	 * @throws IOException
	 *             Excepci�n lanzada en caso de que haya un fallo en la
	 *             retirada. Al meter un valor err�neo por ejemplo.
	 */
	private static void retirar(BufferedReader dato, CCuenta cuenta1) throws IOException {
		System.out.println("Indica cantidad a retirar: ");
		float retirar = recogerOpcion(dato);
		try {
			cuenta1.retirar(retirar);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
	}

	/**
	 * M�todo que efect�a un ingreso � inserci�n de saldo en una cuenta
	 * determinada.
	 * 
	 * @param dato
	 *            cantidad que se desea ingresar.
	 * @param cuenta1
	 *            cuenta de la que se quiere retirar saldo.
	 * @throws IOException
	 *             Excepci�n lanzada en caso de que haya un fallo en el ingreso.
	 *             Al meter un valor err�neo por ejemplo.
	 */
	private static void ingresar(BufferedReader dato, CCuenta cuenta1) throws IOException {
		System.out.println("Indica cantidad a ingresar: ");
		float ingresar = recogerOpcion(dato);
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(ingresar);
		} catch (Exception e) { /*
								 * Podr�a ponerse s�lo una excepci�n de que
								 * fuese nulo mediante NuloException e y crear
								 * la excepci�n. O bien, Exception = Captura
								 * todas las excepciones
								 */
			System.out.print("Fallo al ingresar");
		}
	}

	/**
	 * M�todo que lee los datos introducidos por el usuario y los devuelve como
	 * un n�mero entero.
	 * 
	 * @param dato
	 *            cantidad que se desea usar.
	 * @return n�mero entero.
	 * @throws IOException
	 *             Excepci�n lanzada en caso de que haya un fallo en el ingreso
	 *             de los datos.
	 */
	private static int recogerOpcion(BufferedReader dato) throws IOException {
		return Integer.parseInt(dato.readLine()); // Devuelve un n�mero entero
													// introducido por teclado
	}

	/**
	 * M�todo que dise�a un men� mediante mensajes a trav�s de la consola.
	 */
	private static void mostrarMenu() {
		System.out.println("MENU DE OPERACIONES");
		System.out.println("-------------------");
		System.out.println("1 - Ingresar");
		System.out.println("2 - Retirar");
		System.out.println("3 - Salir");
	}
}
