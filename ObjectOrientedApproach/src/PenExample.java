
abstract class Pen {} // it doesn't have abstract methods
abstract class Pencil {
    abstract void write (); // no {}
}

class DrawingPencil extends Pencil {
    void write () {}
    void erase () {}
}


public class PenExample {

    public static void main(String[] args) {

        // Pen pen = new Pen() ; // cannot "new" a pen (abstract)
        Pencil pencil = new DrawingPencil();
        // pencil.erase // compiler error because the method is not implemented in pencil
        DrawingPencil dp = (DrawingPencil) pencil;
        dp.erase();
    }
}
