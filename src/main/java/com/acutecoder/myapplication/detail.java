package com.acutecoder.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detail extends AppCompatActivity {
    ImageView i;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        i=findViewById(R.id.image);
        t=findViewById(R.id.heading);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        t.setText(b.getString("heading"));
        i.setImageResource(b.getInt("image"));
    }
}