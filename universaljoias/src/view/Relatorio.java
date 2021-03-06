package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;

public class Relatorio extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Relatorio dialog = new Relatorio();
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
	public Relatorio() {
		setTitle("Relatorio");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Relatorio.class.getResource("/img/1622837_analytics_docs_documents_graph_pdf_icon.png")));
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

	}

}
