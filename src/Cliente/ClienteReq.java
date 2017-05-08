package Cliente;

import java.io.BufferedWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import API.IEdge;
import API.ILista;
import VOS.VOFranquicia;
import VOS.VOGeneroPelicula;
import VOS.VOTeatro;
import VOS.VOUsuario;

/**
 * Requerimientos Proyecto 3
 * @author Camilo Montenegro
 *
 */
public class ClienteReq {

	BufferedWriter escritor;
	Scanner lector;


	//TODO: Declarar objetos

	public ClienteReq(BufferedWriter escritor, Scanner lector) {
		this.escritor = escritor;
		this.lector = lector;
	}

	public void pruebas() {
		int opcion = -1;

		//TODO: Inicializar objetos 


		while (opcion != 0) {
			try {
				escritor.write("---------------Pruebas Proyecto 3 ---------------\n");
				escritor.write("Requerimientos:\n");
				escritor.write("1: Cargar salas. (R1) \n");
				escritor.write("2: Cargar Cartelera (R2) \n");
				escritor.write("3: Cargar red. (R3) \n");
				escritor.write("4: Generar plan películas. (R4) \n");
				escritor.write("5: Generar plan películas por genero. (R5) \n");
				escritor.write("6: Generar plan películas por franquicia. (R6) \n");
				escritor.write("7: Generar plan películas por genero y desplazamiento. (R7) \n");
				escritor.write("8: Generar plan películas por genero, desplazamiento y franquicia. (R8) \n");
				escritor.write("9: Generar MST. (R9) \n");
				escritor.write("10: Generar lista de rutas posibles. (R10) \n");
				escritor.write("0: Volver\n");
				escritor.write("------------------------------------------------\n");
				escritor.flush();
				opcion = lector.nextInt();

				switch(opcion) {
				case 1: r1(); break;
				case 2: r2(); break;
				case 3: r3(); break;
				case 4: r4(); break;
				case 5: r5(); break;
				case 6: r6(); break;
				case 7: r7(); break;
				case 8: r8(); break;
				case 9: r9(); break;
				case 10: r10(); break;
				}
			}
			catch (IOException ioe) {
				ioe.printStackTrace();
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
	}

	private void r1() throws IOException{

		//TODO: Cargar la información básica de las salas de cine que participan en el festival: Nombre, ubicación geográfica, y franquicia a la que pertenece.
		long tiempo = System.nanoTime();

		//TODO: Llamar método cargarSalas(String ruta) del API

		tiempo = System.nanoTime() - tiempo;
		escritor.write("Duracion: " + tiempo + " nanosegundos\n");
		escritor.write("Ingrese cualquier letra y Enter para continuar\n");
		escritor.flush();
		lector.next();
	}


	private void r2() throws IOException{

		//TODO: Cargar la información de la cartelera del festival. Esta información incluye la película que se proyectará, 
		//las salas de cine en las que se proyectará, y para cada sala, las fechas y horas en las que se podrá ver la película.
		long tiempo = System.nanoTime();

		//TODO: Llamar método cargarCartelera(String ruta) del API


		tiempo = System.nanoTime() - tiempo;
		escritor.write("Duracion: " + tiempo + " nanosegundos\n");
		escritor.write("Ingrese cualquier letra y Enter para continuar\n");
		escritor.flush();
		lector.next();
	}

	private void r3() throws IOException
	{
		//TODO: Cargar la información de la red de teatros del festival, en donde se indica para cada teatro, 
		//los tiempos y distancias a los otros teatros, cuando esa conexión es posible.
		long tiempo = System.nanoTime();

		//TODO: Llamar método cargarRed(String ruta) del API
  
		tiempo = System.nanoTime() - tiempo;
		escritor.write("Duracion: " + tiempo + " nanosegundos\n");
		escritor.write("Ingrese cualquier letra y Enter para continuar\n");
		escritor.flush();
		lector.next();
	}

	private void r4() throws IOException
	{
		//TODO: Genera el plan para el usuario especifico en la fecha especifica de peliculas que el usuario podria ver
		//maximizando el numero de peliculas
		//RECUERDE: El sistema debe tener en cuenta la duración de la película y el tiempo que toma la película, para calcular el tiempo de desplazamiento al siguiente teatro.
		

	
		escritor.write("Ingrese el ID del Usuario: \n");
		escritor.flush();
		String idUsuario = lector.next();
		System.out.println(idUsuario);

		escritor.write("Ingrese la fecha: \n");
		escritor.flush();
		String fecha = lector.next();
		System.out.println(fecha);


		//RECUERDE: Utilice los Strings previamente declarados y adaptelos al formato que usted debe manejar en su proyecto.
		long tiempo = System.nanoTime();

		//TODO: Llamar método PlanPeliculas(VOUsuario usuario,Date fecha) del API
		//RECUERDE: se espera como resultado un plan en formato ILista.
			
		tiempo = System.nanoTime() - tiempo;
		escritor.write("Duracion: " + tiempo + " nanosegundos\n");
		escritor.write("Ingrese cualquier letra y Enter para continuar\n");
		escritor.flush();
		lector.next();
	}

	private void r5() throws IOException{

		//TODO: Genera un plan de peliculas para UN DIA maximizando la cantidad de peliculas en el dia
		//para dicho genero y que sean recomendadas para el usuario.
		
		escritor.write("Ingrese el ID del usuario: \n");
		escritor.flush();
		String usuarioID = lector.next();
		System.out.println(usuarioID);
		
		escritor.write("Ingrese el genéro de preferencia: \n");
		escritor.flush();
		String genero = lector.next();
		System.out.println(genero);

		//RECUERDE: Utilice los Strings previamente declarados y adaptelos al formato que usted debe manejar en su proyecto.

		long tiempo = System.nanoTime();

		//TODO: Llamar método PlanPorGenero(VOGeneroPelicula genero, VOUsuario usuario) del API
		//Se espera como resultado: lista VOPeliculaPlan 

		tiempo = System.nanoTime() - tiempo;
		escritor.write("Duracion: " + tiempo + " nanosegundos\n");
		escritor.write("Ingrese cualquier letra y Enter para continuar\n");
		escritor.flush();
		lector.next();
	}

	private void r6() throws IOException{

		//TODO:Genera un plan de peliculas en la fecha dada pasando solo por teatros de una misma franquicia
		//maximizando el numero de pliculas
		//RECUERDE: El usuario puede (o no) precisar una franja de horario (ej. ma�ana y noche)


		escritor.write("Ingrese la fecha: \n");
		escritor.flush();
		String fecha = lector.next();
		System.out.println(fecha);
		
		escritor.write("Ingrese la franquicia: \n");
		escritor.flush();
		String franquicia = lector.next();
		System.out.println(franquicia);
		
		escritor.write("Ingrese la franja: \n");
		escritor.flush();
		String franja = lector.next();
		System.out.println(franja);
		
		//RECUERDE: Utilice los Strings previamente declarados y adaptelos al formato que usted debe manejar en su proyecto.
		
		long tiempo = System.nanoTime();

		//TODO: Llamar método PlanPorFranquicia(VOFranquicia franquicia, Date fecha,String franja) del API
		//Se espera como resultado: lista VOPeliculaPlan 
		
		tiempo = System.nanoTime() - tiempo;
		escritor.write("Duracion: " + tiempo + " nanosegundos\n");
		escritor.write("Ingrese cualquier letra y Enter para continuar\n");
		escritor.flush();
		lector.next();
	}

	private void r7() throws IOException{

		//TODO:Genera el plan de peliculas en la fecha especifica, del genero especifico
		//que maximiza el numero de peliculas y que minimiza el tiempo de desplazamiento.
		//Sobre todos los planes de numero de peliculas maximo, se debe encontrar el (uno) de tiempo de desplazamiento minimo

		escritor.write("Ingrese el genero: \n");
		escritor.flush();
		String genero = lector.next();
		System.out.println(genero);

		escritor.write("Ingrese la fecha: \n");
		escritor.flush();
		String fecha = lector.next();
		System.out.println(fecha);

		//RECUERDE: Utilice los Strings previamente declarados y adaptelos al formato que usted debe manejar en su proyecto.
		
		long tiempo = System.nanoTime();

		//TODO: Llamar método PlanPorGeneroYDesplazamiento(VOGeneroPelicula genero, Date fecha) del API
		//Se espera como resultado: lista VOPeliculaPlan 
		
		tiempo = System.nanoTime() - tiempo;
		escritor.write("Duracion: " + tiempo + " nanosegundos\n");
		escritor.write("Ingrese cualquier letra y Enter para continuar\n");
		escritor.flush();
		lector.next();
	}

	private void r8() throws IOException{

		//TODO:  Genera el plan de peliculas en la fecha especifica, del genero especifico, de la franquicia especifica
		//que maximiza el numero de peliculas y que minimiza el tiempo de desplazamiento.
		//Sobre todos los planes de numero de peliculas maximo, se debe encontrar el (uno) de tiempo de desplazamiento minimo 
		
		escritor.write("Ingrese el genero: \n");
		escritor.flush();
		String genero = lector.next();
		System.out.println(genero);
		
		escritor.write("Ingrese la fecha: \n");
		escritor.flush();
		String fecha = lector.next();
		System.out.println(fecha);
		
		escritor.write("Ingrese la franquicia: \n");
		escritor.flush();
		String franquicia = lector.next();
		System.out.println(franquicia);

		//RECUERDE: Utilice los Strings previamente declarados y adaptelos al formato que usted maneja en su proyecto.

		long tiempo = System.nanoTime();

		//TODO: Llamar método PlanPorGeneroDesplazamientoYFranquicia(VOGeneroPelicula genero, Date fecha, VOFranquicia franquicia) del API 
		//Se espera como resultado: lista VOPeliculaPlan 
		
		tiempo = System.nanoTime() - tiempo;
		escritor.write("Duracion: " + tiempo + " nanosegundos\n");
		escritor.write("Ingrese cualquier letra y Enter para continuar\n");
		escritor.flush();
		lector.next();
	}

	private void r9() throws NumberFormatException, IOException
	{
		//TODO:Genera un MST para el grafo de Teatros
		//RECUERDE: En esa medida el sistema debe soportar la generación de este mapa en el caso que sea posible, en caso contrario se debe notificar que no es posible generar el mapa.
		 
		long tiempo = System.nanoTime();

		//TODO: Llamar método generarMapa() del API 
		//Se espera como resultado: ILista IEdge<VOTeatro> 	
		
		tiempo = System.nanoTime() - tiempo;
		escritor.write("Duracion: " + tiempo + " nanosegundos\n");
		escritor.write("Ingrese cualquier letra y Enter para continuar\n");
		escritor.flush();
		lector.next();
	}


	private void r10() throws IOException{

		//TODO: Dado el teatro de origen y el numero maximo de tetros a vistar,
		//genera una lista de todas las rutas distintas que el usuario puede seguir sin sobrepasar el limite maximo de teatros n

		escritor.write("Ingrese el teatro origen: \n");
		escritor.flush();
		String teatro = lector.next();
		System.out.println(teatro);
		
		escritor.write("Ingrese el N máximo de teatros. \n");
		escritor.flush();
		int maxTeatros = lector.nextInt();
		System.out.println(maxTeatros);

		//RECUERDE: Utilice la variable previamente declarada y adaptela al formato que usted maneja en su proyecto.

		long tiempo = System.nanoTime();

		//TODO: Llamar método rutasPosible(VOTeatro origen, int n) del API 
		//Se espera como resultado: ILista<ILista<VOTeatro>>		
		
		tiempo = System.nanoTime() - tiempo;
		escritor.write("Duracion: " + tiempo + " nanosegundos\n");
		escritor.write("Ingrese cualquier letra y Enter para continuar\n");
		escritor.flush();
		lector.next();
	}

}
