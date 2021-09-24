package com.pankajshrivastava.foodapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pankajshrivastava.foodapp.adapter.AsiaFoodAdapter;
import com.pankajshrivastava.foodapp.adapter.PopularFoodAdapter;
import com.pankajshrivastava.foodapp.model.AsiaFood;
import com.pankajshrivastava.foodapp.model.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView popularRecycler, asiaRecycler;
    PopularFoodAdapter popularFoodAdapter;
    AsiaFoodAdapter asiaFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // now here we will add some dummy data to out model class

        List<PopularFood> popularFoodList = new ArrayList<>();

        popularFoodList.add(new PopularFood("Sliced Tomato and green leaf veg", "1000₹", R.drawable.z2));
        popularFoodList.add(new PopularFood("Toast bread with bluebrry on black", "1500₹", R.drawable.z1));
        popularFoodList.add(new PopularFood("Bread with sunny side-up egg ceremic", "700₹", R.drawable.z3));
        popularFoodList.add(new PopularFood("Sliced Tomato and green leaf veg", "1000₹", R.drawable.z2));
        popularFoodList.add(new PopularFood("Toast bread with bluebrry on black", "1500₹", R.drawable.z1));
        popularFoodList.add(new PopularFood("Bread with sunny side-up egg ceremic", "700₹", R.drawable.z3));

        setPopularRecycler(popularFoodList);


        List<AsiaFood> asiaFoodList = new ArrayList<>();
        asiaFoodList.add(new AsiaFood("Double-patty cheeseburger", "700₹", R.drawable.z4, "4.5", "Briand Restaurant"));
        asiaFoodList.add(new AsiaFood("Two slices of sandwich on brown", "500₹", R.drawable.z5, "4.2", "Friends Restaurant"));
        asiaFoodList.add(new AsiaFood("Double-patty cheeseburger", "700₹", R.drawable.z4, "4.5", "Briand Restaurant"));
        asiaFoodList.add(new AsiaFood("Two slices of sandwich on brown", "500₹", R.drawable.z5, "4.2", "Friends Restaurant"));
        asiaFoodList.add(new AsiaFood("Double-patty cheeseburger", "700₹", R.drawable.z4, "4.5", "Briand Restaurant"));
        asiaFoodList.add(new AsiaFood("Two slices of sandwich on brown", "500₹", R.drawable.z5, "4.2", "Friends Restaurant"));

        setAsiaRecycler(asiaFoodList);

    }


    private void setPopularRecycler(List<PopularFood> popularFoodList) {

        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);

    }

    private void setAsiaRecycler(List<AsiaFood> asiaFoodList) {

        asiaRecycler = findViewById(R.id.asia_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        asiaRecycler.setLayoutManager(layoutManager);
        asiaFoodAdapter = new AsiaFoodAdapter(this, asiaFoodList);
        asiaRecycler.setAdapter(asiaFoodAdapter);

    }


}
