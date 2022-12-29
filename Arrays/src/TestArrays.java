
interface Sporty {
    void beSporty();
}


class Car implements Sporty{
    @Override
    public void beSporty() {

    }
}
class Tesla extends Car implements Sporty {
    @Override
    public void beSporty() {

    }
}
class Toyota extends Car implements Sporty {
    @Override
    public void beSporty() {

    }
}

class Ferrari extends Car implements Sporty {
    @Override
    public void beSporty() {

    }
}




public class TestArrays {
    public static void main(String[] args) {
        int [] a = new int[3];
        int [] b = {1,2,3};
        int [] c;
        c = new int[6];
        new TestArrays().takesAnArray(new int[] {1,2,3});

        Sporty [] cars = {new Car(), new Tesla(), new Toyota(), new Ferrari()};
    }

    void takesAnArray (int [] a) {

    }
}
