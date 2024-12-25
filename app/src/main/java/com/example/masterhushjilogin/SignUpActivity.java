package com.example.masterhushjilogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity {
    public Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(v -> startActivity(new Intent(SignUpActivity.this,MainActivity.class)));//เมื่อกดปุ่มกากกะบาท จะเปลี่ยนไปหน้าเลือกบัญชี

    }
}