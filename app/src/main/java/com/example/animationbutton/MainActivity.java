package com.example.animationbutton;
//https://blog.csdn.net/totond/article/details/58721649
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

        btn1.setOnClickListener(onClickListener);
        btn2.setOnClickListener(onClickListener);
        btn3.setOnClickListener(onClickListener);
        btn4.setOnClickListener(onClickListener);
        btn5.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn1:
                    tapToFade();
                    break;
                case R.id.btn2:
                    tapToBlink();
                    break;
                case R.id.btn3:

                    break;
                case R.id.btn4:

                    break;
                case R.id.btn5:

                    break;
            }
        }
    };

    private void tapToBlink() {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
        btn2.startAnimation(animation);
        Log.v("hank","tapToBlink");
    }

    private void tapToFade() {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.fade);
        btn1.startAnimation(animation);
    }



}
