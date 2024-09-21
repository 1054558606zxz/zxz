package com.example.eduworldskilld25;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText username=findViewById(R.id.username);
        EditText youxiang=findViewById(R.id.youxiang);
        EditText phone=findViewById(R.id.phone);
        EditText password=findViewById(R.id.password);
        EditText password2=findViewById(R.id.password2);
        Button zhuce_button=findViewById(R.id.zhuce_button);
        zhuce_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(password.getText().toString().equals(password2.getText().toString())){
                    Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                    intent.putExtra("username", username.getText().toString());
                    intent.putExtra("password", password.getText().toString());
                    startActivity(intent);
                    runOnUiThread(()->Toast.makeText( MainActivity2.this, "注册成功", Toast.LENGTH_SHORT).show());

                }else {
                   runOnUiThread(()->Toast.makeText( MainActivity2.this, "两次密码不一致", Toast.LENGTH_SHORT).show());
                }


            }
        });
    }
}