package com.example.sunny.firebase_listview;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Register_Email extends AppCompatActivity {

    TextInputLayout regEmailAddress;

    String getId, getDept, regEmailstr;

    Button emailNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__email);

        regEmailAddress = findViewById(R.id.regemail);

        emailNext = findViewById(R.id.emailnext);


        Intent getitem= new Intent();
        getId = getitem.getStringExtra("versity_id");
        getDept = getitem.getStringExtra("deptName");

        emailNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                regEmailstr = regEmailAddress.getEditText().getText().toString().trim();

                if(!regEmailstr.isEmpty()){

                    //check if the email is already sign up earlier or new user
                    //check the id & email already has in our database or not
                    Intent i = new Intent(Register_Email.this, Register_Pass.class);
                    i.putExtra("email", regEmailstr);
                    i.putExtra("id", getId);
                    i.putExtra("deptname", getDept);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


                }else{
                    Toast.makeText(Register_Email.this, "Essshh You made a mistake", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
