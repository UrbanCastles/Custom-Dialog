/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kramyer.urbano;

import kramyer.urbano.dialogs.CustomDialog;


public class ShowDialogCustomButtonText {
    public static void main(String[] args) {
        String Message = "This is my Sample Message\n\nThis Custom Dialog was Created by Reymark Urbano. \nAll Rights Reserved.";
        String FrameTitle = "My Custom Dialog with Custom BT Text";
        String BTText = "Got It!";
        CustomDialog.showMessageBox(null, Message, FrameTitle, BTText);
    }
    
}
