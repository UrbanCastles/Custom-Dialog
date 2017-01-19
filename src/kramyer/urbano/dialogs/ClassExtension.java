/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kramyer.urbano.dialogs;

import java.awt.Component;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author CLOMA-ALCANTARA
 */
class ClassExtension {
protected static String Title = "", Msg = "", OKBT = "", CANCELBT = "";
protected static int choice = 0;
protected static Point initialClick;
protected static int FrameWidth = 1, FrameHeight = 1;
protected static JPanel ImageCanvasPanel;
protected static Boolean DisposingDialog = false;
 static Component object;


  
    
    
    
    int showConfDialog(String Title, String Msg){
        this.Title = Title;
        this.Msg = Msg;
        this.OKBT = "Yes";
        this.CANCELBT = "No";
        
        Set_Strings();
        set_Default_Icon(4); // Question Icon
       set_LOOK_AND_FEEL();
        return choice;
    }
    
    int showConfDialog(String Title, String Msg, String OKBT, String CANCELBT){
        
        this.Title = Title;
        this.Msg = Msg;
        this.OKBT = OKBT;
        this.CANCELBT = CANCELBT;
        
        Set_Strings();
        set_Default_Icon(4); // Question Icon
       set_LOOK_AND_FEEL();
        
        return choice;
    }
    
    protected static boolean set_Background_Image(Image image) {
        boolean OK = true;
      try{
        Image img2 = image.getScaledInstance((int)MyOptionPane.getSize().width,(int)MyOptionPane.getSize().height, Image.SCALE_FAST);
        ImageIcon userIcon = new ImageIcon(img2);
        FrameBG.setIcon(userIcon);}
        catch(Exception e){
            FrameBG.setIcon(null);
            OK = false;
        }  
        
        return OK;
    }
    
    protected static void set_user_Icon(ImageIcon ic){
        Image img1 = ic.getImage();
        Image img2 = img1.getScaledInstance(97, 97, Image.SCALE_SMOOTH);
        ImageIcon userIcon = new ImageIcon(img2);
        Icon_ImgView.setIcon(userIcon);
    }
    
    protected void set_Default_Icon(int Type){
    switch (Type) {
        case 0:
            Icon_ImgView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kramyer/urbano/dialogs/ERROR_MESSAGE_ICON.png")));
            break;
        case 1:
            Icon_ImgView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kramyer/urbano/dialogs/INFO_MESSAGE_ICON.png")));
            break;
        case 2:
            Icon_ImgView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kramyer/urbano/dialogs/WARNING_MESSAGE_ICON.png")));
            break;
        case 3:
            Icon_ImgView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kramyer/urbano/dialogs/QUESTION_MESSAGE_ICON.png")));
            break;
        default:
    }
    }
    
    protected static void set_LOOK_AND_FEEL(){
        MyOptionPane.setSize(jPanel5.getSize());
        MyOptionPane.setSize(FrameWidth =  jPanel5.getPreferredSize().width+20,FrameHeight = jPanel5.getPreferredSize().height+10);
        MyOptionPane.setLocationRelativeTo(object);
        MyOptionPane.setModal(true);
    }
    
    protected static void Show_DialogFrame(){
        MyOptionPane.repaint();
        Frame_Pane.show();
        Content_Pane.show();
        MyOptionPane.show();
    }
    
    protected static void Set_Strings(){
        TopBar_TITLE.setText(Title);
        MidBar_MESSAGE.setText("<html></center>"+Set_BREAKS(Msg)+"</center></html>");
        Confirm_BUTTON.setText(OKBT);
        Cancel_BUTTON.setText(CANCELBT);
    }
    
    protected static String Set_BREAKS(String Msg){
        String BreakedStr = "";
        try{
        BreakedStr = Msg.replace("\n", "<br>");}
        catch(Exception e){ BreakedStr = "";}
        
        return BreakedStr;
    }
    
    public static Frame getFrameforComponent(Component parentComponent){
        return (Frame) SwingUtilities.getAncestorOfClass(Frame.class, parentComponent);
    }

                
    protected void initComponents(Component obj) {
        DisposingDialog = false;
        object = obj;
        Frame SourceFrame = getFrameforComponent(obj);
        
        MyOptionPane = new javax.swing.JDialog(SourceFrame, "");
        Content_Pane = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        TopBar_TITLE = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Cancel_BUTTON = new javax.swing.JButton();
        Confirm_BUTTON = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        MidBar_MESSAGE = new javax.swing.JLabel();
        Icon_ImgView = new javax.swing.JLabel();
        Frame_Pane = new javax.swing.JPanel();
        FrameBG = new javax.swing.JLabel();

        MyOptionPane.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        MyOptionPane.setUndecorated(true);
        
        MyOptionPane.getContentPane().setLayout(new java.awt.CardLayout());

        Content_Pane.setOpaque(false);
        Content_Pane.setLayout(new java.awt.BorderLayout());

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 0, 51));
        jPanel6.setOpaque(false);

        TopBar_TITLE.setBackground(new java.awt.Color(51, 51, 51));
        TopBar_TITLE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TopBar_TITLE.setForeground(new java.awt.Color(255, 255, 255));
        TopBar_TITLE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TopBar_TITLE.setText("Message");
        TopBar_TITLE.setOpaque(true);
        TopBar_TITLE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TopBar_TITLEMouseDragged(evt);
            }
        });
        TopBar_TITLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TopBar_TITLEMousePressed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 0, 51));
        jPanel7.setOpaque(false);

        Cancel_BUTTON.setText("Cancel");
        Cancel_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_BUTTONActionPerformed(evt);
            }
        });

        Confirm_BUTTON.setText("Yes");
        Confirm_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_BUTTONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(Confirm_BUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cancel_BUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Cancel_BUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(Confirm_BUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 0, 51));
        jPanel8.setOpaque(false);

        MidBar_MESSAGE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MidBar_MESSAGE.setForeground(new java.awt.Color(255, 255, 255));
        MidBar_MESSAGE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Icon_ImgView.setBackground(new java.awt.Color(204, 0, 51));
        Icon_ImgView.setForeground(new java.awt.Color(255, 255, 255));
        Icon_ImgView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon_ImgView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kramyer/urbano/dialogs/INFO_MESSAGE_ICON.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Icon_ImgView, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MidBar_MESSAGE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MidBar_MESSAGE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Icon_ImgView, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(TopBar_TITLE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(TopBar_TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.add(jPanel6, java.awt.BorderLayout.CENTER);

        Content_Pane.add(jPanel5, java.awt.BorderLayout.CENTER);

        MyOptionPane.getContentPane().add(Content_Pane, "card2");

        Frame_Pane.setLayout(new java.awt.BorderLayout());

        FrameBG.setBackground(new java.awt.Color(102, 102, 102));
        FrameBG.setOpaque(true);
        Frame_Pane.add(FrameBG, java.awt.BorderLayout.CENTER);
        
        Confirm_BUTTON.setFocusable(true);
        Cancel_BUTTON.setFocusable(true);

        MyOptionPane.getContentPane().add(Frame_Pane, "card3");
        MyOptionPane.setLocationRelativeTo(obj);
    }                  

    private void Confirm_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {                                               
        choice = 1;
        DisposingDialog = true;
        MyOptionPane.dispose();
    }                                              

    private void Cancel_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {                                              
        choice = 0;
        DisposingDialog = true;
        MyOptionPane.dispose();
    }                                             
                                           

    private void TopBar_TITLEMousePressed(java.awt.event.MouseEvent evt) {                                          
        initialClick = evt.getPoint();
        TopBar_TITLE.getComponentAt(initialClick);
    }                                         

    private void TopBar_TITLEMouseDragged(java.awt.event.MouseEvent evt) {                                          
        int thisX = MyOptionPane.getLocation().x;
        int thisY = MyOptionPane.getLocation().y;
        
         // Determine how much the mouse moved since the initial click
            int xMoved = (thisX + (evt.getX())) - (thisX + initialClick.x);
            int yMoved = (thisY + (evt.getY())) - (thisY + initialClick.y);

            // Move window to this position
            int X = thisX + xMoved;
            int Y = thisY + yMoved;
            MyOptionPane.setLocation(X, Y); 
    }

    // Variables declaration - do not modify                     
    protected static javax.swing.JLabel FrameBG;
    protected static javax.swing.JButton Cancel_BUTTON;
    protected static javax.swing.JButton Confirm_BUTTON;
    protected static javax.swing.JPanel Content_Pane;
    protected static javax.swing.JPanel Frame_Pane;
    protected static javax.swing.JLabel Icon_ImgView;
    protected static javax.swing.JLabel MidBar_MESSAGE;
    protected static javax.swing.JDialog MyOptionPane;
    protected static javax.swing.JLabel TopBar_TITLE;
    protected static javax.swing.JPanel jPanel5;
    protected static javax.swing.JPanel jPanel6;
    protected static javax.swing.JPanel jPanel7;
    protected static javax.swing.JPanel jPanel8;
    
    // End of variables declaration                   
}
