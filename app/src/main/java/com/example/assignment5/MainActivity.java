package com.example.assignment5;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.assignment5.Model.Model;
import com.example.assignment5.adapter.RecyclerViewAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String[] titles = {"Oak", "Pine", "Maple", "Birch", "Willow"};
        String[] subtitles = {"Strong wood", "Coniferous tree", "Autumn colors", "Smooth bark", "Graceful appearance"};
        Integer[] images = {
                R.drawable.oak, R.drawable.pine, R.drawable.maple,
                R.drawable.birch, R.drawable.willow
        };

        ArrayList<Model> data = new ArrayList<>();
        for (int i = 0; i < titles.length; i++) {
            Model model = new Model();
            model.setTitle(titles[i]);
            model.setSubtitle(subtitles[i]);
            model.setImageId(images[i]);
            data.add(model);
        }

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(data, this);
        recyclerView.setAdapter(adapter);
    }
}