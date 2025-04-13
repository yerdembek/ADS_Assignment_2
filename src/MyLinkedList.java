public class MyLinkedList<T> implements MyList<T> {
    private MyNode<T> head;
    private int length;

    public MyLinkedList() {
        head = null;
        length = 0;
    }

    @Override
    public void add(T item) {
        MyNode<T> newNode = new MyNode<>(item);
        if (head == null) {
            head = newNode;
        } else {
            MyNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }

        if (index == 0) {
            head = head.next;
        } else {
            MyNode<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        length--;
    }

    @Override
    public void clear() {
        head = null;
        length = 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }
        MyNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    private static class MyNode<T> {
        T data;
        MyNode<T> next;

        MyNode(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
