package ull.patrones.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame
{//ATRIBUTOS
	private JButton m_btnAnadirEvento;
	private JButton m_btnEliminarEvento;
	
	private JPanel m_panelBotones;
	/**
	 * constructor por defecto
	 */
	public VentanaPrincipal()
	{
		initComponet();
	}
	/**
	 * Método para inicializar los distintos componentes de la ventana
	 */
	private void initComponet()
	{
		initPanelBotones();
		initVentana();
	}
	/**
	 * Método que crea el panel donde iran los botones y lo configura
	 */
	private void initPanelBotones()
	{
		configBotones();
		m_panelBotones = new JPanel(new FlowLayout());
		m_panelBotones.setVisible(true);
		m_panelBotones.add(m_btnAnadirEvento);
		m_panelBotones.add(m_btnEliminarEvento);
	}
	/**
	 * Método que crea y configura los botones
	 */
	private void configBotones()
	{
		m_btnAnadirEvento = new JButton("Añadir Evento a la Cola");
		m_btnAnadirEvento.setVisible(true);
		m_btnEliminarEvento = new JButton("Eliminar evento de la cola");
		m_btnEliminarEvento.setVisible(true);
	}
	/**
	 * Configuración de la ventana
	 */
	private void initVentana()
	{
		this.setTitle("Practica 5-DAP");
		this.setSize(800,400);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		add(m_panelBotones,BorderLayout.SOUTH);
	}

}
