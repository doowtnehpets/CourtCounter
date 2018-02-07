package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int team_A_score = 0;
    int team_B_score = 0;

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
        team_A_score += 3;
        displayForTeamA(team_A_score);
    }

    /**
     * Increases Team A score by 2 points
     */
    public void team_A_2points(View view) {
        team_A_score += 2;
        displayForTeamA(team_A_score);
    }

    /**
     * Increases Team A score by 1 point
     */
    public void team_A_freethrow(View view) {
        team_A_score += 1;
        displayForTeamA(team_A_score);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increases Team B score by 3 points
     */
    public void team_B_3points(View view) {
        team_B_score += 3;
        displayForTeamB(team_B_score);
    }

    /**
     * Increases Team B score by 2 points
     */
    public void team_B_2points(View view) {
        team_B_score += 2;
        displayForTeamB(team_B_score);
    }

    /**
     * Increases Team B score by 1 point
     */
    public void team_B_freethrow(View view) {
        team_B_score += 1;
        displayForTeamB(team_B_score);
    }

    /**
     * Resets the score to zero for both teams
     */
    public void reset_score(View view) {
        team_A_score = 0;
        team_B_score = 0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
}