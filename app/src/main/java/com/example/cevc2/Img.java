package com.example.cevc2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class Img extends BaseAdapter {

    private Context mContext;
    public int[] images = {
            R.drawable.boat1,
            R.drawable.boat2,
            R.drawable.boat3,
            R.drawable.boat4,
            R.drawable.boat5,
            R.drawable.boat6
    };

    public Img(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return images[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(images[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(
                new GridView.LayoutParams(
                        340,
                        350
                ));

        return imageView;
    }
}
