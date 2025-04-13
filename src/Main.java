public class Main {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();

        System.out.println("Pushing elements:");
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top of stack (peek): " + stack.peek());

        System.out.println("\nPopping elements:");
        while (!stack.isEmpty()) {
            System.out.println("- " + stack.pop());
        }

        System.out.println("Stack size after popping all: " + stack.size());
    }
}
