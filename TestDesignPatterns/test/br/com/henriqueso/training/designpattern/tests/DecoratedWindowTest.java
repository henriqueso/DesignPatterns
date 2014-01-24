package br.com.henriqueso.training.designpattern.tests;


import org.junit.Assert;
import org.junit.Test;

import br.com.henriqueso.training.extensionpatterns.decorator.HorizontalScrollBarDecorator;
import br.com.henriqueso.training.extensionpatterns.decorator.SimpleWindow;
import br.com.henriqueso.training.extensionpatterns.decorator.VerticalScrollBarDecorator;
import br.com.henriqueso.training.extensionpatterns.decorator.Window;


/**
 * The Class DecoratedWindowTest.
 */
public class DecoratedWindowTest {

    /**
     * Test simple window.
     */
    @Test
    public void testSimpleWindow() {
        Window window = new SimpleWindow();

        Assert.assertEquals("wrong description",
                        "simple window",
                        window.getDescription());
    }

    /**
     * Test window with horizontal scroll bar.
     */
    @Test
    public void testWindowWithHorizontalScrollBar() {
        Window window = new HorizontalScrollBarDecorator(new SimpleWindow());

        Assert.assertEquals("wrong description",
                        "simple window, including horizontal scrollbars",
                        window.getDescription());
    }

    /**
     * Test window with vertical scroll bar.
     */
    @Test
    public void testWindowWithVerticalScrollBar() {
        Window window = new VerticalScrollBarDecorator(new SimpleWindow());

        Assert.assertEquals("wrong description",
                        "simple window, including vertical scrollbars",
                        window.getDescription());
    }

    /**
     * Test window with scroll bars.
     */
    @Test
    public void testWindowWithScrollBars() {
        Window decoratedWindow = new HorizontalScrollBarDecorator(
                        new VerticalScrollBarDecorator(
                                        new SimpleWindow()));

        Assert.assertEquals("wrong description",
                        "simple window, including vertical scrollbars, including horizontal scrollbars",
                        decoratedWindow.getDescription());
    }

}
