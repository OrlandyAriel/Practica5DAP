package ull.patrones.estrategia;

import java.util.Calendar;

import ull.patrones.singleton.ColaSingleton;

public class Ev_multa implements IEvento
{
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
		return "Multa";
	}

	@Override
	public void start()
	{
		Thread t_hilo = new Thread(this);
		t_hilo.start();
		
	}
}	
