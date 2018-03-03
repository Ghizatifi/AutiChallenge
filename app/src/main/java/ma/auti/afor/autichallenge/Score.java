package ma.auti.afor.autichallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Score  {

    private int Id;
    private double Score;

    public Score(int id, double score) {
        Id = id;
        Score = score;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }
}
