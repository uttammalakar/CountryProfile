package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bdbutton,indiabutton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bdbutton=findViewById(R.id.BdbuttonId);
        indiabutton=findViewById(R.id.IndiaButtonId);
        bdbutton.setOnClickListener(this);
        indiabutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.BdbuttonId){
            intent =new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","bangladesh");
            startActivity(intent);

        }
        if (view.getId() == R.id.IndiaButtonId){
            intent =new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","india");
            startActivity(intent);

        }
    }
}