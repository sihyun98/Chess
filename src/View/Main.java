package View;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
        new MainFrame("Chess");
    }
}

class MainFrame extends JFrame {
	BlockButton chessMap;
	
	public MainFrame(String title) {
		super(title);
		chessMap = new BlockButton();
		add(chessMap.getGui());
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    pack();
	    setMinimumSize(this.getSize());
	    setVisible(true);
	}
}
