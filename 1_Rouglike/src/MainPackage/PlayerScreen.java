package MainPackage;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class PlayerScreen implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		terminal.write("You are having fun", 1, 1);
		terminal.writeCenter("Press ENTER to win, ESCAPE to lose", 22);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()){
		case KeyEvent.VK_ESCAPE: return new LoseScreen();
		case KeyEvent.VK_ENTER: return new WinScreen();
		
		}
		return this;
	}

}
