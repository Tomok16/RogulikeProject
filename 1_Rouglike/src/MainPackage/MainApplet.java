package MainPackage;

import java.applet.Applet;
import asciiPanel.AsciiPanel;;

public class MainApplet extends Applet {

	private static final long serialVersionUID = -944496907192112340L;
	private AsciiPanel terminal;

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

}
