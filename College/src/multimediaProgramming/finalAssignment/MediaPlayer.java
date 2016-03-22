package multimediaProgramming.finalAssignment;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Main class for Media player assignment.
 * <br>Extends Jframe class.
 * @author Brian McCarthy.
 * @version 0.2.
 */
public class MediaPlayer extends JFrame {

	/**
	 * @param KIT (Toolkit, static final).
	 * @param SCREENSIZE (Dimension, static final).
	 * @param HEIGHT (int, static final).
	 * @param WIDTH (int, static final).
	 * @param play (Button).
	 * @param stop (Button).
	 * @param title (String).
	 * @param pane (Container)
	 */
	private static final Toolkit KIT = Toolkit.getDefaultToolkit();
	private static final Dimension SCREENSIZE = KIT.getScreenSize();
	private static final int HEIGHT = SCREENSIZE.height, WIDTH = SCREENSIZE.width;

	private Button play = new Button(true, "Play"), stop = new Button(false, "Stop");
	private String title = "Media Player";
	private Container pane = getContentPane();

	/**
	 * Constructor for Media Player.
	 * <br>Calls methods: 
	 * <br>
	 * <ul>
	 * <li>addNorth().</li>
	 * <li>set().</li>
	 * </ul> 
	 */
	public MediaPlayer() {
		addNorth();
		set();
	}

	/**
	 * method to get a new instance of JPanel.
	 * @return new instance of JPanel with a layout manager of Flow layout.
	 */
	private JPanel newPanel() {
		return new JPanel(new FlowLayout());
	}

	/**
	 * addNorth() creates a new JPanel in the north region.
	 * <br> with the play and stop button in the JPanel.
	 * <br> adds action listener to both buttons to change the state.
	 */
	private void addNorth() {
		JPanel north = newPanel();
		north.add(play);
		north.add(stop);
		play.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (play.getState()) {
					play.press();
					stop.press();
				}
			}
			
		});
		stop.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (stop.getState()) {
					stop.press();
					play.press();
				}
			}
			
		});
		pane.add(north, BorderLayout.NORTH);
	}

	/**
	 * Set() calls methods:
	 * <br> 
	 * <ul>
	 * <li>setTitle().</li>
	 * <li>setDefaultCloseOperation(EXIT_ON_CLOSE).</li>
	 * <li>setSize(WIDTH/2, HEIGHT/2).</li>
	 * <li>setLocations(WIDTH/4, HEIGHT/4).</li>
	 * <li>setVisible(true).</li>
	 * </ul>
	 */
	private void set() {
		setTitle(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(WIDTH / 2, HEIGHT / 2);
		setLocation(WIDTH / 4, HEIGHT / 4);
		setVisible(true);
	}

	/**
	 * Main method to run by the compiler.
	 * @param args (String[]) not used.
	 */
	public static void main(String[] args) {
		new MediaPlayer();
	}

}
