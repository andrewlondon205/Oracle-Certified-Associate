package ooa;

import java.util.ArrayList;
import java.util.List;

public class DriverOOA {

    public static void main(String[] args) {

        List<Exercise> exerciseList= new ArrayList<>();
        Exercise soccer = new Soccer(12.5);
        Exercise sprint = new Sprint(0.1);
        Exercise stroll = new Stroll(10);
        Exercise raceWalking = new RaceWalking(5);

        exerciseList.add(soccer);
        exerciseList.add(sprint);
        exerciseList.add(stroll);
        exerciseList.add(raceWalking);

        performExercises(exerciseList);

    }

    public static void performExercises(List<Exercise> exercises) {
        for (Exercise ex : exercises) {
            if (ex instanceof BallSport)
                System.out.println(ex.getClass().getSimpleName());
            else if (ex instanceof OlympicSport)
                System.out.println(ex.getClass().getSimpleName());
        }
    }
}
