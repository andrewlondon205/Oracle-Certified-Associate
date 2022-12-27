import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        /**
         * Note: No catch or finally required. Finally is implicit. However, main() must daclare it throws IOException
         * 'out' closed first, then 'in'
         */

        try (FileInputStream in = new FileInputStream("in.txt");
             FileOutputStream out = new FileOutputStream("out.txt") ) {
        }

        //Scope is local i.e. ok to use 'in' again
        // 'var' is ok i.e. local Variable Type Inference is ok
        try (FileInputStream in = new FileInputStream("in.txt");
             var out = new FileOutputStream("out.txt") ) {
        }
    }
}
