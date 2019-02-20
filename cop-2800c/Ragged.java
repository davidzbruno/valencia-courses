import java.util.*;

public class Ragged {
    public static void main(String[] args) {
        // Initial Program
        Scanner sc = new Scanner(System.in);
        // Creates an array with 25 rows and an unknown number of columns
        double[][] classroom = new double[25][];
        int MAX_EXAMS = 0;
        // Enter at least 10 students along with a varying number of exam scores for
        // each different student.
        Random ran = new Random();

        for (int studentID = 0, k = ran.nextInt(10) + 11; studentID < k; ++studentID) {
            int exams = ran.nextInt(8) + 2;
            MAX_EXAMS = (MAX_EXAMS < exams) ? exams : MAX_EXAMS;// set the MAX_EXAMS variable
            classroom[studentID] = new double[exams];
            for (int examNum = 0; examNum < classroom[studentID].length; ++examNum) {// adding exam scores
                classroom[studentID][examNum] = ran.nextDouble()*50 + 50.0; // ignore expanded decimal format
            }

        }
        // Display the average for all exams by each Student ID
        System.out.printf("----------------Averages by Student ID----------------\n");
        for (int studentID = 0; studentID < classroom.length; ++studentID) {
            if (classroom[studentID] != null) { // there is a student at this index
                studentAverage(studentID, classroom);
            }
        }
        // Display the average for each exam by Exam Number
        System.out.printf("----------------Averages by Exam Number----------------\n");
        for (int examNum = 0; examNum < MAX_EXAMS; examNum++) {
            examAverage(examNum, classroom);
        }
        // Display the class average
        classAverage(classroom);

        // Menu Program
        String option = "quit"; System.out.print("Welcome to my menu! ");
        
        do { System.out.println("Please choose one of the followingg options:" +
        "\n(1) Input grades" +
        "\n(2) Display the average for all exams by each Student ID" +
        "\n(3) Display the average for each exam by Exam Number" +
        "\n(4) Display the class average");
        
        option = sc.next();
        switch (option) { 
            case "1": 
            // The menu system will have an option to input grades for the next student.
            // Once pressed the user will then enter how many exams that student has taken.
            // The program will then ask the user to enter each of those exam scores.
                inputGrade(classroom);
                break;
            case "2": 
            // Menu will have an option to display the exam average by student.
                System.out.printf("Which student ID are you looking to display?\n");
                int studentID = sc.nextInt();
                studentAverage(studentID, classroom);
                break;
            case "3":
            // Menu will have an option to display the exam average by exam.
                System.out.printf("Which student ID are you looking to display?\n");
                int examNum = sc.nextInt();
                examAverage(examNum, classroom);
                break;
            case "4":
            // Menu will have an option to display the current class average for all exams.
                classAverage(classroom);
                break;
            default:
                System.out.println("You entered an invaid option. Try again.");
                break;
            }
        }
        while (!option.equals("quit")); 
        sc.close();
    }

    private static void studentAverage(int studentID, double[][] classroom) {
        double average = 0.0;

        for (double examGrade : classroom[studentID]) {
            average += examGrade;
        }
        average /= classroom[studentID].length;
        System.out.printf("Student %d %.2f\n", studentID + 1, average);
    };

    private static void examAverage(int examNum, double[][] classroom) {
        double average = 0.0, exams = 0.0;

        for (int studentID = 0; studentID < classroom.length; ++studentID) {
            if (classroom[studentID] == null || classroom[studentID].length - 1 < examNum) // The student never took this exam
                continue;
            average += classroom[studentID][examNum];
            exams++;
        }
        average = (exams == 0) ? 0 : average / exams;
        System.out.printf("Exam %d: %.2f\n", examNum + 1, average);
    }

    private static void classAverage(double[][] classroom) {
        double average = 0.0, exams = 0.0;

        for (int studentID = 0; studentID < classroom.length; ++studentID) {
            if (classroom[studentID] != null) {
                for (int examNum = 0; examNum < classroom[studentID].length; ++examNum) {
                    average += classroom[studentID][examNum];
                    exams++;
                }
            }

        }

        average /= exams;
        System.out.printf("Class Average: %.2f\n", average);
    }

}