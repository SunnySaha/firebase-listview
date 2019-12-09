package com.example.sunny.firebase_listview;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Register_Id extends AppCompatActivity {

    Spinner departmentchoice;

    String departmentName, versityid;
    TextInputLayout versityId;

    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__id);


        departmentchoice = findViewById(R.id.departmentSpinner);



        next = findViewById(R.id.idnext);

        versityId = findViewById(R.id.regid);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                departmentName = departmentchoice.getSelectedItem().toString();
                versityid = versityId.getEditText().getText().toString().trim();

                if(!departmentName.isEmpty() && !versityid.isEmpty()){
                    Intent i = new Intent(Register_Id.this, Register_Email.class);
                    i.putExtra("versity_id", versityid);
                    i.putExtra("deptName", departmentName);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


                }else{

                    Toast.makeText(Register_Id.this, "Something Wrong", Toast.LENGTH_LONG).show();
                }
            }
        });




    }
}
