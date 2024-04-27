/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import static Models.DataPassword.passData;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class ListPasswordPage extends BasePage {
    
    public ListPasswordPage(int width){
        super("Password List Page", width);
    }
    
    @Override
    public void drawContent(){
        this.label.text = "Terdapat " + passData.size()+ " tersimpan.";
        this.label.draw();
        this.label.text = "---- ---- ----";
        this.label.draw();
        //print semua password
        ArrayList<PasswordStore> passwords = DataPassword.passData;
        for (PasswordStore password : passwords) {

            String colName = String.format("| %-25s", password.name);
            String colUsername = String.format("| %-25s", password.username);
            String colCategory = String.format("| %-25s |", password.getCategory());

            this.label.text = "  " + colName + colUsername + colCategory;
            this.label.draw();
        }

        this.space.draw();
        new MainPage(width).draw();
    }
    
   
}

/*
Nama : Filipus Arif Kristiyan
Nim  : A11.2022.14278
Kel  : A11.44UG1
tgl  : 8 April 2024
*/

