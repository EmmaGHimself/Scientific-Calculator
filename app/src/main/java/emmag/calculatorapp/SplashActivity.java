package emmag.calculatorapp;

import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    Animation anim;
    ImageView imageView;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        this.imageView = (ImageView) findViewById(R.id.logoIV);
        this.anim= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
        this.anim.setAnimationListener(new AnimationListener(){
            public void onAnimationStart(Animation animation){
            }

            public void onAnimationEnd(Animation animation){
                SplashActivity.this.finish();
                SplashActivity splashActivity = SplashActivity.this;
                splashActivity.startActivity(new Intent(splashActivity, MainActivity.class));
            }

            public void onAnimationRepeat(Animation animation) {
            }
        });
        this.imageView.startAnimation(this.anim);
    }
}
