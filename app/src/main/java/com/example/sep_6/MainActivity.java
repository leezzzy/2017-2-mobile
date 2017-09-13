package com.example.sep_6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void nextScene(View v){
        Intent i = new Intent(this, Main2Activity.class);
        // Intent(from, to)
            startActivity(i); // 새로운 액티비티 실행
    }

}
