package com.example.asus.test;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Surface;
import android.widget.ImageView;
import android.widget.TextView;

public class details extends AppCompatActivity {
    private ImageView imageView;
    private TextView title,details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView = findViewById(R.id.image_details);
        title = findViewById(R.id.title2);
        details = findViewById(R.id.details_text);


        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String select = bundle.getString("name");
            System.out.println(select);

            showDetails(select);
        }

    }
    public void showDetails(String select){
        title.setText(null);
        int orientation = this.getResources().getConfiguration().orientation;
        if(select.contains("greatwall")){
            getSupportActionBar().setTitle(R.string.great_wall);
            imageView.setImageResource(R.drawable.great_wall);
            if(orientation == Configuration.ORIENTATION_PORTRAIT){
                title.setText(R.string.great_wall);
            }
            details.setText(R.string.great_wall_text);
        }if(select.contains("petra")){
            getSupportActionBar().setTitle(R.string.petra);
            imageView.setImageResource(R.drawable.petra);
            if(orientation == Configuration.ORIENTATION_PORTRAIT){
                title.setText(R.string.petra);
            }
            details.setText(R.string.petra_text);
        }if(select.contains("christ")){
            getSupportActionBar().setTitle(R.string.christ);
            imageView.setImageResource(R.drawable.christ);
            if(orientation == Configuration.ORIENTATION_PORTRAIT){
                title.setText(R.string.christ);
            }
            details.setText(R.string.christ_text);
        }if(select.contains("machu")){
            getSupportActionBar().setTitle(R.string.machu);
            imageView.setImageResource(R.drawable.machu);
            if(orientation == Configuration.ORIENTATION_PORTRAIT){
                title.setText(R.string.machu);
            }
            details.setText(R.string.machu_text);
        }if(select.contains("chichen")){
            getSupportActionBar().setTitle(R.string.chichen);
            imageView.setImageResource(R.drawable.chichen);
            if(orientation == Configuration.ORIENTATION_PORTRAIT){
                title.setText(R.string.chichen);
            }
            details.setText(R.string.chichen_text);
        }if(select.contains("colosseum")){
            getSupportActionBar().setTitle(R.string.colosseum);
            imageView.setImageResource(R.drawable.colosseu);
            if(orientation == Configuration.ORIENTATION_PORTRAIT){
                title.setText(R.string.colosseum);
            }
            details.setText(R.string.colosseum_text);
        }if(select.contains("taj")){
            getSupportActionBar().setTitle(R.string.taj);
            imageView.setImageResource(R.drawable.tajmahal);
            if(orientation == Configuration.ORIENTATION_PORTRAIT){
                title.setText(R.string.taj);
            }
            details.setText(R.string.taj_text);
        }if(select.contains("pyramid")){
            getSupportActionBar().setTitle(R.string.pyramid);
            imageView.setImageResource(R.drawable.pyramid);
            if(orientation == Configuration.ORIENTATION_PORTRAIT){
                title.setText(R.string.pyramid);
            }
            details.setText(R.string.pyramid_text);
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
