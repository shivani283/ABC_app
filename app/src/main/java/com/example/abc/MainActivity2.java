package com.example.abc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText ed;
    Button signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ed=findViewById(R.id.editTextTextPassword);
        signin=findViewById(R.id.signinbutton);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(MainActivity2.this,Insta_Activity4.class);

                if (ed.getText().toString().equals("1234")) {
                    startActivity(intent4);
                }
            }
        });

    }
}