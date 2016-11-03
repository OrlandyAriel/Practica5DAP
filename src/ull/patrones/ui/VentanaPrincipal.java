package ull.patrones.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import ull.patrones.estrategia.Ev_atasco;
import ull.patrones.estrategia.Ev_colision;
import ull.patrones.estrategia.Ev_emergencia;
import ull.patrones.estrategia.Ev_lentitud;
import ull.patrones.estrategia.Ev_multa;
import ull.patrones.estrategia.IEvento;
import ull.patrones.singleton.ColaSingleton;

public class VentanaPrincipal extends JFrame
{ // ATRIBUTOS
	private JButton m_btnAnadirAtasco;
	private JButton m_btnAnadirColision;
	private JButton m_btnAnadirEmergencia;
	private JButton m_btnAnadirLentitud;
	private JButton m_btnAnadirMulta;
	private JPanel m_panelBotones;
	private ScrollPane m_scrollPanel;
	private JTextArea m_textArea;
	private ColaSingleton m_colaSingleton;

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
		initScrollPane();
		initVentana();
		actualizaJtexArea();
	}

	/**
	 * Método que crea el panel donde iran los botones y lo configura
	 */
	private void initPanelBotones()
	{
		configBotones();
		m_panelBotones = new JPanel(new FlowLayout());
		m_panelBotones.setVisible(true);
		m_panelBotones.add(m_btnAnadirAtasco);
		m_panelBotones.add(m_btnAnadirColision);
		m_panelBotones.add(m_btnAnadirEmergencia);
		m_panelBotones.add(m_btnAnadirLentitud);
		m_panelBotones.add(m_btnAnadirMulta);
	}

	/**
	 * Configruación del scrollPane
	 */
	private void initScrollPane()
	{
		m_textArea = new JTextArea();
		m_textArea.setBackground(Color.BLACK);
		m_textArea.setEditable(false);
		m_textArea.setEnabled(false);
		m_scrollPanel = new ScrollPane();
		m_scrollPanel.setBounds(10, 30, 200, 110);
		m_scrollPanel.add(m_textArea);
	}

	/**
	 * Método que crea y configura los botones
	 */
	private void configBotones()
	{
		m_btnAnadirAtasco = crearBtn("Atasco", new Ev_atasco());
		m_btnAnadirColision = crearBtn("Colision", new Ev_colision());
		m_btnAnadirEmergencia = crearBtn("Emergencia", new Ev_emergencia());
		m_btnAnadirLentitud = crearBtn("Lentitud", new Ev_lentitud());
		m_btnAnadirMulta = crearBtn("Multa", new Ev_multa());
	}

	/**
	 * Agrupa las acciones repetitivas de un crear un botón
	 * 
	 * @param a_titulo,
	 *            titulo visible del boton
	 * @param a_evento,
	 *            IEvento del que quiere añadir al hacer click @return, retorna
	 *            el botón creado con su fuionalidad
	 */
	private JButton crearBtn(String a_titulo, IEvento a_evento)
	{
		JButton t_button = new JButton(a_titulo);
		t_button.setVisible(true);
		t_button.addActionListener(
				new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent arg0)
					{
						singleton(a_evento);
					}
				}
		);
		return t_button;
	}

	/**
	 * Agrega un elemento a la lista
	 * 
	 * @param e
	 */
	private void agregaElem(String e)
	{
		m_textArea.setText(e);
	}

	/**
	 * Método para añadir un evento desde un botón
	 * 
	 * @param a_evento
	 */
	private void singleton(IEvento a_evento)
	{
		m_colaSingleton = ColaSingleton.getInstancia();
		m_colaSingleton.acolar(a_evento);
		agregaElem(m_colaSingleton.toString());
	}

	/**
	 * Método que se actualiza cada 5 segundos la cola en la ventana
	 */
	private void actualizaJtexArea()
	{
		m_colaSingleton = ColaSingleton.getInstancia();
		while (true)
		{
			try
			{
				Thread.sleep(500);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			agregaElem(m_colaSingleton.toString());
			System.out.println(m_colaSingleton);

		}
	}

	/**
	 * Configuración de la ventana
	 */
	private void initVentana()
	{
		this.setTitle("Practica 5-DAP");
		this.setSize(450, 300);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		add(m_panelBotones, BorderLayout.SOUTH);
		add(m_scrollPanel, BorderLayout.CENTER);
	}
}
