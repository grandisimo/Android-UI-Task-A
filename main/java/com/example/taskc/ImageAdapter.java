package com.example.taskc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.taskc.R;


public class ImageAdapter extends BaseAdapter {

    private Context c;
    public static  Integer [] categories;

    public ImageAdapter(Context context, Integer[] categories){
        this.c = context;
        this.categories = categories;


    }
    @Override
    public int getCount() {
        return categories.length;
    }

    @Override
    public Object getItem(int position) {
        return categories[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView = new ImageView(c);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);

        imageView.setImageResource(categories[position]);
        return imageView;



    }
}
