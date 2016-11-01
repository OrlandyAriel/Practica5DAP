package ull.patrones.estrategia;


import ull.patrones.auxilares.Fecha;

public interface IEvento extends Runnable
{
	public long getIdTipoEvento();
	public Fecha getFecha();
	public void start();
}
