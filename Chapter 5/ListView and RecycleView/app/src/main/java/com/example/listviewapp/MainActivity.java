package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String arr[] = {"This is", "Item", "Item2", "Another Item", "vivek", "Gaurav", "Saurabh", "Ravi", "XYZ"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

// This is Build In Array Adapter of android joki humne yeh niche me use kiya h
//        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
//        listView.setAdapter(ad);

// This is Our custom Adapter
        vivekAdapter ad = new vivekAdapter(this,R.layout.my_vivek_layout, arr);
        listView.setAdapter(ad);

        //Listener on ArrayAdapter ListView
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "You clicked on: " + i, Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}