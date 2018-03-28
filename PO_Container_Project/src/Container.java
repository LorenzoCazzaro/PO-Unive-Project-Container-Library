import java.util.Iterator;

public interface Container<T> {

    void add(T elem) throws FullContainerException;

    /*Se un container è vuoto allora l'elemento non sarà presente -> NotFoundException*/
    void remove(T elem) throws NotFoundException; /

    boolean existsElem(T elem);

    Iterator<E> iterator();

    boolean isEmpty();

    int size();

}
