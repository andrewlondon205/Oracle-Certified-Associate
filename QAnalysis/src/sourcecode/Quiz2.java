package sourcecode;

public class Quiz2 {

    public static void main(String[] args) {

        int rate = 10;

        int t = 5;

        double amount = 1000.0;

        for(int i=0; i<t; i++){
            amount = amount*(1 - rate/100);
        }

        System.out.println(amount);
    }
}
