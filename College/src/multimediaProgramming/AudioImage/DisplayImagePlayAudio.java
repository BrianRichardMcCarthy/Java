package multimediaProgramming.AudioImage;

import javax.swing.*;
import java.net.URL;
import java.applet.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class DisplayImagePlayAudio extends JFrame implements WindowListener {
	// instance variables - replace the example below with your own
	private AudioClip audioClip;

	/**
	 * Constructor for objects of class DisplayImagePlayAudio
	 */
	public DisplayImagePlayAudio() {
		// initialise instance variables
		URL urlForImage = getClass().getResource("C:\\Users\\Brian\\Desktop\\Projects\\Java\\College\\src\\multimediaProgramming\\AudioImage\\images\\denmark.gif");
		add(new JLabel(new ImageIcon(urlForImage)));
		URL urlForAudio = getClass().getResource("C:\\Users\\Brian\\Desktop\\Projects\\Java\\College\\src\\multimediaProgramming\\AudioImage\\audio\\denmark.wav");
		audioClip = Applet.newAudioClip(urlForAudio);
		audioClip.play();
	}

	/**
	 * An example of a method - replace this comment with your own
	 *
	 * @param y
	 *            a sample parameter for a method
	 * @return the sum of x and y
	 */
	public static void main(String args[]) {
		// put your code here
		DisplayImagePlayAudio test = new DisplayImagePlayAudio();
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.pack();
		test.setVisible(true);
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
	}

	public void windowClosing(WindowEvent arg0) {
		audioClip.stop();
	}

	public void windowOpened(WindowEvent arg0) {
	}

	public void windowClosed(WindowEvent arg0) {
	}

	public void windowIconified(WindowEvent arg0) {
	}

	public void windowDeiconified(WindowEvent arg0) {
	}

	public void windowActivated(WindowEvent arg0) {
	}

	public void windowDeactivated(WindowEvent arg0) {
	}
}