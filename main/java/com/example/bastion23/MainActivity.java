package com.example.bastion23;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_palais18 = (Button) findViewById(R.id.btn_palais18);
        Intent intent_palais18 = new Intent(MainActivity.this, Palais18Activity.class);

        btn_palais18.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(intent_palais18);
            }
        });

    }
}