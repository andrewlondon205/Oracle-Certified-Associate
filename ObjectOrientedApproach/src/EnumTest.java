
enum Direction {
    NORTH,SOUTH,EAST,WEST
}

public class EnumTest {
    public static void main(String[] args) {
        //Direction d = new Direction(); //compiler error
        //Direction d = Direction.SOUTH_WEST // type safety

        Direction d = Direction.WEST;
        System.out.println(d == Direction.WEST);
        System.out.println(d.equals(Direction.WEST));

        switch (d) {
            case WEST -> System.out.println("West");

        }
        Direction d2 = Direction.valueOf("EAST");
        System.out.println(d2);

        for(Direction direction : Direction.values()) {
            System.out.println(direction.ordinal() + ", " + direction.name());
        }
    }
}
