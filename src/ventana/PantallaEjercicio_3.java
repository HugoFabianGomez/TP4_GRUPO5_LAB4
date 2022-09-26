package ventana;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaEjercicio_3 extends JFrame {

	private static final long serialVersionUID = 1L;
	ButtonGroup GrupoDeRadios;
	private JPanel contentPane;
	private String SistemaOperativo;
	private String Especialidad;
	private String Mensaje;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaEjercicio_3 frame = new PantallaEjercicio_3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PantallaEjercicio_3() {

		GrupoDeRadios = new ButtonGroup();

		setBounds(200, 200, 450, 280);
		setTitle("Seleccion multiple");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(34, 72, 372, -48);
		getContentPane().add(horizontalBox);

		JPanel pnlSO = new JPanel();
		pnlSO.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pnlSO.setBounds(25, 11, 381, 39);
		contentPane.add(pnlSO);
		pnlSO.setLayout(null);

		JLabel lblSistemaOperativo = new JLabel("Elige un sistema operativo");
		lblSistemaOperativo.setBounds(10, 8, 161, 15);
		pnlSO.add(lblSistemaOperativo);
		lblSistemaOperativo.setFont(new Font("Tahoma", Font.BOLD, 12));

		JRadioButton rbtnWindows = new JRadioButton("Windows");
		rbtnWindows.setBounds(177, 5, 78, 23);
		pnlSO.add(rbtnWindows);
		GrupoDeRadios.add(rbtnWindows);

		JRadioButton rbtnMac = new JRadioButton("Mac");
		rbtnMac.setBounds(257, 5, 55, 23);
		pnlSO.add(rbtnMac);
		GrupoDeRadios.add(rbtnMac);

		JRadioButton rbtnLinux = new JRadioButton("Linux");
		rbtnLinux.setBounds(310, 5, 65, 23);
		pnlSO.add(rbtnLinux);
		GrupoDeRadios.add(rbtnLinux);

		JPanel pnlEspecialidad = new JPanel();
		pnlEspecialidad.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pnlEspecialidad.setBounds(25, 61, 381, 95);
		contentPane.add(pnlEspecialidad);
		pnlEspecialidad.setLayout(null);

		JLabel lblEspecialidad = new JLabel("Elige una especialidad");
		lblEspecialidad.setBounds(10, 34, 132, 15);
		pnlEspecialidad.add(lblEspecialidad);
		lblEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 12));

		JCheckBox cbxAdministracion = new JCheckBox("Administracion");
		cbxAdministracion.setBounds(169, 31, 145, 23);
		pnlEspecialidad.add(cbxAdministracion);

		JCheckBox cbxDiseñoGrafico = new JCheckBox("Diseño grafico");
		cbxDiseñoGrafico.setBounds(169, 57, 145, 23);
		pnlEspecialidad.add(cbxDiseñoGrafico);

		JCheckBox cbxProgramacion = new JCheckBox("Programacion");
		cbxProgramacion.setBounds(169, 7, 145, 23);
		pnlEspecialidad.add(cbxProgramacion);

		JPanel pnlHoras = new JPanel();
		pnlHoras.setBounds(25, 167, 381, 34);
		contentPane.add(pnlHoras);
		pnlHoras.setLayout(null);

		JLabel lblCantidadDeHoras = new JLabel("Cantidad de horas en la computadora:");
		lblCantidadDeHoras.setBounds(10, 5, 235, 15);
		pnlHoras.add(lblCantidadDeHoras);
		lblCantidadDeHoras.setFont(new Font("Tahoma", Font.BOLD, 12));

		JTextPane txtHoras = new JTextPane();
		txtHoras.setBounds(255, 5, 85, 20);
		pnlHoras.add(txtHoras);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (validarDatos() == 1) {
					if (rbtnWindows.isSelected()) {
						SistemaOperativo = "Windows - ";
					} else if (rbtnMac.isSelected()) {
						SistemaOperativo = "Mac - ";
					} else if (rbtnLinux.isSelected()) {
						SistemaOperativo = "Linux - ";
					}

					Especialidad = "";
					if (cbxAdministracion.isSelected()) {
						Especialidad += "Administracion - ";
					}
					if (cbxDiseñoGrafico.isSelected()) {
						Especialidad += "Diseño Grafico - ";
					}
					if (cbxProgramacion.isSelected()) {
						Especialidad += "Programacion - ";
					}
					Mensaje = SistemaOperativo + Especialidad + txtHoras.getText() + " Hs";
					JOptionPane.showMessageDialog(null, Mensaje);
				} else if (validarDatos() == -1){
					JOptionPane.showMessageDialog(null, "Debe completar todos los campos!");
				} else if (validarDatos() == -2){
					JOptionPane.showMessageDialog(null, "Debe completar el campo con un numero!");
				}
			}

			private int validarDatos() {
				if (rbtnWindows.isSelected()) {
				} else if (rbtnMac.isSelected()) {
				} else if (rbtnLinux.isSelected()) {
				} else {
					return -1;
				}

				if (cbxAdministracion.isSelected()) {
				} else if (cbxDiseñoGrafico.isSelected()) {
				} else if (cbxProgramacion.isSelected()) {
				} else {
					return -1;
				}

				if (txtHoras.getText().isEmpty()) {
					return -1;
				} else if (ValidarNumero(txtHoras.getText()) == false) {
					return -2;
				}
				return 1;
			}
		});
		btnAceptar.setBounds(317, 207, 89, 23);
		contentPane.add(btnAceptar);
	}

	public static boolean ValidarNumero(String n) {
		if (n == null || n.equals("")) {
			return false;
		}

		for (int i = 0; i < n.length(); i++) {
			char c = n.charAt(i);
			if (c < '0' || c > '9') {
				return false;
			}
		}
		return true;
	}
}
