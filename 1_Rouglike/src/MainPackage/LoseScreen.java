package MainPackage;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class LoseScreen implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		terminal.write("You lost!", 1, 1);
		terminal.writeCenter("Press ENTER to try again", 22);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode()==KeyEvent.VK_ENTER ? new PlayerScreen() : this;
	}

}
