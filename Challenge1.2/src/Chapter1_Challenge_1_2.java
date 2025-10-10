public class Chapter1_Challenge_1_2 {
    public static void main(String[] args) {
        String[] winningNumbers = {"12-34-56-78-90", "33-44-11-66-22", "01-02-03-04-05"};
        
        double highestAverage = -1;
        String bestWinningNumber = "";
        int bestSum = 0;
        
        System.out.println("=== LOTTERY NUMBER ANALYZER ===");
        
        // For-each loop for iterating through tickets
        for (String ticket : winningNumbers) {
            // Remove dashes
            String cleanNumber = ticket.replace("-", "");
            
            // Convert to char array
            char[] chars = cleanNumber.toCharArray();
            int[] digits = new int[chars.length];
            int sum = 0;
            
            // For loop for processing digits
            for (int i = 0; i < chars.length; i++) {
                digits[i] = Character.getNumericValue(chars[i]);
                sum += digits[i];
            }
            
            double average = (double) sum / digits.length;
            
            // Display analysis
            System.out.println("Analyzing: " + ticket);
            System.out.println("Without dashes: " + cleanNumber);
            System.out.println("Digits: " + java.util.Arrays.toString(digits));
            System.out.println("Digit Sum: " + sum + ", Digit Average: " + average);
            System.out.println("---");
            
            // Update highest average
            if (average > highestAverage) {
                highestAverage = average;
                bestWinningNumber = ticket;
                bestSum = sum;
            }
        }
        
        // Final result
        System.out.println("RESULT: The winning number with the highest average is:");
        System.out.println("'" + bestWinningNumber + "' with an average of " + highestAverage);
        System.out.println("(Sum: " + bestSum + " across " + bestWinningNumber.replace("-", "").length() + " digits)");
    }
}