import javax.swing.JFrame;
 
public class LauncherWindows extends JFrame {
 
        public LauncherWindows(){
                this.setTitle("Minecraft Switcher");
                this.setSize(500, 450);
                this.setLocationRelativeTo(null);               
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setContentPane(new LauncherWindowsContent(this));
                this.setVisible(true);
        }
        public int getWindowsWidth(){
        	return this.getWidth();
        }
        public int getWindowsHeight(){
        	return this.getHeight();
        }
        
}
