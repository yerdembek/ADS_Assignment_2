public class MyQueue<T> {
    private MyLinkedList<T> storage;

    public MyQueue() {
        storage = new MyLinkedList<>();
    }

    public void enqueue(T item) {
        storage.add(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        T first = storage.get(0);
        storage.remove(0);
        return first;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return storage.get(0);
    }

    public boolean isEmpty() {
        return storage.size() == 0;
    }

    public int size() {
        return storage.size();
    }

    public void clear() {
        storage.clear();
    }
}
