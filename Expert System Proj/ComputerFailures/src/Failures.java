/*
 * Students: Ma. Fernanda Molina & Emil Vega
 * Subject: Expert System - Neural Networks
 * Course: 7° TIC's
 * Description: System to solve basic computers failures through a knowledge-based system.
 */


import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Failures {

	public JFrame failure = new JFrame();
	public JPanel panel = new JPanel();
	
	public JLabel lblFailureTitle = new JLabel("Please choose the failures that your computer presents.");
	
	public JCheckBox chckbxReboot = new JCheckBox("Unexpected restarts or unexpected shutdowns");
	public JCheckBox chckbxAudSound = new JCheckBox("When playing an audio there is no sound");
	public JCheckBox chckbxAudMen = new JCheckBox("Does not play the audio and a message appears");
	public JCheckBox chckbxVidRep = new JCheckBox("Does not play the video");
	public JCheckBox chckbxVidMen = new JCheckBox("Does not play the video and a message appears");
	public JCheckBox chckbxClosures = new JCheckBox("Unexpected closures");
	public JCheckBox chckbxFreez = new JCheckBox("Freezing");
	public JCheckBox chckbxTime = new JCheckBox("Incorrect time and date");
	public JCheckBox chckbxHD1 = new JCheckBox("The operating system is slow");
	public JCheckBox chckbxHD2 = new JCheckBox("There are constant restarts");
	public JCheckBox chckbxHD3 = new JCheckBox("Show blue screenshots");
	public JCheckBox chckbxHD4 = new JCheckBox("There are errors when saving files");
	public JCheckBox chckbxHD5 = new JCheckBox("Metallic noise is heard");
	public JCheckBox chckbxMon1 = new JCheckBox("The monitor shows a horizontal line when turning on");
	public JCheckBox chckbxMon2 = new JCheckBox("The monitor shows blinks");
	public JCheckBox chckbxMon3 = new JCheckBox("The monitor shows no screen image");
	public JCheckBox chckbxMon4 = new JCheckBox("The monitor images do not have all the colors.");
	public JCheckBox chckbxMouse1 = new JCheckBox("The Mouse turns on and does not run");
	public JCheckBox chckbxMouse2 = new JCheckBox("The PC does not recognize the mouse");
	public JCheckBox chckbxMouse3 = new JCheckBox("The PC recognizes the mouse but does not run");
	public JCheckBox chckbxKeyboard1 = new JCheckBox("Keyboard does not respond");
	public JCheckBox chckbxKeyboard2 = new JCheckBox("The keyboard is not recognized by the PC");
	
	
	public JButton btnNext = new JButton("NEXT");
	
	public String diag="", recom="", note="";
	

	/**
	 * Create the application.
	 */
	public Failures() {
		initialize();
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxReboot.isSelected()) {
					diag="Failure selected: "+chckbxReboot.getLabel()+"\n The problem can come from dirt inside the cabinet, or a clogged fan. \nOverheating";
					recom="Failure selected: "+chckbxReboot.getLabel()+"\n- If it feels too hot coming from inside, it would be nice to clean the fan. Allow it to cool.\n"
							+ "- Make sure that the ventilation holes are not blocked and that the internal fan works.";
					note="Failure selected: "+chckbxReboot.getLabel()+"\nIf the problem persists, the power supply may be failing, or it might even be good to check the internal cables, to see if they are connected correctly.\n "
							+ "It is advisable to call the technical service.";
				}
				if (chckbxAudSound.isSelected()) {
					diag=diag+"\nFailure selected: "+chckbxAudSound.getLabel()+
							"\nThe problem may be due to drivers or maybe the speakers are damaged. Another possible cause is that the silent mode is activated.";
					
					recom=recom+"\nFailure selected: "+chckbxAudSound.getLabel()+ 
							"\n- Check if the mute function is activated.\n"
							+ "- Click on the volume icon in the taskbar or use the keyboard controls to increase the volume.\n"
							+ "- Check that the powered speakers are on (activated).\n"
							+ "- Turn off the PC and reconnect the speakers.\n"
							+ "- If headphones are connected to your PC, disconnect them.";
					note=note+"\nFailure selected: "+chckbxAudSound.getLabel()+ 
							"\nIf none of these steps solve the problem, you need to call a technical service.";
				}
				if (chckbxAudMen.isSelected()) {
					diag=diag+"\nFailure selected: "+chckbxAudMen.getLabel()+
							"\nThe problem may be due to the file format you are playing. It can also be a codec problem.";
					recom=recom+"\nFailure selected: "+chckbxAudMen.getLabel()+
							"\n- You should verify that the file you are trying to play is an audio format like: WAV or MP3.\n" + 
							"- Check that the Windows Media Player is set to automatically download the codecs.";
					note=note+"\nFailure selected: "+chckbxAudMen.getLabel()+
							"\nNote that you must be connected to the Internet to download the codec file. For more information, open Windows Media Player Help and search for codec.";
				}
				if (chckbxVidRep.isSelected()) {
					diag=diag+"\nFailure selected: "+ chckbxVidRep.getLabel() +
							"\nThe file may be damaged or in an unacceptable format";
					recom=recom+"\nFailure selected: "+ chckbxVidRep.getLabel()+
							"\nVerify that the file format is AVI, MOV, WMV, FLV or MP4.\n" + 
							"- Open the video file in a video editor, such as WinDVD Creator, and then save the file again in an accepted format.";
					note=note+"\nFailure selected: "+ chckbxVidRep.getLabel()+
							"\nIf none of these steps solve the problem, probably you have lose your file";
				}
				if (chckbxVidMen.isSelected()) {
					diag=diag+"\nFailure selected: "+ chckbxVidMen.getLabel() +
							"\nError codecs or files to play the video are lost or damaged.";
					recom=recom+"\nFailure selected "+ chckbxVidMen.getLabel()+
							"\nCheck that the Windows Media Player is set to automatically download the codecs.\n" + 
							"- 1. Click on Start, right click on My Computer and select popiedades.\n"
							+ "  2. Select the Hardware tab and click on Device Manager.\n"
							+ "  3. Click on the plus sign (+) next to Sound, video and game devices.\n"
							+ "  4. Click on the Driver tab and then on Update Driver.\n"
							+ "  5. Select Install from a list of specific locations, and then click Next.\n" 
							+ "  6. Uncheck Search for removable media.\n"
							+ "  7. Click Include this location in this search and then the Browse button.\n"
							+ "  8. Click on the plus sign (+) following the following directories: My Computer - C: \\ - Drivers.\n"
							+ "  9. Click OK, Next, and once the drivers have been updated, click Finish.\n"
							+ "  10. Turn on the PC again.";
					note=note+"\nFailure selected: "+ chckbxVidMen.getLabel()+
							"\nThe steps may vary depending on the windows version";
				}
				if (chckbxClosures.isSelected() && chckbxFreez.isSelected()) {
					diag=diag+"\nFailure selected: " + chckbxClosures.getLabel()+ " and " + chckbxFreez.getLabel()+
							"\nProblems caused by spyware. It may also be due to the lack of correct drivers for the installed hardware";
					recom=recom+"\nFailure selected: "+ chckbxClosures.getLabel()+ " and " + chckbxFreez.getLabel()+
							"\n- It will be enough to have and constantly update an anti-spyware program.\n"
							+ "- If the problem is the drivers you have to find new drivers and update or change them. In the worst case you have to change hardware.\n"
							+ "- It would also be a good idea to increase the virtual memory of the PC, so that it takes better advantage of the installed RAM.";
					note=note+"\nFailure selected: "+ chckbxClosures.getLabel()+ " and " + chckbxFreez.getLabel()+
							"\nIf you do not have a clear idea of how to solve the problem it will be better to look for technical help.";
				}
				if (chckbxTime.isSelected()) {
					diag=diag+"\nFailure selected: "+chckbxTime.getLabel()+
							"\nThe useful life of the CMOS battery has run out.";
					recom=recom+"\nFailure selected: "+chckbxTime.getLabel()+
							"\n- Before replacing the battery, restore the date and time of the operating system using the Control Panel.\n"
							+ "- These are easily replaceable. Just open the computer case and look at the main board, you should see a little circular stack that you can easily pop and replace it with a new one.";
					note=note+"\nFailure selected: "+chckbxTime.getLabel()+
							"\nThis battery is usually a battery used for any watch, so you can find it at any store.";
				}
				if((chckbxHD1.isSelected() && chckbxHD2.isSelected())||(chckbxHD3.isSelected() && chckbxHD4.isSelected())||(chckbxHD3.isSelected()&&chckbxHD5.isSelected())){
					diag = diag+"\nFailure Selected: ";
					if (chckbxHD1.isSelected() && chckbxHD2.isSelected()) {
						diag=diag+chckbxHD1.getLabel()+" and "+chckbxHD2.getLabel()+" ";
					}
					if(chckbxHD3.isSelected() && chckbxHD4.isSelected()) {
						diag=diag +chckbxHD3.getLabel()+" and "+chckbxHD4.getLabel()+" ";
					}
					if (chckbxHD3.isSelected()&&chckbxHD5.isSelected()){
						diag=diag +chckbxHD3.getLabel()+" and "+chckbxHD5.getLabel()+" ";
					}
					diag=diag+"\nProblems detected on the hard disk";
					recom=recom+"\nFailure Selected: ";
					if (chckbxHD1.isSelected() && chckbxHD2.isSelected()) {
						recom=recom+chckbxHD1.getLabel()+" and "+chckbxHD2.getLabel()+" ";
					}
					if(chckbxHD3.isSelected() && chckbxHD4.isSelected()) {
						recom=recom +chckbxHD3.getLabel()+" and "+chckbxHD4.getLabel()+" ";
					}
					if (chckbxHD3.isSelected()&&chckbxHD5.isSelected()){
						recom=recom +chckbxHD3.getLabel()+" and "+chckbxHD5.getLabel()+" ";
					}
					recom=recom+"\n- Try defragmenting the hard drive from the control panel.\n" + 
							"- If the PC is hanging, press and hold the power button for about 5 seconds or until the PC shuts down and comes back up.\n" + 
							"- It is advisable to make a backup of your documents in case the hard disk stops working definitively.\n" + 
							"- It is recommended to change hard disk.";
					note=note+"\nFailure Selected: ";
					if (chckbxHD1.isSelected() && chckbxHD2.isSelected()) {
						note=note+chckbxHD1.getLabel()+" and "+chckbxHD2.getLabel()+" ";
					}
					if(chckbxHD3.isSelected() && chckbxHD4.isSelected()) {
						note=note +chckbxHD3.getLabel()+" and "+chckbxHD4.getLabel()+" ";
					}
					if (chckbxHD3.isSelected()&&chckbxHD5.isSelected()){
						note=note +chckbxHD3.getLabel()+" and "+chckbxHD5.getLabel()+" ";
					}
					note=note+"\nIf it is necessary to replace the hard disk you will need the help of the technical service.";
				}
				if(chckbxMon1.isSelected() || chckbxMon2.isSelected() || chckbxMon3.isSelected() || chckbxMon4.isSelected()) {
					diag = diag+"\nFailure Selected: ";
					if (chckbxMon1.isSelected()) {
						diag=diag+chckbxMon1.getLabel()+" ";
					}
					if(chckbxMon2.isSelected()) {
						diag=diag +chckbxMon2.getLabel()+" ";
					}
					if(chckbxMon3.isSelected()) {
						diag=diag +chckbxMon3.getLabel()+" ";
					}
					if(chckbxMon4.isSelected()){
						diag=diag +chckbxMon4.getLabel();
					}
					diag=diag+"\nProblems detected in the Monitor";
					recom=recom+"\nFailure Selected: ";
					if (chckbxMon1.isSelected()) {
						recom=recom+chckbxMon1.getLabel()+" ";
					}
					if (chckbxMon2.isSelected()) {
						recom=recom+chckbxMon2.getLabel()+" ";
					}
					if (chckbxMon3.isSelected()) {
						recom=recom+chckbxMon3.getLabel()+" ";
					}
					if(chckbxMon4.isSelected()){
						recom=recom+chckbxMon4.getLabel();
					}
					recom=recom+"\n- Verify that video drivers of the video adapter are properly installed\n"
							+ "- This is done by viewing the System properties from Windows in the Device Manager option in the System category of the Control Panel. If you have an exclamation point, it means that a) The device's drivers are not installed correctly, b) The device has a resource conflict (IRQ) memory addresses, c) the video adapter's configuration is not correct and is corrected in the properties of the screen in the Configuration option, assigning the colors to 16,000,000 or more colors.\n"
							+ "- Reconnect the monitor plug and turn on again.\n"
							+ "- Inspect the video connector on the monitor to make sure there are no pins\n" + 
							"bent. If there are, change them.";
					note=note+"\nFailure Selected: ";
					if (chckbxMon1.isSelected()) {
						note=note+chckbxMon1.getLabel()+" ";
					}
					if (chckbxMon2.isSelected()) {
						note=note+chckbxMon2.getLabel()+" ";
					}
					if (chckbxMon3.isSelected()) {
						note=note+chckbxMon3.getLabel()+" ";
					}
					if(chckbxMon4.isSelected()){
						note=note+chckbxMon4.getLabel();
					}
					note=note+"\nIf none of these steps solve the problem, you need to call a technical service.";
				}
				if(chckbxMouse2.isSelected() || chckbxMouse1.isSelected() || chckbxMouse3.isSelected()) {
					diag = diag+"\nFailure Selected: ";
					if (chckbxMouse1.isSelected()) {
						diag=diag+chckbxMouse1.getLabel()+" ";
					}
					if(chckbxMouse2.isSelected()) {
						diag=diag +chckbxMouse2.getLabel()+" ";
					}
					if(chckbxMouse3.isSelected()){
						diag=diag +chckbxMouse3.getLabel()+" ";
					}
					diag=diag+"\nProblems detected in the Mouse";
					recom=recom+"\nFailure Selected: ";
					if (chckbxMouse1.isSelected()) {
						recom=recom+chckbxMouse1.getLabel()+" ";
					}
					if(chckbxMouse2.isSelected()) {
						recom=recom +chckbxMouse2.getLabel()+" ";
					}
					if(chckbxMouse3.isSelected()){
						recom=recom +chckbxMouse3.getLabel()+" ";
					}
					recom=recom+"\n- Verify that the mouse cable is correctly installed in its ports. Check the Mouse drivers in the device manager.\n"
							+ "- Uncover the mouse and check that the optical readers are right and the cable is not open inside with a multimeter.\n"
							+ "- Place the mouse on a mouse pad or white sheet of paper or gently wipe the light detection lenses on the bottom of the mouse with a lint-free cloth (do not use paper).";
					note=note+"\nFailure Selected: ";
					if (chckbxMouse1.isSelected()) {
						note=note+chckbxMouse1.getLabel()+" ";
					}
					if(chckbxMouse2.isSelected()) {
						note=note +chckbxMouse2.getLabel()+" ";
					}
					if(chckbxMouse3.isSelected()){
						note=note +chckbxMouse3.getLabel()+" ";
					}
					note=note+"\nIf none of these steps solve the problem, probably the mouse input port is damaged or you may have to change the mouse.";
				}
				if(chckbxKeyboard1.isSelected() || chckbxKeyboard2.isSelected()) {
					diag = diag+"\nFailure Selected: ";
					if (chckbxKeyboard1.isSelected()) {
						diag=diag+chckbxKeyboard1.getLabel()+" ";
					}
					if(chckbxKeyboard2.isSelected()){
						diag=diag +chckbxKeyboard2.getLabel()+" ";
					}
					diag=diag+"\nError detection in the keyboard.";
					recom=recom+"\nFailure Selected: ";
					if (chckbxKeyboard1.isSelected()) {
						recom=recom+chckbxKeyboard1.getLabel()+" ";
					}
					if(chckbxKeyboard2.isSelected()){
						recom=recom +chckbxKeyboard2.getLabel()+" ";
					}
					recom=recom+"\n- Check if the keyboard contacts are bent or split. If so, you have to change the keyboard.\n"
							+ "- Turn off the PC using the mouse; Reconnect the keyboard to the back of the PC and turn on the computer.\n"
							+ "- Press the DEL key to verify if the keyboard responds in MS-DOS mode. You should enter the CMOS or BIOS of the computer.\n"
							+ "- Verify that there is no system policy manager or Virus that disables the keyboard when Windows loads.\n"
							+ "- Test your keyboard with another computer. If it does not respond, replace it with a new one.";
					note=note+"\nFailure Selected: ";
					if (chckbxKeyboard1.isSelected()) {
						note=note+chckbxKeyboard1.getLabel()+" ";
					}
					if(chckbxKeyboard2.isSelected()){
						note=note +chckbxKeyboard2.getLabel()+" ";
					}
					note=note+"\nIf you think you can not solve this problem call the technical service.";
				}
				if(!diag.equals("")) {
					diagnosis();
				}else {
					JOptionPane.showMessageDialog(null, "You have not chosen any option or I can not help you with your marked options.", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
			}
			
		});
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		panel.setLayout(new MigLayout());
		lblFailureTitle.setFont(new Font("Dialog", Font.BOLD, 20));
		
		panel.add(lblFailureTitle, "wrap");
		panel.add(chckbxReboot);
		panel.add(chckbxAudSound, "skip, split2, wrap");
		panel.add(chckbxAudMen);
		panel.add(chckbxVidRep, "skip, split2, wrap");
		panel.add(chckbxVidMen);
		panel.add(chckbxClosures, "skip, split2, wrap");
		panel.add(chckbxFreez);
		panel.add(chckbxTime, "skip, split2, wrap");
		panel.add(chckbxHD1);
		panel.add(chckbxHD2, "skip, split2, wrap");
		panel.add(chckbxHD3);
		panel.add(chckbxHD4, "skip, split2, wrap");
		panel.add(chckbxHD5);
		panel.add(chckbxMon1, "skip, split2, wrap");
		panel.add(chckbxMon2);
		panel.add(chckbxMon3, "skip, split2, wrap");
		panel.add(chckbxMon4);
		panel.add(chckbxMouse1, "skip, split2, wrap");
		panel.add(chckbxMouse2);
		panel.add(chckbxMouse3, "skip, split2, wrap");
		panel.add(chckbxKeyboard1);
		panel.add(chckbxKeyboard2, "skip, split2, wrap");
		panel.add(btnNext, "alignx center");
		
		
		failure.getContentPane().add(panel);
		failure.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		failure.pack();
			
	}
	
	private void diagnosis() {
		DiagnosisNRecomendation newWindow = new DiagnosisNRecomendation(diag, recom, note);
		newWindow.diagNRecom.setVisible(true);
		failure.dispose();
	}

}
