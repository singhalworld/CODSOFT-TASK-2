import java.util.*;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     
       int totalsubject=sc.nextInt();


        int totalMarks = 0;
        
        for (int i = 1; i <= totalsubject; i++) {
            System.out.print("ENTER THE MARKS OBTAINED IN SUBJECT" + i + ": ");
            int marks = sc.nextInt();
            
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid input! Marks should be between 0 and 100.");
                return;
            }
            
            totalMarks += marks;
        }
        
        double averagePercentage = totalMarks/totalsubject;

        

        
        char grade;
        if (averagePercentage >= 90) {
            grade = 'O';
        } else if (averagePercentage >= 80) {
            grade ='E';
        } else if (averagePercentage >= 70) {
            grade = 'A';
        } else if (averagePercentage >= 60) {
            grade = 'B';
        } else {
            grade = 'F';
        }

        
        System.out.println("%%%%%%  CONGRATULATION YOUR TOTAL MARKS IS :" + totalMarks + "     %%%%%%");
        System.out.println();
        System.out.println();



        System.out.println("#######   AVERAGE PERCENTAGE YOU GOT : " + averagePercentage + "    ######");
        System.out.println();
        System.out.println();



        System.out.println("*******   YOUR GRADE IS  : " + grade + "   *******");
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("O_______________OUTSTANDING");
        System.out.println("E_______________EXCELENT");
        System.out.println("A_______________AVERAGE");
        System.out.println("B_______________BELOW AVERAGE");
        System.out.println("F_______________***FAIL***");
        System.out.println();
        System.out.println();
        System.out.println();
        
    }
}







        
    
