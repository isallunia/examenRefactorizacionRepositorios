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
 * <li>En la clase TestCCuenta TestCCuenta.java: Extrae los métodos
 * recogerOpcion, mostrarMenu, ingresar, retirar</li>
 * <li>TestCCuenta.java: Convierte dato en campo</li>
 * <li>TestCCuenta.java: Incorpora saldoActual en la misma línea.</li>
 * <li>TestCCuenta.java: Renombra la variable local cuenta1 con tu cuenta en el
 * sistema (d13macom, por ejemplo)</li>
 * </ol>
 * 
 * @author Isabel María Gómez Palomeque
 * @version 1.0
 */
public class TestCCuenta {
	/**
	 * Declaración e inicialización de un BufferedReader dato.
	 */
	private static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
	/**
	 * Declaración del campo saldoActual.
	 */
	private static double saldoActual;

	public static void main(String[] args) {
		/**
		 * Declaración de la variable d15gopai de tipo CCuenta.
		 */
		CCuenta d15gopai;
		/**
		 * Variable local inicializada que nos servirá la creación del menú.
		 */
		int opcion = 0;
		/**
		 * Inicialización de la variable d15gopai invocando al constructor de
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
	 * Método que efectúa una retirada de saldo en una cuenta determinada.
	 * 
	 * @param dato
	 *            cantidad que se desea retirar.
	 * @param cuenta1
	 *            cuenta de la que se quiere retirar saldo.
	 * @throws IOException
	 *             Excepción lanzada en caso de que haya un fallo en la
	 *             retirada. Al meter un valor erróneo por ejemplo.
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
	 * Método que efectúa un ingreso ó inserción de saldo en una cuenta
	 * determinada.
	 * 
	 * @param dato
	 *            cantidad que se desea ingresar.
	 * @param cuenta1
	 *            cuenta de la que se quiere retirar saldo.
	 * @throws IOException
	 *             Excepción lanzada en caso de que haya un fallo en el ingreso.
	 *             Al meter un valor erróneo por ejemplo.
	 */
	private static void ingresar(BufferedReader dato, CCuenta cuenta1) throws IOException {
		System.out.println("Indica cantidad a ingresar: ");
		float ingresar = recogerOpcion(dato);
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(ingresar);
		} catch (Exception e) { /*
								 * Podría ponerse sólo una excepción de que
								 * fuese nulo mediante NuloException e y crear
								 * la excepción. O bien, Exception = Captura
								 * todas las excepciones
								 */
			System.out.print("Fallo al ingresar");
		}
	}

	/**
	 * Método que lee los datos introducidos por el usuario y los devuelve como
	 * un número entero.
	 * 
	 * @param dato
	 *            cantidad que se desea usar.
	 * @return número entero.
	 * @throws IOException
	 *             Excepción lanzada en caso de que haya un fallo en el ingreso
	 *             de los datos.
	 */
	private static int recogerOpcion(BufferedReader dato) throws IOException {
		return Integer.parseInt(dato.readLine()); // Devuelve un número entero
													// introducido por teclado
	}

	/**
	 * Método que diseña un menú mediante mensajes a través de la consola.
	 */
	private static void mostrarMenu() {
		System.out.println("MENU DE OPERACIONES");
		System.out.println("-------------------");
		System.out.println("1 - Ingresar");
		System.out.println("2 - Retirar");
		System.out.println("3 - Salir");
	}
}
