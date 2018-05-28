package Model;

import javax.swing.JButton;

public class Block extends JButton{
	private int x,y;
	String pieceStatus;
	
	public Block(int x, int y, String status) {
		this.x = x;
		this.y = y;
		this.pieceStatus = status;
	}
	
	public void change (String status) {
		this.pieceStatus = status;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public String getStatus() {
		return this.pieceStatus;
	}
}
