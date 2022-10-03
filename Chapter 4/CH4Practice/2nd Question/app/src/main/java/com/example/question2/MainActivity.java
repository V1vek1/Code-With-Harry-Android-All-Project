package com.example.question2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void MyWeb ( View view )
    {
    openUrl("http://www.google.com");
}
    public void openUrl (String url) //Yha bracket me pura site ka url dena padta, per hmne String url likha kyu ki link string ke form mr hota h
    {
        //Uri = Uniforn resource indentifier hota h hamne uska sort form bnaya h

        Uri uri =Uri.parse(url) ;
        Intent launchWeb = new Intent ( Intent.ACTION_VIEW , uri) ;
        startActivity(launchWeb);
    }
}