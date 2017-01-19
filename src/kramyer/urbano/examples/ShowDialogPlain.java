/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kramyer.urbano;

import kramyer.urbano.dialogs.CustomDialog;

public class ShowDialogPlain {
    
    public static void main(String[] args) {
        String Message = "This is my Sample Message\n\nThis Custom Dialog was Created by Reymark Urbano. \nAll Rights Reserved.";
        CustomDialog.showMessageBox(null, Message);
    }
    
}
