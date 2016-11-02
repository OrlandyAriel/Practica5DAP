package ull.patrones.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import ull.patrones.estrategia.Ev_atasco;
import ull.patrones.estrategia.IEvento;
import ull.patrones.singleton.ColaSingleton;

public class VentanaPrincipal extends JFrame
{	//ATRIBUTOS
	private JButton m_btnAnadirEvento;
	
	private JPanel m_panelBotones;
	private ScrollPane m_scrollPanel;
	private JTextArea m_textArea;
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
		
	}
	/**
	 * Configruación del scrollPane
	 */
	private void initScrollPane()
	{
		m_textArea = new JTextArea();
		m_scrollPanel = new ScrollPane();
		m_scrollPanel.setBounds(10,30,200,110); 
		m_scrollPanel.add(m_textArea);
	}
	/**
	 * Método que crea y configura los botones
	 */
	private void configBotones()
	{
		m_btnAnadirEvento = new JButton("Añadir Evento a la Cola");
		m_btnAnadirEvento.setVisible(true);
		m_btnAnadirEvento.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				singleton(new Ev_atasco());
			}
		});
	}
	/**
	 * Agrega un elemento a la lista
	 * @param e
	 */
	private void agregaElem(String e)
	{
		m_textArea.setText(e);
	}
	private void singleton(IEvento a_evento)
	{
		ColaSingleton a = ColaSingleton.getInstancia();
		a.acolar(a_evento);
		System.out.println(a);
		agregaElem(a.toString());
		
	}
	/**
	 * Configuración de la ventana
	 */
	private void initVentana()
	{
		this.setTitle("Practica 5-DAP");
		this.setSize(400,400);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		add(m_panelBotones,BorderLayout.SOUTH);
		add(m_scrollPanel, BorderLayout.CENTER);
	}
}
