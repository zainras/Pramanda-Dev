package dev.mandapo.pramandagame;


import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class MapLv1 extends AppCompatActivity {
    Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_lv1);
    }


    public void btnNextTask(View view) {
        String taskKey = view.getTag().toString();
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        int xDpi = 0;
        int yDpi = 0;
        switch (taskKey) {
            case "0":
                xDpi = (int)(metrics.density * 0f);
                yDpi = (int)(metrics.density * 0f);
            break;
            case "1":
                xDpi = (int)(metrics.density * 60f);
                yDpi = (int)(metrics.density * -70f);
                break;
            case "2":
                xDpi = (int)(metrics.density * 120f);
                yDpi = (int)(metrics.density * 10f);
                break;
            case "3":
                xDpi = (int)(metrics.density * 190f);
                yDpi = (int)(metrics.density * 110f);
                break;
        }

        GifImageView gifImageView = (GifImageView) findViewById(R.id.gifChar);
        gifImageView.animate().translationX(xDpi).translationY(yDpi).setDuration(500).start();

    }
}
