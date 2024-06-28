package com.example.agricultureapps;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton btnlogout = findViewById(R.id.btnicon9);
        btnlogout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Home.this, MainActivity.class);
                startActivity(intent);
            }

        });
        ImageButton btnprolist = findViewById(R.id.imgicon1);
        btnprolist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Home.this, ProductList.class);
                startActivity(intent);
            }
        });
        ImageButton btnpropost = findViewById(R.id.imgicon2);
        btnpropost.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Home.this, Post_Product.class);
                startActivity(intent);
            }
        });
        ImageButton btnprofile = findViewById(R.id.imgicon3);
        btnprofile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Home.this, Profile.class);
                startActivity(intent);
            }
        });
        ImageButton btnOrder = findViewById(R.id.imgicon4);
        btnOrder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Home.this, Order.class);
                startActivity(intent);
            }
        });
        ImageButton btnMessage = findViewById(R.id.imgicon5);
        btnMessage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Home.this, Message.class);
                startActivity(intent);
            }
        });

        ImageButton btnNoti = findViewById(R.id.imgicon6);
        btnNoti.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Home.this, Notifications.class);
                startActivity(intent);
            }
        });
        ImageButton btnSetti= findViewById(R.id.imgicon7);
        btnSetti.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Home.this, Setting.class);
                startActivity(intent);
            }
        });
        ImageButton btnhelp = findViewById(R.id.imgicon8);
        btnhelp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Home.this, Help.class);
                startActivity(intent);
            }
        });

        ImageButton btncart = findViewById(R.id.btncart);
        btncart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Home.this, cart.class);
                startActivity(intent);
            }
        });

    }
}