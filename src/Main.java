public class Main {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();

        System.out.println("Adding elements to queue:");
        queue.enqueue("Apple");
        queue.enqueue("Banana");
        queue.enqueue("Cherry");

        System.out.println("Current size: " + queue.size());
        System.out.println("Peek: " + queue.peek());

        System.out.println("\nRemoving elements:");
        while (!queue.isEmpty()) {
            System.out.println("- " + queue.dequeue());
        }

        System.out.println("Size after all removals: " + queue.size());
    }
}
