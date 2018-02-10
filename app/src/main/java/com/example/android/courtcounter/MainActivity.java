package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int team_A_score = 0;
    int team_B_score = 0;

    int team_A_foul = 0;
    int team_B_foul = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score and fouls for Team A.
     */
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(team_A_score));

        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(team_A_foul));
    }

    /**
     * Increases Team A score by 1 point
     */
    public void team_A_score(View view) {
        team_A_score++;
        displayForTeamA();
    }

    /**
     * Increases Team A fouls by 1
     */
    public void team_A_foul(View view) {
        team_A_foul++;
        displayForTeamA();
    }

    /**
     * Displays the given score and fouls for Team B.
     */
    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(team_B_score));

        TextView foulView = (TextView) findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(team_B_foul));
    }

    /**
     * Increases Team B score by 1 point
     */
    public void team_B_score(View view) {
        team_B_score++;
        displayForTeamB();
    }

    /**
     * Increases Team B fouls by 1
     */
    public void team_B_foul(View view) {
        team_B_foul++;
        displayForTeamB();
    }

    /**
     * Resets the score and fouls to zero for both teams
     */
    public void reset_score(View view) {
        team_A_score = 0;
        team_B_score = 0;
        team_A_foul = 0;
        team_B_foul = 0;
        displayForTeamA();
        displayForTeamB();
    }
}