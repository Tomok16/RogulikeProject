package MainPackage;

import java.awt.Color;
import java.awt.event.KeyEvent;
import asciiPanel.AsciiPanel;

public class StartScreen implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		Color startColor = new Color(255);
		terminal.write("START SCREEN", 1, 1);
		terminal.writeCenter("Press ENTER to start", 22, startColor);

	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_ENTER ? new PlayerScreen() : this;
	}

}
