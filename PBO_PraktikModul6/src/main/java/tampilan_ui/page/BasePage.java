/*Aisyah Nuraini (A11.2022.14161)
A11.44UG1 - Pemrograman Berbasis Objek Praktikum 6
Intellij IDEA*/


package tampilan_ui.page;

import tampilan_ui.output.Component;
import tampilan_ui.output.HLine;
import tampilan_ui.output.Space;
import tampilan_ui.output.Label;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public abstract class BasePage {
    protected ArrayList<Component> components;
    protected int width;
    protected Space space;
    protected HLine hline;
    protected Label label;
    protected String title;

    public BasePage(String title, int width) {
        this.title = title;
        this.width = width;
        this.components = new ArrayList();
        this.space = new Space(width);
        this.hline = new HLine(width);
        this.label = new Label(title.toUpperCase(), width);
    }

    public void draw() {
        this.drawHeader();
        this.space.draw();
        try {
            this.drawContent();
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void drawHeader() {
        this.hline.draw();
        this.space.draw();
        this.label.draw();
        this.space.draw();
        this.hline.draw();
    }

    public void drawFooter() {
        this.space.draw();
        this.hline.draw();
    }

    public abstract void drawContent() throws NoSuchAlgorithmException, Exception;

}

