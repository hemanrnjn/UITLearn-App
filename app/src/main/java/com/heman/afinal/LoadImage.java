package com.heman.afinal;

/**
 * Created by Himanshu on 21-02-2017.
 */

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import uk.co.senab.photoview.PhotoViewAttacher;

public class LoadImage extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_display);

        PhotoViewAttacher photoViewAttacher ;


        ImageView imageView = (ImageView) findViewById(R.id.img1);
        ImageView imageView2 = (ImageView) findViewById(R.id.img2);
        ImageView imageView3 = (ImageView) findViewById(R.id.img3);

//Loading image from below url into imageView

        Picasso.with(this)
                .load("http://192.168.43.172/FinalProject/images/back.jpg")
                .into(imageView);

        photoViewAttacher = new PhotoViewAttacher(imageView);

        photoViewAttacher.update();

        Picasso.with(this)
                .load("http://192.168.43.172/FinalProject/images/back.jpg")
                .into(imageView2);

        photoViewAttacher = new PhotoViewAttacher(imageView2);

        photoViewAttacher.update();


    }
}