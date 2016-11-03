package ull.patrones.auxilares;

import java.util.Calendar;
/**
 * @author Orlandy Ariel Sánchez A.
 *	clase para obtener la fecha
 */
public class Fecha
{
	private int m_dia;
	private int m_mes;
	private int m_anio;
	private int m_hora;
	private int m_minutos;

	private Calendar m_fecha;
	private int m_segundos;
	/**
	 * Constructor por defecto que obtiene la fecha del sistema
	 */
	public Fecha()
	{
		m_fecha = Calendar.getInstance();
		configFecha();
	}
	/**
	 * Método que configura la fecha con su dia y hora
	 */
	private void configFecha()
	{
		m_dia = m_fecha.get(Calendar.DAY_OF_MONTH);
		m_mes = m_fecha.get(Calendar.MONTH) + 1;
		m_anio = m_fecha.get(Calendar.YEAR);
		m_hora = m_fecha.get(Calendar.HOUR_OF_DAY);
		m_minutos = m_fecha.get(Calendar.HOUR_OF_DAY);
		m_segundos = m_fecha.get(Calendar.SECOND);
	}

	public int getM_dia()
	{
		return m_dia;
	}

	public int getM_mes()
	{
		return m_mes;
	}

	public int getM_anio()
	{
		return m_anio;
	}

	public int getM_hora()
	{
		return m_hora;
	}

	public int getM_minutos()
	{
		return m_minutos;
	}

	public int getM_segundos()
	{
		return m_segundos;
	}

	@Override
	public String toString()
	{
		return m_dia + "/" + m_mes + "/" + m_anio + "---" + m_hora + ":" + m_minutos +":"+m_segundos;
	}
}
