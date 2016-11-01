package ull.patrones;

import ull.patrones.estrategia.Ev_atasco;
import ull.patrones.estrategia.Ev_colision;
import ull.patrones.estrategia.Ev_emergencia;
import ull.patrones.estrategia.Ev_lentitud;
import ull.patrones.estrategia.Ev_multa;
import ull.patrones.singleton.ColaSingleton;

public class Practica5DAPPruebaMain
{

	public static void main(String[] args)
	{
		ColaSingleton a = ColaSingleton.getInstancia();

		a.acolar(new Ev_colision());

		a.acolar(new Ev_multa());
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		a.acolar(new Ev_emergencia());
		try
		{
			Thread.sleep(2000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		a.acolar(new Ev_atasco());
		try
		{
			Thread.sleep(2000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		a.acolar(new Ev_lentitud());
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		while (true)
		{
			System.out.println(a);
			try
			{
				Thread.sleep(500);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

	}

}
