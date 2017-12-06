import java.util.ArrayList;

public class Queue<Object> {
    ArrayList<Object> arr = new ArrayList<Object>();
    int size = 0;

    void push(Object node) {
        arr.add(node);
        size = size+1;
    }
    Object pop() {
        size = size - 1;
        return arr.get(0);
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }
}
