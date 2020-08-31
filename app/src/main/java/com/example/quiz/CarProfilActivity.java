package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class CarProfilActivity extends AppCompatActivity {
    private TextView textViewvites;
    private TextView textViewkoltuk;
    private TextView textViewmodel;
    private TextView textViewyakituketimi;
    private TextView textViewyakit;
    private ImageView imageViewaraba;
    private TextView textViewad;
    private TextView textViewkira;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_car_detail_profil);
        textViewvites = findViewById(R.id.textViewvites);
        textViewkoltuk=findViewById(R.id.textViewkoltuk);
        textViewmodel=findViewById(R.id.textViewmodel);
        textViewyakituketimi= findViewById(R.id.textViewyakituketimi);
        textViewyakit= findViewById(R.id.textViewyakit);
        imageViewaraba=findViewById(R.id.imageViewaraba);
        textViewad=findViewById(R.id.textViewad);
        textViewkira=findViewById(R.id.textViewkira);


        String carname =getIntent().getStringExtra("name");
        String vites =getIntent().getStringExtra("vites");

        String koltuk =getIntent().getStringExtra("koltuk");

        String model =getIntent().getStringExtra("model");
        String yakittuketimi =getIntent().getStringExtra("yakittuketimi");
        int kira =getIntent().getIntExtra("kira",0);
        String resim =getIntent().getStringExtra("resim");
        String yakit =getIntent().getStringExtra("yakit");

        textViewad.setText(carname);
        textViewvites.setText(vites);
        textViewkoltuk.setText(koltuk);
        textViewmodel.setText(model);
        textViewyakituketimi.setText(yakittuketimi);
        textViewyakit.setText(yakit);
        textViewkira.setText(Integer.toString(kira));

        Glide
                .with(this)
                .load(resim)
                .into(imageViewaraba);

    }
}
