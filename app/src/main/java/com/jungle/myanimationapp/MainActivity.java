package com.jungle.myanimationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public TextView text1;
    public TextView text2;
    public boolean isShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.txtone);
        text2=findViewById(R.id.txttwo);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
                if (isShow){
                    text1.animate().alpha(0.0f).setDuration(2000);
                    text2.animate().alpha(1).setDuration(2000);
                    isShow=false;
                }else if (!isShow){
                    text2.animate().alpha(0).setDuration(2000);
                    text1.animate().alpha(1).setDuration(2000);
                    isShow=true;
                }

            }
        });

    }
}
