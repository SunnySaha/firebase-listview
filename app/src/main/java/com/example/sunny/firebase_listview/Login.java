package com.example.sunny.firebase_listview;

import android.annotation.SuppressLint;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    TextInputLayout idInput;
    TextInputLayout emailInput;
    TextInputLayout passInput;
    Button login;
    String id, pass, email;
    TextView forgetpass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        idInput = findViewById(R.id.idInputLayout);
        emailInput = findViewById(R.id.emailInputLayout);
        passInput = findViewById(R.id.passInputLayout);
        forgetpass = findViewById(R.id.forgetPass);

        login= findViewById(R.id.login_button);

        forgetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               id = idInput.getEditText().getText().toString().trim();
               pass = passInput.getEditText().getText().toString().trim();
               email = emailInput.getEditText().getText().toString();
               if(!id.isEmpty() && !pass.isEmpty() && !email.isEmpty()){
                   Toast.makeText(Login.this, "Now will check the procedure", Toast.LENGTH_LONG).show();

               }else{

                   Toast.makeText(Login.this, "Filled all Procedure First", Toast.LENGTH_LONG).show();
               }

            }
        });

    }
}
