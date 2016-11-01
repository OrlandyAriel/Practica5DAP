package ull.patrones.estrategia;

import java.util.Calendar;

public interface IEvento extends Runnable
{
	public long getIdTipoEvento();
	public Calendar getFecha();
	public void start();
}
