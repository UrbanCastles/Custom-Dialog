/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kramyer;

import java.awt.Color;
import javax.swing.ImageIcon;
import kramyer.urbano.dialogs.CustomDialog;


public class ConfirmDialogAddIcon {
    public static void main(String[] args) {
        String Message = "This is my Sample Message\n\nThis Custom Dialog was Created by Reymark Urbano. \nAll Rights Reserved.";
        String FrameTitle = "My Custom Dialog with Custom Background";
        
        String BT1 = "Got it!", BT2 = "More Info!";
        Color myBGColor = new Color(51,102,255); //somewhat a lighter shade of blue
        Color myFGColor = Color.YELLOW;  // change foreground color to yellow
        Color myTopColor = Color.blue;  //Color blue
        ImageIcon myIC = new ImageIcon("src/kramyer/urbano/SampleIcon.png"); // set a new icon to the Dialog

       int Choice =  CustomDialog.showConfirmMessageBox(null, Message, FrameTitle, BT1, BT2, CustomDialog.ERR_MESSAGE, myBGColor, myFGColor, myTopColor,myIC);
       if(Choice == CustomDialog.NO_OPTION){  // No Button Clicked
            CustomDialog.showMessageBox(null, "He is a 4th year College student from Calamba, Philippines!");
        }
    }
}
