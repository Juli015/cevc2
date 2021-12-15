package com.example.cevc2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gridViewImages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_fragment);
        gridViewImages = findViewById(R.id.grid_view_images);
        gridViewImages.setAdapter(new Img(this));
    }
}