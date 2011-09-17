import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class LauncherWindowsContent extends JPanel {
	LauncherWindows w;
	int height;
	int width;
	int headerwidth;
	int contentwidth;
	int contentheight;
	JButton bouton173 = new JButton("Launch Minecraft 1.7.3");
	JButton bouton181 = new JButton("Launch Minecraft 1.8.1");
	JLabel labelheader = new JLabel("Choose version of minecraft");

   public LauncherWindowsContent(LauncherWindows launcherWindows) {
	   w = launcherWindows;
       JPanel south = new JPanel();
       JPanel headers = new JPanel();
       headers.setSize(50 , 50);
       headers.add(labelheader);
       south.add(bouton173);
       south.add(bouton181);
       headers.setPreferredSize( new Dimension( 600, 50));
       south.setPreferredSize( new Dimension( 600, 110));
       this.add(headers,BorderLayout.NORTH);
       this.add(south,BorderLayout.SOUTH);
   }              
}
