package com.example.alex.b10509028;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (EditText)findViewById(R.id.et);
        Button button = (Button)findViewById(R.id.bt);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent in = new Intent();
                in.setClass(MainActivity.this,Main2Activity.class);
                Bundle bu = new Bundle();
                bu.putString("BOOM",text.getText().toString());
                in.putExtras(bu);

                startActivity(in);

            }
        });


    }
}
