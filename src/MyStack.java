public class MyStack<T> {
    private MyArrayList<T> storage;

    public MyStack() {
        storage = new MyArrayList<>();
    }

    public void push(T item) {
        storage.add(item); // добавляем в конец
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T top = storage.get(storage.size() - 1);
        storage.remove(storage.size() - 1);
        return top;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return storage.get(storage.size() - 1);
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
