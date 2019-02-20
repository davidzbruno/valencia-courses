import java.util.*;

public class Ragged {
    public static void main(String[] args){
    // Initial Program
        Scanner sc = new Scanner(System.in);
        //Creates an array with 25 rows and an unknown number of columns
        int[][] classroom = new int[25][];
        //Enter at least 10 students along with a varying number of exam scores for each different student.
        Random ran = new Random();
        for(int i = 0, j = ran.nextInt(10)+11; i < j; ++i){
            classroom[i] = new int[ran.nextInt(8)+3];
        }
        //Display the average for all exams by each Student ID
        for(int studentID = 0; studentID <= classroom.length; studentID++){
            studentAverage(studentID);
        }
        //Display the average for each exam by Exam Number
        for(int examNum = 0; examNum <= 10; examNum++){ //ASSUME THERE ARE <= 10 exams/student
            examAverage(examNum);
        }
        //Display the class average
        classAverage();
        
    // Menu Program
        String option = "quit";
        System.out.print("Welcome to my menu! ");
        do{
            System.out.println("Please choose one of the followingg options:" + 
            "\n(1) Input grades" +
            "\n(2) Display the average for all exams by each Student ID" +
            "\n(3) Display the average for each exam by Exam Number" +
            "\n(4) Display the class average");
            
            option = sc.next();
            switch(option){
                case "1":
                //The menu system will have an option to input grades for the next student.
                //Once pressed the user will then enter how many exams that student has taken.
                //The program will then ask the user to enter each of those exam scores.
                    inputGrade();
                    break;
                case "2":
                //Menu will have an option to display the exam average by student.
                    studentAverage();
                    break;
                case "3":
                //Menu will have an option to display the exam average by exam.
                    examAverage();
                    break;
                case "4":
                //Menu will have an option to display the current class average for all exams.
                    classAverage();
                    break;
                default:
                    System.out.println("You entered an invaid option. Try again.");
                    break;
            }
        }while(!option.equals("quit"));

    }
    private static void studentAverage(int studentID){

    };

}