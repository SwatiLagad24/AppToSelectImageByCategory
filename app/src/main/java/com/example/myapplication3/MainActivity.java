package com.example.myapplication3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button btnAnimal,btnFlower,btnPlanet;
    private ImageView imgView;
    private int result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initListeners();
    }
    private void initView(){
        btnAnimal=findViewById(R.id.btnAnimal);
        btnFlower=findViewById(R.id.btnFlower);
        btnPlanet=findViewById(R.id.btnPlanet);

    }
    private void initListeners(){

        btnAnimal.setOnClickListener(new BtnAnimalListener());
        btnFlower.setOnClickListener(new BtnFlowerListener());
        btnPlanet.setOnClickListener(new BtnPlanetListener());
    }
    private class BtnAnimalListener implements View.OnClickListener{
        @Override
        public void onClick(View v){


            Intent intent=new Intent(MainActivity.this,dataActivity.class);
            intent.putExtra("result1",R.drawable.animal2);
            intent.putExtra("result2",R.drawable.animal3);
            intent.putExtra("result3",R.drawable.animal4);
            intent.putExtra("result4",R.drawable.animal5);
            startActivityForResult(intent,1);


        }
    }

    private class BtnFlowerListener implements View.OnClickListener{
        @Override
        public void onClick(View v){



            Intent intent=new Intent(MainActivity.this,dataActivity.class);
            intent.putExtra("result1",R.drawable.f1);
            intent.putExtra("result2",R.drawable.f2);
            intent.putExtra("result3",R.drawable.f3);
            intent.putExtra("result4",R.drawable.f4);
            startActivityForResult(intent,1);

        }
    }

    private class BtnPlanetListener implements View.OnClickListener{
        @Override
        public void onClick(View v){


            Intent intent=new Intent(MainActivity.this,dataActivity.class);
            intent.putExtra("result1",R.drawable.p1);
            intent.putExtra("result2",R.drawable.p2);
            intent.putExtra("result3",R.drawable.p3);
            intent.putExtra("result4",R.drawable.p4);
            startActivityForResult(intent,1);

        }
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(data==null){
            return;
        }
        Bundle bundle=data.getExtras();
        result=bundle.getInt("result");
        imgView.setImageResource(result);

    }
}