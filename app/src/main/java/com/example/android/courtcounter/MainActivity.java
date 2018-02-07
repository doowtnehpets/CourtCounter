package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increases Team A score by 3 points
     */
    public void team_A_3points(View view) {
        displayForTeamA(3);
    }

    /**
     * Increases Team A score by 2 points
     */
    public void team_A_2points(View view) {
        displayForTeamA(2);
    }

    /**
     * Increases Team A score by 1 points
     */
    public void team_A_freethrow(View view) {
        displayForTeamA(1);
    }
}