/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kramyer;

import kramyer.urbano.dialogs.CustomDialog;

/**
 *
 * @author CLOMA-ALCANTARA
 */
public class ConfirmDialogDialogType {
    
    public static void main(String[] args) {
         String Message = "WARNING:\n Do you like this Custom Dialog?"; //nullable
        String FrameTitle = "My Custom Dialog (WARNING TYPE)"; //nullable
        String BT = "Yes, I Like it!"; //nullable
        String BT2 = "Not so!"; //nullable
        
        int Choice = CustomDialog.showConfirmMessageBox(null, Message, FrameTitle, BT, BT2, CustomDialog.WARN_MESSAGE);
        
        if(Choice == CustomDialog.YES_OPTION){  // yes Button Clicked
            CustomDialog.showMessageBox(null, "Me too!");
        }
        else{  // no button clicked
            CustomDialog.showMessageBox(null, "I Understand!");
        }
        
        /* OTHER TYPES OF DIALOG:
        
        CustomDialog.INFO_MESSAGE;  //Information Type
        CustomDialog.ERR_MESSAGE;   //Error Type
        CustomDialog.QUEST_MESSAGE; //Question Type
        
        */
    }
   
}
