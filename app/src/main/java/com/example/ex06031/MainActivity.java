package com.example.ex06031;

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
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Clickme=findViewById(R.id.Clickme);
        tv=findViewById(R.id.tv);

    }

    public void go(View view) {
        tv.setText("Oh, yea, I’ve been clicked!");
        tv.setTextSize(23);

    }
}