package com.example.taska;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.layoutsexercise.R;

public class MainActivity extends AppCompatActivity {

    GridView grid1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        grid1 = (GridView) findViewById(R.id.gridView);
        grid1.setAdapter(new ImageAdapter(MainActivity.this));

        grid1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent catAndSheep = new Intent(getApplicationContext(), ClickableList.class);

                startActivity(catAndSheep);
            }
        });

    }


}
