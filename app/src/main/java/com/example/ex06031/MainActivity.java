package com.example.ex06031;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button Clickme;
    int count;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Clickme=findViewById(R.id.Clickme);
        tv=findViewById(R.id.tv);
        count=0;

    }

    public void go(View view) {
        count++;
        tv.setText("This is a click number:"+count);

        tv.setTextColor(Color.RED);


    }
}