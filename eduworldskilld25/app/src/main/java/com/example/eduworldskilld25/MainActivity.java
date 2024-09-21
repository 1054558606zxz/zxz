package com.example.eduworldskilld25;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText username=findViewById(R.id.username);
        EditText password=findViewById(R.id.password);
        Button login_button=findViewById(R.id.login_button);
        Intent intent=getIntent();
        String uname=intent.getStringExtra("username");
        String paswd=intent.getStringExtra("password");



        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(uname!=null&&paswd!=null){
                    if(username.getText().toString().equals(uname)&&password.getText().toString().equals(paswd)){
                        Intent intent1=new Intent(MainActivity.this,MainActivity3.class);
                        startActivity(intent1);
                        Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_SHORT).show();

                    }else {
                        Toast.makeText(MainActivity.this,"登录失败",Toast.LENGTH_SHORT).show();

                    }
                }else {
                    Toast.makeText(MainActivity.this,"账号密码无效",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}