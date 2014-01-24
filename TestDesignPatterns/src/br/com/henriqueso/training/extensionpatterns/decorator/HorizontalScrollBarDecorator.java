package br.com.henriqueso.training.extensionpatterns.decorator;


/**
 * 
 */
public class HorizontalScrollBarDecorator extends WindowDecorator {

    /**
     * Instantiates a new horizontal scroll bar decorator.
     * 
     * @param decoratedWindow
     *            the decorated window
     */
    public HorizontalScrollBarDecorator(final Window decoratedWindow) {
        super(decoratedWindow);
    }

    /**
     * Draws window with Horizontal scroll bar.
     * 
     * @see br.com.henriqueso.training.extensionpatterns.decorator.WindowDecorator#draw()
     */
    public void draw() {
        super.draw();
        drawHorizontalScrollBar();
    }

    /**
     * Draw horizontal scroll bar.
     */
    private void drawHorizontalScrollBar() {
        // draw the horizontal scrollbar

    }

    /**
     * @see br.com.henriqueso.training.extensionpatterns.decorator.WindowDecorator#getDescription()
     */
    public String getDescription() {
        return super.getDescription() + ", including horizontal scrollbars";
    }
}
