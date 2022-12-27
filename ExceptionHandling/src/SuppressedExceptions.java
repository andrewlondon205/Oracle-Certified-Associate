import java.io.IOException;

class CustomCloseable implements AutoCloseable {
    private final char letter;
    CustomCloseable(char letter) {this.letter = letter;}
    @Override
    public void close() throws IOException {
        throw new IOException("Closing: " + letter);
    }
}


public class SuppressedExceptions {
    public static void main(String[] args) {
        try (CustomCloseable c1 = new CustomCloseable('A');
            CustomCloseable c2 = new CustomCloseable('B')) {
            throw new IOException("Try");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            for (Throwable t : e.getSuppressed()) {
                System.out.println("suppressed: " + t);
            }
            try {
                throw new IOException("Catch");
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
                for (Throwable t : e2.getSuppressed()) {
                    System.out.println("suppressed twice??: " + t);
                }
            }
        }
        finally {
            System.out.println("Custom Finally");
        }
    }
}
