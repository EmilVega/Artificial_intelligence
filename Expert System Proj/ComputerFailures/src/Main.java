/*
 * Students: Ma. Fernanda Molina & Emil Vega
 * Subject: Expert System - Neural Networks
 * Course: 7° TIC's
 * Description: System to solve basic computers failures through a knowledge-based system.
 */


import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Main {

	JFrame main1 = new JFrame();
	JPanel panel = new JPanel();
	JLabel lblTitle = new JLabel("<html><body>Knowledge-based System for diagnosing and <br>troubleshooting common computer problems </body></html>");
	JLabel lblAuthors = new JLabel("Made by Ma. Fernanda Molina & Emil Vega");
	JLabel lblInst = new JLabel("YACHAY TECH");
	JButton btnIniciar = new JButton("START");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.main1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TurnOn newWindow = new TurnOn();
				newWindow.turnOn.setVisible(true);
				main1.dispose();
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		panel.setLayout(new MigLayout());
		lblTitle.setFont(new Font("Dialog", Font.BOLD, 40));
		lblAuthors.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		lblInst.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		panel.add(lblTitle, "wrap");
		panel.add(lblAuthors, "alignx center, wrap");
		panel.add(lblInst, "align center, wrap");
		panel.add(btnIniciar, "alignx center");
		
		
		main1.getContentPane().add(panel);
		main1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		main1.pack();
				
		
	}

}
