package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;

public class Fornecedor extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fornecedor dialog = new Fornecedor();
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
	public Fornecedor() {
		setTitle("Fornecedor");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Fornecedor.class.getResource("/img/9133518_deliveryman_delivery_logistic_shipping_icon.png")));
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

	}

}
