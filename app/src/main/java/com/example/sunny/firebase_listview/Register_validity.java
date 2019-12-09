package com.example.sunny.firebase_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register_validity extends AppCompatActivity {

    Button regValidity;
    String getid, getemail, getpass, getdept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_validity);

        regValidity = findViewById(R.id.validitynext);

        Intent item = new Intent();
        getid = item.getStringExtra("userid");
        getemail = item.getStringExtra("useremail");
        getpass = item.getStringExtra("userpass");
        getdept = item.getStringExtra("userdept");


        regValidity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register_validity.this, Login.class);
                startActivity(i);
            }
        });

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
