public class WhileLoop {

    public static void main(String[] args) {

        int x = 0;
        while (x > 0)
            System.out.println("x>0");
        while (x < 3) {
            System.out.println(x);
            x++;
        }

        int y = 1;
    //    while(y) {} // int cannot be converted to boolean
    //    while(y=5) {} // resolves to 5 (the value of the variable after the assignment)

     //   while(y==5){} // ok
     //   while(true){} // ok

        int n = 3;
        do {
            System.out.println(n);
            n++;
        }
        while (n < 99);

        do{
            System.out.println(n);
            --n;
        } while (n > 0); // lack of semicolumn leads to an error at compile-time

    }
}
