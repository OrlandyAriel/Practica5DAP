package ull.patrones;

import ull.patrones.estrategia.Ev_atasco;
import ull.patrones.singleton.ColaSingleton;

public class Practica5DAP
{
	public static void main(String[] args)
	{
		ColaSingleton a = ColaSingleton.getInstancia();
		System.out.println(a.toString());
		
		a.acolar(new Ev_atasco());
		System.out.println(a.toString());
		
		a.acolar(new Ev_atasco());
		System.out.println(a.toString());

		a.acolar(new Ev_atasco());
		System.out.println(a.toString());

		a.acolar(new Ev_atasco());
		System.out.println(a.toString());

		a.acolar(new Ev_atasco());
		System.out.println(a.toString());
		a = ColaSingleton.getInstancia();
		
		a.desacolar();
		System.out.println(a.toString());
	}
}
