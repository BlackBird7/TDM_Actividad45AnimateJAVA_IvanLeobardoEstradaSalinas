package com.ittepic.tdm_actividad45animatejava_ivanleobardoestradasalinas;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView =findViewById(R.id.faceIcon);
    }
    public void onButtonClick(View v) {

        imageView.animate()
                .scaleX(2)
                .scaleY(2)
                .rotationX(220)
                .rotationY(220)
                .translationX(200)
                .translationY(200)
                .setDuration(3000)
                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {
                        Log.i("Animation", "onAnimationStart");
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        Log.i("Animation", "onAnimationEnd");
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });
    }
}
