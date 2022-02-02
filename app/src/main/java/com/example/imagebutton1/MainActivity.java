package com.example.imagebutton1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {
    ImageView iv1;
    ImageButton imagebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv1 = findViewById(R.id.imageView);
        imagebtn = findViewById(R.id.imageButton);
    }

    public void Clicked(View view) {
        int random = (int)(101*Math.random())%3+1;
        if(random == 1) {
            imagebtn.setImageResource(R.drawable.oneone);
            iv1.setImageResource(R.drawable.cln);
        }
        else if(random == 2) {
            imagebtn.setImageResource(R.drawable.two);
            iv1.setImageResource(R.drawable.python);
        }
        else if(random == 3) {
            imagebtn.setImageResource(R.drawable.three);
            iv1.setImageResource(R.drawable.assembly);
        }
    }
}