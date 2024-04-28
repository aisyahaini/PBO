/*Aisyah Nuraini (A11.2022.14161)
A11.44UG1 - Pemrograman Berbasis Objek Praktikum 6
Intellij IDEA*/

package tampilan_ui.input;

import tampilan_ui.output.Component;

import java.util.Scanner;

public class Input implements Component {
    private String label;
    private Scanner input;
    private String value;

    public Input(String label) {
        this.label = label;
        this.input = new Scanner(System.in);
    }

    public void draw() {
        System.out.print("| " + label + " : ");
    }

    public String getValue() {
        value = input.nextLine();
        return value;
    }

    public int getValueInt() {
        value = input.nextLine();
        return Integer.parseInt(value);
    }

    public double getValueDouble() {
        value = input.nextLine();
        return Double.parseDouble(value);
    }
}
