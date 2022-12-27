import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExceptions {

    public static void main(String[] args) {
        try {
            spillTea();
            System.out.println("Will never get here!");
        } catch (RuntimeException rte) {
            getAnotherCup();
        }
        enjoyRestOfVideo();
    }

    public static void spillTea() {
        System.out.println("Spilling tea... ");
        throw new RuntimeException();
    }

    public static void getAnotherCup () {
        System.out.println("Getting another cup");
    }

    public static void enjoyRestOfVideo() {
        System.out.println("Enjoying rest of video");
    }

    public static void Exception () {
        try {
            /**
             * Must throw an IOException here, otherwise compiler will realise the catch blocks are unreachable. If the
             * catch blocks were for RuntimeExceptions only, then i could have an empty try {} block
             */
            throw new IOException();
        } catch (FileNotFoundException |EOFException e) {
            /**
             * Identifier appears only once. These do not compile:
             * catch (FileNotFoundException e | EOFException e)
             * catch (FileNotFoundException e1 | EOFException e2)
             * Exceptions must be siblings (no subclass relationship)
             * This fails to compile:
             * catch (FileNotFoundException | IOException e)
             */
        } catch (IOException ioe) {}
    }
}
