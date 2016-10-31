package ull.patrones.estrategia;

public interface IEvento extends Runnable
{
	public long getIdTipoEvento();
	public String getFecha();
}
