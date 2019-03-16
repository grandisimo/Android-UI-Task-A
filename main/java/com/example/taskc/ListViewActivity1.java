package com.example.taskc;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListViewActivity1 extends AppCompatActivity {

    public static  Integer [] categories = {
            R.drawable.cat1,
            R.drawable.cat2,
            R.drawable.cat3,
            R.drawable.cat4,
            R.drawable.cat5,
            R.drawable.cat6,
            R.drawable.cat7,
            R.drawable.cat8,
            R.drawable.cat8,
            R.drawable.cat10,
            R.drawable.cat11,
            R.drawable.cat12,
            R.drawable.cat13,
            R.drawable.cat14,
            R.drawable.cat15,
            R.drawable.cat16,
            R.drawable.cat17,
            R.drawable.cat18,
            R.drawable.cat19,
            R.drawable.cat21,
    };

    ListView listView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_view);


        listView1 = (ListView) findViewById(R.id.listView1);
        listView1.setAdapter(new ImageAdapter(this, categories ));


    }
}
