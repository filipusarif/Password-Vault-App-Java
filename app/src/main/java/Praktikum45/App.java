/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Praktikum45;

import Models.DataPassword;
import Models.MainPage;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args)throws Exception {
        DataPassword.loadCSVData();
        new MainPage("Aplikasi Password Vault", 70).draw();
    }
}


/*
Nama : Filipus Arif Kristiyan
Nim  : A11.2022.14278
Kel  : A11.44UG1
tgl  : 8 April 2024
*/
