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
		return m_cola.toString();
	}
}
