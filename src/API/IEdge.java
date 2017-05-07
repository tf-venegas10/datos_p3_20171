package API;
/**
 *  
 * @Author: Tomas F. Venegas 
 */
public interface IEdge<T> {
	
	/**
	 * retorna el nodo de salida de la arista
	 * @return nodoSalida
	 */
	public T getNodoSalida();
	
	/**
	 * Setter
	 * @return
	 */
	public T setNodoSalida();
	
	/**
	 * Setter
	 * @return
	 */
	public T getNodoLlegada();
	
	/**
	 * retorna el nodo de llegada de la arista
	 * @return nodoLlegada
	 */
	public T setNodoLlegada();
	
}
