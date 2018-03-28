public interface OurIterator<E> { //aggiungere remove e foreach? Forse tramite sottointerfaccia.

    boolean hasNext();

    E next();

    void remove(); //eccezione o no? Per il momento no.
}
