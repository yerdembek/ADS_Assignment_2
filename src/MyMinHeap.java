public class MyMinHeap<T extends Comparable<T>> {
    private Object[] heap;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public MyMinHeap() {
        heap = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    private void bubbleUp(int index) {
        while (index > 0) {
            int parentIdx = (index - 1) / 2;
            T current = (T) heap[index];
            T parent = (T) heap[parentIdx];
            if (current.compareTo(parent) < 0) {
                swap(index, parentIdx);
                index = parentIdx;
            } else {
                break;
            }
        }
    }

    private void bubbleDown(int index) {
        while (index < size) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;

            if (left < size && ((T) heap[left]).compareTo((T) heap[smallest]) < 0) {
                smallest = left;
            }
            if (right < size && ((T) heap[right]).compareTo((T) heap[smallest]) < 0) {
                smallest = right;
            }

            if (smallest != index) {
                swap(index, smallest);
                index = smallest;
            } else {
                break;
            }
        }
    }


    public void insert(T item) {
        ensureCapacity();
        heap[size] = item;
        bubbleUp(size);
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
        bubbleDown(0);
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
