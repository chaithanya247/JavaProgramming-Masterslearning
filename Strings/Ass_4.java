package Strings;

public class Ass_4 {

    public static void main(String[] args) {
        // Initialize the string
        String s = "java is super";

        // Get the length of the string
        int len = s.length();

        // Create a new string to store the reversed string
        String reversedString = "";

        // Populate the new string with characters from the original string in reverse order
        for (int i = len - 1; i >= 0; i--) {
            reversedString += s.charAt(i);
        }

        // Print the reversed string
        System.out.println(reversedString);
    }
}
