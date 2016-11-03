package ull.patrones.singleton;

import java.util.LinkedList;

import ull.patrones.estrategia.IEvento;
/**
 * @author Orlandy Ariel Sánchez A.
 *	Clase ColaSingleton que representa la lista de eventos.
 */
public class ColaSingleton
{
	private static ColaSingleton m_instancia = new ColaSingleton();
	private static LinkedList<IEvento> m_cola;
	/**
	 * Constructor por defecto privado, de manera que no se puedan crear nuevos objetos de
	 * esta clase fuera.
	 */
	private ColaSingleton()
	{
		m_cola = new LinkedList<>();
	}
	/**
	 * Método para obtener la instancia de esta clase
	 * @return, devuelve la instancia de la clase
	 */
	public static ColaSingleton getInstancia()
	{
		return m_instancia;
	}
	/**
	 * Método para añadir un elemento a la cola
	 * @param a_evento, objeto de tipo IEvento para almacenarlo en la cola
	 */
	public void acolar(IEvento a_evento)
	{
		m_cola.addLast(a_evento);
		m_cola.getLast().start();
	}
	/**
	 * Método que elimina el último elemento de la cola
	 * 
	 */
	public void desacolar()
	{
		m_cola.removeFirst();
	}
	/**
	 * Método para eliminar un objeto concreto de la cola
	 * @param a_evento, elemento que se quiere borrar
	 */
	public void desacolar(IEvento a_evento)
	{
		m_cola.remove((Object) a_evento);
	}

	@Override
	public String toString()
	{
		String result = "";
		for (int i = 0; i < m_cola.size(); i++)
		{
			result += m_cola.get(i).toString() + "\n";
		}
		return result;
	}
}
