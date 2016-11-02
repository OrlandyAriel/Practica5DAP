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
		tiempoEspera(4000);
		a.acolar(new Ev_multa());
		tiempoEspera(3000);
		a.acolar(new Ev_emergencia());
		tiempoEspera(2000);
		a.acolar(new Ev_atasco());
		tiempoEspera(1000);
		a.acolar(new Ev_lentitud());
		tiempoEspera(1000);
		while (true)
		{
			System.out.println(a);
			tiempoEspera(500);
		}
	}
	public static void tiempoEspera(int i)
	{
		try
		{
			Thread.sleep(i);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
