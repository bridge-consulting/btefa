package it.bridgeconsulting.btefa.interfaces.adapters;

/**
 * @author fcambi
 * @version 0.7
 */
public interface Adapter<S, T> {

    public T adapt(S source);

}
