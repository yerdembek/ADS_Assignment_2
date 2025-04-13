public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyLinkedList<>();

        System.out.println("Adding elements...");
        list.add("One");
        list.add("Two");
        list.add("Three");

        System.out.println("Current size: " + list.size());

        System.out.println("Elements:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("- " + list.get(i));
        }

        System.out.println("\nRemoving element at index 1...");
        list.remove(1);

        System.out.println("After removal:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("- " + list.get(i));
        }

        System.out.println("\nClearing the list...");
        list.clear();

        System.out.println("Size after clear: " + list.size());
    }
}
