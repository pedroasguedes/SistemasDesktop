package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;

public class Clietes extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clietes dialog = new Clietes();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Clietes() {
		setTitle("Clientes");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Clietes.class.getResource("/img/3709745_assistance_client_customer_employee_female_icon.png")));
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

	}

}
