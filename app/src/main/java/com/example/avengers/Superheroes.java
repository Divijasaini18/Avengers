package com.example.avengers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.avengers.databinding.ActivitySuperheroesBinding;

public class Superheroes extends AppCompatActivity {
    ActivitySuperheroesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivitySuperheroesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        binding.blackPanther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Superheroes.this,BlackPanther.class);
                startActivity(intent);

            }
        });
        binding.blackWidow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Superheroes.this,BlackWidow.class);
                startActivity(intent);

            }
        });
        binding.ctAmerica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Superheroes.this,CaptainAmerica.class);
                startActivity(intent);

            }
        });
        binding.ctMarvel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Superheroes.this,CaptainMarvel.class);
                startActivity(intent);

            }
        });
        binding.drStrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Superheroes.this,DrStrange.class);
                startActivity(intent);

            }
        });
        binding.hawkEye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Superheroes.this,HawkEye.class);
                startActivity(intent);

            }
        });
        binding.hulk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Superheroes.this,Hulk.class);
                startActivity(intent);

            }
        });
        binding.ironMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Superheroes.this,IronMan.class);
                startActivity(intent);

            }
        });
        binding.scarlett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Superheroes.this,ScarlettWitch.class);
                startActivity(intent);

            }
        });
        binding.spider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Superheroes.this,SpiderMan.class);
                startActivity(intent);

            }
        });
        binding.thor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Superheroes.this,Thor.class);
                startActivity(intent);

            }
        });
        binding.vision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Superheroes.this,Vision.class);
                startActivity(intent);

            }
        });

    }
}
