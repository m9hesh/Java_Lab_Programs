//15. Write a program to load and display image and perform gray scale

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageLoader extends JPanel {

	private BufferedImage image;

	public ImageLoader() {
		try {
			// Load the image from a file
			File file = new File("image.jpg");
			image = ImageIO.read(file);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Draw the original image
		g.drawImage(image, 0, 0, this);

		// Convert the image to grayscale
		for (int x = 0; x < image.getWidth(); x++) {
			for (int y = 0; y < image.getHeight(); y++) {
				Color c = new Color(image.getRGB(x, y));
				int gray = (int) (0.299 * c.getRed() + 0.587 * c.getGreen() + 0.114 * c.getBlue());
				Color grayColor = new Color(gray, gray, gray);
				image.setRGB(x, y, grayColor.getRGB());
			}
		}

		// Draw the grayscale image
		g.drawImage(image, 0, image.getHeight() + 10, this);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Image Loader");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setContentPane(new ImageLoader());
		frame.setVisible(true);
	}
}
