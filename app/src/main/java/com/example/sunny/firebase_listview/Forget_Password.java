package com.example.sunny.firebase_listview;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Forget_Password extends AppCompatActivity {

    TextInputLayout emailToReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget__password);

        emailToReset = findViewById(R.id.emailToResetPass);
        
    }
}
