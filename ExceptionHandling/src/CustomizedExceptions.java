class DangerException extends Exception {}
class BullsInFieldException extends DangerException {}
class BogHoleException extends DangerException {}

public class CustomizedExceptions {
    public static void main(String[] args) {
        try {
            walk();
        } catch (DangerException de) {
            de.printStackTrace();
        }
    }

    public static void walk() throws DangerException {
        try {
            throw new BullsInFieldException();
        } catch (BullsInFieldException bife) {
            throw new DangerException();
        }
    }
}


