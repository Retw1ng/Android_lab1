package com.example.myapplication;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import org.w3c.dom.Text;

public class HelloActivity  extends Activity {
    int count = 0;
    int col= 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        Button button1 = findViewById(R.id.button1);
        TextView score = (TextView) findViewById(R.id.countt);
        final int[] colors = {0xfffff000};
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setBackgroundColor(colors[0]);
                colors[0] = colors[0] - 0x00000FF0;
                count = count + 1;
                score.setText(String.valueOf(count));
            }
        });

        Button button2 = findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = count + 2;
                score.setText(String.valueOf(count));

            }
        });
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setBackgroundColor(Color.RED);
                count = count + 3;
                score.setText(String.valueOf(count));

            }
        });
    }
}