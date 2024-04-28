/*Aisyah Nuraini (A11.2022.14161)
A11.44UG1 - Pemrograman Berbasis Objek Praktikum 6
Intellij IDEA*/

package tampilan_ui.output;

public class Space implements Component{
    private final int width;

    public Space(int width){
        this.width = width;
    }

    // Method to draw space
    public void draw() {
        System.out.print("|");
        for (int i = 0; i < width; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }


}

