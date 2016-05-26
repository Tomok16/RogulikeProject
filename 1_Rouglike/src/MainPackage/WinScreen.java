package MainPackage;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class WinScreen implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		terminal.write("You are awesome");
		terminal.writeCenter("Press ENTER to begin", 22);

	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode()==KeyEvent.VK_ENTER ? new PlayerScreen():this;
	}

}
