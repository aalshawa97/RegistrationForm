package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegisterBtnClick (View view){

        TextView txtFirstName = findViewById(R.id.register);
        TextView txtLastName = findViewById(R.id.lastName);
        EditText editTextFirstName = findViewById(R.id.firstName);
        EditText editTextLastName = findViewById(R.id.lastName);
        txtFirstName.setText("First Name: " + editTextFirstName.getText().toString());
        txtLastName.setText("Last Name: " + editTextLastName.getText().toString());
        /*TextView txtEmail = findViewById(R.id.textViewEmail);


        EditText editTextEmail = findViewById(R.id.editTextEmail);



        txtEmail.setText("Email: " + editTextEmail.getText().toString());

         */
    }
}