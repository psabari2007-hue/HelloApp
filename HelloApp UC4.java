public class HelloAppUC4 {
    public static void main(String[] args) {
        // Check if any arguments were provided
        if (args.length > 0) {
            // Join the names in the array with a comma and space
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        } else {
            // Default message if no arguments are present
            System.out.println("Hello, World!");
        }
    }
}