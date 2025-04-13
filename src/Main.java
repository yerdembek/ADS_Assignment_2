public class Main {
    public static void main(String[] args) {
        MyMinHeap<Integer> minHeap = new MyMinHeap<>();

        minHeap.insert(42);
        minHeap.insert(15);
        minHeap.insert(23);
        minHeap.insert(8);
        minHeap.insert(16);

        System.out.println("Heap size: " + minHeap.size());
        System.out.println("Minimum: " + minHeap.getMin());

        System.out.println("\nExtracting elements:");
        while (!minHeap.isEmpty()) {
            System.out.println("- " + minHeap.extractMin());
        }

        System.out.println("Heap size after all extractions: " + minHeap.size());
    }
}
