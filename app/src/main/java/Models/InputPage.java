/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import static Models.DataPassword.passData;

/**
 *
 * @author lenovo
 */
public class InputPage extends BasePage {
    private  Input nameInput;
    private  Input usernameInput;
    private  Input passwordInput;
    private  SelectInput catInput;
    private PasswordStore passStr;


    public InputPage( int width) {
        super("Input Page", width);
        this.nameInput = new Input("Judul Password");
        this.usernameInput = new Input("Username");
        this.passwordInput = new Input("Password");
        String[] kategoriOptions = {"Belum terkategori", "Aplikasi Web", "Aplikasi Mobile", "Akun Lainnya"};
        this.catInput = new SelectInput("Kategori", kategoriOptions, width);
    }

    @Override
    public void drawContent() {
        this.nameInput.draw();
        String judul = nameInput.getValue();
        this.usernameInput.draw();
        String username = usernameInput.getValue();
        this.passwordInput.draw();
        String password = passwordInput.getValue();
        this.catInput.draw();
        int kategori = catInput.getValue();
        passStr = new PasswordStore(judul, username, password, kategori-1);
        DataPassword.passData.add(passStr);

        new MainPage(width).draw(); // Kembali ke halaman utama setelah input selesai
    }
}

/*
Nama : Filipus Arif Kristiyan
Nim  : A11.2022.14278
Kel  : A11.44UG1
tgl  : 8 April 2024
*/
