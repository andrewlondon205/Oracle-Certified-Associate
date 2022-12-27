import java.io.Closeable;
import java.io.IOException;

class MyCloseable implements AutoCloseable {
    private final char letter;
    MyCloseable(char letter) {this.letter = letter;}
    @Override
    public void close() throws Exception {
        System.out.println(letter);
    }
}

public class TryWithResourcesTest {
    public static void main(String[] args)  {
        try(MyCloseable c1 = new MyCloseable('A');
           MyCloseable c2 = new MyCloseable('B')) {
            int x = 5/0;
        } catch (Exception ae) {
            System.out.println("Exception: Divide by Zero");
        } finally {
            System.out.println("Custom finally");
        }

    }
}
