package br.com.henriqueso.training.extensionpatterns.decorator;


/**
 * The Class WindowDecorator.
 */
public abstract class WindowDecorator implements Window {

    /** The window being decorated. */
    protected Window decoratedWindow;

    /**
     * Instantiates a new window decorator.
     * 
     * @param decoratedWindow
     *            the decorated window
     */
    public WindowDecorator(final Window decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }

    /**
     * @see br.com.henriqueso.training.extensionpatterns.decorator.Window#draw()
     */
    public void draw() {
        decoratedWindow.draw();
    }

    /**
     * @see br.com.henriqueso.training.extensionpatterns.decorator.Window#getDescription()
     */
    public String getDescription() {
        return decoratedWindow.getDescription();
    }

}
