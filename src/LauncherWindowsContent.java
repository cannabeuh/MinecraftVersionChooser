import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class LauncherWindowsContent extends JPanel {
	LauncherWindows w;
	int height;
	int width;
	int headerwidth;
	int contentwidth;
	int contentheight;
   public LauncherWindowsContent(LauncherWindows launcherWindows) {
	   w = launcherWindows;
   }
public void paintComponent(Graphics g){
		height = w.getWindowsHeight();
		width = w.getWindowsWidth();
		headerwidth=width-60;
		contentwidth=width-45;
		contentheight=height-120;
		g.fillRoundRect((width-(headerwidth+5))/2, 10, headerwidth, 50, 10, 10);
        g.fillRoundRect((width-(contentwidth+5))/2, 70, contentwidth, contentheight, 10, 10);
		Image img;
		try {
			img = ImageIO.read(new File("header.png"));
			g.drawImage(img, width-headerwidth, 10, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

   }               
}
