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
public class ConfirmDialogCustomButtontext {
    public static void main(String[] args) {
        String Message = "This is my Sample Message\n\nDo you Like this Custom Dialog?";
        String FrameTitle = "My Custom Confirm Dialog with Custom BT Text";
        String BTText = "Yah,like it!";
        String BTText2 = "I don't know!";
        
        int Choice = CustomDialog.showConfirmMessageBox(null, Message, BTText, BTText, BTText2);
        if(Choice == CustomDialog.YES_OPTION){  // yes Button Clicked
            CustomDialog.showMessageBox(null, "Me too!");
        }
        else{  // no button clicked
            CustomDialog.showMessageBox(null, "I Understand!");
        }
    }
}
