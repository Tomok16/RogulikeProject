package MainPackage;
import javax.swing.JFrame;
import asciiPanel.AsciiPanel;

public class Main extends JFrame {

	private static final long serialVersionUID = -3942095006060970495L;
	private AsciiPanel terminal;
	
	public Main (){
		super();
		terminal = new AsciiPanel();
		terminal.write("First attemp",1,1);
		add(terminal);
		pack();
	}
	
	public static void main(String[] args) {
		Main app = new Main();
		app.setDefaultCloseOperation(EXIT_ON_CLOSE);
		app.setVisible(true);
	}
	
	static void hello(){
		System.out.println("HI");
	}
	static void iAmChanged(){
		System.out.println("Another commit");
	}
}
