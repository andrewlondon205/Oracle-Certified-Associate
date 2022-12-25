class Animal {
    public void eat() {System.out.println("Animal::eat()");}
    public void eat(String s) {System.out.println("Animal::eat(string)");}
    public Animal drink() {return new Animal();}
}

class Cow extends Animal {
  //  private void eat() {} // access modifier cannot be weaker
  //  public void eat() throws IOException {}

    public void eat(String s) {} // an overload, not an override
 //   public String eat() {} // return type should be void

    public Cow drink () {return new Cow();}

}

class Horse extends Animal {
    public void eat() {System.out.println("Hourse:eat()");}
    public void buck() {System.out.println("Hourse:buck()");}
}


public class TestAnimals {

    public static void main(String[] args) {

        Animal aa = new Animal();
        aa.eat(); // Animal::eat()
        aa.eat("something"); // Animal::eat(String)
        // aa.buck(); //buck() is not in Animal class

        Animal ah = new Animal();
        ah.eat();  // Horse::eat()
        ah.eat("hello world"); // Animal::eat(String) - inherited method
        // ah.buck() // buck() not in Animal Class

        new Horse().buck(); // Horse::buck()
     }

}
