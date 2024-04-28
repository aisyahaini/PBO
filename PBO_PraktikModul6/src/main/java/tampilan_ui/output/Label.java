/*Aisyah Nuraini (A11.2022.14161)
A11.44UG1 - Pemrograman Berbasis Objek Praktikum 6
Intellij IDEA*/

package tampilan_ui.output;

public class Label implements Component{
    private final int width;
    public String text;

    public Label(String text, int width){
        this.width = width;
        this.text = text;
    }

    Label(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Method to draw label
    public void draw() {
        System.out.print("| ");
        if (text.length() <= width - 2) {
            System.out.print(text);
            for (int i = 0; i < width - 2 - text.length(); i++) {
                System.out.print(" ");
            }
        }
        System.out.println(" |");
    }

}

