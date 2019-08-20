package com.example.asus.test;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(this);
        btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(this);
        btn4 = findViewById(R.id.button4);
        btn4.setOnClickListener(this);
        btn5 = findViewById(R.id.button5);
        btn5.setOnClickListener(this);
        btn6 = findViewById(R.id.button6);
        btn6.setOnClickListener(this);
        btn7 = findViewById(R.id.button7);
        btn7.setOnClickListener(this);
        btn8 = findViewById(R.id.button8);
        btn8.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder aleart = new AlertDialog.Builder(MainActivity.this);
        aleart.setTitle("Confirm Exit??");
        aleart.setMessage("Are you sure to exit now?");
        aleart.setCancelable(true);
        aleart.setIcon(R.drawable.ic_exit_to_app_black_24dp);
        aleart.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        aleart.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Welcome Back...",Toast.LENGTH_SHORT).show();
            }
        });
        aleart.create().show();
    }


    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.button1){
            intent = new Intent(MainActivity.this,details.class);
            Toast.makeText(MainActivity.this,btn1.getText(),Toast.LENGTH_SHORT).show();
            intent.putExtra("name","greatwall");
            startActivity(intent);
        }
        if(v.getId()==btn2.getId()){
           intent = new Intent(MainActivity.this,details.class);
            Toast.makeText(MainActivity.this,btn2.getText(),Toast.LENGTH_SHORT).show();
            intent.putExtra("name","petra");
            startActivity(intent);
       }
        if(v.getId()==btn3.getId()){
            intent = new Intent(MainActivity.this,details.class);
           Toast.makeText(MainActivity.this,btn3.getText(),Toast.LENGTH_SHORT).show();
            intent.putExtra("name","christ");
            startActivity(intent);
        }
        if(v.getId()==btn4.getId()){
            intent = new Intent(MainActivity.this,details.class);
            Toast.makeText(MainActivity.this,btn4.getText(),Toast.LENGTH_SHORT).show();
            intent.putExtra("name","machu");
            startActivity(intent);
        }
        if(v.getId()==btn5.getId()){
           intent = new Intent(MainActivity.this,details.class);
            Toast.makeText(MainActivity.this,btn5.getText(),Toast.LENGTH_SHORT).show();
           intent.putExtra("name","chichen");
            startActivity(intent);
        }
        if(v.getId()==btn6.getId()){
           intent = new Intent(MainActivity.this,details.class);
            Toast.makeText(MainActivity.this,btn6.getText(),Toast.LENGTH_SHORT).show();
            intent.putExtra("name","colosseum");
           startActivity(intent);
        }
        if(v.getId()==btn7.getId()){
            intent = new Intent(MainActivity.this,details.class);
            Toast.makeText(MainActivity.this,btn7.getText(),Toast.LENGTH_SHORT).show();
            intent.putExtra("name","taj");
            startActivity(intent);
        }
        if(v.getId()==btn8.getId()){
            intent = new Intent(MainActivity.this,details.class);
            Toast.makeText(MainActivity.this,btn8.getText(),Toast.LENGTH_SHORT).show();
           intent.putExtra("name","pyramid");
            startActivity(intent);
        }


    }
}
