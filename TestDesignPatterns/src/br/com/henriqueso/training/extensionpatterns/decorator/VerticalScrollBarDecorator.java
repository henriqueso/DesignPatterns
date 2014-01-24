package br.com.henriqueso.training.extensionpatterns.decorator;


/**
 * 
 */
public class VerticalScrollBarDecorator extends WindowDecorator {

    /**
     * Instantiates a new vertical scroll bar decorator.
     * 
     * @param decoratedWindow
     *            the decorated window
     */
    public VerticalScrollBarDecorator(final Window decoratedWindow) {
        super(decoratedWindow);
    }

    /**
     * @see br.com.henriqueso.training.extensionpatterns.decorator.WindowDecorator#draw()
     */
    public void draw() {
        super.draw();
        drawVerticalScrollBar();
    }

    /**
     * Draw vertical scroll bar.
     */
    private void drawVerticalScrollBar() {
        // draw the vertical scrollbar

    }

    /**
     * Gets the description.
     * 
     * @return the description
     * @see br.com.henriqueso.training.extensionpatterns.decorator.WindowDecorator#getDescription()
     */
    public String getDescription() {
        return super.getDescription() + ", including vertical scrollbars";
    }
}
