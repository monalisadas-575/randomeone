package engineeringDigest.stream;


public class Practice123 {
    public static void main(String[] args) {
        // LINE 6: This is where you pass your input!
        String day = "OCTOBER";

        // The switch expression reads the variable 'day' from above
        String result = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY" -> "Work days";
            case "THURSDAY", "FRIDAY"             -> {
                System.out.println("Almost weekend!");
                yield "Pre-weekend";
            }
            case "SATURDAY", "SUNDAY"             -> "Weekend!";
            default                               -> "Unknown day";
        };

        // Print the final result to the console
        System.out.println("Result: " + result);
    }
}
