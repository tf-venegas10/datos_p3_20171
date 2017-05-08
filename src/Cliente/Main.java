package Cliente;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Cliente Proyecto3 Festival de Cine
 * @author Camilo Montenegro
 *
 */
public class Main {


	static BufferedWriter escritor = new BufferedWriter(new OutputStreamWriter(System.out));
	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {



		ClienteReq cliente = new ClienteReq(escritor, lector);
		int opcion = -1;

		//TODO: Inicializar objetos 

		while (opcion != 0) {
			try {
				escritor.write("---------------Cliente Pruebas Proyecto 3---------------\n");
				escritor.write("Ingrese un numeral\n");
				escritor.write("Opciones:\n");
				escritor.write("1: Crear Sistema de Recomendaciones. \n");
				escritor.write("2: Menú requerimientos \n");
				escritor.write("0: Salir\n");
				escritor.write("------------------------------------------------\n");
				escritor.flush();
				opcion = lector.nextInt();

				switch(opcion) {
				case 1: r1(); break;
				case 2: cliente.pruebas(); break;
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			catch (InputMismatchException ime) {
				try {
					escritor.write("No ingreso un numeral\n");
					escritor.write("Ingrese cualquier letra y enter para continuar\n");
					escritor.flush();
					lector.nextLine();
					lector.nextLine();
				}
				catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}

		try {
			escritor.write("Chao");
			escritor.flush();
			escritor.close();
			lector.close();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

	private static void r1() throws IOException{

		//TODO: Crea un Sistema de recomendaci�n vacio
		

		long tiempo = System.nanoTime();

		//TODO: Llamar método crearSR() del API
		
		tiempo = System.nanoTime() - tiempo;
		escritor.write("Duracion: " + tiempo + " nanosegundos\n");
		escritor.write("Ingrese cualquier letra y Enter para continuar\n");
		escritor.flush();
		lector.next();
	}

}