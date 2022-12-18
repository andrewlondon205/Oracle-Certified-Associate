import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoop {

    public static void main(String[] args) {
        String [] cars = new String[3];
        cars[0] = "Fiat";
        cars[1] = "Volvo";
        cars[2] = "Tesla";

        for (int i=0; i<cars.length; i++)
            System.out.println(cars[i]);

        for (String car: cars)
            System.out.println(car);

        for (var car : cars)
            System.out.println(car);

        List<String> vehicles = new ArrayList<>();

        vehicles.add("Fiat");
        vehicles.add("Volvo");
        vehicles.add("Tesla");
        vehicles.add("Ferrari");

        for (String vehicle:vehicles)
            System.out.println(vehicle);

        String [] countries = new String[3];
        countries[0] = "Ireland";
        countries[1] = "United States";
        countries[2] = "Canada";
/*

        for(int country: countries) {} // 'country' should be String

        String name = "";
        for (String name: countries) // 'name' is already declared
            System.out.println(name);

        String player = "Federer";
        for (String p:player) {} // array or Iterable on RHS

        long [] la = {8L,9L,10L};
        for (int n: la) {} // 'n' needs to be long
*/

        String [][] directions = {{"North", "South"}, {"East","West"}};

        for (String [] row:directions) {
            for (int i=0; i<row.length; i++) {
                System.out.print(row[i] + "\t");
        }
        System.out.println();
    }
    }
}
