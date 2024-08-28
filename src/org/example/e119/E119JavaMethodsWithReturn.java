package org.example.e119;

public class E119JavaMethodsWithReturn {
    // Method to replace all instances of a given character with '*'
    public static String censorLetter(String str, char a) {
        // Use the replace method to replace all occurrences of the character with '*'
        return str.replace(a, '*');
    }

    public static void main(String[] args) {
        // Test the censorLetter method
        String result = censorLetter("beatch", 'e');
        System.out.println(result); // Output: b*atch
    }
}
