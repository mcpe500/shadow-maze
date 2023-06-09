package shadowmaze2.utils;

import processing.core.PApplet;
import processing.core.PImage;

public class Button {

    private PApplet parent; // Reference to the parent PApplet
    private String text;
    private int sizeX;
    private int sizeY;
    private int positionX;
    private int positionY;
    private boolean isButtonClicked;
    private Runnable onClickFunction; // Runnable to be executed when the button is clicked
    private PImage backgroundImage; // Image for the button background

    public Button(PApplet parent, int positionX, int positionY, int sizeX, int sizeY, String text, Runnable onClickFunction) {
        this.parent = parent;
        this.positionX = positionX;
        this.positionY = positionY;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.text = text;
        this.isButtonClicked = false;
        this.onClickFunction = onClickFunction; // Set the onClickFunction
        this.backgroundImage = null; // Set the background image to null initially
    }

    public Button(PApplet parent, int positionX, int positionY, int sizeX, int sizeY, String text, Runnable onClickFunction, PImage backgroundImage) {
        this(parent, positionX, positionY, sizeX, sizeY, text, onClickFunction);
        this.backgroundImage = backgroundImage; // Set the background image
    }

    public void draw() {
        parent.rectMode(parent.CENTER);
        parent.textAlign(parent.CENTER, parent.CENTER);

        if (backgroundImage != null) {
            parent.image(backgroundImage, positionX, positionY, sizeX, sizeY);
        } else {
            parent.fill(200); // Set the fill color before drawing the rectangle
            parent.rect(positionX, positionY, sizeX, sizeY);
        }

        parent.fill(255); // Set the text color before drawing the text
        parent.text(text, positionX, positionY);
    }

    public void checkClick(int mouseX, int mouseY) {
        if (mouseX >= (positionX - sizeX / 2) && mouseX <= (positionX + sizeX / 2)
                && mouseY >= (positionY - sizeY / 2) && mouseY <= (positionY + sizeY / 2)) {
            isButtonClicked = true;
            onClickFunction.run(); // Execute the onClickFunction
        } else {
            isButtonClicked = false;
        }
    }

    public boolean isClicked() {
        return this.isButtonClicked;
    }
}
