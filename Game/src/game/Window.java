package game;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.JFrame;

/**
 * Date: 21/03/2016<br>
 * Program: 2D Game Engine<br>
 * Program Description:<br>
 * Youtube Video Link: https://www.youtube.com/playlist?list=PL8CAB66181A502179<br>
 * @author Brian McCarthy
 * @version 0.0
 *
 */
public class Window extends Canvas implements Runnable {

	/**
	 * @param serialVersionUID (long).<br>
	 * @param WIDTH (int, final & static).
	 * @param HEIGHT (int, final & static).
	 * @param SCALE (int, final & static).
	 * @param window (JFrame).
	 * @param running (boolean).
	 */
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 160, HEIGHT = WIDTH/12*9, SCALE = 3;
	private static final String NAME = "Game";
	private JFrame window = new JFrame(NAME);
	private boolean running = false;
	private int tickCounter = 0;
	private BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
	private int[] pixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();
	
	/**
	 * Constructor calls the following methods to set up the game window:
	 * <ul>
	 * <li>setMinimumSize</li>
	 * <li>setMaximumSize</li>
	 * <li>setPreferredSize</li>
	 * </ul>
	 * For @param window
	 * <ul>
	 * <li>setDefaultCloseOperation</li>
	 * <li>setLayout</li>
	 * <li>add</li>
	 * <li>pack</li>
	 * <li>setResizable</li>
	 * <li>setLocationRelativeTo</li>
	 * <li>setVisible</li>
	 * </ul>
	 */
	public Window() {
		setMinimumSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
		setMaximumSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
		setPreferredSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new BorderLayout());
		window.add(this, BorderLayout.CENTER);
		window.pack();
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

	/**
	 * 
	 */
	public synchronized void start() {
		// setRunning(true);
		running = true;
		new Thread(this).start();
	}
	
	/**
	 * 
	 */
	public synchronized void stop() {
		setRunning(false);
	}
	
	/**
	 * 
	 * @param temp local variable to method setRunning. Will be assigned to class variable running
	 */
	public void setRunning(boolean temp) {
		this.running = temp;
	}
	
	/**
	 * Accessor Method to get class instance variable (running)
	 * @return current state of running variable
	 */
	public boolean getRunning() {
		return running;
	}
	
	/**
	 * 
	 */
	public void tick() {
		tickCounter++;
		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = i + tickCounter;
		}
	}
	
	/**
	 * 
	 */
	public void render() {
		BufferStrategy bs = getBufferStrategy();
		if (bs == null) {
			createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
		g.dispose();
		bs.show();
	}
	
	/**
	 * 
	 */
	public void run() {
		long lastTime = System.nanoTime(), lastTimer = System.currentTimeMillis();
		double nsPerTick = 1000000000D/60D, delta = 0;
		int ticks = 0, frames = 0;
		
		while(running) {
			long now = System.nanoTime();
			delta += (now - lastTime)/nsPerTick;
			lastTime = now;
			boolean render = false;
			while (delta >= 1) {
				ticks++;
				tick();
				delta -= 1;
				render = true;
			}
			
			try {
				Thread.sleep(2);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if (render) {
				frames++;
				render();
			}
			
			if (System.currentTimeMillis() - lastTimer >= 1000) {
				lastTimer += 1000;
				frames = 0;
				ticks = 0;
			}
		}
	}
}
