package ma.auti.afor.autichallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.IOException;

import ma.auti.afor.autichallenge.Common.Common;
import ma.auti.afor.autichallenge.DB.Db2;

public class Main2Activity extends AppCompatActivity {

    SeekBar seekBar;
    TextView txtMode;
    Button btnPlay,btnScore;
    Db2 db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        seekBar = (SeekBar)findViewById(R.id.seekBar);
        txtMode = (TextView)findViewById(R.id.txtMode);
        btnPlay = (Button)findViewById(R.id.btnPlay);
        btnScore = (Button)findViewById(R.id.btnScore);


        db = new Db2(this);
        try{
            db.createDataBase();
        }
        catch (IOException e){
            e.printStackTrace();
        }




        //Event
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(progress == 0)
                    txtMode.setText(Common.MODE.EASY.toString());
                else if(progress == 1)
                    txtMode.setText(Common.MODE.MEDIUM.toString());
                else if(progress == 2)
                    txtMode.setText(Common.MODE.HARD.toString());
                else if(progress == 3)
                    txtMode.setText(Common.MODE.HARDEST.toString());
            }


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),PlayNmbr.class);
                intent.putExtra("MODE",getPlayMode()); // Send Mode to Play page
                startActivity(intent);
                finish();
            }
        });

        btnScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Score.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private String getPlayMode() {
        if(seekBar.getProgress()==0)
            return Common.MODE.EASY.toString();
        else if(seekBar.getProgress()==1)
            return Common.MODE.MEDIUM.toString();
        else if(seekBar.getProgress()==2)
            return Common.MODE.HARD.toString();
        else
            return Common.MODE.HARDEST.toString();
    }
}
