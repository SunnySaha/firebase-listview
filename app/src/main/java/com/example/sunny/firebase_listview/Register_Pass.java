package com.example.sunny.firebase_listview;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register_Pass extends AppCompatActivity {

    TextInputLayout regPass;
    Button passNext;
    String getId, getEmail, getDept, regPassStr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__pass);

        regPass = findViewById(R.id.regpass);
        passNext = findViewById(R.id.passnext);

        Intent item = new Intent();
        getId = item.getStringExtra("id");
        getEmail = item.getStringExtra("email");
        getDept = item.getStringExtra("deptname");

        passNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                regPassStr = regPass.getEditText().getText().toString();
                if(!regPassStr.isEmpty()){

                    //now time to email validation
                    Intent i = new Intent(Register_Pass.this, Register_validity.class);
                    i.putExtra("userid", getId);
                    i.putExtra("useremail", getEmail);
                    i.putExtra("userdept", getDept);
                    i.putExtra("userpass", regPassStr);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }

            }
        });
    }
}
