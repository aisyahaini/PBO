/*Aisyah Nuraini (A11.2022.14161)
A11.44UG1 - Pemrograman Berbasis Objek Praktikum 6
Intellij IDEA*/

package tampilan_ui.page;

//import java.util.ArrayList;
//import tampilan_ui.output.Space;
//import tampilan_ui.output.HLine;
//import tampilan_ui.output.Label;
import password.PasswordStore;

import java.util.ArrayList;

import data.DataPassword;

public class ListPasswordPage extends BasePage {
    String text;
    int width;
    
    public ListPasswordPage( int width) {
        super("Password List Page", width);
    }

    @Override
    public void drawContent() {
        int totalPasswords = DataPassword.passData.size();
        this.space.draw();
        this.label.text = "Terdapat " + totalPasswords + " tersimpan.";
        this.label.draw();
        this.label.text = "----- ----- -----";
        this.label.draw();

        ArrayList<PasswordStore> passwords = DataPassword.passData;

        // Menampilkan semua password
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
