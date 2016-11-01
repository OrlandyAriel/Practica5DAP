package ull.patrones.estrategia;


import ull.patrones.auxilares.Fecha;
import ull.patrones.singleton.ColaSingleton;

public class Ev_emergencia implements IEvento
{
	private Fecha m_fecha;

	public Ev_emergencia()
	{
		m_fecha = new Fecha();
	}
	@Override
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
	public long getIdTipoEvento()
	{
		return 0;
	}

	@Override
	public Fecha getFecha()
	{
		return m_fecha;
	}
	@Override
	public String toString()
	{
		return "emergencia";
	}
	@Override
	public void start()
	{
		Thread t_hilo = new Thread(this);
		t_hilo.start();
	}
}
