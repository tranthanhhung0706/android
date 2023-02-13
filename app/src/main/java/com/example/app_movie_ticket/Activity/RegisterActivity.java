package com.example.app_movie_ticket.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.app_movie_ticket.R;

public class RegisterActivity extends AppCompatActivity {
    ImageView img_back;
    Button btn_sign_up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setController();
        setEvent();
    }

    private void setEvent() {
        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        btn_sign_up.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(RegisterActivity.this,UserProFilingActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }

    private void setController() {
        img_back=findViewById(R.id.img_back);
        btn_sign_up=findViewById(R.id.btn_sign_up);
    }
}