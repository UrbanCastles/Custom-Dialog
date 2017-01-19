/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kramyer.urbano.dialogs;

import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.accessibility.Accessible;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/**
 *
 * @author CLOMA-ALCANTARA
 */
public class CustomDialog extends JComponent implements Accessible {
    
    public static void showMessageBox(Component obj,String Msg) throws HeadlessException {
        new MessageBox().showMsgDialog(obj,Msg);
    }
    
    public static void showMessageBox(Component obj,String Msg, String Title) throws HeadlessException {
        new MessageBox().showMsgDialog(obj, Title, Msg);
    }
    
    public static void showMessageBox(Component obj,String Msg, String Title, String btTxt) throws HeadlessException {
        new MessageBox().showMsgDialog(obj, Title, Msg, btTxt);
    }
    
    public static void showMessageBox(Component obj,String Msg, String Title, String btTxt, int i) throws HeadlessException {
        new MessageBox().showMsgDialog(obj, Title, Msg, btTxt, i);
    }
    
    public static void showMessageBox(Component obj,String Msg, String Title, String btTxt, int i, Color clr) throws HeadlessException {
        new MessageBox().showMsgDialog(obj, Title, Msg, btTxt, i, clr);
    }
    
    public static void showMessageBox(Component obj,String Msg, String Title, String btTxt, int i, Color clr, Color clr1) throws HeadlessException {
        new MessageBox().showMsgDialog(obj, Title, Msg, btTxt, i, clr,clr1);
    }
    
    public static void showMessageBox(Component obj,String Msg, String Title, String btTxt, int i, Color clr, Color clr1, Color clr2) throws HeadlessException {
        new MessageBox().showMsgDialog(obj, Title, Msg, btTxt, i, clr,clr1, clr2);
    }
    
    public static void showMessageBox(Component obj,String Msg, String Title, String btTxt, int i, Color clr, Color clr1, Color clr2, ImageIcon ic) throws HeadlessException {
        new MessageBox().showMsgDialog(obj, Title, Msg, btTxt, i, clr,clr1, clr2, ic);
    }
    
    public static void showMessageBox(Component obj,String Msg, String Title, String btTxt, int i, Image img, Color clr1, Color clr2, ImageIcon ic, boolean bl) throws HeadlessException {
        new MessageBox().showMsgDialog(obj, Title, Msg, btTxt, i, img, clr1, clr2, ic, bl);
    }
    
    
    
    public static int showConfirmMessageBox(Component obj, String Msg) throws HeadlessException {
        return new ConfirmationBox().showConfDialog(obj, Msg);
    }
    
    public static int showConfirmMessageBox(Component obj, String Msg, String Title) throws HeadlessException {
        return new ConfirmationBox().showConfDialog(obj, Title, Msg);
    }
    
    public static int showConfirmMessageBox(Component obj, String Msg, String Title, String btTxt, String btTxt1) throws HeadlessException {
        return new ConfirmationBox().showConfDialog(obj, Title, Msg, btTxt, btTxt1);
    }
    
    public static int showConfirmMessageBox(Component obj,String Msg, String Title, String btTxt, String btTxt1, int i) throws HeadlessException {
        return new ConfirmationBox().showConfDialog(obj, Title, Msg, btTxt, btTxt1, i);
    }
    
    public static int showConfirmMessageBox(Component obj,String Msg, String Title, String btTxt, String btTxt1, int i, Color clr) throws HeadlessException {
        return new ConfirmationBox().showConfDialog(obj, Title, Msg, btTxt, btTxt1, i, clr);
    }
    
    public static int showConfirmMessageBox(Component obj,String Msg, String Title, String btTxt, String btTxt1, int i, Color clr, Color clr1) throws HeadlessException {
        return new ConfirmationBox().showConfDialog(obj, Title, Msg, btTxt, btTxt1, i, clr, clr1);
    }
    
    public static int showConfirmMessageBox(Component obj,String Msg, String Title, String btTxt, String btTxt1, int i, Color clr, Color clr1, Color clr2) throws HeadlessException {
        return new ConfirmationBox().showConfDialog(obj, Title, Msg, btTxt, btTxt1, i, clr, clr1, clr2);
    }
    
    public static int showConfirmMessageBox(Component obj,String Msg, String Title, String btTxt, String btTxt1, int i, Color clr, Color clr1, Color clr2, ImageIcon ic) throws HeadlessException {
        return new ConfirmationBox().showConfDialog(obj, Title, Msg, btTxt, btTxt1, i, clr, clr1, clr2, ic);
    }
    
    public static int showConfirmMessageBox(Component obj,String Msg, String Title, String btTxt, String btTxt1, int i, Image img, Color clr1, Color clr2, ImageIcon ic, boolean bl) throws HeadlessException {
        return new ConfirmationBox().showConfDialog(obj, Title, Msg, btTxt, btTxt1, i, img, clr1, clr2, ic, bl);
    }
     
    
    public static final int YES_OPTION = 1;
    public static final int NO_OPTION = 0;
    public static final int ERR_MESSAGE = 0;
    public static final int INFO_MESSAGE = 1;
    public static final int WARN_MESSAGE = 2;
    public static final int QUEST_MESSAGE = 3;
    public static final boolean TRANSPARENT_BACKGROUND = true;
    public static final boolean OPAQUE_BACKGROUND = false;
    
    
    
    
}
