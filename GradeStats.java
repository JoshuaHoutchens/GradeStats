//BEGIN
//    CREATE array or list to hold 10 floating-point numbers
//    CREATE variables for sum, max, and min
//    PRINT "Please enter 10 grades:"
//    
//    FOR i from 1 to 10:
//        READ input_grade
//        ADD input_grade to sum
//        IF i is 1:
//            SET max = input_grade
//            SET min = input_grade
//        ELSE:
//            IF input_grade > max THEN SET max = input_grade
//            IF input_grade < min THEN SET min = input_grade
//        END IF
//    END FOR
//    
//    CALCULATE average = sum / 10
//    PRINT average, max, and min
//END

package gradestats;

import java.util.Scanner;

public class GradeStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalGrades = 10;
        float sum = 0;
        float max = Float.NEGATIVE_INFINITY;
        float min = Float.POSITIVE_INFINITY;

        System.out.println("Enter " + totalGrades + " floating-point grades:");

        // For-loop ensures the program runs exactly 10 times (preventing endless loops)
        for (int i = 1; i <= totalGrades; i++) {
            System.out.print("Grade " + i + ": ");
            
            // Basic validation to ensure input is a number
            while (!scanner.hasNextFloat()) {
                System.out.println("Invalid input. Please enter a numeric grade.");
                scanner.next(); // Clear the invalid input
            }
            
            float currentGrade = scanner.nextFloat();
            sum += currentGrade;

            if (currentGrade > max) {
                max = currentGrade;
            }
            if (currentGrade < min) {
                min = currentGrade;
            }
        }

        float average = sum / totalGrades;

        System.out.println("\n--- Statistics ---");
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        
        scanner.close();
    }
}
