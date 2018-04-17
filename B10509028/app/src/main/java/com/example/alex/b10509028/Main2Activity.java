package com.example.alex.b10509028;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bu = getIntent().getExtras();
        String he  = bu.getString("BOOM");
        TextView she = (TextView)findViewById(R.id.tv);
        she.setText("B10509028"+ he );
    }
}
