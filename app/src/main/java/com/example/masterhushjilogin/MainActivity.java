package com.example.masterhushjilogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button button1;
    public Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1); //หาหน้าที่มีปุ่ม button1 คือ sign up
        button2 = findViewById(R.id.button2); //หาหน้าที่มีปุ่ม button2 คือ guests

        button1.setOnClickListener(new View.OnClickListener() { //ให้ปุ่มsign up  รับค่าจาก User
            @Override
            public void onClick(View v) { //เมื่อคลิกปุ่ม sign up
                Intent intent = new Intent(MainActivity.this,SignUpActivity.class); //ให้เปลี่ยนหน้าจากหน้าเลือกใช้บัญชีเป็นลงทะเบียน
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { //ให้ปุ่ม guests รับค่าจาก User
            @Override
            public void onClick(View v) { //เมื่อคลิกปุ่ม guests
                Intent intent1 = new Intent(MainActivity.this, MainActivity2.class);//ให้เปลี่ยนหน้าจากหน้าเลือกใช้บัญชีเป็นหน้าhomeแอพ
                startActivity(intent1);
            }
        });
    }
}