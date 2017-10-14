package com.example.salman.workoutapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    WorkoutDetailFragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment= (WorkoutDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detail_Frag);
        fragment.setWorkoutID(1);

    }
}
