package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUI2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCinco;
	private JTextField txtCuatro;
	private JTextField txtTres;
	private JTextField txtUno;
	private JTextField txtDos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI2 frame = new GUI2();
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
	public GUI2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		txtUno = new JTextField();
		txtUno.setHorizontalAlignment(SwingConstants.CENTER);
		txtUno.setText("Uno");
		contentPane.add(txtUno);
		txtUno.setColumns(10);
		
		txtDos = new JTextField();
		txtDos.setHorizontalAlignment(SwingConstants.CENTER);
		txtDos.setText("Dos");
		contentPane.add(txtDos);
		txtDos.setColumns(10);
		
		txtTres = new JTextField();
		txtTres.setHorizontalAlignment(SwingConstants.CENTER);
		txtTres.setText("Tres");
		contentPane.add(txtTres);
		txtTres.setColumns(10);
		
		txtCuatro = new JTextField();
		txtCuatro.setHorizontalAlignment(SwingConstants.CENTER);
		txtCuatro.setText("Cuatro");
		contentPane.add(txtCuatro);
		txtCuatro.setColumns(10);
		
		txtCinco = new JTextField();
		txtCinco.setHorizontalAlignment(SwingConstants.CENTER);
		txtCinco.setText("Cinco");
		contentPane.add(txtCinco);
		txtCinco.setColumns(10);
	}

}
