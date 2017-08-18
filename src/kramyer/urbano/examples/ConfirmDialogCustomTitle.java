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
public class ConfirmDialogCustomTitle {
    public static void main(String[] args) {
        String Message = "Do you like this Custom Dialog eh?.";
        String FrameTitle = "Hey Man!";
        
        int Choice = CustomDialog.showConfirmMessageBox(null, Message, FrameTitle);
        
        if(Choice == CustomDialog.YES_OPTION){  // yes Button Clicked
            CustomDialog.showMessageBox(null, "Me too!");
        }
        else{  // no button clicked
            CustomDialog.showMessageBox(null, "I Understand!");
        }
    }
    
}
