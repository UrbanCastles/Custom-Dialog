/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kramyer.urbano;

import kramyer.urbano.dialogs.CustomDialog;

/**
 *
 * @author CLOMA-ALCANTARA
 */
public class ConfirmDialogPlain {
    public static void main(String[] args) {
        String Message = "Do you like this Custom Dialog ahh?";
        
        int Choice = CustomDialog.showConfirmMessageBox(null, Message);
        
        if(Choice == CustomDialog.YES_OPTION){  // yes Button Clicked
            CustomDialog.showMessageBox(null, "Me too!");
        }
        else{  // no button clicked
            CustomDialog.showMessageBox(null, "I Understand!");
        }
    }
}
