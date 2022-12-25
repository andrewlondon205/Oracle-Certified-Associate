public class Actor {
    private String name;
    private int age;

    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public  boolean equals(Object o) {
        if (o instanceof Actor) {
            Actor actor = (Actor) o;
            if(this.getAge() == actor.getAge() && this.getName().equals(actor.getName())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return 7;
    }

    public static void main(String[] args) {

        Actor actor1 = new Actor("Johny Depp",48);
        Actor actor2 = new Actor("Johny Depp",48);

        System.out.println(actor1 == actor2);
        System.out.println(actor1.equals(actor2));

    }
}
