import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class ArraysPgm {

    public static void main(String[] args) {
        studentGrades();
    }

    public static void studentGrades() {
        int [][] studentGrades = {{77,68,86},{96,76,45}};
        outputGrades(studentGrades);

        for (int[] student : studentGrades) {
            int min = MAX_VALUE, max = MIN_VALUE;
            double sum = 0, average ;
            for (int grade : student) {
                sum += grade;
                if (grade > max)
                    max = grade;
                if (grade < min)
                    min = grade;
            }
            average = sum / student.length;
            System.out.println();
            System.out.println("smallest grade: "+min);
            System.out.println("largest grade: "+max);
            System.out.println("average grade: "+ average);
            System.out.println();
        }
    }

    public static void outputGrades(int [][] grades) {
        int index = 1;
        for (int [] student : grades) {
            System.out.print("Student " + index +": ");
            for (int grade : student) {
                System.out.print(grade + ", " );
            }
            System.out.println();
            index++;
        }
    }

    public static int calcMinimumGrade (int [] student) {
        int min = MAX_VALUE;
        for (int grade : student ) {
            if (grade < min)
                min = grade;
        }
        return min;
    }

    public static int calcMaximumGrade (int [] student) {
        int max = MIN_VALUE;
        for (int grade : student ) {
            if (grade > max)
                max = grade;
        }
        return max;
    }

    public static double calcAverage (int [] student) {
        double sum = 0;
        for (int grade : student ) {
            sum += grade;
        }
        return sum/student.length;
    }
}
