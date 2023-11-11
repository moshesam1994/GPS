package com.example.gpstraking;

import android.app.Application;
import android.location.Location;

import java.util.ArrayList;
import java.util.List;

public class MyApplication extends Application {
    private List<Location> myLocations;
    private static MyApplication singleton;

    public static MyApplication getSingleton() {
        return singleton;
    }
    public  void onCreate(){
        super.onCreate();
        singleton=this;
        myLocations=new ArrayList<>();


    }


    public List<Location> getMyLocations() {
        return myLocations;
    }

    public void setMyLocations(List<Location> myLocations) {
        this.myLocations = myLocations;
    }
}

