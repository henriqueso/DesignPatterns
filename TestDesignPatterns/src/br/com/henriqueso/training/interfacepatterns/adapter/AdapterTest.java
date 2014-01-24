package br.com.henriqueso.training.interfacepatterns.adapter;


/**
 * 
 */
public class AdapterTest {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        Client client = new AdapteeToClientAdapter(new Adaptee());

        client.clientMethod();
    }

}
