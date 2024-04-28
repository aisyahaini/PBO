/*Aisyah Nuraini (A11.2022.14161)
A11.44UG1 - Pemrograman Berbasis Objek Praktikum 6
Intellij IDEA*/


package tampilan_ui.page;

import tampilan_ui.input.Input;
import tampilan_ui.input.SelectInput;
import password.PasswordStore;
import data.DataPassword;

import java.security.NoSuchAlgorithmException;


public class InputPage extends BasePage{
    private  Input judulInput;
    private  Input usernameInput;
    private  Input passwordInput;
    private SelectInput kategoriInput;
    
    public InputPage( int width) {
        super("Input Page", width);
        this.judulInput = new Input("Judul Password");
        this.usernameInput = new Input("Username");
        this.passwordInput = new Input("Password");
        String[] kategoriOptions = {"Belum terkategori", "Aplikasi Web", "Aplikasi Mobile", "Akun Lainnya"};
        this.kategoriInput = new SelectInput("Kategori", kategoriOptions, width);
    }

    @Override
    public void drawContent() throws NoSuchAlgorithmException, Exception {
        this.judulInput.draw();
        String judul = judulInput.getValue();
        this.usernameInput.draw();
        String username = usernameInput.getValue();
        this.passwordInput.draw();
        String password = passwordInput.getValue();
        this.kategoriInput.draw();
        int kategori = kategoriInput.getValue();
        
        PasswordStore passwordStore = new PasswordStore(judul, username, password, kategori);
        DataPassword.passData.add(passwordStore);

        new MainPage(width).draw(); // Kembali ke halaman utama setelah input selesai
    }
}
