package com.example.fthelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView tvMain;
    private boolean isHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMain = (TextView) findViewById(R.id.tvMain);
        tvMain.setText(R.string.hello);
        isHelloWorld = true;
    }
    public void onClickButtonMain(View v) {
        if(isHelloWorld) {
            this.tvMain.setText(R.string.secondary_text);
        } else {
            this.tvMain.setText(R.string.hello);
        }
        this.isHelloWorld = !this.isHelloWorld;
    }
}