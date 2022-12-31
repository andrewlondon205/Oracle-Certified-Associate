import java.util.ArrayList;
import java.util.List;

class Individual {
    private String name;
    Individual(String name) {this.name = name; }
    public String getName() {return name;}

    @Override
    public String toString() {
        return "Individual{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Individual) {
            Individual id = (Individual) o ;
            if (id.getName().equals(this.name))
                return true;
        }
        return false;
    }
}


public class TestArraysAndArrayLists {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        Individual [] individuals = {new Individual("Alex"), new Individual("Brian")};
        List<Individual> people = new ArrayList<>();
        Individual april = new Individual("April");
        people.add(april);
        people.add(new Individual("Beatrice"));
        people.add(new Individual("Carol"));
        people.add(new Individual("Deirdre"));
        people.add(new Individual("Enda"));
        people.add(new Individual("Frank"));
        people.add(new Individual("Henry"));
        people.add(new Individual("Gerard"));
        System.out.println(people);

        Individual p = people.get(1);
        System.out.println(p.getName());
        System.out.println(people.contains(april));
        System.out.println(people.contains(new Individual("Beatrice")));
        people.add(new Individual("Carol"));
        people.remove(new Individual("Carol"));
        System.out.println(people);
        people.remove(0);
        System.out.println(people);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(1000));
        numbers.add(1000);
        System.out.println(numbers);

    }
}
