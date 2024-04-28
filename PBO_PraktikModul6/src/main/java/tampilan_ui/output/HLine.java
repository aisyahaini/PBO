/*Aisyah Nuraini (A11.2022.14161)
A11.44UG1 - Pemrograman Berbasis Objek Praktikum 6
Intellij IDEA*/

package tampilan_ui.output;

public class HLine implements Component{
    private int width;   //(-)

    public HLine(int width){
        this.width = width;
    }

    public void draw() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("=");
        }
        System.out.println("+");
    }

}

