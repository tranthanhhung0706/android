package com.example.app_movie_ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.app_movie_ticket.Activity.LoginActivity;
import com.example.app_movie_ticket.Activity.ScheduleActivity;
import com.example.app_movie_ticket.Model.Movie;
import com.example.app_movie_ticket.Model.User;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
     Button btn_get_start;
     TextView txt_sign_in;
    List<User> list;
    List<Movie> movieList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }
    public static String convertDateToDayOfWeek(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // lưu ý: tháng bắt đầu từ 0
        Date date = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("EEEE"); // "EEEE" sẽ trả về thứ dưới dạng chữ đầy đủ
        String dayOfWeek = format.format(date);
        return dayOfWeek;
    }
    private void setEvent() {
        btn_get_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int year = 2023;
                int month = 3;
                int day = 14;
                String dayOfWeek = convertDateToDayOfWeek(year, month, day);
                System.out.println("Ngày " + day + "/" + month + "/" + year + " là " + dayOfWeek);
                Intent intent=new Intent(MainActivity.this, ScheduleActivity.class);
                startActivity(intent);
//                ApiService.apiSevice.getAll().enqueue(new Callback<List<User>>() {
//                    @Override
//                    public void onResponse(Call<List<User>> call, Response<List<User>> response) {
//                        Toast.makeText(MainActivity.this,"success",Toast.LENGTH_SHORT).show();
//                        list=new ArrayList<>();
//                        list=response.body();
//                        for (int i=0;i<list.size();i++){
//                            System.out.println(list.get(i).getUsername());
//                        }
//
//                    }
//
//                    @Override
//                    public void onFailure(Call<List<User>> call, Throwable t) {
//                        Toast.makeText(MainActivity.this,"error",Toast.LENGTH_SHORT).show();
//
//                    }
//                });
//                ApiService.apiSevice.getAllMovie().enqueue(new Callback<List<Movie>>() {
//                    @Override
//                    public void onResponse(Call<List<Movie>> call, Response<List<Movie>> response) {
//                        Toast.makeText(MainActivity.this,"success",Toast.LENGTH_SHORT).show();
//                        movieList=new ArrayList<>();
//                        movieList=response.body();
//                        for (int i=0;i<movieList.size();i++){
//                            System.out.println(movieList.get(i).getName());
//                        }
//
//                    }
//                    @Override
//                    public void onFailure(Call<List<Movie>> call, Throwable t) {
//                        Toast.makeText(MainActivity.this,"faill",Toast.LENGTH_SHORT).show();
//
//                    }
//                });
            }
        });
        txt_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

    }

    private void setControl() {
        btn_get_start=findViewById(R.id.btn_getstart);
        txt_sign_in=findViewById(R.id.txt_sign_in);
    }
}