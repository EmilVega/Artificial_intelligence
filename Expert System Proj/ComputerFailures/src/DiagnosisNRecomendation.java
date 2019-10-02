/*
 * Students: Ma. Fernanda Molina & Emil Vega
 * Subject: Expert System - Neural Networks
 * Course: 7° TIC's
 */

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DiagnosisNRecomendation {

	public JFrame diagNRecom = new JFrame();
	public JPanel panel = new JPanel();
	public JLabel lblDiagTitle = new JLabel("Diagnosis");
	public JTextArea txaDiag;
	public JLabel lblRecomTitle = new JLabel("Recommendations");	
	public JTextArea txaRecom;
	public JLabel lblTech = new JLabel("Note");
	public JTextArea txaTech;
	public JButton home = new JButton("HOME");

	/**
	 * Create the application.
	 */
	public DiagnosisNRecomendation(String diag, String recom, String note) {
		initialize(diag, recom, note);
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main newWindow = new Main();
				newWindow.main1.setVisible(true);
				diagNRecom.dispose();
			}
		});
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String diag, String recom, String note) {
		
		lblDiagTitle.setFont(new Font("Dialog", Font.BOLD, 20));
		txaDiag = new JTextArea(diag);
		txaDiag.setEditable(false);
		txaDiag.setFont(new Font("Dialog", Font.PLAIN, 15));
		txaDiag.setLineWrap(true);
		lblRecomTitle.setFont(new Font("Dialog", Font.BOLD, 20));
		txaRecom = new JTextArea(recom);
		txaRecom.setEditable(false);
		txaRecom.setFont(new Font("Dialog", Font.PLAIN, 15));
		txaRecom.setLineWrap(true);
		lblTech.setFont(new Font("Dialog", Font.BOLD, 20));
		txaTech = new JTextArea(note);
		txaTech.setEditable(false);
		txaTech.setFont(new Font("Dialog", Font.PLAIN, 15));
		txaRecom.setLineWrap(true);
	
		panel.setLayout(new MigLayout());
		panel.add(lblDiagTitle, "wrap");
		panel.add(new JScrollPane(txaDiag), "wrap, push, grow");
		panel.add(lblRecomTitle, "wrap");
		panel.add(new JScrollPane(txaRecom), "wrap, push, grow");
		panel.add(lblTech, "wrap");
		panel.add(new JScrollPane(txaTech), "wrap, push, grow");
		panel.add(home, "align center");
		
		
		diagNRecom.getContentPane().add(panel);
		diagNRecom.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		diagNRecom.pack();
		
	}
}
