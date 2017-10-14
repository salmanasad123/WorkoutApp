package com.example.salman.workoutapp;

/**
 * Created by Salman on 10/14/2017.
 */

public class Workout {

    private String name;
    private String description;

    private Workout(String name, String description) {
        this.name = name;
        this.description = description;

    }

    public static final Workout[] workouts = {
            new Workout("The Limb Loosner", "5 handstand push-ups\n 10 1 legged squats\n 15 pull-ups"),
            new Workout("Core Agony", "100 pull-ups\n 100 push-ups \n 100 sit-ups"),
            new Workout("The Wimp Special", "5 push-ups\n 10 pull-ups\n 15 squats"),
            new Workout("Strength and Length", "5 handstand push-ups\n 10 1 legged squats\n 15 pull-ups"),
    };


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static Workout[] getWorkouts() {
        return workouts;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
