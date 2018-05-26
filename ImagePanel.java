package ChessProject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 * ImagePanel is JPanel variant for displaying BufferedImage
 * <p>
 * to maintain alpha channel in image, ImagePanel is transparent, by default.
 * 
 * @see JPanel
 * @see BufferedImage
 * @author LeNerd
 * @since 2018-05-23
 */

//To show chess pieces
public class ImagePanel extends JPanel
{
	private static final long serialVersionUID = 1241885397633460571L;

	BufferedImage image; //변수 선언

	public ImagePanel()
	{
		setOpaque(false); //no background color
	}

	/**
	 * set Image to draw
	 * 
	 * @param image
	 *            image to set.
	 */
	
	//BufferedImage를 그림
	//image를 더이상 보이지 않게 하기 위해서는 null 실행
	public void setImage(BufferedImage image)
	{
		this.image = image;
	}

	/**
	 * get current Image
	 * 
	 * @return BufferedImage
	 */
	
	//현재 보이는 이미지 출력
	public BufferedImage getImage()
	{
		return image;
	}

	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		/*
		 * inform render to use bilinear interpolation
		 */
		((Graphics2D) g).setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);

		if (image != null)
		{
			//이미지가 null이 아니라면 아래의 비율로 그린다
			/*
			 * if image is set, draw to fill.
			 * with aspect ratio
			 */
			float wr = (float)getWidth() / (float)image.getWidth();
			float hr = (float)getHeight() / (float)image.getHeight();
			
			float r = Math.min(wr, hr);

			int w = (int)(image.getWidth()*r);
			int h = (int)(image.getHeight()*r);
			g.drawImage(image, (getWidth()-w)/2,(getHeight()-h)/2,w,h, this);
		}
	}
}
