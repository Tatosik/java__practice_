package mirea__lab__21;

public abstract class AbstractQueue<E> implements Queue<E> {
    protected int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
    }
}