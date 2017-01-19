/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kramyer.urbano;

import java.awt.Color;
import javax.swing.ImageIcon;
import kramyer.urbano.dialogs.CustomDialog;

/**
 *
 * @author CLOMA-ALCANTARA
 */
public class ShowDialogAddIcon {
    
    public static void main(String[] args) {
        String Message = "This is my Sample Message\n\nThis Custom Dialog was Created by Reymark Urbano. \nAll Rights Reserved.";
        String FrameTitle = "My Custom Dialog with Custom Background";
        Color myBGColor = new Color(51,102,255); //somewhat a lighter shade of blue
        Color myFGColor = Color.YELLOW;  // change foreground color to yellow
        Color myTopColor = Color.blue;  //Color blue
        ImageIcon myIC = new ImageIcon("src/kramyer/urbano/SampleIcon.png"); // set a new icon to the Dialog

        CustomDialog.showMessageBox(null, Message, FrameTitle, "OK", CustomDialog.ERR_MESSAGE, myBGColor, myFGColor, myTopColor,myIC);
    }
    
}
