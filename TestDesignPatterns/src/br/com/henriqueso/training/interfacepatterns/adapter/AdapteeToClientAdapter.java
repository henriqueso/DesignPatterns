/*
 * 
 */
package br.com.henriqueso.training.interfacepatterns.adapter;


/**
 * The Class AdapteeToClientAdapter.
 */
public class AdapteeToClientAdapter implements Client {

    /** The adaptee. */
    private final Adaptee adaptee;

    /**
     * Instantiates a new adaptee to client adapter.
     * 
     * @param instance
     *            the instance
     */
    public AdapteeToClientAdapter(final Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * @see br.com.henriqueso.training.interfacepatterns.adapter.Client#clientMethod()
     */
    public void clientMethod() {
        // call Adaptee's method(s) to implement Client's clientMethod

        adaptee.adapteeMethod();
    }

}
