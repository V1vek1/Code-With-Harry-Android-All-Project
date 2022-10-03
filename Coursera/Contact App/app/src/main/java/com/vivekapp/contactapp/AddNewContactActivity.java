package com.vivekapp.contactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddNewContactActivity extends AppCompatActivity {
    EditText nameEt , phoneEt;
    Button saveBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_contact);
        nameEt = findViewById(R.id.nameET);
        phoneEt = findViewById(R.id.phoneET);
        saveBtn =findViewById(R.id.saveBtn);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEt.getText().toString().trim();
                String phone = phoneEt.getText().toString().trim();

                Intent intent = new Intent();
                intent.putExtra("name",name);
                intent.putExtra("phone",name);
                setResult(Activity.RESULT_OK,intent);
                finish();
            }
        });
    }
}