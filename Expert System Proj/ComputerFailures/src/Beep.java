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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Beep {

	JFrame beep = new JFrame();
	JFrame beepMenu = new JFrame();
	JPanel panel = new JPanel();
	ButtonGroup g1 = new ButtonGroup();
	JLabel lblQuest = new JLabel("When you press the power button, do you hear a beep?");
	JRadioButton rdbtnSi = new JRadioButton("YES");
	JRadioButton rdbtnNo = new JRadioButton("NO");
	JButton btnNext = new JButton("NEXT");
	

	/**
	 * Create the application.
	 */
	public Beep() {
		initialize();
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNo.isSelected()) {
					noBeep();
				}else if(rdbtnSi.isSelected()) {
					beepMenu();
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
		g1.add(rdbtnSi);
		g1.add(rdbtnNo);
		
		panel.add(lblQuest, "wrap");
		panel.add(rdbtnSi, "wrap");
		panel.add(rdbtnNo, "wrap");
		panel.add(btnNext, "alignx center");
		
		
		beep.getContentPane().add(panel);
		beep.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		beep.pack();
		
		
		
	}
	
	private void noBeep() {
		String diag = ("If the computer does not turn on and no beep is heard, then it is an electronic or electrical problem.");
		String recom = ("- Make sure the PC power wire is plugged in.\n"+ 
				"- Try plugging the PC into another socket.\n" + 
				"- Verify that the power supply is in the on position.\n"+
				"- Make sure the power supply is at the appropriate voltage for your region.\n"+
				"- Replace the power wire with one that is sure it is working.\n"+
				"- Unplug all external devices from the PC - including a CD disk or digital camera - with the exception of the monitor. If the computer turns on without the devices, reconnect the peripherals one at a time until you can identify the device with the problem.");
		String note = ("If none of these steps solve the problem, see if your computer still has its current warranty and, if so, send the equipment to the manufacturer. If the warranty has expired call a technical service.");
		DiagnosisNRecomendation newWindow = new DiagnosisNRecomendation(diag, recom, note);
		newWindow.diagNRecom.setVisible(true);
		beep.dispose();
		
	}
	
	private void beepMenu() {
		JPanel panel2 = new JPanel();
		JLabel lblQuest2 = new JLabel("How many and how are the beeps you hear?");
		lblQuest2.setFont(new Font("Dialog", Font.PLAIN, 20));
		ButtonGroup g2 = new ButtonGroup();
		JRadioButton rdbtn1 = new JRadioButton("Continuous tone");
		JRadioButton rdbtn2 = new JRadioButton("Six short tones");
		JRadioButton rdbtn3 = new JRadioButton("Two long tones and one short");
		JRadioButton rdbtn4 = new JRadioButton("Others");
		g2.add(rdbtn1);
		g2.add(rdbtn2);
		g2.add(rdbtn3);
		g2.add(rdbtn4);
		JButton next2 = new JButton("NEXT");
		next2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtn1.isSelected()) {
					contTone();
				}else if(rdbtn2.isSelected()) {
					sixTone();
				}else if(rdbtn3.isSelected()) {
					twoNOneTone();
				}else if(rdbtn4.isSelected()) {
					others();
				}else {
					JOptionPane.showMessageDialog(null, "You have to choose an option", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		panel2.setLayout(new MigLayout());
		panel2.add(lblQuest2, "wrap");
		panel2.add(rdbtn1, "wrap");
		panel2.add(rdbtn2, "wrap");
		panel2.add(rdbtn3, "wrap");
		panel2.add(rdbtn4, "wrap");
		panel2.add(next2, "alignx center");
		
		beepMenu.getContentPane().add(panel2);
		beepMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		beepMenu.pack();
		beepMenu.setVisible(true);
		beep.dispose();
	}
	
	private void contTone() {
		String diag = ("Error in the power supply (the power goes bad, or the supply box is annoyed)");
		String recom = ("There is no other solution than replacing the power supply box.");
		String note = ("To change the electrical supply box, it is better to call a technical service.");
		DiagnosisNRecomendation newWindow = new DiagnosisNRecomendation(diag, recom, note);
		newWindow.diagNRecom.setVisible(true);
		beepMenu.dispose();
	}
	
	private void sixTone() {
		String diag = ("Error detection in the keyboard");
		String recom = ("Try with another keyboard. If it does not work it is the input port of the keyboard.");
		String note = ("If the problem is the input port of the keyboard, it is better to call a technical service.");
		DiagnosisNRecomendation newWindow = new DiagnosisNRecomendation(diag, recom, note);
		newWindow.diagNRecom.setVisible(true);
		beepMenu.dispose();
	}
	
	private void twoNOneTone() {
		String diag = ("Error detection in the monitor");
		String recom = ("- Try with another wire to conect the monitor.\n"+
				"- Try with another monitor.\n"+
				"- If it does not work it is the input port of the monitor.\n"+
				"- If it was connected through the VGA port, try to connect through the HDMI port or vice versa.");
		String note = ("If none of these steps solve the problem, you need to call a technical service.");
		DiagnosisNRecomendation newWindow = new DiagnosisNRecomendation(diag, recom, note);
		newWindow.diagNRecom.setVisible(true);
		beepMenu.dispose();
	}
	
	private void others() {
		String diag = ("Error detection in the internal hardware");
		String recom = ("You should check according to your type of BIOS and the number of beeps you hear to know what the precise error is. (This you can do on the internet).");
		String note = ("Even though you find the specific hardware that is giving you problems, it is very likely that you will have to call the technical service to solve it..");
		DiagnosisNRecomendation newWindow = new DiagnosisNRecomendation(diag, recom, note);
		newWindow.diagNRecom.setVisible(true);
		beepMenu.dispose();
	}

}
