
class BullInFieldException extends Exception {
    BullInFieldException () {}
    BullInFieldException (Exception e) {
        super(e);
    }
    BullInFieldException(String s) {
        super(s);
    }
}


public class CustomExceptions {
    public static void main(String[] args) throws Exception{
        throw new BullInFieldException("Walking in fields ...");
    }
}
