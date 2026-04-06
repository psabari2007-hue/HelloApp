public class HelloAppUC6 {

    public static void main(String[] args) {
        // Initialize StringBuilder for efficient string building
        StringBuilder nameBuilder = new StringBuilder();

        // 1. Enhanced For Loop: Iterates over the args array
        for (String name : args) {
            // 2. Append each name followed by a comma and a space
            nameBuilder.append(name).append(", ");
        }

        // 3. Trailing Character Removal & String Length check
        // Check if the builder has content to avoid errors
        if (nameBuilder.length() > 0) {
            // Remove the last two characters (the extra ", ")
            String formattedNames = nameBuilder.substring(0, nameBuilder.length() - 2);
            
            // Output the final result
            System.out.println("Names: " + formattedNames);
        } else {
            System.out.println("No arguments were provided.");
        }
    }
}