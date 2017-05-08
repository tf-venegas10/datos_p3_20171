package VOS;

import java.sql.Date;
import java.sql.Time;

/**
 *  
 * @Author: Tomas F. Venegas 
 */
public class VOPeliculaPlan {
	
	/**
	 * Atributo que apunta a la pelicula que se propone
	 */
	private VOPelicula pelicula;
	
	
	/**
	 * Atributo que apunta al teatro que se propone
	 */
	private VOTeatro teatro;
	
	/**
	 * Atributo que modela la hora de inicio de la pelicula
	 */
	private Time horaInicio;
	
	/**
	 * Atributo que modela la hora de fin de la pelicula
	 */
	private Time horaFin;
	
	/**
	 * Atributo que modela el dia de presentacion de la pelicla
	 * (1..5)
	 */
	
	private int dia;
	
	public VOPeliculaPlan() {
		// TODO Auto-generated constructor stub
	}

	public VOPelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(VOPelicula pelicula) {
		this.pelicula = pelicula;
	}

	public VOTeatro getTeatro() {
		return teatro;
	}

	public void setTeatro(VOTeatro teatro) {
		this.teatro = teatro;
	}

	public Time getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Time horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Time getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Time horaFin) {
		this.horaFin = horaFin;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}
	
	
	

}
