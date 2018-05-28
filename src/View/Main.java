package View;

import javax.swing.JFrame;

import Model.Block;

public class Main {
	public static void main(String[] args) {
        new MainFrame("Chess");
    }
}

class MainFrame extends JFrame {
	Block chessMap;
	
	public MainFrame(String title) {
		super(title);
		chessMap = new Block();
		add(chessMap.getGui());
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    pack();
	    setMinimumSize(this.getSize());
	    setVisible(true);
	}
}
