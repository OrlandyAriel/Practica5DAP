package ull.patrones.estrategia;

import ull.patrones.auxilares.Fecha;
import ull.patrones.singleton.ColaSingleton;

public class Ev_multa implements IEvento
{
	private Fecha m_fecha;
	private final int m_idtipoevento = 0005;
	public Ev_multa()
	{
		m_fecha = new Fecha();
	}

	@Override
	public long getIdTipoEvento()
	{
		return m_idtipoevento;
	}

	@Override
	public Fecha getFecha()
	{
		return m_fecha;
	}

	public void run()
	{
		try
		{
			Thread.sleep(10000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		ColaSingleton.getInstancia().desacolar(this);
	}

	@Override
	public String toString()
	{
		return "Evento: MULTA, Fecha: "+m_fecha+", con ID: "+m_idtipoevento;
	}

	@Override
	public void start()
	{
		Thread t_hilo = new Thread(this);
		t_hilo.start();

	}
}
