package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.VLogin;
import modelo.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContrasenia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FLogin frame = new FLogin();
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
	public FLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INICIAR SESION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(136, 11, 166, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(119, 63, 58, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(119, 111, 89, 14);
		contentPane.add(lblNewLabel_2);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(229, 62, 96, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContrasenia = new JPasswordField();
		txtContrasenia.setBounds(229, 110, 96, 20);
		contentPane.add(txtContrasenia);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ingresar();
				
				/*controlador.VLogin objVLogin = new controlador.VLogin();
		        objVLogin.validarUsuario(txtUsuario, txtContrasenia);
		        
		        vistas.FPrincipal objFPrincipal = new vistas.FPrincipal();
		        objFPrincipal.Mostrar();*/
			}
		});
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnIngresar.setBounds(173, 166, 111, 23);
		contentPane.add(btnIngresar);
	}

	protected void ingresar() {
		
		String usuario = txtUsuario.getText();
		String contrasenia = String.valueOf(txtContrasenia.getPassword());
		
		VLogin vlogin = new VLogin();
		
		Usuario usuario2 = new Usuario();
		usuario2.setUsername(usuario);
		usuario2.setPassword(contrasenia);
		
		Usuario usu = vlogin.validarUsuario(usuario2);
		
	    if (usu != null) {
			JOptionPane.showMessageDialog(contentPane, "Bienvenido");
			
			FPrincipal principal = new FPrincipal();
			principal.setVisible(true);
			
		} else {
			JOptionPane.showMessageDialog(contentPane, "Datos invalidos", "Error",JOptionPane.ERROR_MESSAGE);
		}
		
	}
}
