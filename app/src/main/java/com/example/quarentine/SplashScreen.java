package com.example.quarentine;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;


public class SplashScreen extends Activity {
    ConstraintLayout constraintLayout;

    protected void onCreate(
            Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a ConstraintLayout in which to add the ImageView
        constraintLayout = new ConstraintLayout(this);

        // Instantiate an ImageView and define its properties
        ImageView i = new ImageView(this);
        i.setImageResource(R.drawable.ic_logo);
        i.setContentDescription(getResources().getString(R.string.my_image_desc));

        // set the ImageView bounds to match the Drawable's dimensions
        i.setAdjustViewBounds(true);
        i.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        // Add the ImageView to the layout and set the layout as the content view.
        constraintLayout.addView(i);
        setContentView(constraintLayout);
    }
}
