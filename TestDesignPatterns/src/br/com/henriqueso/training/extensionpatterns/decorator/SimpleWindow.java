package br.com.henriqueso.training.extensionpatterns.decorator;


/**
 * The Class SimpleWindow.
 */
public class SimpleWindow implements Window {

    /**
     * Draws the simple window.
     * 
     * @see br.com.henriqueso.training.extensionpatterns.decorator.Window#draw()
     */
    public void draw() {
        // draw window
    }

    /**
     * Gets the description of the simple window.
     * 
     * @return the description
     * @see br.com.henriqueso.training.extensionpatterns.decorator.Window#getDescription()
     */
    public String getDescription() {
        return "simple window";
    }

}
