package chapter1challenges;

public class Chapter1_Challenge_1_1 {
    public static void main(String[] args) {
        // Input number
        int number = 13579;
        
        // Step 1: Calculate number of digits
        int numDigits = (int) Math.log10(number) + 1;
        
        // Step 2: Extract first digit
        int firstDigit = number / (int) Math.pow(10, numDigits - 1);
        
        // Step 3: Extract last digit
        int lastDigit = number % 10;
        
        // Step 4: Extract second digit
        int secondDigit = (number / (int) Math.pow(10, numDigits - 2)) % 10;
        
        // Step 5: Extract second-last digit
        int secondLastDigit = (number / 10) % 10;
        
        // Step 6: Calculate product of first and last digit
        int product = firstDigit * lastDigit;
        
        // Step 7: Calculate sum of second and second-last digit
        int sum = secondDigit + secondLastDigit;
        
        // Step 8: Concatenate product and sum to form final code
        String finalCode = product + "" + sum;
        
        // Output the result
        System.out.println("The decrypted code is: " + finalCode);
    }
}