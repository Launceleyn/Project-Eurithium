import java.awt.Color;
import javax.swing.JFrame;
import asciiPanel.AsciiPanel;
import javax.swing.plaf.ColorUIResource;

public class ApplicationMain extends JFrame {
	private static final long serialVersionUID = 105L;

    private static AsciiPanel terminal;

    public ApplicationMain(){
        super();
        terminal = new AsciiPanel(80,24);
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
        terminal.setDefaultBackgroundColor(new Color(0,0,0));
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////WORLD GENERATION////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        world newWorld = new world();
        //newWorld.generateView();

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////GAME GOES HERE//////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////       
        for(int i = 0; i < 38; i++)
        {
        	for(int j = 0; j<24; j++)
        	{
                terminal.write(newWorld.getVis(i,j), i,j, null, new ColorUIResource(0, 0, 0));//new Color(80+j, 80+i, 255)
        	}
        }
        for(int i = 0; i < 24; i++)
        {
        	terminal.write('|', 39,i, null, new ColorUIResource(0, 0, 0));
        }

        //terminal.write("R", 1,1, new Color(0, 0, 0), null);
        //terminal.write("E", 2,2, new Color(0, 0, 0),new Color(0, 0, 0));
        //terminal.write("D", 3,3, null,new ColorUIResource(255, 0, 0) );
    }
    
    
    
    
    
    
    
}