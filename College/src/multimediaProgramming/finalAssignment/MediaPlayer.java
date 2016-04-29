package multimediaProgramming.finalAssignment;

import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MediaPlayer extends JFrame implements WindowListener, ItemListener {
	
	public static Toolkit kit = Toolkit.getDefaultToolkit();
	private static Dimension screen = kit.getScreenSize();
	private String 
							dir = "src\\multimediaProgramming\\finalAssignment\\", 
							slashFlag = "flags\\", 
							slashAudio = "anthems\\",
							currentAnthem = "Denmark.wav",
							currentFlag = "denmark.jpg",
							selected;
							;
	private ImageIcon flag = new ImageIcon(dir + slashFlag + currentFlag);
	// Applet.newAudioClip(dir + slashAudio + currentAnthem)
	private AudioClip audio;
	private JLabel labelImage = new JLabel(flag);
	private JComboBox country = new JComboBox();

	public String toString() {
		return dir + slashFlag + currentFlag;
	}
	
	public MediaPlayer() {
		setSize(screen.width / 2, screen.height / 2);
		setLocation(screen.width / 4, screen.height / 4);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addDropDown();
		add(labelImage, BorderLayout.CENTER);
		add(country, BorderLayout.NORTH);
		pack();
		setVisible(true);
	}
	
	private void addDropDown() {
		 country.addItem("USA");
		 country.addItem("UK");
		 country.addItem("Denmark");
		 country.addItem("Norway");
		 country.addItem("China");
		 country.addItem("India");
		 country.addItem("Germany");
		 country.addItemListener(this);
	}
	
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		audio.stop();
	}

	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		String[] fileType = {".jpg", ".wav"};
		selected = (String)country.getSelectedItem();
		currentAnthem = dir + selected + fileType[1];
		currentFlag = dir + slashFlag + selected + fileType[0];
		System.out.println(currentFlag);
		flag.getImage().flush();
		flag.setImage(new ImageIcon(currentFlag).getImage());
		labelImage.imageUpdate(flag.getImage(), 0, 0, 100, 100, 100);
		labelImage.repaint();
	}
	
	public static void main(String[] args) {
		try {
			new MediaPlayer();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
