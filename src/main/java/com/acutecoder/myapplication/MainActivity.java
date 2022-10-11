package com.acutecoder.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView c1,c2,c3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1= findViewById(R.id.card1);
        c2= findViewById(R.id.card2);
        c3= findViewById(R.id.card3);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(c1.getContext(), detail.class);
                intent.putExtra("heading","Storage Unit");
                intent.putExtra("image",R.drawable.assert2);
                c1.getContext().startActivity(intent);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(c1.getContext(), detail.class);
                intent.putExtra("heading","Volentere On Ground");
                intent.putExtra("image",R.drawable.assert4);
                c1.getContext().startActivity(intent);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(c1.getContext(), detail.class);
                intent.putExtra("heading","Food Distribution and collection");
                intent.putExtra("image",R.drawable.assert3);
                c1.getContext().startActivity(intent);
            }
        });
    }
}