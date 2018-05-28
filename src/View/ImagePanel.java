package View;
/*
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;*/
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
/*import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
*/
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import Model.Block;

public class ImagePanel extends JPanel {
	private static final long serialVersionUID = 1241885397633460571L;
	BufferedImage image;
	public ImagePanel() {
		setOpaque(false);//������ ����
	}
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	public BufferedImage getImage() {
		return image;
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		((Graphics2D) g).setRenderingHint(RenderingHints.KEY_INTERPOLATION,
				RenderingHints.VALUE_INTERPOLATION_BILINEAR);

		if (image != null) {
			float wr = (float)getWidth() / (float)image.getWidth();
			float hr = (float)getHeight() / (float)image.getHeight();
			
			float r = Math.min(wr, hr);

			int w = (int)(image.getWidth()*r);
			int h = (int)(image.getHeight()*r);
			g.drawImage(image, (getWidth()-w)/2,(getHeight()-h)/2,w,h, this);
		}
	}
}

