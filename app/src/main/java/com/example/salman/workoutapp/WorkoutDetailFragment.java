package com.example.salman.workoutapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragment extends Fragment {
    private long workoutID;


    public WorkoutDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if(view!=null)
        {
            TextView title=view.findViewById(R.id.TextTitle);
            Workout workout=Workout.workouts[(int)workoutID];
            title.setText(workout.getName());
            TextView description = view.findViewById(R.id.TextDescription);
            description.setText(workout.getDescription());

        }
    }

    public void setWorkoutID(long workoutID) {
        this.workoutID = workoutID;
    }
}
