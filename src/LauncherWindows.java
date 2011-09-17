import java.awt.Color;

import javax.swing.JFrame;
 
public class LauncherWindows extends JFrame {
 
        public LauncherWindows(){
                this.setTitle("Minecraft Switcher");
                this.setSize(600, 200);
                this.setLocationRelativeTo(null);               
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setContentPane(new LauncherWindowsContent(this));
                this.setVisible(true);
                this.setResizable(false);
                this.setBackground(Color.GRAY);
        }
        public int getWindowsWidth(){
        	return this.getWidth();
        }
        public int getWindowsHeight(){
        	return this.getHeight();
        }
        
}
