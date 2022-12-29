package exception;

import java.io.IOException;

public class Child extends Parent{
    @Override
    public void process() throws NoSuchMethodException {
        throw new NoSuchMethodException("Another exception thrown");
    }

    /**
     * In attemtping to throw OException and NoSuchMethodException, we get an "unreachable statement" error. To fix this,
     * we should be throwing one of the two above-mentioned exceptions.
     */
}
