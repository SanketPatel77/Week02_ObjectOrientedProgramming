public class PalindromeString {
    public static void main(String[] args) {
        // Create an instance of PalindromeChecker with a string
        PalindromeChecker isPalindrome = new PalindromeChecker("madaam");
        // Display whether the string is a palindrome
        isPalindrome.display();
    }
}

class PalindromeChecker {
    String text;

    // Constructor to initialize the text
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the string is a palindrome
    public boolean palindrome() {
        String reverse = "";  // Variable to store the reversed string

        // Loop to reverse the string
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);  // Add each character in reverse order
        }

        // Check if the original text is equal to the reversed string
        return text.equals(reverse);  // Return true if palindrome, else false
    }

    // Method to display the result
    public void display() {
        System.out.println("Is String palindrome: " + palindrome());
    }
}