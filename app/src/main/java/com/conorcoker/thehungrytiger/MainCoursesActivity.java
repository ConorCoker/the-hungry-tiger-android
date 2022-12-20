package com.conorcoker.thehungrytiger;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainCoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);
        ListView mainCoursesList=findViewById(R.id.list_view_main_courses);
        Dish[] mainCourses={
                new Dish("Meatballs","Italian Flavour Yummy",3099),
                new Dish("Stewed Oregano Boar","Eat this and become a boar",5099),
                new Dish(" Thyme Oysters","Fish is good for your brain",4055),
                new Dish("Peanut Wafer","Contains Nuts!",1299)
        };
        ArrayAdapter<Dish> dishesAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,mainCourses);
        mainCoursesList.setAdapter(dishesAdapter);
    }
}
