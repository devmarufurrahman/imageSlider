package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageSlider imageSlider;
    ArrayList<SlideModel> imageList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageSlider = findViewById(R.id.imgSlider);


        imageList.add(new SlideModel(R.drawable.image1, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.image2, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.image3, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.image4, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.image5, ScaleTypes.CENTER_CROP));



        imageSlider.setImageList(imageList);

    }
}