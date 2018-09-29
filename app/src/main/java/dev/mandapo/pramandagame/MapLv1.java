package dev.mandapo.pramandagame;


import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class MapLv1 extends AppCompatActivity {
    Context context;
    public static String EXTRA_TASK_KEY = "";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_lv1);

        Intent intent = getIntent();

        // Get the extras (if there are any)
        Bundle extras = intent.getExtras();
        if (extras != null) {
            System.out.println(extras);
            String moveKey = extras.getString("EXTRA_JOS");

            DisplayMetrics metrics = getResources().getDisplayMetrics();
            int xDpi = 0;
            int yDpi = 0;
            int oldXDpi = 0;
            int oldYDpi = 0;
            switch (moveKey) {
            case "0":
                oldXDpi = (int)(metrics.density * 0f);
                oldYDpi = (int)(metrics.density * 0f);
                xDpi = (int)(metrics.density * 0f);
                yDpi = (int)(metrics.density * 0f);
            break;
            case "1":
                oldXDpi = (int)(metrics.density * 0f);
                oldYDpi = (int)(metrics.density * 0f);
                xDpi = (int)(metrics.density * 60f);
                yDpi = (int)(metrics.density * -70f);
                break;
            case "2":
                oldXDpi = (int)(metrics.density * 60f);
                oldYDpi = (int)(metrics.density * -70f);
                xDpi = (int)(metrics.density * 120f);
                yDpi = (int)(metrics.density * 10f);
                break;
            case "3":
                oldXDpi = (int)(metrics.density * 1200f);
                oldYDpi = (int)(metrics.density * 10f);
                xDpi = (int)(metrics.density * 190f);
                yDpi = (int)(metrics.density * 110f);
                break;
            }

            GifImageView gifImageView = (GifImageView) findViewById(R.id.gifChar);
            gifImageView.setX(oldXDpi);
            gifImageView.setY(oldYDpi);
            gifImageView.animate().translationX(xDpi).translationY(yDpi).setDuration(1500).start();

         }

    }


    public void btnNextTask(View view) {
        String taskKey = view.getTag().toString();

        Intent intent = new Intent(MapLv1.this, QuestionActivity.class);

        intent.putExtra(QuestionActivity.EXTRA_TASK_KEY, taskKey);
        startActivity(intent);


    }
}
