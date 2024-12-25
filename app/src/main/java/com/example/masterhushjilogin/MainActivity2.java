package com.example.masterhushjilogin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity2 extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    FrameLayout frameLayout;
    public Button button5;
    public Button button6;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bottomNavigationView = findViewById(R.id.bottomNavigationView); //หาหน้าที่มีเมนู
        button6 = findViewById(R.id.button6);//หาหน้าที่มีปุ่ม 6 คือ ปุ่ม home

        button6.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this,MainActivity2.class)));//เมื่อกดปุ่มhome จะกลับมาที่หน้า home

        //frameLayout = findViewById(R.id.frameLayout);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout,new RecipeFragment());//เพิ่ม fragment ในหน้าhome
        fragmentTransaction.commit();

        button5 = findViewById(R.id.button5); //หาหน้าที่มีปุ่ม 5 คือ Read

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() { //ให้เมนูรับค่าจาก User ในการเลือกกดเมนู
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) { //เมื่อกดเลือกเมนู
                if (item.getItemId()==R.id.search) { //ถ้ากดเลือก search  จะเปลี่ยนหน้าจาก home ไปเป็น หน้า search
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout,new SearchFragment());
                    fragmentTransaction.commit();
                }else if (item.getItemId()==R.id.add) { //ถ้ากดเลือก add จะเปลี่ยนเป็นหน้า add
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new AddFragment());
                    fragmentTransaction.commit();
                }else if (item.getItemId()==R.id.profile) { //ถ้ากดเลือกprofile จะเปลี่ยนหน้าเป็น profile
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.frameLayout, new ProfileFragment());
                    fragmentTransaction.commit();
                }
                return true;
            }
        });
        button5.setOnClickListener(new View.OnClickListener() { //ให้ปุ่ม5 คือ Read รับค่าจาก User
            @Override
            public void onClick(View v) { //เมื่อกดปุ่มread
                Intent intent = new Intent(MainActivity2.this,BananaCake.class); //เปลียนหน้าไปเป็นหน้าสูตรการทำเค้กกล้วยหอม่
                startActivity(intent);
            }
        });
    }
}
