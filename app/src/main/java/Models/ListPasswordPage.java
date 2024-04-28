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
        //proses mendapatkan kata terpanjang, agar ukuran column dapat seragam.
        //sekalipun textnya panjang(opsional).
        int col = 0;
        for(PasswordStore password: passwords){
            col = (password.name.length()>col)? password.name.length() : col;
            col = (password.username.length()>col)? password.username.length() : col;
            col = (password.getCategory().length()>col)? password.getCategory().length() : col;
        }
        col++;
        int i = 1;
        for(PasswordStore password :  passwords){
            this.label.text = ("|"+i+" ".repeat(3 - Integer.toString(i).length())+"| "+ password.name + " ".repeat(col-password.name.length()) +
                    "| "+ password.username + " ".repeat(col-password.username.length())+
                    "| "+ password.getCategory() + " ".repeat(col-password.getCategory().length()) +"|");
            this.label.draw();
            i++;
        }
        this.space.draw();
        drawFooter();
        String inputDetail;
        Input detail = new Input("Pilih index detail / [x - kembali ke main]");
        detail.draw();
        inputDetail = detail.getValue();
        if (inputDetail.equals("x")) {
            // Kembali ke halaman utama
            new MainPage(width).draw();
        } else {
            try {
                int inputNumber = Integer.parseInt(inputDetail);
                PasswordStore passStr;
                passStr = passData.get(inputNumber-1);
                // Periksa apakah nomor berada dalam rentang yang diinginkan
                if (inputNumber > 0 && inputNumber <= passData.size()) { // Ubah 100 menjadi batas atas yang diinginkan
                    // Lanjut ke halaman detail
                    new DetailPage(inputNumber-1, passStr.name ,width).draw();
                } else {
                    System.out.println("Input diluar rentang yang diizinkan. Mohon masukkan angka antara 1 sampai "+passData.size()+1+".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Mohon masukkan angka atau 'x' untuk kembali ke halaman utama.");
            }
        }    
    }
    
   
}

/*
Nama : Filipus Arif Kristiyan
Nim  : A11.2022.14278
Kel  : A11.44UG1
tgl  : 8 April 2024
*/

