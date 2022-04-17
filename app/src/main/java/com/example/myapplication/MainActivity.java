package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=findViewById(R.id.btn1);
        Button btn2=findViewById(R.id.btn2);
        btn1.setOnClickListener(new MyOnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent i=new Intent(MainActivity.this,MainActivity2.class);
                                                startActivity(i);


                                    }
                                }
        );
        btn2.setOnClickListener(new MyOnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent i=new Intent(MainActivity.this,MainActivity3.class);
                                        startActivity(i);


                                    }
                                }
        );
    }


    //定义按钮点击监听器
    class MyOnClickListener implements View.OnClickListener{
        //按钮点击
        @Override
        public void onClick(View view) {

            if(view.getId()==R.id.btn1){

            }
        }
    }
}
