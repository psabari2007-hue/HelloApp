public class NameFormatterUC5 {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;

        for (String name : args) {
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }
        System.out.println(nameBuilder.toString());
    }
}