/**
 * La documentación del API de ninguna forma reemplaza la lectura de los requerimientos del proyecto.
 * El documento del proyecto tiene definidos los requerimientos exactos.
 * 
 * 
 * @Author: Tomas F. Venegas
 * 
 */



package API;

import java.sql.Date;

import VOS.VOFranquicia;
import VOS.VOGeneroPelicula;
import VOS.VOPeliculaPlan;
import VOS.VOTeatro;
import VOS.VOUsuario;



public interface ISistemaRecomendacion {
	

	
	/**
	 * Metodo que crea un Sistema de recomendación vacio
	 * @return ISistemaRecomendacionPeliculas
	 */
	ISistemaRecomendacion crearSR();
	
	/**R1
	 * 
	 * Cargar la informacion basica de las salas de cine que participan en el festival.
	 * (Nombre, ubicacion, franquicia)
	 * @param ruta
	 * @return
	 */
	boolean cargarSalas(String ruta);
	
	/**R2
	 * 
	 * Cargar la informacion de la cartelera del festival
	 * 
	 * @param ruta
	 * @return 
	 */
	boolean cargarCartelera(String ruta);
	
	/**R3
	 * Carga la informacion de la red de teatros del festival. 
	 * 
	 * 
	 * @param ruta
	 * @return
	 */
	boolean cargarRed(String ruta);
	
	/**
	 * 
	 * @return número de pelíclas en la cartelera del sistema
	 */
	int sizeMovies() ;
	
	/**
	 * 
	 * @return número de teatros registrados
	 */
	int sizeTeatros() ;
	
	/**R4
	 * 
	 * Genera el plan para el usuario especifico en la fecha especifica de peliculas que el usuario podria ver
	 * maximizando el numero de peliculas
	 * 
	 * @param usuario
	 * @param fecha
	 * @return lista con el plan propuesto
	 */
	ILista<VOPeliculaPlan> PlanPeliculas(VOUsuario usuario,Date fecha);
	
	/**R5
	 * Genera un plan de peliculas para UN DIA maximizando la cantidad de peliculas en el dia
	 * para dicho genero y que sean recomendadas para el usuario.
	 * @param genero
	 * @param usuario
	 * @return lista con el plan propuesto
	 */
	ILista<VOPeliculaPlan> PlanPorGenero(VOGeneroPelicula genero, VOUsuario usuario);
	
	/**R6
	 * Genera un plan de peliculas en la fecha dada pasando solo por teatros de una misma franquicia
	 * maximizando el numero de pliculas
	 * El usuario puede (o no) precisar una franja de horario (ej. mañana y noche)
	 * @param franquicia
	 * @param fecha
	 * @param franja
	 * @return plan propuesto
	 */
	ILista<VOPeliculaPlan> PlanPorFranquicia(VOFranquicia franquicia, Date fecha,String franja);
	
	/**R7
	 * 
	 * Genera el plan de peliculas en la fecha especifica, del genero especifico
	 * que maximiza el numero de peliculas y que minimiza el tiempo de desplazamiento.
	 * Sobre todos los planes de numero de peliculas maximo, se debe encontrar el (uno) de tiempo de desplazamiento minimo 
	 * @param genero
	 * @param fecha
	 * @return plan
	 */
	ILista<VOPeliculaPlan> PlanPorGeneroYDesplazamiento(VOGeneroPelicula genero, Date fecha);
	
	
	/**R8
	 * 
	 * Genera el plan de peliculas en la fecha especifica, del genero especifico, de la franquicia especifica
	 * que maximiza el numero de peliculas y que minimiza el tiempo de desplazamiento.
	 * Sobre todos los planes de numero de peliculas maximo, se debe encontrar el (uno) de tiempo de desplazamiento minimo 
	 * @param genero
	 * @param franquicia
	 * @param fecha
	 * @return plan
	 */
	ILista<VOPeliculaPlan> PlanPorGeneroDesplazamientoYFranquicia(VOGeneroPelicula genero, Date fecha, VOFranquicia franquicia);
	
	/**R9
	 * Genera un MST para el grafo de Teatros
	 * @return Lista de aristas pertenecientes al MST encontrado, null si no es posible generar un MST.
	 */
	ILista<IEdge<VOTeatro>> generarMapa();
	
	
	/**R10
	 * Dado el teatro de origen y el numero maximo de tetros a vistar,
	 * genera una lista de todas las rutas distintas que el usuario puede seguir sin sobrepasar el limite maximo de teatros n
	 * @param origen
	 * @param n
	 * @return lista de rutas posibles
	 */
	ILista<ILista<VOTeatro>> rutasPosible(VOTeatro origen, int n);
	
	
}
