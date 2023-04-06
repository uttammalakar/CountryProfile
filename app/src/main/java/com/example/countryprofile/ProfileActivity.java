package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        imageView=findViewById(R.id.ImageId);
        textView=findViewById(R.id.TextId);
        Bundle bundle=getIntent().getExtras();
        if (bundle!=null){


            String countryname=bundle.getString("name");
            showDetails(countryname);
        }
    }
    void showDetails(String countryname){

        if (countryname.equals("bangladesh")){

            imageView.setImageResource(R.drawable.bdflag);
            textView.setText(R.string.bdtxt);
        }
        if (countryname.equals("india")){

            imageView.setImageResource(R.drawable.indianflag);
            textView.setText(R.string.indiatx);
        }
    }
}