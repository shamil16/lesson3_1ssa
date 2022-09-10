package com.company;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView mName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mName=findViewById(R.id.tv_two);
        String txtName = getIntent().getStringExtra("parametr");
        mName.setText(mName.getText().toString()+ " "+txtName);
    }
}