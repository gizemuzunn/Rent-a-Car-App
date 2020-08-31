package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleview);
        init_recylerview();
    }

    private void init_recylerview(){
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerView.Adapter adapter = new MyAdapter(this, generate_customer_list());
        recyclerView.setAdapter(adapter);

    }
    private ListElement[] generate_customer_list() {

        ListElement[] elements = {
                new ListElement(0, "Benzinli"),
                new ListElement(1, "BMW SERIES 1 1.5 116D ", "Otomatik", "5", "2019", "Benzinli", "5.9", 2800,"https://images.garenta.com.tr/jato/300/2017/BMW/SERIES%201/5Hatchback315.png" ),
                new ListElement(1, "Hyundai I20 1.4 Mpi Jump", "Manuel", "3", "2019", "Benzinli", "6.8", 2609, "https://tiklakirala.tiklakirala.com/JatoPhotos//HYUNDAI/I20/2020/5HA_135.JPG"),
                new ListElement(1, "BMW SERIES 1 1.5 116D ", "Otomatik", "3", "2019", "Benzinli", "5.8", 2620, "https://images.garenta.com.tr/jato/300/2017/BMW/SERIES%201/5Hatchback315.png"),
                new ListElement(0, "Dizel"),
                new ListElement(1, "Hyundai I20 1.4 Mpi Jump", "Manuel", "5", "2019", "Dizel", "5.9", 2860, "https://tiklakirala.tiklakirala.com/JatoPhotos//HYUNDAI/I20/2020/5HA_135.JPG"),
                new ListElement(1, "Peugeot 2008", "Otomatik", "3", "2019", "Dizel", "7.1", 2883, "https://tiklakirala.tiklakirala.com/JatoPhotos//PEUGEOT/2008/2020/5OD.JPG"),
                new ListElement(1, "CITROEN C-Elysee", "Manuel", "3", "2019", "Dizel", "5.5", 2925, "http://195.155.128.10:1412/image/rac/bc561de7-6fb6-4163-814e-c027ff37e2b2.jpg")
        };

        return elements;
    }
}
