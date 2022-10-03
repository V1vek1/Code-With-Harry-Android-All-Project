package com.example.q3ch1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.preference.EditTextPreference;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;     // As you know ki button is like a key for
    TextView textView; //TextView wo h jisme hum text ya koi input dete h
    String result;     // String bnaya taki jo input aaye use le or int datatype me convert kare
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.ed1);
        button=(Button)findViewById(R.id.bt1);
        textView=(TextView)findViewById(R.id.tv2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = editText.getText().toString(); //yha user se input liya gya h
                int n = Integer.parseInt(number);
                result ="";
                for (int i = 1; i<=10;i++)
                {
                    result+=n+" "+"X "+i+" "+"="+" "+n*i+"\n";
                    textView.setText(result); //yha wo value rakhi ja rahi h
                }
            }
        });
    }
}