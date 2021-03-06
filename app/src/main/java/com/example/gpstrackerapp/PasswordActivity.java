package com.example.gpstrackerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PasswordActivity extends AppCompatActivity {

    String email;
    EditText e3_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        e3_password = (EditText)findViewById(R.id.editTextTextPassword3);

        Intent myIntent = getIntent();
        if(myIntent != null){
            email = myIntent.getStringExtra("email");
        }
    }


    public void goToNamePicActivity(View v){
        if (e3_password.getText().toString().length() > 6){
            Intent myIntent = new Intent(PasswordActivity.this, NameActivity.class);
            myIntent.putExtra("email", email);
            myIntent.putExtra("password", e3_password.getText().toString());

            startActivity(myIntent);
        }else{
            Toast.makeText(getApplicationContext(), "Password length should be more 6 characters", Toast.LENGTH_SHORT).show();
        }
    }

}