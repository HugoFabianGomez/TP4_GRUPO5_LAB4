package ventana;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PantallaPrincipal extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton Ejercicio1;
	private JButton Ejercicio2;
	private JButton Ejercicio3;
	private JButton Mostrar;
	
	public PantallaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Accion de X
		setSize(500, 500); //Tamaño de la Frame
		setLocation(350, 350);//Ubicacion del Frame
		setTitle("Pantalla Principal");
		
		JLabel lblNewLabel = new JLabel("GRUPO NRO: 5");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(48, 11, 149, 37);
		
		Ejercicio1 = new JButton(); //Instanciacion del Boton
		Ejercicio1.setFont(new Font("Arial", Font.BOLD, 15));
		Ejercicio1.setBounds(201, 90, 170, 34);
		Ejercicio1.setText("Ejercicio 1");
		Ejercicio1.addActionListener(new eventoEjer1());

		Ejercicio2 = new JButton();
		Ejercicio2.setFont(new Font("Arial", Font.BOLD, 15));
		Ejercicio2.setBounds(201, 180, 170, 35);
		Ejercicio2.setText("Ejercicio 2");
		Ejercicio2.addActionListener(new eventoEjer2());
		
		Ejercicio3 = new JButton();
		Ejercicio3.setFont(new Font("Arial", Font.BOLD, 15));
		Ejercicio3.setBounds(201, 270, 170, 34);
		Ejercicio3.setText("Ejercicio 3");
		Ejercicio3.addActionListener(new eventoEjer3());
		
		/*Mostrar = new JButton();
		Mostrar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		Mostrar.setBounds(300, 360, 170, 30);
		Mostrar.setText("Mostrar");
		Mostrar.addActionListener(new eventoMostrar());*/
		
		getContentPane().setLayout(null);
		
		getContentPane().add(Ejercicio1);//Lo agrega al contenedor
		getContentPane().add(Ejercicio2);
		getContentPane().add(Ejercicio3);
		//getContentPane().add(Mostrar);
		getContentPane().add(lblNewLabel);
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
		PantallaEjercicio_1 ejer1 = new PantallaEjercicio_1();
		ejer1.Visibilidad_1(true);
		
	}
	
}

class eventoEjer2 implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Presiono Ejercicio 2");
		PantallaEjercicio_2 ejer2 = new PantallaEjercicio_2();
		ejer2.Visibilidad_2(true);
;	}
}

class eventoEjer3 implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Presiono Ejercicio 3");
		PantallaEjercicio_3 ejer3 = new PantallaEjercicio_3();
		ejer3.Visibilidad_3(true);
	}
}

class eventoMostrar implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Presiono Mostrar");
	}
	
}



