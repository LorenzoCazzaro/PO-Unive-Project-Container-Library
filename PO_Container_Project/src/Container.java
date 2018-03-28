import java.util.Iterator;

public interface Container<T> extends OurIterable<E> {

    void add(T elem) throws FullContainerException;

    /*Se un container è vuoto allora l'elemento non sarà presente -> NotFoundException*/
    //Meglio spostarla nell'iterator.
    //void remove(T elem) throws NotFoundException;

    void removeElem(T elem); /*eccezione o no? In questo caso si prevede che prima venga eseguita l'exits.*/

    boolean existsElem(T elem);

    OurIterator<E> iterator();

    boolean isEmpty();

    int size();

}
