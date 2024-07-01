/** Student Grade Calculator
 * Input: Take marks obtained (out of 100) in each subject.
 * Calculate Total Marks: Sum up the marks obtained in all subjects.
 * Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
 * average percentage.
 * Grade Calculation: Assign grades based on the average percentage achieved.
 * Display Results: Show the total marks, average percentage, and the corresponding grade to the user*/

package studentGradeCalculator;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double A_GRADE_BOUNDARY = 90.0;
        final double B_GRADE_BOUNDARY = 80.0;
        final double C_GRADE_BOUNDARY = 70.0;
        final double D_GRADE_BOUNDARY = 60.0;
        System.out.print("Enter the number of subjects : ");
        int numSubjects = sc.nextInt();
        int[] marks = new int[numSubjects];
        for(int i = 0; i < numSubjects; i++){
            System.out.printf("Enter marks obtained in subject %d (out of 100) (in Double data type) : ", i + 1);
            marks[i] = sc.nextInt();
        }
        double totalMarks = 0.0;
        for(double mark : marks){
            totalMarks = totalMarks + mark;
        }
        double averagePercentage = totalMarks / numSubjects;
        char grade;
        if(averagePercentage >= A_GRADE_BOUNDARY){
            grade = 'A';
        }
        else if(averagePercentage >= B_GRADE_BOUNDARY){
            grade = 'B';
        }
        else if(averagePercentage >= C_GRADE_BOUNDARY){
            grade = 'C';
        }
        else if(averagePercentage >= D_GRADE_BOUNDARY){
            grade = 'D';
        }
        else{
            grade = 'F';
        }
        System.out.println("\n----- Results -----");
        System.out.println("Total Marks : " + totalMarks);
        System.out.printf("Average Percentage : %.2f%%\n", averagePercentage);
        System.out.println("Grade : " + grade);
        sc.close();
    }
}
