/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kramyer.urbano;

import kramyer.urbano.dialogs.CustomDialog;


public class ShowDialogDialogType {
    public static void main(String[] args) {
        String Message = "WARNING:\nThis is my Sample Message\n\nThis Custom Dialog was Created by Reymark Urbano. \n"
                            + "This was purely created in java.\nEnjoy!\n\nAll Rights Reserved."; //nullable
        String FrameTitle = "My Custom Dialog (WARNING TYPE)"; //nullable
        String BT = "Oh Well!"; //nullable
        CustomDialog.showMessageBox(null, Message, FrameTitle, BT, CustomDialog.WARN_MESSAGE);
        
        /* OTHER TYPES OF DIALOG:
        
        CustomDialog.INFO_MESSAGE;  //Information Type
        CustomDialog.ERR_MESSAGE;   //Error Type
        CustomDialog.QUEST_MESSAGE; //Question Type
        
        */
        
    }
}
