package com.example.abc;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        login= findViewById(R.id.loginbutton);


        register = findViewById(R.id.regbutton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Login has been clicked", Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 =new Intent(MainActivity.this,SignUp_Activity.class);
                startActivity(intent2);
            }
        });

    }

}