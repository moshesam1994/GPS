package com.example.gpstraking;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ShowSacedLoctionList extends AppCompatActivity {
ListView lv_saveLocations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_saced_loction_list);


        lv_saveLocations=findViewById(R.id.lv_wayPoints);


        MyApplication myApplication=(MyApplication)getApplicationContext();
        List<Location> saveLocations=myApplication.getMyLocations();
        lv_saveLocations.setAdapter(new ArrayAdapter<Location>(this , android.R.layout.simple_list_item_1 ,saveLocations));






    }
}