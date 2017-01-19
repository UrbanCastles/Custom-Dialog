/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kramyer.urbano.dialogs;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import static kramyer.urbano.dialogs.ClassExtension.Confirm_BUTTON;

/**
 *
 * @author CLOMA-ALCANTARA
 */
class ConfirmationBox extends ClassExtension{
    protected static boolean No_errors_onSETTINGBT_IMG = true;
    
    
    int showConfDialog(Component obj,String Message){
        initComponents(obj);
        this.Title = "Confirm";
        if(Message != null){
        this.Msg = Message;}
        this.OKBT = "Yes";
        this.CANCELBT = "No";
        
        Set_Strings();
        set_Default_Icon(3); // Question Icon
       set_LOOK_AND_FEEL();
        Confirm_BUTTON.requestFocus();
        Show_DialogFrame();
        return choice;
    }
    
    int showConfDialog(Component obj,String Title, String Msg){
        initComponents(obj);
        if(Title!= null){
            this.Title = Title;}
        if(Msg != null){
        this.Msg = Msg;}
        this.OKBT = "Yes";
        this.CANCELBT = "No";
        
        Set_Strings();
        set_Default_Icon(3); // Question Icon
       set_LOOK_AND_FEEL();
        Confirm_BUTTON.requestFocus();
        Show_DialogFrame();
        return choice;
    }
    
    int showConfDialog(Component obj,String Title, String Msg, String OKBT, String CANCELBT){
        initComponents(obj);
        if(Title!= null){
        this.Title = Title;}
        if(Msg != null){
        this.Msg = Msg;}
        this.OKBT = OKBT;
        this.CANCELBT = CANCELBT;
        
        Set_Strings();
        set_Default_Icon(3); // Question Icon
       set_LOOK_AND_FEEL();
        Confirm_BUTTON.requestFocus();
        Show_DialogFrame();
        return choice;
    }
    
    int showConfDialog(Component obj,String Title, String Msg, String OKBT, String CANCELBT, int Type){
        initComponents(obj);
        this.Title = Title;
        this.Msg = Msg;
        this.OKBT = OKBT;
        this.CANCELBT = CANCELBT;
        
        Set_Strings();
        if((Type > 3 || Type < 0)){
            Type = 3;}
        set_Default_Icon(Type); // Question Icon
        set_LOOK_AND_FEEL();
        Confirm_BUTTON.requestFocus();
        Show_DialogFrame();
        return choice;
    }
    
    int showConfDialog(Component obj,String Title, String Msg, String OKBT, String CANCELBT, int Type, Color BackgroundColor){
        initComponents(obj);
        this.Title = Title;
        this.Msg = Msg;
        this.OKBT = OKBT;
        this.CANCELBT = CANCELBT;
        if(BackgroundColor != null){
        FrameBG.setBackground(BackgroundColor);}
        
        Set_Strings();
        if(Type > 3 || Type < 0){
            Type = 3;}
        set_Default_Icon(Type);
        set_LOOK_AND_FEEL();
        Confirm_BUTTON.requestFocus();
        Show_DialogFrame();
        return choice;
    }
    
    int showConfDialog(Component obj,String Title, String Msg, String OKBT, String CANCELBT, int Type, 
                        Color BackgroundColor, Color Message_ForegroundColor){
        initComponents(obj);
        this.Title = Title;
        this.Msg = Msg;
        this.OKBT = OKBT;
        this.CANCELBT = CANCELBT;
        if(BackgroundColor != null){
        FrameBG.setBackground(BackgroundColor);}
        if(Message_ForegroundColor != null){
        MidBar_MESSAGE.setForeground(Message_ForegroundColor);
        TopBar_TITLE.setForeground(Message_ForegroundColor);}
        
        Set_Strings();
        if(Type > 3 || Type < 0){
            Type = 3;}
        set_Default_Icon(Type);
        set_LOOK_AND_FEEL();
        Confirm_BUTTON.requestFocus();
        Show_DialogFrame();
        return choice;
    }
    
    int showConfDialog(Component obj,String Title, String Msg, String OKBT, String CANCELBT, int Type, 
                        Color BackgroundColor, Color Message_ForegroundColor, Color TopBar_Color){
        initComponents(obj);
        this.Title = Title;
        this.Msg = Msg;
        this.OKBT = OKBT;
        this.CANCELBT = CANCELBT;
        if(BackgroundColor != null){
        FrameBG.setBackground(BackgroundColor);}
        if(Message_ForegroundColor != null){
        MidBar_MESSAGE.setForeground(Message_ForegroundColor);
        TopBar_TITLE.setForeground(Message_ForegroundColor);}
        if(TopBar_Color != null){
        TopBar_TITLE.setBackground(TopBar_Color);}
        
        Set_Strings();
        if(Type > 3 || Type < 0){
            Type = 3;}
        set_Default_Icon(Type);
        set_LOOK_AND_FEEL();
        Confirm_BUTTON.requestFocus();
        Show_DialogFrame();
        return choice;
    }
    
    int showConfDialog(Component obj,String Title, String Msg, String OKBT,String CANCELBT,
                        int Type, Color BackgroundColor, Color Message_ForegroundColor, Color TopBar_Color, ImageIcon Message_Icon){
        initComponents(obj);
        this.Title = Title;
        this.Msg = Msg;
        this.OKBT = OKBT;
        this.CANCELBT = CANCELBT;
        if(BackgroundColor != null){
        FrameBG.setBackground(BackgroundColor);}
        if(Message_ForegroundColor != null){
        MidBar_MESSAGE.setForeground(Message_ForegroundColor);
        TopBar_TITLE.setForeground(Message_ForegroundColor);}
        if(TopBar_Color != null){
        TopBar_TITLE.setBackground(TopBar_Color);}
        
        if(Type > 3 || Type < 0){
            Type = 3;}
        set_Default_Icon(Type); 
        
        if(Message_Icon != null){
            set_user_Icon(Message_Icon);
        }
        
        Set_Strings();
        
        set_LOOK_AND_FEEL();
        Confirm_BUTTON.requestFocus();
        Show_DialogFrame();
        
        return choice;
    }
    
    int showConfDialog(Component obj,String Title, String Msg, String OKBT, String CANCELBT, int Type, 
                        Image Background_Image, Color Message_ForegroundColor, Color TopBar_Color, 
                        ImageIcon Message_Icon, boolean Background_isTransparent){
        initComponents(obj);
        this.Title = Title;
        this.Msg = Msg;
        this.OKBT = OKBT;
        this.CANCELBT = CANCELBT;
        if(Message_ForegroundColor != null){
        MidBar_MESSAGE.setForeground(Message_ForegroundColor);
        TopBar_TITLE.setForeground(Message_ForegroundColor);}
        if(TopBar_Color != null){
        TopBar_TITLE.setBackground(TopBar_Color);}
        
        if(Type > 3 || Type < 0){
            Type = 3;}
        set_Default_Icon(Type);
        
        if(Message_Icon != null){
            set_user_Icon(Message_Icon);
        }
        Set_Strings();
        
        
        
        
        
        set_LOOK_AND_FEEL();
       
        if(Background_Image != null){
            No_errors_onSETTINGBT_IMG = set_Background_Image(Background_Image);}
        if(Background_isTransparent && No_errors_onSETTINGBT_IMG && Background_Image != null){
            Frame_Pane.setOpaque(false);
            FrameBG.setOpaque(false);
            Content_Pane.setOpaque(false);
            MyOptionPane.getRootPane().setOpaque(false);
            MyOptionPane.getContentPane().setBackground(new Color(0,0,0,0));
            MyOptionPane.setBackground(new Color(0,0,0,0));
        }
        Confirm_BUTTON.requestFocus();
        Show_DialogFrame();
        
        return choice;
    }
}
