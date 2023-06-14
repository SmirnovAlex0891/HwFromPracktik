package hw_2023_03_09;

import java.util.List;
import java.util.NoSuchElementException;

public class MyIterator<T> {
    private Integer previousElement;
    private Integer nextElement;
    private List<T> list;

    public MyIterator(List<T> list) {
        if (list.size() > 0) {
            this.list = list;
            nextElement = 0;
            previousElement = null;

        } else {
            nextElement = null;
            previousElement = null;
        }
    }

    public MyIterator(List<T> list, int tail) {
        if (list.size() >= 2) {
            this.list = list;
            nextElement = tail - 2;
            previousElement = tail - 1;
        } else if (list.size() == 1) {
            this.list = list;
            nextElement = null;
            previousElement = tail - 1;
        } else {
            previousElement = null;
            nextElement = null;
        }
    }

    boolean hasNext() {
        if (nextElement != null) {
            if (this.list.get(nextElement) != null) return true;
            return false;
        }
        return false;
    }

    T next() {
        if (nextElement == null) {
            throw new NoSuchElementException();
        } else {
            T tmp = this.list.get(nextElement);
            if (nextElement == this.list.size() - 1) {
                previousElement = nextElement;
                nextElement = null;
            } else {
                previousElement = nextElement;
                nextElement++;
            }
            return tmp;
        }
    }

    void remove() {
        if (previousElement == null) {
            throw new IllegalStateException();
        } else {
            this.list.remove((int) previousElement);
            if (previousElement == 0) {
                previousElement = null;
            } else {
                previousElement--;
            }
        }
    }

    boolean hasPrevious() {
        if (previousElement != null) {
            if (this.list.get(previousElement) != null) return true;
            return false;
        }
        return false;
    }

    T previous() {
        if (previousElement == null) {
            throw new NoSuchElementException();
        } else {
            T tmp = this.list.get(previousElement);
            if (previousElement == 0) {
                nextElement = previousElement;
                previousElement = null;
            } else {
                nextElement = previousElement;
                previousElement--;
            }
            return tmp;
        }
    }
}
