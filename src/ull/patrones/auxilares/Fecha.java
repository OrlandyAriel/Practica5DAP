package ull.patrones.auxilares;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha
{
	private int m_dia;
	private int m_mes;
	private int m_anio;
	private String m_hora;
	
	private Calendar m_fecha;
	public Fecha()
	{
		m_fecha = new GregorianCalendar();
		configFecha();
	}
	private void configFecha()
	{
		m_dia = m_fecha.get(Calendar.DAY_OF_MONTH);
		m_mes = m_fecha.get(Calendar.MONTH)+1;
		m_anio = m_fecha.get(Calendar.YEAR);
		m_hora = m_fecha.getTime().toString();
	}
	@Override
	public String toString()
	{
		return m_dia+"/"+m_mes+"/"+m_anio+"-"+m_hora;
	}
}
