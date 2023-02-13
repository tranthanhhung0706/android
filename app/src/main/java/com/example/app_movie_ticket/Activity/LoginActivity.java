package com.example.app_movie_ticket.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.app_movie_ticket.R;

public class LoginActivity extends AppCompatActivity {
    Button btn_login;
    TextView txt_sign_up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setControler();
        setEvent();
    }

    private void setEvent() {
        txt_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setControler() {
        btn_login=findViewById(R.id.btn_login);
        txt_sign_up=findViewById(R.id.txt_sign_up);
    }
}