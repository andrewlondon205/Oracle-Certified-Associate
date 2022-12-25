package secondpack;

import firstpack.Book;

public class FictionBook extends Book {
    public void doThings () {
        read(); //different package; inheritance; no problem
        this.read(); //different package; via inheritance; no problem
        FictionBook fb = new FictionBook(); // default constructor created for us
        fb.read(); // no problem

        /**
         * Here, i can create an instance of the superclass that has the protected member. Note that even though
         * FictionBook has access via inheritance to read(), FictionBook must access it properly.
         */

        Book b = new Book();
      //  b.read(); // not public
    }
}

class SpaceFictionBook extends FictionBook {
    public void doThings () {
        read();
  //      new Book().read();
  //      new FictionBook().read();
//        new SpaceFictionBook().read();
    }
}

class Reader {
    public void doThings() {
        Book b = new Book();
        //b.read()  ;

        // can i access the protected member via the subclass that inherits it?
        FictionBook fb = new FictionBook();
        // fb.read();
    }
}