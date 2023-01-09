package vista;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controlador.Conexion;

import javax.swing.JTable;

import javax.swing.JScrollPane;

public class FPrincipal extends JFrame {

	private JPanel contentPane;
	private JTable tablaDatos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FPrincipal frame = new FPrincipal();
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
	public FPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 416, 224);
		contentPane.add(scrollPane);
		
		tablaDatos = new JTable();
		mostrar();
		
		/*Conexion con = new Conexion();
	    Connection conexion = Conexion.getConexion();
		
		DefaultTableModel model = new DefaultTableModel();
	       model.addColumn("Rut");
	       model.addColumn("Nombre");
	       model.addColumn("Apellido");
	       model.addColumn("Telefono");
	       model.addColumn("FechaIngreso");
	       tablaDatos.setModel(model);
	       
        String sql = "select * from Persona";
	       
	       String datos[] = new String[5];
	       Statement st;
	     
	        try {
	            st = conexion.createStatement();
	            ResultSet rs = st.executeQuery(sql);
	            while(rs.next()){
	               datos[0]=rs.getString(1);
	               datos[1]=rs.getString(2);
	               datos[2]=rs.getString(3);
	               datos[3]=rs.getString(4);
	               datos[4]=rs.getString(5);
	               model.addRow(datos);
	               
	            }
	            tablaDatos.setModel(model);
	        } catch (SQLException e) {
	            JOptionPane.showMessageDialog(null, "Error al visualizar datos" + e.toString());
	        }*/
		
		scrollPane.setViewportView(tablaDatos);
	}

	private void mostrar() {
		
		   Conexion con = new Conexion();
	       Connection conexion = Conexion.getConexion();
	       
	       
	       DefaultTableModel model = new DefaultTableModel();
	       model.addColumn("Rut");
	       model.addColumn("Nombre");
	       model.addColumn("Apellido");
	       model.addColumn("Telefono");
	       model.addColumn("FechaIngreso");
	       tablaDatos.setModel(model);
	       
	       String sql = "select * from Persona";
	       
	       String datos[] = new String[5];
	       Statement st;
	     
	        try {
	            st = conexion.createStatement();
	            ResultSet rs = st.executeQuery(sql);
	            while(rs.next()){
	               datos[0]=rs.getString(1);
	               datos[1]=rs.getString(2);
	               datos[2]=rs.getString(3);
	               datos[3]=rs.getString(4);
	               datos[4]=rs.getString(5);
	               model.addRow(datos);
	               
	            }
	            tablaDatos.setModel(model);
	        } catch (SQLException e) {
	            JOptionPane.showMessageDialog(null, "Error al visualizar datos" + e.toString());
	        }
	}
}
