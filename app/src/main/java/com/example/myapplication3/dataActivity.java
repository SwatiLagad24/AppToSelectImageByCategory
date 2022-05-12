package com.example.myapplication3;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class dataActivity extends AppCompatActivity {


    private ImageView imageView1, imageView2, imageView4, imageView3;

    private int res1, res2, res3, res4;

       @Override
    protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);


           LinearLayout mainContainerLayout = new LinearLayout(this);
           mainContainerLayout.setOrientation(LinearLayout.VERTICAL);
           mainContainerLayout.setPadding(20, 20, 20, 40);
           mainContainerLayout.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);

           ViewGroup.LayoutParams layoutParams =
                   new ViewGroup.LayoutParams(
                           ViewGroup.LayoutParams.MATCH_PARENT,
                           ViewGroup.LayoutParams.MATCH_PARENT
                   );

           mainContainerLayout.setLayoutParams(layoutParams);


           ViewGroup.LayoutParams paramsForView =
                   new ViewGroup.LayoutParams(
                           ViewGroup.LayoutParams.MATCH_PARENT,
                           ViewGroup.LayoutParams.WRAP_CONTENT
                   );

           imageView1 = new ImageView(this);
           imageView1.setLayoutParams(paramsForView);
           //final Integer imageId=R.drawable.img;
           imageView1.setPadding(25, 5, 25, 5);
           imageView1.setMaxHeight(30);
           imageView1.setMaxWidth(20);
           // imageView1.setImageResource(imageId);
           mainContainerLayout.addView(imageView1);


           imageView2 = new ImageView(this);
           imageView2.setLayoutParams(paramsForView);
           imageView2.setMaxHeight(40);
           imageView2.setMaxWidth(50);
           mainContainerLayout.addView(imageView2);

           imageView3 = new ImageView(this);
           imageView3.setLayoutParams(paramsForView);
           imageView3.setPadding(5, 5, 5, 5);
           imageView3.setMaxHeight(20);
           imageView3.setMaxWidth(30);
           mainContainerLayout.addView(imageView3);


           imageView4 = new ImageView(this);
           imageView4.setLayoutParams(paramsForView);
           imageView4.setMaxHeight(30);
           imageView4.setMaxWidth(30);
           mainContainerLayout.addView(imageView4);


           setContentView(mainContainerLayout);

           extractInput();
           initListeners();
       }


    private void extractInput() {
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        res1 = bundle.getInt("result1");
        res2 = bundle.getInt("result2");
        res3 = bundle.getInt("result3");
        res4 = bundle.getInt("result4");

        imageView1.setImageResource(res1);
        imageView2.setImageResource(res2);
        imageView3.setImageResource(res3);
        imageView4.setImageResource(res4);

    }

    private void initListeners() {
        imageView1.setOnClickListener(new image1ClickListener());
        imageView2.setOnClickListener(new image2ClickListener());
        imageView3.setOnClickListener(new image3ClickListener());
        imageView4.setOnClickListener(new image4ClickListener());

    }





    private class image2ClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent resultIntent = new Intent();
            resultIntent.putExtra("result", res2);
            setResult(1, resultIntent);

            finish();

        }
    }


    private class image3ClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent resultIntent = new Intent();
            resultIntent.putExtra("result", res3);
            setResult(1, resultIntent);

            finish();

        }
    }

    private class image4ClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent resultIntent = new Intent();
            resultIntent.putExtra("result", res4);
            setResult(1, resultIntent);

            finish();

        }
    }

    private class image1ClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent resultIntent = new Intent();
            resultIntent.putExtra("result", res1);
            setResult(1, resultIntent);

            finish();

        }
    }

}



























