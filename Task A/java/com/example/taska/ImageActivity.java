package com.example.taska;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.layoutsexercise.R;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_image);
        int imgID = getIntent().getExtras().getInt("id");
        Log.d("TAG", "ID: " + imgID);
        ImageView iv =(ImageView) findViewById(R.id.imageView5);

        iv.setImageResource(imgID);

    }
    void openWebSite(View v){
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.thebinarybox.co.uk/"));
        startActivity(i);
    }
}
