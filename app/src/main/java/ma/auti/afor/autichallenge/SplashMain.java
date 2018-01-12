package ma.auti.afor.autichallenge;

import android.support.v7.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import gr.net.maroulis.library.EasySplashScreen;

public class SplashMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EasySplashScreen config=new EasySplashScreen(SplashMain.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(1000)
                .withBackgroundResource(R.drawable.back)
                //.withBackgroundColor(Color.parseColor("#f6acad"))
                .withLogo(R.drawable.logo)
                .withHeaderText("Welcom Guest !");

        config.getHeaderTextView().setTextColor(Color.parseColor("#732b2a"));

        View view=config.create();
        setContentView(view);
    }
}
