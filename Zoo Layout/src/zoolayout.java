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
    	
    	//aparently makes this entire thing start
        String zoo =  "welcome to the zoo";
        
        label = new JLabel(zoo);
        /*
        
        label.setFont(new Font("Serif", Font.PLAIN, 14));
        label.setForeground(new Color(250, 50, 25));
       
        */
        createMenuBar();

        
setTitle("Submenu");
setSize(300, 500);
setLocationRelativeTo(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
JButton quitButton = new JButton("Quit");

quitButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent event) {
        System.exit(0);
    }
});

//creates quit button
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

       
       //classifies the different sub-menus there will be
       JMenu fileMenu = new JMenu("Habitats");
        JMenu impMenu = new JMenu("Aquarium");
        JMenu varMenu = new JMenu("Garden");
        JMenu zarMenu = new JMenu("icecastle");
        JMenu parMenu = new JMenu("plains");
      
        //aquarium
        JMenuItem squidMi = new JMenuItem("squid" );
        JMenuItem dolphinMi = new JMenuItem("dolphin" );
        
        //dolphin sub-menu and habitat launching
        impMenu.add(dolphinMi);
        dolphinMi.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent event) {
        		Dolphin dolfin = new Dolphin();
        		dolfin.go();
        		dolfin.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        	}
        });
        
        //squid sub-menu and habitat launching
        impMenu.add(squidMi);
        squidMi.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent event) {
        		Squid squid = new Squid();
        		squid.go();
        		squid.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        	}
        });
       
        //garden
        
        //bunny sub-menu and habitat launching
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
        
        //plains
        
        //lion
        JMenuItem LionMi = new JMenuItem("lion");
        
        varMenu.add(bunnyMi);
        LionMi.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent event) {
        		Lion lion = new Lion();
        		lion.go();
        		lion.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        		
        	}
        });
        
        
        //ice castle
        
        //penguin sub-menu and habitat launching
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
       
        //code for exiting habitat list
        JMenuItem exitMi = new JMenuItem("Exit habitat list", iconExit);
        exitMi.setToolTipText("Exit application");

        exitMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
        
        //classifies sub-menus
        fileMenu.add(impMenu);
        fileMenu.addSeparator();
        fileMenu.add(varMenu);
        fileMenu.addSeparator();
        fileMenu.add(zarMenu);
        fileMenu.addSeparator();
        fileMenu.add(parMenu);
        fileMenu.addSeparator();
        fileMenu.addSeparator();
        fileMenu.add(exitMi);

        menubar.add(fileMenu);

        setJMenuBar(menubar);        
    }
    
    //code for running actual program
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

            
            
        
            

   
            
            
   
            
        
    


