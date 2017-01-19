/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kramyer.urbano;

import java.awt.Color;
import kramyer.urbano.dialogs.CustomDialog;

/**
 *
 * @author CLOMA-ALCANTARA
 */
public class ShowDialogCustomBGandFG {
    
    public static void main(String[] args) {
        String Message = "This is my Sample Message\n\nThis Custom Dialog was Created by Reymark Urbano. \nAll Rights Reserved.";
        String FrameTitle = "My Custom Dialog with Custom Background";
        Color myBGColor = new Color(51,102,255); //somewhat a lighter shade of blue
        Color myFGColor = Color.YELLOW;  // change foreground color to yellow

        CustomDialog.showMessageBox(null, Message, FrameTitle, "OK", CustomDialog.WARN_MESSAGE, myBGColor, myFGColor);
    }
    
}
