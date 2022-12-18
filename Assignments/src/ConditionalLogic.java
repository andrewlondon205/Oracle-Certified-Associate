import java.util.Scanner;

public class ConditionalLogic {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
          //   preAndPostDifference();
         //   booleanLogicShortCircuitOps();
        //    booleanBitwiseOps();
        // switchVowelOrConsonant();
        //    System.out.println(admitToFilm(20,19));
       // ifMonth();
       // ifGrade();
      //  switchMathOperation();
      //  ifTemperature();
        switchDaysInMonth();
    }

    public static void preAndPostDifference() {
        var x = 5;
        var y = 10;

        System.out.println("The value of x is " + x);
        System.out.println("The value of ++x is " + ++x);
        System.out.println("The value of x++ is " +x++ );
        System.out.println("The value of x is " + x);

        System.out.println();

        System.out.println("The value of y is " + y);
        System.out.println("The value of ++y is " + --y);
        System.out.println("The value of y++ is " +y -- );
        System.out.println("The value of y is " + y);
    }

    public static void booleanLogicShortCircuitOps() {

        boolean flag = false;
        int a = 3;
        if (a <0 && (flag=true)) {
            System.out.println(flag);
        }

        if (a > 0 && (flag=true)) {
            System.out.println(flag);
        }

        /**
         * What was the value of “flag” in the above println() statements and why?
         *
         * In the first if block, the boolean variable will not be printed because one of the conditions in the boolean expression is false.
         * Also, if the first condition is false, then the rest of the expression will not be evaluated or executed. The boolean variable
         * remains false.
         *
         * In regard to the second if block, it's a different scenario. The first condition is true (a>0), and this leads to the evaluation of the
         * rest of the expression, meaning that if 'a' is greater than zero, then the boolean variable will be modified to true, and printed
         * accordingly.
         */
    }

    public static void booleanBitwiseOps() {
        boolean flag = false;
        int x = 3;
        System.out.println("FIRST CONDITION\n");
        if (x <0 & (flag=true)) {
            System.out.println(flag);
        }
        System.out.println("SECOND CONDITION");
        if (x > 0 & (flag=true)) {
            System.out.println(flag);
        }

        /**
         * Same as in the previous method
         */
    }

    public static void compareStrings() {

        String s1, s2;
        System.out.println("Please enter the first string");
        s1 = sc.next();
        System.out.println("Now enter the second string");
        s2 = sc.next();

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    public static boolean admitToFilm (int id, int age) {
        if (age >= 18)
            return true;
        return false;
    }

    public static void switchVowelOrConsonant () {

        char letter;
        System.out.println("Please enter a letter");
        letter = sc.next().charAt(0);

        if(Character.isLetter(letter)) {
            switch (letter) {

                case 65:
                    System.out.println(letter  + " is a vowel");
                    break;
                case 69:
                    System.out.println(letter  + " is a vowel");
                    break;
                case 73:
                    System.out.println(letter  + " is a vowel");
                    break;
                case 79:
                    System.out.println(letter  + " is a vowel");
                    break;
                case 85:
                    System.out.println(letter  + " is a vowel");
                    break;
                case 97:
                    System.out.println(letter  + " is a vowel");
                    break;
                case 101:
                    System.out.println(letter  + " is a vowel");
                    break;
                case 105:
                    System.out.println(letter  + " is a vowel");
                    break;
                case 111:
                    System.out.println(letter  + " is a vowel");
                    break;
                case 117:
                    System.out.println(letter  + " is a vowel");
                    break;

                default:
                    System.out.println(letter + " is a consonant");
                    break;

            }
        }
        else {
            System.out.println(letter + " is not a valid letter");
        }

        // moving the default case to the top of the switch statement will not make any difference. It will still work properly

    }

    public static void ifMonth() {
        int month;
        final int JAN=1,FEB=2,MARCH=3,APRIL=4,MAY=5,JUNE=6,JULY=7,AUG=8,SEP=9,OCT=10,NOV=11,DEC=12;
        System.out.println("What is your favourite month?");
        month = sc.nextInt();
        if (month == JAN)
            System.out.println("January");
        else if (month == FEB)
            System.out.println("February");
        else if (month == MARCH)
            System.out.println("March");
        else if (month == APRIL)
            System.out.println("April");
        else if (month == MAY)
            System.out.println("May");
        else if (month == JUNE)
            System.out.println("June");
        else if (month == JULY)
            System.out.println("July");
        else if (month == AUG)
            System.out.println("August");
        else if (month == SEP)
            System.out.println("September");
        else if (month == OCT)
            System.out.println("October");
        else if (month == NOV)
            System.out.println("November");
        else if (month == DEC)
            System.out.println("December");
        else
            System.out.println(month + " is out of range");
    }

    public static void ifGrade() {
        int mark;
        System.out.println("Please enter a number between 0 and 100");
        mark = sc.nextInt();
        if (mark >= 70 && mark <= 100)
            System.out.println("A");
        else if (mark >= 60 && mark <= 69)
            System.out.println("B");
        else if (mark >= 50 && mark <= 59)
            System.out.println("C");
        else if (mark >= 40 && mark <= 49)
            System.out.println("D");
        else
            System.out.println("Fail");
    }

    public static void switchMathOperation() {
        double answer = 0.0;
        boolean operationOk = true;
        double num1, num2;
        char operation;
        System.out.println("Please, enter the first number");
        num1 = sc.nextDouble();
        System.out.println("Please, enter the second number");
        num2 = sc.nextDouble();
        System.out.println("Now tell us the operation you desire to perform");
        operation = sc.next().charAt(0);

        switch (operation) {
            case '+':
                answer = num1 + num2;
                operationOk = true;
                break;
            case '-':
                answer = num1 - num2;
                operationOk = true;
                break;
            case '*':
                answer = num1 * num2;
                operationOk = true;
                break;
            case '/':
                answer = num1 / num2;
                operationOk = true;
                break;
            default:
                operationOk = false;
                break;
        }

        if(operationOk)
            System.out.println("the answer is: " + answer);
        else
            System.out.println("Unknown mathematical operator: " + operation);
    }

    public static void ifTemperature () {
        int temperature = 0;
        final int COLD = 0, MILD = 15, WARM = 20, VERY_WARM = 25, HOT = 30;
        System.out.println("Hey buddy, please enter a temperature value");
        temperature = sc.nextInt();
        if (temperature <= COLD)
            System.out.println("cold");
        else if (temperature > COLD && temperature < MILD)
            System.out.println("a little cold but ok");
        else if (temperature >= MILD && temperature < WARM)
            System.out.println("mild");
        else if (temperature >= WARM && temperature < VERY_WARM)
            System.out.println("warm");
        else if (temperature >= VERY_WARM && temperature < HOT)
            System.out.println("very warm");
        else if (temperature > HOT)
            System.out.println("hot");

    }
    public static void switchDaysInMonth() {
        int numDays = 0;
        final int JAN=1,FEB=2,MARCH=3,APRIL=4,MAY=5,JUNE=6,JULY=7,AUG=8,SEP=9,OCT=10,NOV=11,DEC=12;
        int month, year;
        System.out.println("Please enter a month value");
        month = sc.nextInt();
        switch (month) {
            case JAN:
                numDays = 31;
                break;
            case FEB:
                System.out.println("Please, enter a year value");
                year = sc.nextInt();
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            case MARCH:
                numDays = 31;
                break;
            case APRIL:
                numDays = 30;
                break;
            case MAY:
                numDays = 31;
                break;
            case JUNE:
                numDays = 30;
                break;
            case JULY:
                numDays = 31;
                break;
            case AUG:
                numDays = 31;
                break;
            case SEP:
                numDays = 30;
                break;
            case OCT:
                numDays = 31;
                break;
            case NOV:
                numDays = 30;
                break;
            case DEC:
                numDays = 31;
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
        System.out.println(numDays);
    }
}
