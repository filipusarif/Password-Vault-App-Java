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
public class DetailPage extends BasePage {
    private PasswordStore passStr;
    private SelectInput actions;
    private int id;
    
    public DetailPage(int id , String name,int width){
        super("AKUN: " + name , width);
        this.id = id;
        passStr = passData.get(id);
        String [] actionOptions = {"Hapus Password", "Kembali ke List Password", "Kembali ke Halaman Utama"};
        this.actions = new SelectInput("Aksi", actionOptions , width);
    }
    
    @Override
    public void drawContent(){
        this.label.text = "Kategori\t: "+passStr.getCategory();
        this.label.draw();
        this.label.text = "Username\t: "+passStr.username;
        this.label.draw();
        this.label.text = "Password\t: "+passStr.getPassword();
        this.label.draw();
        this.label.text = "Encrypt\t: "+passStr.getEncPassword();
        this.label.draw();
        this.label.text = "Score\t: "+passStr.getScore();
        this.label.draw();
        this.hline.draw();
        this.actions.draw();
        int action = actions.getValue()-1;
        switch (action) {
            case 0 -> {
                passData.remove(id);
                drawFooter();
                new ListPasswordPage(this.width).draw();
            }
            case 1 -> {
                drawFooter();
                new ListPasswordPage(this.width).draw();
            }
            case 2 -> {
                drawFooter();
                new MainPage(this.width).draw();
            }
            default -> {
                new ListPasswordPage(this.width).draw();
            }
        }
    }
}
