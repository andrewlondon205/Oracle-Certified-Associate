package exception;

import java.io.IOException;

public class Parent {

    public void process () throws IOException, NoSuchMethodException {
        throw new IOException("This is an IOException");
    }
}
