package logicalProgram;

public class InterviewProgram_1 {
public static void main(String[] args) {

    
        // Print numbers divided by 2
         System.out.println("\nDivided by 2: ");
        for (int i = 1; i < 55; i++) {
            if (i % 2 == 0)
                System.out.print(i + ", ");
        }

        // Print numbers divided by 3
        System.out.println("\n\nDivided by 3: ");
        for (int i = 1; i < 55; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }

        // Print numbers divided by both 2 and 3
        System.out.println("\n\nDivided by 2 & 3: ");
        for (int i = 1; i < 55; i++) {
            if (i % 2 == 0 && i % 3 == 0)
                System.out.print(i + ", ");
        }
        System.out.println("\n");
    }
}

