package com.conorcoker.thehungrytiger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StarterActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

        ListView startersList = findViewById(R.id.list_view_starters);

        Dish[] dishes = {
                new Dish("Burnt Pulled Pork Reduction topped with Salmon Drink",
                        "A nice pork dish with salmon drink to wash it down", 999),
                new Dish("Pre-Masticated Ricotta Scramble served with Psychotropic Rutabaga Chutney",
                        "This meal will go down a treat!", 1199),
                new Dish("Artisinal Rice and Roast Beef Souffle on a bed of Pastrami Segments",
                        "Rice and Roast Beef? Yes please!", 3499),
                new Dish("Succulent Mussel and Yam Paste with Char-broiled Lemon Juice", "Yam Paste with lemon juice?! i wont say no!",
                        1299),
                new Dish("Indoor Banana Salad alongside Biodynamic Goat", "Goat is deffo what i want for dinner!", 4500)
        };


        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        startersList.setAdapter(dishesAdapter);
    }


}