/*Aisyah Nuraini (A11.2022.14161)
A11.44UG1 - Pemrograman Berbasis Objek Praktikum 6
Intellij IDEA*/

import tampilan_ui.page.MainPage;
import data.DataPassword;

public class MainApp {
    public static void main(String[] args) throws Exception {
        DataPassword.loadCSVData();
        new MainPage(70).draw();
    }
}
