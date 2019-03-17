package com.example.taska;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.layoutsexercise.R;

public class ClickableList extends AppCompatActivity {

    ListView listView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_and_sheep);


        listView1 = (ListView) findViewById(R.id.listView1);
        listView1.setAdapter(new ImageAdapter(ClickableList.this));


    }
}
