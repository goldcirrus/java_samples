
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.Timer;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcuzzola
 */
public class TheGameMainWindow extends javax.swing.JFrame {

    /**
     * Creates new form TheGameMainWindow
     */
    private Image crowdImg;
    private Image spidermanImg;
    private Image greenGoblingImg;
    private Image bombImg;
    
    
    private int spidermanX=0;
    private int spidermanY=0;
    
    private int greenmanX=0;    //greenGoblinX
    private int greenmanY=0;
    
    private int bombX = 15;
    private int bombY = 15;
    
    private int bombStep = 5;
    private int greenGoblingStep=5;
    
    /**myTimer is a ActionListener interface implements actionEvent which can be passed into the below Timer Class constructor.
     *greenBoblingMove() method is called by MyTimer object's implement ActionListener interface automatically. */
    private MyTimer greenTimerTrigger = new MyTimer(this);          
    
   /**Create a Timer object to Fires one or more ActionEvents at specified intervals.: MyTimer object "greenTimerTrigger" is passed in as a parameter to trigger an ActionEvent. 
    *greenBoblingMove() method is called by MyTimer object(greenTimerTrigger)'s implement ActionListener interface automatically which moves one step by every Timer object's delay value.*/
    private Timer greenTimer = new Timer(10, greenTimerTrigger);    //Timer is java library class, 1 ms is the time gap, 
    
    
    
    /**Constructor to create the main frame.  */
    public TheGameMainWindow() {
        initComponents();   //netbean made it, including the main frame and the JPanel which contains redraw() method
        
        jPanel1.setVisible(false);  //can or can not see jPanel1 by true or false. jPanel1 is the score panel. 
        
        sort_example(); 
        
        /**make the additional pictures in the images fold available to the main frame and its jPanel(so the jPanel's redraw() method can use them.  */
        load_images();   
    }
    
    /**Method to create a ArrayList, then add some Integer objects and sort on them.  */
    private void sort_example()
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(23);
        numbers.add(21);
        numbers.add(15);
        numbers.add(123);
        
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
    
    /**Method to assign images from images-folder to the program's class image-variables.   */
    private void load_images()
    {
        URL imgUrl = TheGameMainWindow.class.getResource("images/crowdrun.jpg");
        
        ImageIcon imgIcon = new ImageIcon(imgUrl);
        
        crowdImg = imgIcon.getImage();
        
         
            imgUrl = TheGameMainWindow.class.getResource("images/spiderman.png");
        
            imgIcon = new ImageIcon(imgUrl);
        
            spidermanImg = imgIcon.getImage();
            
        imgUrl = TheGameMainWindow.class.getResource("images/greengoblin.png");
        
        imgIcon = new ImageIcon(imgUrl);
        
        greenGoblingImg = imgIcon.getImage();
        
           imgUrl = TheGameMainWindow.class.getResource("images/pumpkinbomb.png");
        
           imgIcon = new ImageIcon(imgUrl);
        
           bombImg = imgIcon.getImage();
        
    }
    
    
    /**Hook Method: Inner Class method built in jGameAreaJPanel constructor's paintComponent(Graphics g) method. In Design mode, right click jPanel, then choose customize code.  */
    public void redraw(java.awt.Graphics g)
    {       
                        
           //1. redraw to add several background crowd images(picture from images folder) to the jGameAreaJPanel's bottom position
           int y=jGameAreaJPanel.getHeight()-crowdImg.getHeight(null);   //fixed y location's value
           
           for(int x=0; x<jGameAreaJPanel.getWidth(); x+= crowdImg.getWidth(null))
           {
               g.drawImage(crowdImg, x, y, null);     //use parameter-Graphics object to call the drawImage method
           }        //call drawImage() method to add the image pictures to this jPanel which contains the redraw() method
             
           /**2. redraw() to add spiderman image to the jGameAreaJPanel. */
           spidermanY = y-50;    //spiderman's Y location is fixed. 
           g.drawImage(spidermanImg, spidermanX, spidermanY, null);    //spiderman's X location is controled by the mouse's X position value: by the method: private void jGameAreaJPanelMouseMoved(java.awt.event.MouseEvent evt) 
                                                                            
           /**3. redraw() to add greenGobling image to the jGameAreaJPanel.*/
           g.drawImage(greenGoblingImg, greenmanX, greenmanY, null);
           
           /**4. redraw() to repaint the jPanel to renew the jPanel to show the newly added pictures of crowds, spiderman and greenGobling. */
           jGameAreaJPanel.repaint();
           
           /**5. redraw() to add bomb image to the jGameAreaJPanel. */
           g.drawImage(bombImg,bombX, bombY,null);
           
           /**6. redraw() to check bombY: when bomb dropped out of the bottom line of the jGameAreaJPanel, show score jPanel. */
           if(bombY>jGameAreaJPanel.getHeight())      
           {
                System.out.println("you missed");
                //System.exit(0);   //terminate the program       //decides the game over
                jPanel1.setVisible(true);         //show the score jPanel
           }
           
           //when spiderman catches the bomb: renew bomb location.
           Rectangle spidermanRect = new Rectangle(spidermanX, spidermanY, spidermanImg.getWidth(null),spidermanImg.getHeight(null));     //java.awt.Rectangle, add an rectangle box enbrace the image
           Rectangle bombRect = new Rectangle(bombX, bombY, bombImg.getWidth(null), bombImg.getHeight(null));       //engrace rectangle box around bombImg
           
           /**7. redraw() to check bombRect: when it intersects spidermanRect, reset bombY to 0 and bombX to random X location.  */
           if(bombRect.intersects(spidermanRect))   //if true, renew bomb's location: bombY=0, bombX=random location
           {
               jGameAreaJPanel.repaint(bombX,bombY,bombImg.getWidth(null),bombImg.getHeight(null));  //only bomb position is changed, no other images change their positions
               bombY = 0;        //bomb Y position is renewed to the top of panel
               
               Random rand=new Random();
               bombX = rand.nextInt(jGameAreaJPanel.getWidth());   //bomb X is renewed to a random X position
               
               jGameAreaJPanel.repaint(bombX,bombY,bombImg.getWidth(null),bombImg.getHeight(null));  //only bomb position is changed, no other images change their positions
         
              
                
               /**when greenGabling is close to the randomLeftX edge of jGameAreaJPanel, change its step to negative, so going towards right. */
               if(greenmanX>bombX-150)
           {
                  jGameAreaJPanel.repaint(greenmanX,greenmanY,greenGoblingImg.getWidth(null),greenGoblingImg.getHeight(null));
                  greenGoblingStep=-5;
                  jGameAreaJPanel.repaint(greenmanX,greenmanY,greenGoblingImg.getWidth(null),greenGoblingImg.getHeight(null));
           
           }
               
              
               /**when greenGabling pass the right edge of jPanel, change its step to positive, so it goes towards left side.   */
              if(greenmanX<((bombX+350)/2))
              {
               jGameAreaJPanel.repaint(greenmanX,greenmanY,greenGoblingImg.getWidth(null),greenGoblingImg.getHeight(null));
               greenGoblingStep=5;
               jGameAreaJPanel.repaint(greenmanX,greenmanY,greenGoblingImg.getWidth(null),greenGoblingImg.getHeight(null));
              }
           }
           
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jGameAreaJPanel = new javax.swing.JPanel() {
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                redraw(g);
            }
        };
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jGameAreaJPanel.setBackground(new java.awt.Color(255, 51, 153));
        jGameAreaJPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jGameAreaJPanelMouseMoved(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jGameAreaJPanelLayout = new javax.swing.GroupLayout(jGameAreaJPanel);
        jGameAreaJPanel.setLayout(jGameAreaJPanelLayout);
        jGameAreaJPanelLayout.setHorizontalGroup(
            jGameAreaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jGameAreaJPanelLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jGameAreaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jGameAreaJPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))
                    .addComponent(jButton1))
                .addGap(49, 49, 49))
        );
        jGameAreaJPanelLayout.setVerticalGroup(
            jGameAreaJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jGameAreaJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(164, 164, 164)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");
        jMenu1.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem2);

        jMenuBar.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar.add(jMenu2);

        jMenu3.setText("jMenu3");
        jMenuBar.add(jMenu3);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jGameAreaJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jGameAreaJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**method to get mouse x-coordinate location to decide spidermanX value.   */
    private void jGameAreaJPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGameAreaJPanelMouseMoved
        spidermanX = evt.getX();      //spidermanX location is assigned by mouth's X location value
        jGameAreaJPanel.repaint();
    }//GEN-LAST:event_jGameAreaJPanelMouseMoved

    /**Method to trigger the timeing function to call greenGoblingMove() method(called in MyTimer Class-ActionListener) with the time interval decided by the Timer object(greenTimer)'s constructor.  
     greenGoblingMove() method to change greenGobling-X and bomb-Y location by their step value of pixels.*/
    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
                         
        /** .start() is the Timer Class object(greenTimer)'s built-in timing function which does eventAct defined by MyTimer Class object every delayed time by Timer object's constructor.   */
        greenTimer.start();      //Timer object start to work by its constructor's configuration: to move greenGobling-X and bomb-Y one step by each delay interval. 
        
        
        /**document the score jPanel.  */
        creat_file();
        read_file();
    }//GEN-LAST:event_jButton1MousePressed
   
   
    
    
    private void creat_file()   //write io into a file
    {
       try
       {
           PrintWriter p= new PrintWriter("whatever.kevin");
       
           p.println("line 1");
           p.println("line 2");
           p.println("line 3");
       
           p.close();
       }catch(FileNotFoundException e)
       {
          System.out.println("wrong, file not found exception");
       }
    }
    
     private void read_file()
    {
        File f = new File("whatever.kevin");
        
        try{
              Scanner scan = new Scanner(f);
              
              while(scan.hasNext()==true)
              {String x = scan.nextLine();
               System.out.println(x);
              //x = scan.nextLine();
             // System.out.println(x);
              }
        }catch(Exception e)
        {
           System.out.println("something wrong is caught.");
        }
    }
    
    /**Method to print something when the top menu bar's one select is selected.   */
    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        System.out.println("Top Manu Bar: menuItem#2 is selected.");
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    /**Method to move greenGobling's X and bomb-Y location by one step pixel value.   */
    public void greenGoblingMove()
    {    
        /**greenGobling changes x location by its one step value. */
        jGameAreaJPanel.repaint(greenmanX, greenmanY,greenGoblingImg.getWidth(null),greenGoblingImg.getHeight(null));
        greenmanX=greenmanX+greenGoblingStep;     //change greenman x value by the predefined step value for every move
        jGameAreaJPanel.repaint(greenmanX, greenmanY,greenGoblingImg.getWidth(null),greenGoblingImg.getHeight(null));  //only repaint greenGoblingImg
        //jGameAreaJPanel.repaint();   //repaint whole jPanel
        
        /**bomb changes y location by its one step value. */
        jGameAreaJPanel.repaint(bombX,bombY,bombImg.getWidth(null), bombImg.getHeight(null));
        bombY = bombY + bombStep;     //move the ball through Y axis 
        jGameAreaJPanel.repaint(bombX,bombY,bombImg.getWidth(null), bombImg.getHeight(null));  //only repaint bomb image
        
        //jGameAreaJPanel.repaint();     //reapint whole jPanel
    
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TheGameMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TheGameMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TheGameMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TheGameMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheGameMainWindow().setVisible(true);     //main class object is created here
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JPanel jGameAreaJPanel;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
