package com.example.masterhushjilogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class BananaCake extends AppCompatActivity {
    public Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banana_cake);

        button6 = findViewById(R.id.button6);//หาหน้าที่มีปุ่ม6 คือ x (ปุ่มออกไปหน้าhome)
        button6.setOnClickListener(v -> startActivity(new Intent(BananaCake.this,MainActivity2.class)));//เมื่อกดปุ่ม x ให้เปลี่ยนจากหน้าสูตรการทำเค้กกล้วยหอมเป็นหน้า home
    }
}