package ventana;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;



public class PantallaPrincipal extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton Ejercicio1;
	private JButton Ejercicio2;
	private JButton Ejercicio3;
	
	public PantallaPrincipal() {
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Accion de X
		setSize(500, 500); //Tamaño de la Frame
		setLocation(350, 350);//Ubicacion del Frame
		setTitle("Pantalla Principal"); //Titulo de la /frame
		getContentPane().setLayout(null); //Respetar el seteo del JButton
		
		Ejercicio1 = new JButton(); //Instanciacion del Boton
		Ejercicio1.setText("Ejercicio 1"); //Titulo del Boton
		Ejercicio1.setBounds(123,  59,  140,  30); //seteo de Ubicacion y Tamaño
		Ejercicio1.addActionListener(new eventoEjer1());

		Ejercicio2 = new JButton();
		Ejercicio2.setText("Ejercicio 2");
		Ejercicio2.setBounds(123,  109,  140,  30);
		Ejercicio2.addActionListener(new eventoEjer2());
		
		Ejercicio3 = new JButton();
		Ejercicio3.setText("Ejercicio 3");
		Ejercicio3.setBounds(123,  171,  140,  30);
		Ejercicio3.addActionListener(new eventoEjer3());
		
		getContentPane().add(Ejercicio1);//Lo agrega al contenedor
		getContentPane().add(Ejercicio2);
		getContentPane().add(Ejercicio3);	
	}
	
	public void Visibilidad(boolean estado) {
		setVisible(true);
	}
}

class eventoEjer1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Presiono Ejercicio 1");
		
	}
	
}

class eventoEjer2 implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Presiono Ejercicio 2");
	}
}

class eventoEjer3 implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Presiono Ejercicio 3");
	}
}
