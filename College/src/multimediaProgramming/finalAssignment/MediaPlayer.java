package multimediaProgramming.finalAssignment;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MediaPlayer extends JFrame implements WindowListener, ItemListener {

	public static Toolkit kit = Toolkit.getDefaultToolkit();
	private static Dimension screen = kit.getScreenSize();
	private String dir = "src\\multimediaProgramming\\finalAssignment\\", slashFlag = "flags\\",
			slashAudio = "anthems\\", currentAnthem = "Denmark.wav", currentFlag = "Denmark.jpg", selected;
	private ImageIcon flag = new ImageIcon(dir + slashFlag + currentFlag);
	private AudioClip audio;
	private JLabel labelImage = new JLabel(flag);
	private JComboBox country = new JComboBox();
	private JButton button = new JButton();
	private boolean isPlaying = false;
	private URL urlAudio;

	public String toString() {
		return dir + slashFlag + currentFlag;
	}

	public MediaPlayer() {
		changeAudio();
		if (!isPlaying)
			button.setText("Play");
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (isPlaying) {
					audio.stop();
					isPlaying = false;
					button.setText("Play");
				} else {
					audio.play();
					isPlaying = true;
					button.setText("Pause");
				}
			}

		});
		addDropDown();
		add(labelImage, BorderLayout.CENTER);
		add(country, BorderLayout.NORTH);
		add(button, BorderLayout.SOUTH);
		pack();
		setSize(screen.width / 2, screen.height / 2);
		setLocation(screen.width / 4, screen.height / 4);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	private void changeAudio() {
		try {
			urlAudio = MediaPlayer.class.getResource(slashAudio + currentAnthem);
			audio = Applet.newAudioClip(urlAudio);
		} catch (Exception e) {
		}
	}

	private void addDropDown() {
		country.addItem("Denmark");
		country.addItem("USA");
		country.addItem("UK");
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
		audio.stop();
		button.setText("Play");
		button.setFocusable(true);
		String[] fileType = { ".jpg", ".wav" };
		selected = (String) country.getSelectedItem();
		currentAnthem = selected + fileType[1];
		currentFlag = dir + slashFlag + selected + fileType[0];
		flag.getImage().flush();
		flag.setImage(new ImageIcon(currentFlag).getImage());
		labelImage.imageUpdate(flag.getImage(), 0, 0, 100, 100, 100);
		labelImage.repaint();
		changeAudio();
	}

	public static void main(String[] args) {
		try {
			new MediaPlayer();
		} catch (Exception e) {
		}
	}

}
