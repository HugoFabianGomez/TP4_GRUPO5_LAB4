package ventana;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class PantallaEjercicio_1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFechaNac;
	private JLabel lblDatos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaEjercicio_1 frame = new PantallaEjercicio_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaEjercicio_1() {
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 300);
		setTitle("Contactos");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(40, 43, 44, 14);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(120, 40, 169, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblApellido.setBounds(40, 74, 46, 14);
		contentPane.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(120, 71, 169, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefono.setBounds(40, 103, 57, 14);
		contentPane.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(120, 100, 169, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblFechaNac = new JLabel("FechaNac.");
		lblFechaNac.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFechaNac.setBounds(40, 134, 65, 14);
		contentPane.add(lblFechaNac);
		
		txtFechaNac = new JTextField();
		txtFechaNac.setBounds(120, 131, 169, 20);
		contentPane.add(txtFechaNac);
		txtFechaNac.setColumns(10);
		
		lblDatos = new JLabel("");
		lblDatos.setBounds(10, 197, 324, 52);
		contentPane.add(lblDatos);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(validarDatos() == true) {
					String mensaje;
					mensaje = "Los datos ingresados fueron: ";
					mensaje += txtNombre.getText() + " " + txtApellido.getText();
					mensaje += ", " + txtTelefono.getText() + ", " + txtFechaNac.getText();
					lblDatos.setText(mensaje);
				}
			}

			private boolean validarDatos() {
				boolean estado = false;
				if(txtNombre.getText().isEmpty() == true) {
					txtNombre.setBackground(Color.red);
				}
				else {
					txtNombre.setBackground(Color.white);
				}
				if(txtApellido.getText().isEmpty() == true) {
					txtApellido.setBackground(Color.red);
				}
				else {
					txtApellido.setBackground(Color.white);
				}
				if(txtTelefono.getText().isEmpty() == true) {
					txtTelefono.setBackground(Color.red);
				}
				else {
					txtTelefono.setBackground(Color.white);
				}
				if(txtFechaNac.getText().isEmpty() == true) {
					txtFechaNac.setBackground(Color.red);
				}
				else {
					txtFechaNac.setBackground(Color.white);
				}
				
				if(txtNombre.getText().isEmpty() == false && txtApellido.getText().isEmpty() == false && txtTelefono.getText().isEmpty() == false && txtFechaNac.getText().isEmpty() == false) {
					return true;
				}
				else {
					return false;
				}
			}
		})
		;
		btnMostrar.setBounds(200, 163, 89, 23);
		contentPane.add(btnMostrar);
		
		
	}
	
	public void Visibilidad_1(boolean visible) {
		// TODO Auto-generated method stub
		setVisible(visible);
	}
	
}


