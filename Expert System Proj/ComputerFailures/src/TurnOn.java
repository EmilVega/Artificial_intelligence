/*
 * Students: Ma. Fernanda Molina & Emil Vega
 * Subject: Expert System - Neural Networks
 * Course: 7° TIC's
 */


//import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class TurnOn {

	JFrame turnOn = new JFrame();
	JPanel panel = new JPanel();
	ButtonGroup g1 = new ButtonGroup();
	JRadioButton rdbtnSi = new JRadioButton("YES");
	JRadioButton rdbtnNo = new JRadioButton("NO");
	JLabel lblQuest = new JLabel("Does your computer turn on?");
	JButton btnNext = new JButton("NEXT");

	/**
	 * Create the application.
	 */
	public TurnOn() {
		initialize();
		
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNo.isSelected()) {
					Beep newWindow = new Beep();
					newWindow.beep.setVisible(true);
					turnOn.dispose();
				}else if(rdbtnSi.isSelected()) {
					Failures newWindow = new Failures();
					newWindow.failure.setVisible(true);
					turnOn.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "You have to choose an option", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		panel.setLayout(new MigLayout());
		lblQuest.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(lblQuest, "wrap");
		panel.add(rdbtnSi, "wrap");
		panel.add(rdbtnNo, "wrap");
		panel.add(btnNext, "alignx center");
		
		
		turnOn.getContentPane().add(panel);
		turnOn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		turnOn.pack();
		
		g1.add(rdbtnSi);
		g1.add(rdbtnNo);
		
	}

}
