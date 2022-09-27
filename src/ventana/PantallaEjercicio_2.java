package ventana;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JComboBox;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Label;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class PantallaEjercicio_2 extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPaneVentana02;
	private JTextField textField_Nota1;
	private JTextField textField_Nota2;
	private JTextField textField_Nota3;
	private JTextField textField_Promedio;
	private JTextField textField_Condicion;
	private JComboBox comboBox_TPs;
	private JButton btnSalir;
	
	public PantallaEjercicio_2() {

		setTitle("Promedios...");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPaneVentana02 = new JPanel();
		contentPaneVentana02.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneVentana02);
		contentPaneVentana02.setLayout(null);
				
		Label label = new Label("Nota 1:");
		label.setBounds(50, 71, 62, 22);
		contentPaneVentana02.add(label);
		
		Label label_1 = new Label("Nota 2:");
		label_1.setBounds(50, 114, 62, 22);
		contentPaneVentana02.add(label_1);
		
		Label label_2 = new Label("Nota 3:");
		label_2.setBounds(50, 157, 62, 22);
		contentPaneVentana02.add(label_2);
		
		textField_Nota1 = new JTextField();
		textField_Nota1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_Nota1.setBounds(133, 71, 86, 20);
		textField_Nota1.addKeyListener(new KeyAdapter() { 
		public void keyTyped(KeyEvent e) {
			char caracter =e.getKeyChar();
			if(((caracter<'0')||(caracter >'9'))&&(caracter!='\b')) e.consume();
		}	
		
	});
		contentPaneVentana02.add(textField_Nota1);
		textField_Nota1.setColumns(10);
		
		textField_Nota2 = new JTextField();
		textField_Nota2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_Nota2.setColumns(10);
		textField_Nota2.setBounds(133, 115, 86, 20);
		textField_Nota2.addKeyListener(new KeyAdapter() { 
		public void keyTyped(KeyEvent e) {
			char caracter =e.getKeyChar();
			if(((caracter<'0')||(caracter >'9'))&&(caracter!='\b')) e.consume();
		}	
		
	});
		contentPaneVentana02.add(textField_Nota2);
		
		textField_Nota3 = new JTextField();
		textField_Nota3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_Nota3.setColumns(10);
		textField_Nota3.setBounds(133, 157, 86, 20);
		textField_Nota3.addKeyListener(new KeyAdapter() { 
		public void keyTyped(KeyEvent e) {
			char caracter =e.getKeyChar();
			if(((caracter<'0')||(caracter >'9'))&&(caracter!='\b')) e.consume();
		}	
		
	});
		contentPaneVentana02.add(textField_Nota3);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(335, 40, 89, 23);
		
		comboBox_TPs = new JComboBox();
		comboBox_TPs.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "Aprobado", "Desaprobado"}));
		comboBox_TPs.setToolTipText("");
		comboBox_TPs.setBounds(133, 188, 86, 22);
		contentPaneVentana02.add(comboBox_TPs);
		
		btnCalcular.addActionListener(new eventobtnCalcular(textField_Nota1, textField_Nota2, textField_Nota3));
		contentPaneVentana02.add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				textField_Nota1.setText(null);
				textField_Nota2.setText(null);
				textField_Nota3.setText(null);
				textField_Promedio.setText(null);
				textField_Condicion.setText(null);
				comboBox_TPs.setSelectedIndex(0); //trabaja por index en este caso es 0 para Seleccione
			}
		});
		btnNuevo.setBounds(335, 114, 89, 23);
		contentPaneVentana02.add(btnNuevo);
		
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Window w = SwingUtilities.getWindowAncestor(PantallaEjercicio_2.this);
				Visibilidad_2(false);
				
				//Visibilidad(false);
				//ventanaEjercicio02.disponse();
			}
		});
		btnSalir.setBounds(335, 203, 89, 23);
		contentPaneVentana02.add(btnSalir);

		
		Label label_2_1 = new Label("Promedio:");
		label_2_1.setBounds(50, 264, 62, 22);
		contentPaneVentana02.add(label_2_1);
		
		Label label_2_1_1 = new Label("Condición:");
		label_2_1_1.setBounds(50, 310, 62, 22);
		contentPaneVentana02.add(label_2_1_1);
		
		textField_Promedio = new JTextField();
		textField_Promedio.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_Promedio.setColumns(10);
		textField_Promedio.setBounds(133, 266, 86, 20);
		contentPaneVentana02.add(textField_Promedio);
		
		textField_Condicion = new JTextField();
		textField_Condicion.setEnabled(false);
		textField_Condicion.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Condicion.setColumns(10);
		textField_Condicion.setBounds(133, 312, 86, 20);
		textField_Promedio.setEnabled(false);
		contentPaneVentana02.add(textField_Condicion);
		
		
		Label label_2_2 = new Label("TPs:");
		label_2_2.setBounds(50, 185, 62, 22);
		contentPaneVentana02.add(label_2_2);
	}

	public void Visibilidad_2(boolean visible) {
		// TODO Auto-generated method stub
		setVisible(visible);
	}
	class eventobtnCalcular implements ActionListener
	{
		private JTextField Nota1, Nota2, Nota3;
		private String TPs;
		private int tps;
		private Float Valor1, Valor2, Valor3, promedio=null;
		private Boolean Promedia = true;
		
		public eventobtnCalcular(JTextField  textField_Nota1, JTextField textField_Nota2, JTextField textField_Nota3) {
			Nota1 = textField_Nota1;
			Nota2 = textField_Nota2;
			Nota3 = textField_Nota3;
			TPs = comboBox_TPs.getSelectedItem().toString();
			tps = comboBox_TPs.getSelectedIndex();
			
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
					
			///Se valida lo ingresado
			if (Nota1.getText().isEmpty()) {
				textField_Nota1.setBackground(Color.RED);
			} else {
				Nota1.setBackground(Color.WHITE);
				Valor1  = 	Float.parseFloat(Nota1.getText());
				if (Valor1 >=0 && Valor1 <=10 ) { promedio = Valor1;}
				else	{textField_Nota1.setBackground(Color.RED);
						Promedia = false;
				System.out.println("La Calificacion esta fuera de rango permitido");
				}
			}
			
			if (Nota2.getText().isEmpty()) {
				Nota2.setBackground(Color.RED);
			} else {
				Nota2.setBackground(Color.WHITE);
				Valor2 = Float.parseFloat(Nota2.getText());
				if (Valor2 >=0 && Valor2 <=10 ) {promedio += Valor2;}
				else {Nota2.setBackground(Color.RED);
				Promedia = false; promedio = null;
				System.out.println("La Calificacion esta fuera de rango permitido");
				}
			}
			
			if (Nota3.getText().isEmpty()) {
				Nota3.setBackground(Color.RED);
			} else {
				Nota3.setBackground(Color.WHITE);
				Valor3 = Float.parseFloat(Nota3.getText());
				if (Valor3 >=0 && Valor3 <=10 ) {promedio += Valor3;}
				else {Nota3.setBackground(Color.RED);
				Promedia = false; promedio = null;
					System.out.println("La Calificacion esta fuera de rango permitido");
				}
			}
			
			
			if(comboBox_TPs.getSelectedItem().toString() == "Desaprobado" ) {
				textField_Condicion.setText("Libre");
			} else
			if(Valor1 < 6 || Valor2 < 6 || Valor3 < 6) {
				textField_Condicion.setText("Libre");
			} else 
			if(Valor1 >= 8 && Valor2 >= 8 && Valor3 >= 8 && comboBox_TPs.getSelectedItem().toString() == "Aprobado") {
				textField_Condicion.setText("Promocionado");
			} else 
			
			if(comboBox_TPs.getSelectedItem().toString() == "Aprobado" && (Valor1 <= 8 || Valor2 <= 8 || Valor3 <= 8) ) {
				textField_Condicion.setText("Regular");
			}
				
			if(Promedia = true) {
				promedio = promedio/3;
				System.out.println("El promedio es  : "+ promedio);
			}
			else promedio = Float.valueOf("0.00");
			textField_Promedio.setText(String.valueOf(promedio));
		}
		
	}

}
