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
    	
        String lyrics =  "Drawing is Life";
        
        label = new JLabel(lyrics);
        label.setFont(new Font("Serif", Font.PLAIN, 14));
        label.setForeground(new Color(250, 50, 25));

        createMenuBar();

setTitle("Submenu");
setSize(100, 250);
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
);

pack();
} 
    
    private void createMenuBar() {
        
        JMenuBar menubar = new JMenuBar();
        
        //images
        ImageIcon iconNew = new ImageIcon("new.png");
        ImageIcon iconOpen = new ImageIcon("open.png");
        ImageIcon iconSave = new ImageIcon("save.png");
        ImageIcon iconExit = new ImageIcon("exit.png");

       
        JMenu fileMenu = new JMenu("Menu");

        JMenu impMenu = new JMenu("Aquarium");

        JMenuItem aquariumMi = new JMenuItem("Aquarium");
        JMenuItem gardenMi = new JMenuItem("Garden");
        JMenuItem giftsMi = new JMenuItem("Gift shop");
        JMenuItem lunchMi = new JMenuItem("Lunch");
        JMenuItem icecastleMi = new JMenuItem("icecastle" );
        
        JMenuItem newsfMi = new JMenuItem("Import newsfeed list...");
        JMenuItem bookmMi = new JMenuItem("Import bookmarks...");
        JMenuItem mailMi = new JMenuItem("Import mail...");
        
        impMenu.add(gardenMi);
        impMenu.add(giftsMi);
        impMenu.add(lunchMi);
       
        JMenuItem aquarium1Mi = new JMenuItem("Aquarium", iconNew);
        JMenuItem garden1Mi = new JMenuItem("Garden", iconOpen);
        JMenuItem gifts1Mi = new JMenuItem("Gift shop", iconSave);
        JMenuItem lunch1Mi = new JMenuItem("Lunch", iconSave);
        JMenuItem icecastle1Mi = new JMenuItem("icecastle", iconSave);

       
        JMenuItem exitMi = new JMenuItem("Exit Submenu", iconExit);
        exitMi.setToolTipText("Exit application");

        exitMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        fileMenu.add(aquarium1Mi);
        fileMenu.add(garden1Mi);
        fileMenu.add(gifts1Mi);
        fileMenu.add(lunch1Mi);
        fileMenu.add(icecastle1Mi);
        fileMenu.addSeparator();
        fileMenu.add(impMenu);
        fileMenu.addSeparator();
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
}

            
            
        
            

   
            
            
   
            
        
    


