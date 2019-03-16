package com.example.taskc;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

public class GridViewActivity2 extends AppCompatActivity {

    public static  Integer [] categories = {
            R.drawable.sheep,
            R.drawable.sheep2,
            R.drawable.sheep3,
            R.drawable.sheep4
    };

    GridView gridView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_view_2);


        gridView1 = (GridView) findViewById(R.id.gridView);
        gridView1.setAdapter(new ImageAdapter(this, categories ));


    }
}
