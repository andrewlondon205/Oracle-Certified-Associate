public class BreakContinue {

    public static void main(String[] args) {
       // nestedLoops();
        int i=0;
        do {
            System.out.println(i);
        }
        while(i++<3);
    }



    public static void nestedLoops () {

        /**
         *     i,  j
         *     1,  1
         *     1,  2
         *     1,  3
         *     1,  4
         *     1,  5
         *     2,  1
         *     2,  2
         *     2,  3
         *     2,  4
         *     2,  5
         *     3,  1
         *     3,  2
         *     3,  3
         *     3,  4
         *     3,  5
         */

        System.out.println("i, j\n====");

        for (int i=1; i<=3; i++) {
            for (int j =1; j<=5; j++) {
                System.out.println(i + ", " + j);
            }
        }
    }

    public static void normalBreak () {

        /**
         *   i, j
         *   1, 1
         *   1, 2
         *   2, 1
         *   2, 2
         *   3, 1
         *   3, 2
         */

        System.out.println("i, j\n====");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    break;
                }
                System.out.println(i + ", " + j);
            }
        }
    }

    public static void normalContinue () {

        /**
         *  Output:
         *  i, j
         *  ====
         *  1, 1
         *  1, 2
         *  1, 4
         *  1, 5
         *  2, 1
         *  2, 2
         *  2, 4
         *  2, 5
         *  3, 1
         *  3, 2
         *  3, 4
         *  3, 5
         */

        System.out.println("i, j\n====");
        for (int i=1; i <=3; i++) {
            for (int j=1; j<=5; j++) {
                if (j ==3){
                    continue; // bypasses s.o.p and continues with inner loop
                }
                System.out.println(i + ", " + j);
            }
        }
    }

    public static void labelledBreak () {
        /**
         *  i, j
         *  ====
         *  1, 1
         *  1, 2
         */
        System.out.println("i, j\n===="); //placed BEFORE label
        OUTERLOOP:
        for(int i=1; i<=3; i++) {
            for (int j=1; j<=5; j++) {
                if (j==3) {
                    break OUTERLOOP; // case sensitive
                }
                System.out.println(i + ", " + j);
            }
        }
    }

    public static void labelledContinue () {

        // once j==3 in inner loop, control passes to next iteration of outer loop

        /**
         *  Output:
         *  i, j
         *  ====
         *  1, 1
         *  1, 2
         *  2, 1
         *  2, 2
         *  3, 1
         *  3, 2
         */

        System.out.println("i, j\n====");
        OUTERLOOP:
        for (int i=1; i<=3; i++) {
            for (int j = 1; j<=5; j++) {
                if (j==3) {
                    continue OUTERLOOP; // exits the inner loop and continue with OUTERLOOP
                }
                System.out.println(i + ", " + j);
            }
        }
    }


}


