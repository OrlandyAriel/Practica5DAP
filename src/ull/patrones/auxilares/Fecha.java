package ull.patrones.auxilares;

import java.util.Calendar;

public class Fecha
{
	private int m_dia;
	private int m_mes;
	private int m_anio;
	private int m_hora;
	private int m_minutos;

	private Calendar m_fecha;
	private int m_segundos;

	public Fecha()
	{
		m_fecha = Calendar.getInstance();
		configFecha();
	}

	private void configFecha()
	{
		m_dia = m_fecha.get(Calendar.DAY_OF_MONTH);
		m_mes = m_fecha.get(Calendar.MONTH) + 1;
		m_anio = m_fecha.get(Calendar.YEAR);
		m_hora = m_fecha.get(Calendar.HOUR_OF_DAY);
		m_minutos = m_fecha.get(Calendar.HOUR_OF_DAY);
		m_segundos = m_fecha.get(Calendar.SECOND);
	}

	@Override
	public String toString()
	{
		return m_dia + "/" + m_mes + "/" + m_anio + "---" + m_hora + ":" + m_minutos +":"+m_segundos;
	}
}
