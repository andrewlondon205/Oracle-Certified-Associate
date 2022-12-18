public class ForLoop {

    public static void main(String[] args) {

        for(int i=1; i<=3; i++); // ok

        for(int i=1; i<=3; i++)
            System.out.println(i); // 1,2,3

        for(int i=3; i>=1; --i)
            System.out.println(i); //3,2,1

        for(int i=0,j=0; i<1 && j<1; ++i, j++)
            System.out.println(i + " " + j); //0,0

        for (int i=0; i<5; i--) {} //infinite loop

        int i=0;
        //for(int i=0; i<5; i++) // 'i' already declared in this scope

    //    for(int j=0, short k=0; i<5 && j<5; i++, j++) // mixed type

        for(int f=0; f<5; f++) {}
       // System.out.println(f); // out of scope

        int counter = 0;
        for(counter=3;counter>1;counter--) {} // it will execute

    }
}
