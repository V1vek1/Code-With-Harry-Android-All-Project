package com.example.q3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //NOTE - Hum data is tarike se le rahe h, per data is tarikes enahi aata h....ya to database aata h ya kisi server ya firebase se
    // matlab hum jha database server denge wha se data fetch kkiya jayega.....per abhi hmare pass database ke liye kuch nahi h
    // issiliye hmne ye bnaya h.....Contact o1 = new Contact(1, "98989898998", "Vivek");...........

    Contact o1 = new Contact(1, "98989898998", "Vivek");
    Contact o2 = new Contact(1, "98989898998", "Vivek");
    Contact o3 = new Contact(1, "98989898998", "Vivek");
    Contact o4 = new Contact(1, "98989898998", "Vivek");
    Contact o5 = new Contact(1, "98989898998", "Vivek");
    Contact o6 = new Contact(1, "98989898998", "Vivek");
    Contact o7 = new Contact(1, "98989898998", "Vivek");
    Contact o8 = new Contact(1, "98989898998", "Vivek");
    Contact o9 = new Contact(1, "98989898998", "Vivek");

    Contact [] contacts = {o1, o2, o3, o4, o5, o6, o7, o8, o9};
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad = new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL)); // Iss method se hum apne items ko divide kar sakte h vertically, horizontally..etc...na samjh aaye to iss code kko coment karke phir
                                                                                                                 // app run karke dekhna or phir bina comment kiye hue bhi run karke dekhna....idea lag jayega
    }
}