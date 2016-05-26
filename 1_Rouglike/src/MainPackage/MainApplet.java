package MainPackage;

import java.applet.Applet;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import asciiPanel.AsciiPanel;;

public class MainApplet extends Applet implements KeyListener{

	private static final long serialVersionUID = -944496907192112340L;
	private AsciiPanel terminal;
	private Screen screen;

	public MainApplet(){
		super();
		terminal = new AsciiPanel();
		terminal.write("We are going online?",1,1);
		add(terminal);
	}

	public void init(){
		super.init();
		this.setSize(terminal.getWidth() +20, terminal.getHeight()+20);
	}
	
	public void repaint(){
		super.repaint();
		terminal.repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
