package com.gmail.reater.last.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA;
    private int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneForTeamA(View v) {
        scoreTeamA++;
        displayForTeam(R.id.team_a_score, scoreTeamA);
    }

    public void addTwoForTeamA(View v) {
        scoreTeamA+=2;
        displayForTeam(R.id.team_a_score, scoreTeamA);
    }

    public void addThreeForTeamA(View v) {
        scoreTeamA+=3;
        displayForTeam(R.id.team_a_score, scoreTeamA);
    }

    public void addOneForTeamB(View v) {
        scoreTeamB++;
        displayForTeam(R.id.team_b_score, scoreTeamB);
    }

    public void addTwoForTeamB(View v) {
        scoreTeamB+=2;
        displayForTeam(R.id.team_b_score, scoreTeamB);
    }

    public void addThreeForTeamB(View v) {
        scoreTeamB+=3;
        displayForTeam(R.id.team_b_score, scoreTeamB);
    }

    public void displayForTeam(int id, int score) {
        TextView scoreView = findViewById(id);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        displayForTeam(R.id.team_a_score, scoreTeamA);
        scoreTeamB = 0;
        displayForTeam(R.id.team_b_score, scoreTeamB);
    }
}