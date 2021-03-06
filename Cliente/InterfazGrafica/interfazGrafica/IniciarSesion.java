package interfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Commons.Jugador;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IniciarSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static ImageIcon fondo;
	private JPasswordField ClaveUsuario;
	private JTextField txtNombre;
	JFrame yo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					IniciarSesion frame = new IniciarSesion();
					frame.setResizable(false);// no lo puedo renderizar
					frame.setVisible(true); // visible al usuario
					frame.setLocationRelativeTo(null); // para que se posisione en el medio de la pantalla

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public IniciarSesion() {
		setTitle("Inicio de sesion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 418, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		JButton btnCrearUsuario = new JButton("Crear Usuario");
		btnCrearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				CrearUsuario nuevoUsuario = new CrearUsuario(yo);
				nuevoUsuario.setLocationRelativeTo(null);
				nuevoUsuario.setResizable(false);
				nuevoUsuario.setVisible(true);

			}
		});

		ClaveUsuario = new JPasswordField();

		JLabel lblClave = new JLabel("Contraseña");
		lblClave.setHorizontalAlignment(SwingConstants.CENTER);
		lblClave.setFont(new Font("Stencil", Font.PLAIN, 20));

		JButton btnIniciar = new JButton("Iniciar Sesion");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Jugador jugador = new Jugador();
				jugador.setNombreDeUsuario(txtNombre.getText());
				// obtengo la clave del usuario para luego consultarlo en la BD
				char[] arrayDeChars = ClaveUsuario.getPassword();
				String clave = new String(arrayDeChars);
				jugador.setClaveUsuario(clave);
				
				if(jugador.getNombreDeUsuario().length()==0 || jugador.getClaveUsuario().length()==0) {
					JOptionPane.showMessageDialog(null, "Datos Incompletos", "ERROR",
							JOptionPane.ERROR_MESSAGE);	
				}
				else {
				//*BUSCAR EN BASE DE DATOS Y CONSULTAR*//
				}
				
			}
		});

		txtNombre = new JTextField();
		txtNombre.setColumns(10);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setFont(new Font("Stencil", Font.PLAIN, 20));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblUsuario, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
						.addComponent(lblClave, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
								.addComponent(btnIniciar, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE).addGap(156)
								.addComponent(btnCrearUsuario))
						.addComponent(ClaveUsuario, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
						.addComponent(txtNombre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
				.addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addGap(39).addComponent(lblUsuario).addGap(18)
				.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addGap(18).addComponent(lblClave).addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(ClaveUsuario, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE).addGap(149).addGroup(gl_panel
						.createParallelGroup(Alignment.BASELINE).addComponent(btnIniciar).addComponent(btnCrearUsuario))
				.addContainerGap()));
		panel.setLayout(gl_panel);

	}
}
