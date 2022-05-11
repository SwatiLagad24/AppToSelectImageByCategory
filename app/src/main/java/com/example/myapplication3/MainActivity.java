package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initListeners();
    }
    private void initView(){
        btnStart=findViewById(R.id.btnStart);

    }
    private void initListeners(){

        btnStart.setOnClickListener(new BtnStartListener());
    }
    private class BtnStartListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Intent inten=new Intent(MainActivity.this,dataActivity.class);
            startActivity(inten);
        }
    }
}