import javax.swing.JFrame;
import asciiPanel.AsciiPanel;

public class ApplicationMain extends JFrame {
	private static final long serialVersionUID = 105L;

    private static AsciiPanel terminal;

    public ApplicationMain(){
        super();
        terminal = new AsciiPanel(80,28);
        //terminal.write("rl tutorial", 1, 1);
        add(terminal);
        pack();
    }
    
    /*Revisit me.
    public void init(){
        super.init(graphicsConfig);
        this.setSize(terminal.getWidth() + 40, terminal.getHeight() + 40);
    }
    */

    public void repaint(){
        super.repaint();
        terminal.repaint();
    }

    public static void main(String[] args) {
        ApplicationMain app = new ApplicationMain();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
        
        
        //Game Goes Here
        terminal.write("rl tutorial", 1, 1);
    }
}