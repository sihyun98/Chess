package Model;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.net.URL;
import java.awt.image.BufferedImage;

public class Block {

    private JPanel gui = new JPanel(new GridLayout());
    private JButton[][] Squares = new JButton[8][8];
    private JPanel chessMap;
    public Block() {
        makeGui();
    }
    public void makeGui() {
        chessMap = new JPanel(new GridLayout(0, 8)); 
        gui.add(chessMap);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                JButton button = new JButton();
                button.setPreferredSize(new Dimension (100,100));
                if ((j % 2 == 0 && i % 2 == 0)||(j % 2 == 1 && i % 2 == 1)) {
                    button.setBackground(Color.WHITE);
                } else {
                    button.setBackground(Color.BLACK);
                }
                Squares[i][j] = button;
                chessMap.add(button);
            }
        }
    }
    public JComponent getGui() {
        return gui;
    }
    public static void main(String[] args) {
        JFrame mainframe = new JFrame("Chess");
    	Block chessMap = new Block();
        mainframe.add(chessMap.getGui());
        mainframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainframe.pack();
        mainframe.setMinimumSize(mainframe.getSize());
        mainframe.setVisible(true);
    }
}