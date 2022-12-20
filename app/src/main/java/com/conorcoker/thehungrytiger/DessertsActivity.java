package com.conorcoker.thehungrytiger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertsActivity extends AppCompatActivity {

    private ListView dessertsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);
        dessertsList = findViewById(R.id.list_view_desserts);

        Dish[] desserts = {
                new Dish("Ice Cream", "Nice Cold and Creamy!", 1299),
                new Dish("Wafer bread", "The kids will love this!", 1099),
                new Dish("Chocolate bread", "You heard us right! Chocolate bread baby!", 1499)
        };

        ArrayAdapter<Dish> myArrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,desserts);
        dessertsList.setAdapter(myArrayAdapter);
    }
}