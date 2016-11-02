package ull.patrones.singleton;

import java.util.LinkedList;

import ull.patrones.estrategia.IEvento;

public class ColaSingleton
{
	private static ColaSingleton m_instancia = new ColaSingleton();
	private static LinkedList<IEvento> m_cola;

	private ColaSingleton()
	{
		m_cola = new LinkedList<>();
	}

	public static ColaSingleton getInstancia()
	{
		return m_instancia;
	}

	public void acolar(IEvento a_evento)
	{
		m_cola.addFirst(a_evento);
		m_cola.getFirst().start();
	}

	public IEvento desacolar()
	{
		return m_cola.removeLast();
	}

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
