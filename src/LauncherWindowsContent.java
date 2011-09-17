import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

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
     	g.setColor(Color.RED);  
		height = w.getWindowsHeight();
		width = w.getWindowsWidth();
		headerwidth=width-100;
		contentwidth=width-50;
		contentheight=height-120;
        g.fillRoundRect((width-(headerwidth+10))/2, 10, headerwidth, 50, 10, 10);
        g.fillRoundRect((width-(contentwidth+10))/2, 70, contentwidth, contentheight, 10, 10);
		Font font = new Font("Courier", Font.BOLD, 20);
	 	g.setFont(font);
     	g.setColor(Color.BLUE);          
     	g.drawString("Minecraft Switcher", width/2, 30);
   }               
}
