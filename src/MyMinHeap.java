public class MyMinHeap<T> {
    private Object[] heap;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public MyMinHeap() {
        heap = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void insert(T item) {
        ensureCapacity();
        heap[size] = item;
        size++;
    }

    public T getMin() {
        if (isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }
        return (T) heap[0];
    }

    public T extractMin() {
        if (isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }
        T min = (T) heap[0];
        heap[0] = heap[size - 1];
        size--;
        return min;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void swap(int i, int j) {
        Object temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void ensureCapacity() {
        if (size == heap.length) {
            Object[] newHeap = new Object[heap.length * 2];
            for (int i = 0; i < heap.length; i++) {
                newHeap[i] = heap[i];
            }
            heap = newHeap;
        }
    }
}
