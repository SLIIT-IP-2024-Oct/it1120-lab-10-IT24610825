import java.util.Scanner;

public class IT24610825Lab10Q1 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the mark (0 to 100): ");
        int mark = scanner.nextInt();
        
        
      
        
       
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";
		 String grade = "";
        
        if (mark >= 75) {
            grade = "A";
        } else if (mark >= 60) {
            grade = "B";
        } else if (mark >= 50) {
            grade = "C";
        } else if (mark >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

       
        assert (isGradeCorrect(mark, grade)) : "Incorrect Grade Assigned"; // Verify the grade assigned is correct
        
        
        System.out.println("Grade: " + grade);
        System.out.println("Mark is Validated");
    }

   
    private static boolean isGradeCorrect(int mark, String grade) {
        if (mark >= 75 && grade.equals("A")) return true;
        if (mark >= 60 && mark < 75 && grade.equals("B")) return true;
        if (mark >= 50 && mark < 60 && grade.equals("C")) return true;
        if (mark >= 40 && mark < 50 && grade.equals("D")) return true;
        return mark < 40 && grade.equals("F");
    }
}
