package com.example.gavin.testing_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> dataFromMain = new ArrayList<>();
        RecyclerView testRV = findViewById(R.id.testRV);

        dataFromMain.add("AAAA");
        dataFromMain.add("BBBB");

        adapter4Main adapting = new adapter4Main(dataFromMain);
        testRV.setAdapter(adapting);
        testRV.setLayoutManager(new LinearLayoutManager(this));
        adapting.notifyDataSetChanged();
    }
}
