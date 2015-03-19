import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class zoolayout extends JFrame {

	JLabel label;
    public zoolayout() {
        
        initUI();
    }

    private void initUI() {
    	
        String zoo =  "";
        
        label = new JLabel(zoo);
        /*
        
        label.setFont(new Font("Serif", Font.PLAIN, 14));
        label.setForeground(new Color(250, 50, 25));
       
        */
        createMenuBar();

setTitle("Submenu");
setSize(250, 500);
setLocationRelativeTo(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
JButton quitButton = new JButton("Quit");

quitButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent event) {
        System.exit(0);
    }
});

createLayout(quitButton);
createLayout(label);

setTitle("the best zoo evah");
}


private void createLayout(JComponent... arg) {

Container pane = getContentPane();
GroupLayout gl = new GroupLayout(pane);
pane.setLayout(gl);        

gl.setAutoCreateContainerGaps(true);

gl.setHorizontalGroup(gl.createSequentialGroup()
        .addComponent(arg[0])
);

gl.setVerticalGroup(gl.createParallelGroup()
        .addComponent(arg[0])
);}




    
    private void createMenuBar() {
        
        JMenuBar menubar = new JMenuBar();
        
        //images
        ImageIcon iconNew = new ImageIcon("new.png");
        ImageIcon iconOpen = new ImageIcon("open.png");
        ImageIcon iconSave = new ImageIcon("save.png");
        ImageIcon iconExit = new ImageIcon("exit.png");

       
       
       JMenu fileMenu = new JMenu("Habitats");
        JMenu impMenu = new JMenu("Aquarium");
        JMenu varMenu = new JMenu("Garden");
        JMenu zarMenu = new JMenu("icecastle");

       /* 
        JMenuItem aquariumMi = new JMenuItem("Aquarium");
        JMenuItem gardenMi = new JMenuItem("Garden");
        JMenuItem giftsMi = new JMenuItem("Gift shop");
        JMenuItem lunchMi = new JMenuItem("Lunch");
        JMenuItem icecastleMi = new JMenuItem("icecastle" );
      
        */
      
        //aquarium
        JMenuItem squidMi = new JMenuItem("squid" );
        JMenuItem dolphinMi = new JMenuItem("dolphin" );
        
        
        impMenu.add(dolphinMi);
        dolphinMi.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent event) {
        		Dolphin dolfin = new Dolphin();
        		dolfin.go();
        		dolfin.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        	}
        });
        
        impMenu.add(squidMi);
        squidMi.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent event) {
        		Squid squid = new Squid();
        		squid.go();
        		squid.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        	}
        });
        
       // impMenu.add(DolphinMi);
       /* DolphinMi.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent event) {
        		Dolphin dolfin = new Dolphin();
        		dolfin.go();
        		dolfin.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        	}
        });
    		*/
        //garden
        JMenuItem bunnyMi = new JMenuItem("bunny");
        
        varMenu.add(bunnyMi);
        bunnyMi.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent event) {
        		Bunbun bunbun = new Bunbun();
        		bunbun.go();
        		bunbun.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        	}
        	});
        
        //ice castle
        JMenuItem penguinMi = new JMenuItem("penguin");
        
        zarMenu.add(penguinMi);
        penguinMi.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent event) {
        		Penguin penguin = new Penguin();
        		penguin.go();
        		penguin.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        		
        	}
        });
        		
        
        
        /*
        JMenuItem aquarium1Mi = new JMenuItem("Aquarium", iconNew);
        JMenuItem garden1Mi = new JMenuItem("Garden", iconOpen);
        JMenuItem gifts1Mi = new JMenuItem("Gift shop", iconSave);
        JMenuItem lunch1Mi = new JMenuItem("Lunch", iconSave);
        JMenuItem icecastle1Mi = new JMenuItem("icecastle", iconSave);
         */
       
        JMenuItem exitMi = new JMenuItem("Exit habitat list", iconExit);
        exitMi.setToolTipText("Exit application");

        exitMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
        /*
        fileMenu.add(aquarium1Mi);
        fileMenu.add(garden1Mi);
        fileMenu.add(gifts1Mi);
        fileMenu.add(lunch1Mi);
        fileMenu.add(icecastle1Mi);
        fileMenu.addSeparator();
        */
        
        //classifies sub menus
        fileMenu.add(impMenu);
        fileMenu.addSeparator();
        fileMenu.add(varMenu);
        fileMenu.addSeparator();
        fileMenu.add(zarMenu);
        fileMenu.add(exitMi);

        menubar.add(fileMenu);

        setJMenuBar(menubar);        
    }
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                zoolayout ex = new zoolayout();
                ex.setVisible(true);
            }
        });
    }
{}}

            
            
        
            

   
            
            
   
            
        
    


