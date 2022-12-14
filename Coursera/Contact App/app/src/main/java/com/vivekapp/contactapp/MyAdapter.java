package com.vivekapp.contactapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter { //Here i use implement method (press ctrl+i)

    public ArrayList<Contact> contacts;
    public Context context;

    public MyAdapter(ArrayList<Contact> contacts_list,Context context){
        contacts = new ArrayList<>();
        this.contacts = contacts_list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //LayoutInflater is a function which is convert xml file into actual view
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.list_row,null);
        TextView nameTv,phoneTv;
        ImageView callBtn,smsBtn;

        nameTv = row.findViewById(R.id.nameTv);
        phoneTv =row.findViewById(R.id.phoneTv);

        nameTv.setText(contacts.get(position).getName()); //yeh contact ka string lega
        phoneTv.setText(contacts.get(position).getName());

        callBtn = row.findViewById(R.id.callBtn);
        smsBtn = row.findViewById(R.id.smsBtn);

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = contacts.get(position).getPhone();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phone));
                context.startActivity(intent);
            }
        });

        smsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {String phone = contacts.get(position).getPhone();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("sms:" + phone));
                context.startActivity(intent);
            }
        });
        return row;
    }
}
