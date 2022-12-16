public class IfStatements {

    public static void ifStatement1() {
            var x = 5; // LVTI -> x,y are both int's
            var y = 6;

        if (x>3) // true
            x++; // x==6
        if (x>5) { // true
            x--; // x ==5
            y++; // y== 7
        }
        if (x<3) { // false
            y--;
        }
        System.out.println(x + " " + y);
    }

    public static void ifStatement2() {
        var x = 5;
        var y = 6;

        if (x == 4) {
            x ++;
            y ++;
        } else {
            x --; // x == 4
            y --; // y == 5
        }
        System.out.println(x + " " + y); // 4 5
    }

    public static void ifStatement3() {
        var x = 5;
        var y = 6;
        boolean b = false;

        if (b = true) { // true
            x++; // x == 6
            y++; // y == 7
        } else if (y > 0) { // not evaluated
            x--;
            y--;
        } else { // not evaluated
            x = 9;
            y = 9;
        }
        System.out.println(x + " " + y); // 6 7
    }

    public static void ifStatement4 () {
        var x = 0;
        var y = 0;
        // if (x = 3) {} // not a boolean expression
        if (x == 3) // ok, a boolean expression
            if(x == 10)
                x++;
        y++; // executed
        System.out.println(x + " " + y);
    }

    public static void danglingElse (boolean b) {
        if (b)
            if(b)
                System.out.println("Here1"); // if 'true' is passed in
            else
                System.out.println("Here2");
        else
            System.out.println("Here3");// if 'false' is passed in

    }

    public static void main(String[] args) {

        ifStatement1();
        ifStatement2();
        ifStatement3();
        ifStatement4();
        danglingElse(true);
    }
}
