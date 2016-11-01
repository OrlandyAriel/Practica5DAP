package ull.patrones.estrategia;

import java.util.Calendar;

import ull.patrones.singleton.ColaSingleton;

public class Ev_lentitud implements IEvento
{

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
	public Calendar getFecha()
	{
		return null;
	}
	@Override
	public String toString()
	{
		return "lentitud";
	}
	@Override
	public void start()
	{
		Thread t_hilo = new Thread(this);
		t_hilo.start();
	}
}
