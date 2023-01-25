package com.example.kosmetikcenternurul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menu extends AppCompatActivity {

    ImageButton profile, produk1, produk2, produk3, produk4, produk5, produk6, produk7, produk8, produk9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        profile = (ImageButton) findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, profile.class);
                startActivity(intent);
            }
        });
        produk1 = (ImageButton) findViewById(R.id.produk1);
        produk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, produk1.class);
                startActivity(intent);
            }
        });
        produk2 = (ImageButton) findViewById(R.id.produk2);
        produk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, produk2.class);
                startActivity(intent);
            }
        });
        produk3 = (ImageButton) findViewById(R.id.produk3);
        produk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, produk3.class);
                startActivity(intent);
            }
        });
        produk4 = (ImageButton) findViewById(R.id.produk4);
        produk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, produk4.class);
                startActivity(intent);
            }
        });
        produk5 = (ImageButton) findViewById(R.id.produk5);
        produk5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, produk5.class);
                startActivity(intent);
            }
        });
        produk6 = (ImageButton) findViewById(R.id.produk6);
        produk6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, produk6.class);
                startActivity(intent);
            }
        });
        produk7 = (ImageButton) findViewById(R.id.produk7);
        produk7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, produk7.class);
                startActivity(intent);
            }
        });
        produk8 = (ImageButton) findViewById(R.id.produk8);
        produk8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, produk8.class);
                startActivity(intent);
            }
        });
        produk9 = (ImageButton) findViewById(R.id.produk9);
        produk9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, produk9.class);
                startActivity(intent);
            }
        });

    }
}