package MainPackage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import asciiPanel.AsciiPanel;

public class Main extends JFrame implements KeyListener {

	private static final long serialVersionUID = -3942095006060970495L;
	private AsciiPanel terminal;
	private Screen screen;

	public Main() {
		super();
		terminal = new AsciiPanel();
		add(terminal);
		pack();
		screen = new StartScreen();
		addKeyListener(this);
		repaint();

	}
	
	public void repaint(){
		terminal.clear();
		screen.displayOutput(terminal);
		super.repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		screen=screen.respondToUserInput(e);
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	public static void main(String[] args) {
		Main app = new Main();
		app.setDefaultCloseOperation(EXIT_ON_CLOSE);
		app.setVisible(true);
	}

}
