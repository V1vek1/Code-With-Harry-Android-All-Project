package com.example.sharedprefsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        TextView textView;
        EditText editText;
        Button button;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            editText = findViewById(R.id.editText); //Yha maine inn tino ko xml se java me leliya findViewById se
            textView = findViewById(R.id.textView);
            button = findViewById(R.id.button);

            button.setOnClickListener(new View.OnClickListener() { //yha maine kha i agar koi mere  button per click karta h to,
                @Override
                public void onClick(View v) {
                    String val = editText.getText().toString(); //to mai iss line se wo text ko uthaunga or usko name sharedPrefrance me save kar dunga
                    SharedPreferences sP = getSharedPreferences("MyPref", MODE_PRIVATE); //Mode private ki help se hum apne iss app ke data ko, kisi or app me access nahi de sakte h
                    SharedPreferences.Editor ed = sP.edit();
                    ed.putString("name", val);
                    ed.apply();  //Synchronous = happens at the same time. Asynchronous = doesn't happen at the same time, Humne yha apply use kiya kyuki ye Asynchronous h warna hum commit use kar sajte the apply ki jagah per
                    textView.setText(val);
                }
            });

            SharedPreferences sP = getSharedPreferences("MyPref", MODE_PRIVATE); //Mode private ki help se hum apne iss app ke data ko, kisi or app me access nahi de sakte h
            String editVal = sP.getString("name", "No value as of now");
            textView.setText(editVal); //yha per maine sharedPreferences se value ko liya or editVal me store kra diya

        }
    }
